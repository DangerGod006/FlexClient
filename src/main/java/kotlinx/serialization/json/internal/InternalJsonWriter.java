package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/InternalJsonWriter.class */
@JsonFriendModuleApi
public interface InternalJsonWriter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    void writeLong(long j);

    void writeChar(char c);

    void write(@NotNull String str);

    void writeQuoted(@NotNull String str);

    void release();

    /* JADX INFO: compiled from: JsonStreams.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/InternalJsonWriter$Companion.class */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final void doWriteEscaping(@NotNull String text, @NotNull Function3<? super String, ? super Integer, ? super Integer, Unit> writeImpl) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(writeImpl, "writeImpl");
            int lastPos = 0;
            int length = text.length();
            for (int i = 0; i < length; i++) {
                int c = text.charAt(i);
                if (c < StringOpsKt.getESCAPE_STRINGS().length && StringOpsKt.getESCAPE_STRINGS()[c] != null) {
                    writeImpl.invoke(text, Integer.valueOf(lastPos), Integer.valueOf(i));
                    String escape = StringOpsKt.getESCAPE_STRINGS()[c];
                    Intrinsics.checkNotNull(escape);
                    writeImpl.invoke(escape, 0, Integer.valueOf(escape.length()));
                    lastPos = i + 1;
                }
            }
            writeImpl.invoke(text, Integer.valueOf(lastPos), Integer.valueOf(text.length()));
        }
    }
}
