package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/t.class */
public final /* synthetic */ class t {
    public static final int[] K;

    static {
        int[] iArr = new int[rw.values().length];
        try {
            iArr[rw.MIRROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[rw.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[rw.BLOOM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[rw.DOUBLE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr[rw.CAMOUFLAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        K = iArr;
    }
}
