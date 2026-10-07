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
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m0.class */
public final class m0 {

    @NotNull
    private final class_1792 D;

    @NotNull
    private final class_1792 o;

    @NotNull
    private final class_1792 y;
    public static final m0 SPEED;
    public static final m0 STRENGTH;
    public static final m0 FIRE_RESISTANCE;
    public static final m0 INVISIBILITY;
    private static final /* synthetic */ m0[] z;
    private static final /* synthetic */ EnumEntries q;
    private static int E;

    private m0(String str, int i, class_1792 class_1792Var, class_1792 class_1792Var2, class_1792 class_1792Var3) {
        this.D = class_1792Var;
        this.o = class_1792Var2;
        this.y = class_1792Var3;
    }

    @NotNull
    public final class_1792 e() {
        return this.D;
    }

    @NotNull
    public final class_1792 D() {
        return this.o;
    }

    @NotNull
    public final class_1792 Q() {
        return this.y;
    }

    public static m0[] values() {
        return (m0[]) z.clone();
    }

    public static m0 valueOf(String value) {
        return (m0) Enum.valueOf(m0.class, value);
    }

    @NotNull
    public static EnumEntries q() {
        return q;
    }

    private static final /* synthetic */ m0[] V() {
        return new m0[]{SPEED, STRENGTH, FIRE_RESISTANCE, INVISIBILITY};
    }

    static {
        int i;
        long jA = yz.a(5425629107657822773L, -8076617250336727802L, MethodHandles.lookup().lookupClass()).a(129589830581030L) ^ 96006362818641L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8624387327524465611L, jA) /* invoke-custom */ == 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(95, 8617926576472209343L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i3 = 0;
        String str = "Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\b\u001et´®\u0082\u0083è9\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u00105\u008aô§ÁãûJp«çvv2\u0002¾\u0010Æ\u0094Ç\u008a¢Ë2*\\º\u0019ÑIø$A\u0010¤ÉN\u0011Hò§\u00129\b7^¸mP´\u0018lôu\bC\u0019\u001aã`B\u0083{\u0095ªÁÂæwa\u0012¯>\u0017÷\u0010Ú\u0094J=\u001fêÁßåap\u0091ê3ØM\u0010Fq\u0006\u008f¸2åqÍm¢Ì;eµ¸\u0010Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\bñ0·UA t}\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u0010´ä!ï.Ç,DÉ\u009e\u008fÊ`\u0098l\u001e";
        int length = "Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\b\u001et´®\u0082\u0083è9\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u00105\u008aô§ÁãûJp«çvv2\u0002¾\u0010Æ\u0094Ç\u008a¢Ë2*\\º\u0019ÑIø$A\u0010¤ÉN\u0011Hò§\u00129\b7^¸mP´\u0018lôu\bC\u0019\u001aã`B\u0083{\u0095ªÁÂæwa\u0012¯>\u0017÷\u0010Ú\u0094J=\u001fêÁßåap\u0091ê3ØM\u0010Fq\u0006\u008f¸2åqÍm¢Ì;eµ¸\u0010Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\bñ0·UA t}\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u0010´ä!ï.Ç,DÉ\u009e\u008fÊ`\u0098l\u001e".length();
        char cCharAt = 16;
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
                            String str3 = strArr[1];
                            class_1792 class_1792Var = class_1802.field_8479;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var, strArr[13]);
                            class_1792 class_1792Var2 = class_1802.field_8162;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var2, strArr[10]);
                            class_1792 class_1792Var3 = class_1802.field_8601;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var3, strArr[2]);
                            SPEED = new m0(str3, 0, class_1792Var, class_1792Var2, class_1792Var3);
                            String str4 = strArr[4];
                            class_1792 class_1792Var4 = class_1802.field_8183;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var4, strArr[8]);
                            class_1792 class_1792Var5 = class_1802.field_8162;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var5, strArr[14]);
                            class_1792 class_1792Var6 = class_1802.field_8601;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var6, strArr[11]);
                            STRENGTH = new m0(str4, 1, class_1792Var4, class_1792Var5, class_1792Var6);
                            String str5 = strArr[7];
                            class_1792 class_1792Var7 = class_1802.field_8135;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var7, strArr[5]);
                            class_1792 class_1792Var8 = class_1802.field_8162;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var8, strArr[14]);
                            class_1792 class_1792Var9 = class_1802.field_8725;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var9, strArr[9]);
                            FIRE_RESISTANCE = new m0(str5, 2, class_1792Var7, class_1792Var8, class_1792Var9);
                            String str6 = strArr[3];
                            class_1792 class_1792Var10 = class_1802.field_8071;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var10, strArr[12]);
                            class_1792 class_1792Var11 = class_1802.field_8711;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var11, strArr[6]);
                            class_1792 class_1792Var12 = class_1802.field_8725;
                            Intrinsics.checkNotNullExpressionValue(class_1792Var12, strArr[0]);
                            INVISIBILITY = new m0(str6, 3, class_1792Var10, class_1792Var11, class_1792Var12);
                            z = V();
                            q = EnumEntriesKt.enumEntries(z);
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
                        str = "´\u001a\u009f¡\u0012þÌ\u008a\bñ0·UA t}";
                        length = "´\u001a\u009f¡\u0012þÌ\u008a\bñ0·UA t}".length();
                        cCharAt = '\b';
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

    public static void l(int i) {
        E = i;
    }

    public static int B() {
        return E;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int v() {
        return B() == 0 ? 107 : 0;
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
