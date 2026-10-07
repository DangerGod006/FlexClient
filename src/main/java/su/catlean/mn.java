package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mn.class */
public final /* synthetic */ class mn {
    public static final int[] a;

    static {
        int[] iArr = new int[w2.values().length];
        try {
            iArr[w2.FOV.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[w2.HEALTH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[w2.DISTANCE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        a = iArr;
    }
}
