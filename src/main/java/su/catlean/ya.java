package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ya.class */
public final /* synthetic */ class ya {
    public static final int[] u;
    public static final int[] x;

    static {
        int[] iArr = new int[ji.values().length];
        try {
            iArr[ji.SINE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ji.ROAMING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[ji.DRUNK_SINE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[ji.RANDOM.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr[ji.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        u = iArr;
        int[] iArr2 = new int[my.values().length];
        try {
            iArr2[my.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            iArr2[my.EYES.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr2[my.ROAMING.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
        try {
            iArr2[my.RUST.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
        }
        try {
            iArr2[my.CLOSEST.ordinal()] = 5;
        } catch (NoSuchFieldError e10) {
        }
        x = iArr2;
    }
}
