package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_4.class */
public final class _4 extends _d {

    @NotNull
    public static final _4 l;
    private static final long i = yz.a(8483872058818725846L, -6435918021674741058L, MethodHandles.lookup().lookupClass()).a(49829903838760L);
    private static final String o;

    private _4(long j) {
        super(o, jt.n(), (i ^ j) ^ 4738147213897L);
    }

    @Flow
    private final void a(PlayerUpdateEvent playerUpdateEvent) {
        long j = i ^ 8337758205231L;
        J((int) (j >>> 32), (class_1657) zf.v(j ^ 32951491083350L), (int) (((j ^ 78802197779788L) << 32) >>> 32));
    }

    static {
        long j = (i ^ 112512926829860L) ^ 105919699084151L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((r0 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        o = d(cipher.doFinal("Î7¬\u0092Ý\b©Ô\u0014C\u008aµ=÷3È".getBytes("ISO-8859-1"))).intern();
        l = new _4(j);
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
