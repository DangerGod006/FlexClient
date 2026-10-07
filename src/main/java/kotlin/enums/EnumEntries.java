package kotlin.enums;

import java.lang.Enum;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/enums/EnumEntries.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
public interface EnumEntries<E extends Enum<E>> extends List<E>, KMappedMarker {
}
