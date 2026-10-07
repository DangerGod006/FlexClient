package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/j6.class */
public final /* synthetic */ class j6 {
    public static final int[] k;

    static {
        int[] iArr = new int[px.values().length];
        try {
            iArr[px.SERVER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[px.CLIENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[px.PREDICT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        k = iArr;
    }
}
