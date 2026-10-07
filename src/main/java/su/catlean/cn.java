package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/cn.class */
final class cn {

    @NotNull
    private final Function0 N;

    @NotNull
    private final Function0 Z;
    public static final cn FIREWORK;
    public static final cn FRIEND;
    public static final cn PEARL;
    public static final cn XP;
    public static final cn NONE;
    private static final cn[] p;
    private static final EnumEntries T;
    private static final long a = yz.a(6600132333390343143L, -8488503337729565593L, MethodHandles.lookup().lookupClass()).a(128603587947717L);

    private cn(String str, int i, Function0 function0, Function0 function02) {
        this.N = function0;
        this.Z = function02;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    cn(String str, int i, Function0 function0, Function0 function02, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, function0, (i2 & 2) != 0 ? cn::a : function02);
        long j2 = a ^ j;
    }

    @NotNull
    public final Function0 b() {
        return this.N;
    }

    @NotNull
    public final Function0 I() {
        return this.Z;
    }

    public static cn[] values() {
        return (cn[]) p.clone();
    }

    public static cn valueOf(String value) {
        return (cn) Enum.valueOf(cn.class, value);
    }

    @NotNull
    public static EnumEntries Z() {
        return T;
    }

    private static final Unit a() {
        return Unit.INSTANCE;
    }

    private static final Unit R() {
        long j = a ^ 108325993465867L;
        q5.Z((int) (j >>> 32), q5.E, (short) ((r1 << 32) >>> 48), (int) (((j ^ 5594905191204L) << 48) >>> 48));
        return Unit.INSTANCE;
    }

    private static final Unit p() {
        long j = a ^ 16195693038981L;
        q5.a((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 66809622305950L) << 48) >>> 48), q5.E);
        return Unit.INSTANCE;
    }

    private static final Unit A() {
        long j = a ^ 49518891935974L;
        long j2 = j ^ 123972177184403L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 11824978638420L;
        int i4 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7055816463354122905L, j) /* invoke-custom */;
        q5 q5Var = q5.E;
        if (i4 != 0) {
            try {
                if (!q5.q(i, (char) i2, i3, q5Var)) {
                    q5Var = q5.E;
                    q5.g(q5Var, j3);
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(q5Var, 6971501159314684316L, j) /* invoke-custom */;
            }
        } else {
            q5.g(q5Var, j3);
        }
        return Unit.INSTANCE;
    }

    private static final Unit c() {
        long j = a ^ 53639518175631L;
        long j2 = j ^ 119854989225978L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 25290247855933L;
        int i4 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8610224490941989904L, j) /* invoke-custom */;
        q5 q5Var = q5.E;
        if (i4 != 0) {
            try {
                if (q5.q(i, (char) i2, i3, q5Var)) {
                    q5Var = q5.E;
                    q5.g(q5Var, j3);
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(q5Var, -8514439240510664459L, j) /* invoke-custom */;
            }
        } else {
            q5.g(q5Var, j3);
        }
        return Unit.INSTANCE;
    }

    private static final Unit d() {
        q5.B(q5.E, (a ^ 67987294254988L) ^ 104942484752174L);
        return Unit.INSTANCE;
    }

    private static final Unit f() {
        return Unit.INSTANCE;
    }

    private static final cn[] B() {
        return new cn[]{FIREWORK, FRIEND, PEARL, XP, NONE};
    }

    static {
        int i;
        long j = (a ^ 54689810113001L) ^ 151330888774L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((r0 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "ÿw×j~\u00155Ã\u000fe\"\u0001ç¹\u009bg\bÚÂ´Ù@DÃ\u0001\bO§\u000bø\u0090º\u0015¼";
        int length = "ÿw×j~\u00155Ã\u000fe\"\u0001ç¹\u009bg\bÚÂ´Ù@DÃ\u0001\bO§\u000bø\u0090º\u0015¼".length();
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
                            FIREWORK = new cn(strArr[0], 0, cn::R, null, j, 2, null);
                            FRIEND = new cn(strArr[2], 1, cn::p, null, j, 2, null);
                            PEARL = new cn(strArr[3], 2, cn::A, cn::c);
                            XP = new cn(strArr[1], 3, cn::d, null, j, 2, null);
                            NONE = new cn(strArr[4], 4, cn::f, null, j, 2, null);
                            p = B();
                            T = EnumEntriesKt.enumEntries(p);
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
                        str = "\u000eD\u008c\u001f\u009döÄb\b0hæ\u001e0y\u000e\u0081";
                        length = "\u000eD\u008c\u001f\u009döÄb\b0hæ\u001e0y\u000e\u0081".length();
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
