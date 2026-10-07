package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dc.class */
public final /* synthetic */ class dc {
    public static final int[] y;

    static {
        int[] iArr = new int[b2.values().length];
        try {
            iArr[b2.FRAME.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[b2.CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        y = iArr;
    }
}
