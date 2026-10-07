package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yv.class */
public final /* synthetic */ class yv {
    public static final int[] D;

    static {
        int[] iArr = new int[oz.values().length];
        try {
            iArr[oz.Jitter.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[oz.Glide.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[oz.Off.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        D = iArr;
    }
}
