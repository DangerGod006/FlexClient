package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/DecodeInputStream.class */
@ExperimentalEncodingApi
final class DecodeInputStream extends InputStream {

    @NotNull
    private final InputStream input;

    @NotNull
    private final Base64 base64;
    private boolean isClosed;
    private boolean isEOF;

    @NotNull
    private final byte[] singleByteBuffer;

    @NotNull
    private final byte[] symbolBuffer;

    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferStartIndex;
    private int byteBufferEndIndex;

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.byteBufferStartIndex < this.byteBufferEndIndex) {
            int i = this.byteBuffer[this.byteBufferStartIndex] & 255;
            this.byteBufferStartIndex++;
            resetByteBufferIfEmpty();
            return i;
        }
        switch (read(this.singleByteBuffer, 0, 1)) {
            case -1:
                return -1;
            case 0:
            default:
                throw new IllegalStateException("Unreachable".toString());
            case 1:
                return this.singleByteBuffer[0] & 255;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        if (r14 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r7.isEOF == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        return r14 - r9;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.DecodeInputStream.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.isClosed) {
            this.isClosed = true;
            this.input.close();
        }
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        this.byteBufferEndIndex += this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, this.byteBufferEndIndex, 0, symbolBufferLength);
        int bytesToCopy = Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, bytesToCopy);
        shiftByteBufferToStartIfNeeded();
        return bytesToCopy;
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        ArraysKt.copyInto(this.byteBuffer, dst, dstOffset, this.byteBufferStartIndex, this.byteBufferStartIndex + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        int byteBufferCapacity = this.byteBuffer.length - this.byteBufferEndIndex;
        int symbolBufferCapacity = (this.symbolBuffer.length / 4) * 3;
        if (symbolBufferCapacity > byteBufferCapacity) {
            ArraysKt.copyInto(this.byteBuffer, this.byteBuffer, 0, this.byteBufferStartIndex, this.byteBufferEndIndex);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    private final int handlePaddingSymbol(int symbolBufferLength) throws IOException {
        this.symbolBuffer[symbolBufferLength] = 61;
        if ((symbolBufferLength & 3) == 2) {
            int secondPad = readNextSymbol();
            if (secondPad >= 0) {
                this.symbolBuffer[symbolBufferLength + 1] = (byte) secondPad;
            }
            return symbolBufferLength + 2;
        }
        return symbolBufferLength + 1;
    }

    private final int readNextSymbol() throws IOException {
        int read;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            read = this.input.read();
            if (read == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(read));
        return read;
    }
}
