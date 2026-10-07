package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexFormat;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormatKt.class */
public final class HexFormatKt {
    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        HexFormat.Builder builder = new HexFormat.Builder();
        builderAction.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCaseSensitive(String $this$isCaseSensitive) {
        String $this$any$iv = $this$isCaseSensitive;
        for (int i = 0; i < $this$any$iv.length(); i++) {
            char element$iv = $this$any$iv.charAt(i);
            if (Intrinsics.compare((int) element$iv, Uuid.SIZE_BITS) >= 0 || Character.isLetter(element$iv)) {
                return true;
            }
        }
        return false;
    }
}
