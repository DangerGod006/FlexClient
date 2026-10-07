package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/r8.class */
public final /* synthetic */ class r8 {
    public static final int[] P;

    static {
        int[] iArr = new int[xb.values().length];
        try {
            iArr[xb.All.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[xb.Select.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[xb.WhiteList.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        P = iArr;
    }
}
