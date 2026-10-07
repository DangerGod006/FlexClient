package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jy.class */
final class jy {

    @NotNull
    private final class_2960 o;

    @NotNull
    private final class_2960 q;
    public static final jy CONTAINER;
    public static final jy NORMAL;
    public static final jy ABSORBING;
    private static final jy[] j;
    private static final EnumEntries x;
    private static final long a = yz.a(1932610023855144807L, 3324433405844299484L, MethodHandles.lookup().lookupClass()).a(99569550897541L);

    private jy(String str, int i, class_2960 class_2960Var, class_2960 class_2960Var2) {
        this.o = class_2960Var;
        this.q = class_2960Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final class_2960 Z(long a2, boolean half) {
        long j2 = a ^ a2;
        class_2960 class_2960Var = half;
        if (class_2960Var == 0) {
            return this.o;
        }
        try {
            class_2960Var = this.q;
            return class_2960Var;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_2960Var, 6375507960969037285L, j2) /* invoke-custom */;
        }
    }

    public static jy[] values() {
        return (jy[]) j.clone();
    }

    public static jy valueOf(String value) {
        return (jy) Enum.valueOf(jy.class, value);
    }

    @NotNull
    public static EnumEntries S() {
        return x;
    }

    private static final jy[] a() {
        return new jy[]{CONTAINER, NORMAL, ABSORBING};
    }

    static {
        int i;
        long j2 = a ^ 118735757526252L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j2 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i3 = 0;
        String str = "¿\u009awks÷\rõôn\u0014$/V\u008f#\u000eß\u0007\u008c9\u009egSÃyÍI9Ü¼|\bZHõÔú*¿N\u0010¿\u009awks÷\rõëGø³+J¡u\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸\u0010Ô\u0016\u0080\u0001ý·¹?²ÑafZ\u0010\u0004á\u0010¿\u009awks÷\rõWèB\n·\u0097\u009fÞ ¿\u009awks÷\rõôn\u0014$/V\u008f#ò\u0094ñ£ý\u0005{5Î°\u0097\u0098r«\u008cç\u0010\u0084åÛÈº´Ý~\u009bp\f\u0018îPK\u0002\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸";
        int length = "¿\u009awks÷\rõôn\u0014$/V\u008f#\u000eß\u0007\u008c9\u009egSÃyÍI9Ü¼|\bZHõÔú*¿N\u0010¿\u009awks÷\rõëGø³+J¡u\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸\u0010Ô\u0016\u0080\u0001ý·¹?²ÑafZ\u0010\u0004á\u0010¿\u009awks÷\rõWèB\n·\u0097\u009fÞ ¿\u009awks÷\rõôn\u0014$/V\u008f#ò\u0094ñ£ý\u0005{5Î°\u0097\u0098r«\u008cç\u0010\u0084åÛÈº´Ý~\u009bp\f\u0018îPK\u0002\u0018¿\u009awks÷\rõöU¡\u0086\u00ad7e\u008b\u008e,g¬\u0086gl¸".length();
        char cCharAt = ' ';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            String str3 = strArr[7];
                            class_2960 class_2960VarMethod_60656 = class_2960.method_60656(strArr[3]);
                            Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_60656, strArr[10]);
                            class_2960 class_2960VarMethod_606562 = class_2960.method_60656(strArr[8]);
                            Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_606562, strArr[9]);
                            CONTAINER = new jy(str3, 0, class_2960VarMethod_60656, class_2960VarMethod_606562);
                            String str4 = strArr[1];
                            class_2960 class_2960VarMethod_606563 = class_2960.method_60656(strArr[2]);
                            Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_606563, strArr[9]);
                            class_2960 class_2960VarMethod_606564 = class_2960.method_60656(strArr[5]);
                            Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_606564, strArr[9]);
                            NORMAL = new jy(str4, 1, class_2960VarMethod_606563, class_2960VarMethod_606564);
                            String str5 = strArr[4];
                            class_2960 class_2960VarMethod_606565 = class_2960.method_60656(strArr[6]);
                            Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_606565, strArr[9]);
                            class_2960 class_2960VarMethod_606566 = class_2960.method_60656(strArr[0]);
                            Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_606566, strArr[9]);
                            ABSORBING = new jy(str5, 2, class_2960VarMethod_606565, class_2960VarMethod_606566);
                            j = a();
                            x = EnumEntriesKt.enumEntries(j);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g";
                        length = "w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g w\u0085\"ñü?öv\u0090ç0|VeÅ\u0095\u008dî\u008fæ4\u0013\r3¶ZUZ£\u0086¯g".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
