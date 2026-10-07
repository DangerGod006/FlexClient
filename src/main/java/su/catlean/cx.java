package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/cx.class */
public final /* synthetic */ class cx {
    public static final int[] x;

    static {
        int[] iArr = new int[ni.values().length];
        try {
            iArr[ni.NCP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ni.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[ni.ANTI.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        x = iArr;
    }
}
