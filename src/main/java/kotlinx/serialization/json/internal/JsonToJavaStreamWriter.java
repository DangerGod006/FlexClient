package kotlinx.serialization.json.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.uuid.Uuid;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonToJavaStreamWriter.class */
public final class JsonToJavaStreamWriter implements InternalJsonWriter {

    @NotNull
    private final OutputStream stream;

    @NotNull
    private final byte[] buffer;

    @NotNull
    private char[] charArray;
    private int indexInBuffer;

    public JsonToJavaStreamWriter(@NotNull OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) throws IOException {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c) throws IOException {
        writeUtf8CodePoint(c);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] arr = this.charArray;
        arr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, arr, 1);
        int i = 1 + length;
        for (int i2 = 1; i2 < i; i2++) {
            char c = arr[i2];
            if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i2, text);
                return;
            }
        }
        arr[length + 1] = '\"';
        writeUtf8(arr, length + 2);
        flush();
    }

    private final void appendStringSlowPath(int currentSize, String string) throws IOException {
        int sz = currentSize;
        int length = string.length();
        for (int i = currentSize - 1; i < length; i++) {
            int sz2 = ensureTotalCapacity(sz, 2);
            int ch = string.charAt(i);
            if (ch < StringOpsKt.getESCAPE_MARKERS().length) {
                byte marker = StringOpsKt.getESCAPE_MARKERS()[ch];
                if (marker == 0) {
                    sz = sz2 + 1;
                    this.charArray[sz2] = (char) ch;
                } else if (marker == 1) {
                    String escapedString = StringOpsKt.getESCAPE_STRINGS()[ch];
                    Intrinsics.checkNotNull(escapedString);
                    int sz3 = ensureTotalCapacity(sz2, escapedString.length());
                    escapedString.getChars(0, escapedString.length(), this.charArray, sz3);
                    sz = sz3 + escapedString.length();
                } else {
                    this.charArray[sz2] = '\\';
                    this.charArray[sz2 + 1] = (char) marker;
                    sz = sz2 + 2;
                }
            } else {
                sz = sz2 + 1;
                this.charArray[sz2] = (char) ch;
            }
        }
        ensureTotalCapacity(sz, 1);
        this.charArray[sz] = '\"';
        writeUtf8(this.charArray, sz + 1);
        flush();
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int newSize = oldSize + additional;
        if (this.charArray.length <= newSize) {
            char[] cArrCopyOf = Arrays.copyOf(this.charArray, RangesKt.coerceAtLeast(newSize, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.charArray = cArrCopyOf;
        }
        return oldSize;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() throws IOException {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    private final void flush() throws IOException {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final void ensure(int bytesCount) throws IOException {
        if (this.buffer.length - this.indexInBuffer < bytesCount) {
            flush();
        }
    }

    private final void write(int i) {
        byte[] bArr = this.buffer;
        int i2 = this.indexInBuffer;
        this.indexInBuffer = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void writeUtf8(char[] string, int count) throws IOException {
        char c;
        if (!(count >= 0)) {
            throw new IllegalArgumentException("count < 0".toString());
        }
        if (!(count <= string.length)) {
            throw new IllegalArgumentException(("count > string.length: " + count + " > " + string.length).toString());
        }
        int i = 0;
        while (i < count) {
            char c2 = string[i];
            if (c2 >= 128) {
                if (c2 >= 2048) {
                    if (c2 >= 55296 && c2 <= 57343) {
                        int low = i + 1 < count ? string[i + 1] : (char) 0;
                        if (c2 <= 56319) {
                            boolean z = 56320 <= low && low < 57344;
                            if (z) {
                                int codePoint = 65536 + (((c2 & 1023) << 10) | (low & 1023));
                                if (this.buffer.length - this.indexInBuffer < 4) {
                                    flush();
                                }
                                int byte$iv = (codePoint >> 18) | 240;
                                byte[] bArr = this.buffer;
                                int i2 = this.indexInBuffer;
                                this.indexInBuffer = i2 + 1;
                                bArr[i2] = (byte) byte$iv;
                                int byte$iv2 = ((codePoint >> 12) & 63) | Uuid.SIZE_BITS;
                                byte[] bArr2 = this.buffer;
                                int i3 = this.indexInBuffer;
                                this.indexInBuffer = i3 + 1;
                                bArr2[i3] = (byte) byte$iv2;
                                int byte$iv3 = ((codePoint >> 6) & 63) | Uuid.SIZE_BITS;
                                byte[] bArr3 = this.buffer;
                                int i4 = this.indexInBuffer;
                                this.indexInBuffer = i4 + 1;
                                bArr3[i4] = (byte) byte$iv3;
                                int byte$iv4 = (codePoint & 63) | Uuid.SIZE_BITS;
                                byte[] bArr4 = this.buffer;
                                int i5 = this.indexInBuffer;
                                this.indexInBuffer = i5 + 1;
                                bArr4[i5] = (byte) byte$iv4;
                                i += 2;
                            }
                        }
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr5 = this.buffer;
                        int i6 = this.indexInBuffer;
                        this.indexInBuffer = i6 + 1;
                        bArr5[i6] = (byte) 63;
                        i++;
                    } else {
                        if (this.buffer.length - this.indexInBuffer < 3) {
                            flush();
                        }
                        int byte$iv5 = (c2 >> '\f') | 224;
                        byte[] bArr6 = this.buffer;
                        int i7 = this.indexInBuffer;
                        this.indexInBuffer = i7 + 1;
                        bArr6[i7] = (byte) byte$iv5;
                        int byte$iv6 = ((c2 >> 6) & 63) | Uuid.SIZE_BITS;
                        byte[] bArr7 = this.buffer;
                        int i8 = this.indexInBuffer;
                        this.indexInBuffer = i8 + 1;
                        bArr7[i8] = (byte) byte$iv6;
                        int byte$iv7 = (c2 & '?') | Uuid.SIZE_BITS;
                        byte[] bArr8 = this.buffer;
                        int i9 = this.indexInBuffer;
                        this.indexInBuffer = i9 + 1;
                        bArr8[i9] = (byte) byte$iv7;
                        i++;
                    }
                } else {
                    if (this.buffer.length - this.indexInBuffer < 2) {
                        flush();
                    }
                    int byte$iv8 = (c2 >> 6) | 192;
                    byte[] bArr9 = this.buffer;
                    int i10 = this.indexInBuffer;
                    this.indexInBuffer = i10 + 1;
                    bArr9[i10] = (byte) byte$iv8;
                    int byte$iv9 = (c2 & '?') | Uuid.SIZE_BITS;
                    byte[] bArr10 = this.buffer;
                    int i11 = this.indexInBuffer;
                    this.indexInBuffer = i11 + 1;
                    bArr10[i11] = (byte) byte$iv9;
                    i++;
                }
            } else {
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr11 = this.buffer;
                int i12 = this.indexInBuffer;
                this.indexInBuffer = i12 + 1;
                bArr11[i12] = (byte) c2;
                i++;
                int runLimit = Math.min(count, i + (this.buffer.length - this.indexInBuffer));
                while (i < runLimit && (c = string[i]) < 128) {
                    byte[] bArr12 = this.buffer;
                    int i13 = this.indexInBuffer;
                    this.indexInBuffer = i13 + 1;
                    bArr12[i13] = (byte) c;
                    i++;
                }
            }
        }
    }

    private final void writeUtf8CodePoint(int codePoint) throws IOException {
        if (codePoint >= 128) {
            if (codePoint >= 2048) {
                boolean z = 55296 <= codePoint && codePoint < 57344;
                if (!z) {
                    if (codePoint >= 65536) {
                        if (codePoint > 1114111) {
                            throw new JsonEncodingException("Unexpected code point: " + codePoint);
                        }
                        if (this.buffer.length - this.indexInBuffer < 4) {
                            flush();
                        }
                        int byte$iv = (codePoint >> 18) | 240;
                        byte[] bArr = this.buffer;
                        int i = this.indexInBuffer;
                        this.indexInBuffer = i + 1;
                        bArr[i] = (byte) byte$iv;
                        int byte$iv2 = ((codePoint >> 12) & 63) | Uuid.SIZE_BITS;
                        byte[] bArr2 = this.buffer;
                        int i2 = this.indexInBuffer;
                        this.indexInBuffer = i2 + 1;
                        bArr2[i2] = (byte) byte$iv2;
                        int byte$iv3 = ((codePoint >> 6) & 63) | Uuid.SIZE_BITS;
                        byte[] bArr3 = this.buffer;
                        int i3 = this.indexInBuffer;
                        this.indexInBuffer = i3 + 1;
                        bArr3[i3] = (byte) byte$iv3;
                        int byte$iv4 = (codePoint & 63) | Uuid.SIZE_BITS;
                        byte[] bArr4 = this.buffer;
                        int i4 = this.indexInBuffer;
                        this.indexInBuffer = i4 + 1;
                        bArr4[i4] = (byte) byte$iv4;
                        return;
                    }
                    if (this.buffer.length - this.indexInBuffer < 3) {
                        flush();
                    }
                    int byte$iv5 = (codePoint >> 12) | 224;
                    byte[] bArr5 = this.buffer;
                    int i5 = this.indexInBuffer;
                    this.indexInBuffer = i5 + 1;
                    bArr5[i5] = (byte) byte$iv5;
                    int byte$iv6 = ((codePoint >> 6) & 63) | Uuid.SIZE_BITS;
                    byte[] bArr6 = this.buffer;
                    int i6 = this.indexInBuffer;
                    this.indexInBuffer = i6 + 1;
                    bArr6[i6] = (byte) byte$iv6;
                    int byte$iv7 = (codePoint & 63) | Uuid.SIZE_BITS;
                    byte[] bArr7 = this.buffer;
                    int i7 = this.indexInBuffer;
                    this.indexInBuffer = i7 + 1;
                    bArr7[i7] = (byte) byte$iv7;
                    return;
                }
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr8 = this.buffer;
                int i8 = this.indexInBuffer;
                this.indexInBuffer = i8 + 1;
                bArr8[i8] = (byte) 63;
                return;
            }
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            int byte$iv8 = (codePoint >> 6) | 192;
            byte[] bArr9 = this.buffer;
            int i9 = this.indexInBuffer;
            this.indexInBuffer = i9 + 1;
            bArr9[i9] = (byte) byte$iv8;
            int byte$iv9 = (codePoint & 63) | Uuid.SIZE_BITS;
            byte[] bArr10 = this.buffer;
            int i10 = this.indexInBuffer;
            this.indexInBuffer = i10 + 1;
            bArr10[i10] = (byte) byte$iv9;
            return;
        }
        if (this.buffer.length - this.indexInBuffer < 1) {
            flush();
        }
        byte[] bArr11 = this.buffer;
        int i11 = this.indexInBuffer;
        this.indexInBuffer = i11 + 1;
        bArr11[i11] = (byte) codePoint;
    }
}
