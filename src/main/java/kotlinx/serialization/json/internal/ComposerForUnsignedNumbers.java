package kotlinx.serialization.json.internal;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ComposerForUnsignedNumbers.class */
@SuppressAnimalSniffer
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter writer, boolean forceQuoting) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = forceQuoting;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v) {
        if (this.forceQuoting) {
            printQuoted(Integer.toUnsignedString(UInt.m326constructorimpl(v)));
        } else {
            print(Integer.toUnsignedString(UInt.m326constructorimpl(v)));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v) {
        if (this.forceQuoting) {
            printQuoted(Long.toUnsignedString(ULong.m406constructorimpl(v)));
        } else {
            print(Long.toUnsignedString(ULong.m406constructorimpl(v)));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v) {
        if (this.forceQuoting) {
            printQuoted(UByte.m243toStringimpl(UByte.m246constructorimpl(v)));
        } else {
            print(UByte.m243toStringimpl(UByte.m246constructorimpl(v)));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v) {
        if (this.forceQuoting) {
            printQuoted(UShort.m510toStringimpl(UShort.m513constructorimpl(v)));
        } else {
            print(UShort.m510toStringimpl(UShort.m513constructorimpl(v)));
        }
    }
}
