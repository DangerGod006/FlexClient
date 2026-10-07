package su.catlean;

import net.minecraft.class_1934;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/z8.class */
public final /* synthetic */ class z8 {
    public static final int[] s;
    public static final int[] R;
    public static final int[] m;

    static {
        int[] iArr = new int[al.values().length];
        try {
            iArr[al.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[al.SEMI.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[al.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        s = iArr;
        int[] iArr2 = new int[class_1934.values().length];
        try {
            iArr2[class_1934.field_9215.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr2[class_1934.field_9220.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        try {
            iArr2[class_1934.field_9219.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
        }
        try {
            iArr2[class_1934.field_9216.ordinal()] = 4;
        } catch (NoSuchFieldError e7) {
        }
        R = iArr2;
        int[] iArr3 = new int[_j.values().length];
        try {
            iArr3[_j.ScoreBoard.ordinal()] = 1;
        } catch (NoSuchFieldError e8) {
        }
        try {
            iArr3[_j.PlayerList.ordinal()] = 2;
        } catch (NoSuchFieldError e9) {
        }
        m = iArr3;
    }
}
