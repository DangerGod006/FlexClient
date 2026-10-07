package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl.class */
@JsonFriendModuleApi
public abstract class InternalJsonReaderCodePointImpl implements InternalJsonReader {

    @Nullable
    private Character bufferedChar;

    public abstract boolean exhausted();

    public abstract int nextCodePoint();

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public final int read(@NotNull char[] buffer, int bufferOffset, int count) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = 0;
        if (this.bufferedChar != null) {
            Character ch = this.bufferedChar;
            Intrinsics.checkNotNull(ch);
            buffer[bufferOffset + 0] = ch.charValue();
            i = 0 + 1;
            this.bufferedChar = null;
        }
        while (i < count && !exhausted()) {
            int codePoint = nextCodePoint();
            if (codePoint <= 65535) {
                buffer[bufferOffset + i] = (char) codePoint;
                i++;
            } else {
                char upChar = (char) ((codePoint >>> 10) + 55232);
                char lowChar = (char) ((codePoint & 1023) + CharCompanionObject.MIN_LOW_SURROGATE);
                buffer[bufferOffset + i] = upChar;
                i++;
                if (i < count) {
                    buffer[bufferOffset + i] = lowChar;
                    i++;
                } else {
                    this.bufferedChar = Character.valueOf(lowChar);
                }
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }
}
