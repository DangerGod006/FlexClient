package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d3.class */
public final /* synthetic */ class d3 {
    public static final int[] D;

    static {
        int[] iArr = new int[zn.values().length];
        try {
            iArr[zn.Custom.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[zn.Cancel.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[zn.OldGrim.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[zn.GrimNew.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        D = iArr;
    }
}
