package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bw.class */
public final /* synthetic */ class bw {
    public static final int[] i;

    static {
        int[] iArr = new int[nc.values().length];
        try {
            iArr[nc.Block.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[nc.Grow.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[nc.Shrink.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        i = iArr;
    }
}
