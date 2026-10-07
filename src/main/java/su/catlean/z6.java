package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/z6.class */
public final /* synthetic */ class z6 {
    public static final int[] K;
    public static final int[] h;

    static {
        int[] iArr = new int[p6.values().length];
        try {
            iArr[p6.NCP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[p6.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        K = iArr;
        int[] iArr2 = new int[wn.values().length];
        try {
            iArr2[wn.OLD.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr2[wn.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr2[wn.NEW.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        try {
            iArr2[wn.STRICT.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
        }
        h = iArr2;
    }
}
