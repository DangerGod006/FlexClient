package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/o5.class */
public final /* synthetic */ class o5 {
    public static final int[] i;

    static {
        int[] iArr = new int[l8.values().length];
        try {
            iArr[l8.Distance.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[l8.FOV.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[l8.Health.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        i = iArr;
    }
}
