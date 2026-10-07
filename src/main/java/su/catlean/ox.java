package su.catlean;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ox.class */
public final /* synthetic */ class ox {
    public static final int[] m;
    public static final int[] J;
    public static final int[] I;

    static {
        int[] iArr = new int[s9.values().length];
        try {
            iArr[s9.COMETS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[s9.SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        m = iArr;
        int[] iArr2 = new int[x0.values().length];
        try {
            iArr2[x0.INVENTORY.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr2[x0.SILENT.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr2[x0.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        J = iArr2;
        int[] iArr3 = new int[fy.values().length];
        try {
            iArr3[fy.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            iArr3[fy.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr3[fy.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
        I = iArr3;
    }
}
