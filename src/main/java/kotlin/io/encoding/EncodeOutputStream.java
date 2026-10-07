package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/EncodeOutputStream.class */
@ExperimentalEncodingApi
final class EncodeOutputStream extends OutputStream {

    @NotNull
    private final OutputStream output;

    @NotNull
    private final Base64 base64;
    private boolean isClosed;
    private int lineLength;

    @NotNull
    private final byte[] symbolBuffer;

    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferLength;

    public EncodeOutputStream(@NotNull OutputStream output, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.output = output;
        this.base64 = base64;
        this.lineLength = this.base64.isMimeScheme$kotlin_stdlib() ? this.base64.getMimeLineLength$kotlin_stdlib() : -1;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        checkOpen();
        byte[] bArr = this.byteBuffer;
        int i = this.byteBufferLength;
        this.byteBufferLength = i + 1;
        bArr[i] = (byte) b;
        if (this.byteBufferLength == 3) {
            encodeByteBufferIntoOutput();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] source, int offset, int length) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        checkOpen();
        if (offset < 0 || length < 0 || offset + length > source.length) {
            throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", source size: " + source.length);
        }
        if (length == 0) {
            return;
        }
        if (!(this.byteBufferLength < 3)) {
            throw new IllegalStateException("Check failed.");
        }
        int startIndex = offset;
        int endIndex = startIndex + length;
        if (this.byteBufferLength != 0) {
            startIndex += copyIntoByteBuffer(source, startIndex, endIndex);
            if (this.byteBufferLength != 0) {
                return;
            }
        }
        while (startIndex + 3 <= endIndex) {
            int groupCapacity = (this.base64.isMimeScheme$kotlin_stdlib() ? this.lineLength : this.symbolBuffer.length) / 4;
            int groupsToEncode = Math.min(groupCapacity, (endIndex - startIndex) / 3);
            int bytesToEncode = groupsToEncode * 3;
            int symbolsEncoded = encodeIntoOutput(source, startIndex, startIndex + bytesToEncode);
            if (!(symbolsEncoded == groupsToEncode * 4)) {
                throw new IllegalStateException("Check failed.");
            }
            startIndex += bytesToEncode;
        }
        ArraysKt.copyInto(source, this.byteBuffer, 0, startIndex, endIndex);
        this.byteBufferLength = endIndex - startIndex;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        checkOpen();
        this.output.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.isClosed) {
            this.isClosed = true;
            if (this.byteBufferLength != 0) {
                encodeByteBufferIntoOutput();
            }
            this.output.close();
        }
    }

    private final int copyIntoByteBuffer(byte[] source, int startIndex, int endIndex) throws IOException {
        int bytesToCopy = Math.min(3 - this.byteBufferLength, endIndex - startIndex);
        ArraysKt.copyInto(source, this.byteBuffer, this.byteBufferLength, startIndex, startIndex + bytesToCopy);
        this.byteBufferLength += bytesToCopy;
        if (this.byteBufferLength == 3) {
            encodeByteBufferIntoOutput();
        }
        return bytesToCopy;
    }

    private final void encodeByteBufferIntoOutput() throws IOException {
        int symbolsEncoded = encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength);
        if (!(symbolsEncoded == 4)) {
            throw new IllegalStateException("Check failed.");
        }
        this.byteBufferLength = 0;
    }

    private final int encodeIntoOutput(byte[] source, int startIndex, int endIndex) throws IOException {
        int symbolsEncoded = this.base64.encodeIntoByteArray(source, this.symbolBuffer, 0, startIndex, endIndex);
        if (this.lineLength == 0) {
            this.output.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.lineLength = this.base64.getMimeLineLength$kotlin_stdlib();
            if (!(symbolsEncoded <= this.base64.getMimeLineLength$kotlin_stdlib())) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.output.write(this.symbolBuffer, 0, symbolsEncoded);
        this.lineLength -= symbolsEncoded;
        return symbolsEncoded;
    }

    private final void checkOpen() throws IOException {
        if (this.isClosed) {
            throw new IOException("The output stream is closed.");
        }
    }
}
