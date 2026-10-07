package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ly.class */
public final /* synthetic */ class ly {
    public static final int[] K;

    static {
        int[] iArr = new int[tz.values().length];
        try {
            iArr[tz.CUSTOM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[tz.SYNC.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[tz.SKY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[tz.LIGHT_RGB.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr[tz.RGB.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        K = iArr;
    }
}
