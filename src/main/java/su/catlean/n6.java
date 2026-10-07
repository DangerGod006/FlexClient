package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/n6.class */
public final /* synthetic */ class n6 {
    public static final int[] w;
    public static final int[] l;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.BOX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[w.OUTLINE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        w = iArr;
        int[] iArr2 = new int[gh.values().length];
        try {
            iArr2[gh.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr2[gh.WHITE_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        l = iArr2;
    }
}
