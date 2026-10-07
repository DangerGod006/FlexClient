package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yr.class */
public final /* synthetic */ class yr {
    public static final int[] h;

    static {
        int[] iArr = new int[jp.values().length];
        try {
            iArr[jp.VANILLA.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[jp.SEQUENTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[jp.GRIM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        h = iArr;
    }
}
