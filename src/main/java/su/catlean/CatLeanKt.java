package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CatLean.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/CatLeanKt.class */
public final class CatLeanKt {

    @NotNull
    public static final String K;

    @NotNull
    private static final ModContainer u;

    @NotNull
    public static final ModContainer y() {
        return u;
    }

    static {
        long jA = yz.a(-2813126912829381979L, -1174520337878320957L, MethodHandles.lookup().lookupClass()).a(121828399357397L) ^ 66403820449893L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = "ã28ýmºz´\u0018d\u009a>¦Å\u001d»ÂT{=Ã\u0087\u0088\u0004º².gKß\u0089\u001c=\bã28ýmºz´".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("ã28ýmºz´\u0018d\u009a>¦Å\u001d»ÂT{=Ã\u0087\u0088\u0004º².gKß\u0089\u001c=\bã28ýmºz´".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                K = strArr[0];
                Object objOrElseThrow = FabricLoader.getInstance().getModContainer(strArr[2]).orElseThrow();
                Intrinsics.checkNotNullExpressionValue(objOrElseThrow, strArr[1]);
                u = (ModContainer) objOrElseThrow;
                return;
            }
            cCharAt = "ã28ýmºz´\u0018d\u009a>¦Å\u001d»ÂT{=Ã\u0087\u0088\u0004º².gKß\u0089\u001c=\bã28ýmºz´".charAt(i3);
        }
    }

    private static String a(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = 255 & bArr[i2];
            if (i3 < 192) {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
            } else if (i3 < 224) {
                i2++;
                int i5 = i;
                i++;
                cArr[i5] = (char) (((char) (((char) (i3 & 31)) << 6)) | ((char) (bArr[i2] & 63)));
            } else if (i2 < length - 2) {
                int i6 = i2 + 1;
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
