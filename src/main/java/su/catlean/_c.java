package su.catlean;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_c.class */
public final class _c extends _d {

    @NotNull
    public static final _c o = null;
    private static final long i = 0;
    private static final String l = null;
    private static final long O = 0;

    private _c(long j) {
        super(l, jt.Q(), (i ^ j) ^ 112840147166597L);
    }

    @Flow
    private final void T(PlayerUpdateEvent playerUpdateEvent) {
        long j = i ^ 91769781790107L;
        J((int) (j >>> 32), dx.Y((char) (j >>> 48), dx.K, Y(j ^ 53067929445375L), w2.FOV, false, false, (int) O, (int) (((j ^ 1589232921427L) << 16) >>> 32), (char) ((r1 << 48) >>> 48), null), (int) (((j ^ 48131890059899L) << 32) >>> 32));
    }

    private static String d(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }
}
