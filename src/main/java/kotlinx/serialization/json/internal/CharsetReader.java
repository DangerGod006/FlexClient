package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CharsetReader.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/CharsetReader.class */
public final class CharsetReader {

    @NotNull
    private final InputStream inputStream;

    @NotNull
    private final Charset charset;

    @NotNull
    private final CharsetDecoder decoder;

    @NotNull
    private final ByteBuffer byteBuffer;
    private boolean hasLeftoverPotentiallySurrogateChar;
    private char leftoverChar;

    public CharsetReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.inputStream = inputStream;
        this.charset = charset;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = this.charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        Intrinsics.checkNotNullExpressionValue(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.decoder = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        this.byteBuffer = byteBufferWrap;
        this.byteBuffer.flip();
    }

    public final int read(@NotNull char[] array, int offset, int length) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (length == 0) {
            return 0;
        }
        boolean z = 0 <= offset && offset < array.length;
        if (!(z && length >= 0 && offset + length <= array.length)) {
            throw new IllegalArgumentException(("Unexpected arguments: " + offset + ", " + length + ", " + array.length).toString());
        }
        int offset2 = offset;
        int length2 = length;
        int bytesRead = 0;
        if (this.hasLeftoverPotentiallySurrogateChar) {
            array[offset2] = this.leftoverChar;
            offset2++;
            length2--;
            this.hasLeftoverPotentiallySurrogateChar = false;
            bytesRead = 1;
            if (length2 == 0) {
                return 1;
            }
        }
        if (length2 == 1) {
            int c = oneShotReadSlowPath();
            if (c != -1) {
                array[offset2] = (char) c;
                return bytesRead + 1;
            }
            if (bytesRead == 0) {
                return -1;
            }
            return bytesRead;
        }
        return doRead(array, offset2, length2) + bytesRead;
    }

    private final int doRead(char[] array, int offset, int length) throws CharacterCodingException {
        CharBuffer charBuffer = CharBuffer.wrap(array, offset, length);
        if (charBuffer.position() != 0) {
            charBuffer = charBuffer.slice();
        }
        boolean isEof = false;
        while (true) {
            CoderResult cr = this.decoder.decode(this.byteBuffer, charBuffer, isEof);
            if (cr.isUnderflow()) {
                if (isEof || !charBuffer.hasRemaining()) {
                    break;
                }
                int n = fillByteBuffer();
                if (n < 0) {
                    isEof = true;
                    if (charBuffer.position() == 0 && !this.byteBuffer.hasRemaining()) {
                        break;
                    }
                    this.decoder.reset();
                } else {
                    continue;
                }
            } else if (cr.isOverflow()) {
                boolean z = charBuffer.position() > 0;
                if (_Assertions.ENABLED && !z) {
                    throw new AssertionError("Assertion failed");
                }
            } else {
                cr.throwException();
            }
        }
        if (isEof) {
            this.decoder.reset();
        }
        if (charBuffer.position() == 0) {
            return -1;
        }
        return charBuffer.position();
    }

    private final int fillByteBuffer() {
        this.byteBuffer.compact();
        try {
            int limit = this.byteBuffer.limit();
            int position = this.byteBuffer.position();
            int remaining = position <= limit ? limit - position : 0;
            int bytesRead = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + position, remaining);
            if (bytesRead < 0) {
                return bytesRead;
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + bytesRead);
            this.byteBuffer.flip();
            return this.byteBuffer.remaining();
        } finally {
            this.byteBuffer.flip();
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.hasLeftoverPotentiallySurrogateChar) {
            this.hasLeftoverPotentiallySurrogateChar = false;
            return this.leftoverChar;
        }
        char[] array = new char[2];
        int bytesRead = read(array, 0, 2);
        switch (bytesRead) {
            case -1:
                return -1;
            case 0:
            default:
                throw new IllegalStateException(("Unreachable state: " + bytesRead).toString());
            case 1:
                return array[0];
            case 2:
                this.leftoverChar = array[1];
                this.hasLeftoverPotentiallySurrogateChar = true;
                return array[0];
        }
    }

    public final void release() {
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.INSTANCE;
        byte[] bArrArray = this.byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        byteArrayPool8k.release(bArrArray);
    }
}
