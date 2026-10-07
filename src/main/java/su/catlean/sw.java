package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sw.class */
public final /* synthetic */ class sw {
    public static final int[] M;

    static {
        int[] iArr = new int[ys.values().length];
        try {
            iArr[ys.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ys.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        M = iArr;
    }
}
