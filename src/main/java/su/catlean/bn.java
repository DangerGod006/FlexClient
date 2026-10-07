package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bn.class */
public final /* synthetic */ class bn {
    public static final int[] A;

    static {
        int[] iArr = new int[b3.values().length];
        try {
            iArr[b3.KIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[b3.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[b3.HOME.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[b3.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        A = iArr;
    }
}
