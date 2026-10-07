package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g0.class */
public final /* synthetic */ class g0 {
    public static final int[] U;

    static {
        int[] iArr = new int[af.values().length];
        try {
            iArr[af.MATRIX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[af.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[af.WATER_BUCKET.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[af.MATRIX_2.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr[af.FT_FENCE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        U = iArr;
    }
}
