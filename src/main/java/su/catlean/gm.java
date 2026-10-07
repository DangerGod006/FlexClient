package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gm.class */
public final /* synthetic */ class gm {
    public static final int[] Y;

    static {
        int[] iArr = new int[nl.values().length];
        try {
            iArr[nl.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[nl.VULCAN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        Y = iArr;
    }
}
