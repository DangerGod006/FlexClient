package su.catlean;

import java.awt.Font;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/b8.class */
public final class b8 {
    public static c6 U;
    public static c6 W;
    public static c6 Q;
    public static c6 T;
    public static c6 Y;
    public static c6 c;
    public static c6 L;
    public static c6 t;
    public static c6 K;
    public static c6 a;

    @NotNull
    private static final List R;
    private static String[] J;
    private static final long b = yz.a(-322321680349859716L, -196398282025928332L, MethodHandles.lookup().lookupClass()).a(191101755471682L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 f(long j) {
        Object obj = b ^ j;
        try {
            obj = U;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12065, 4398754077371892783L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 9108265679141791349L, obj) /* invoke-custom */;
        }
    }

    public static final void t(@NotNull c6 c6Var, long a2) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207192783555000233L ^ (b ^ a2)) /* invoke-custom */);
        U = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 p(long j) {
        Object obj = b ^ j;
        try {
            obj = W;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12213, 3243850756071497661L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7309753520834280803L, obj) /* invoke-custom */;
        }
    }

    public static final void B(long a2, @NotNull c6 c6Var) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207248472090857665L ^ (b ^ a2)) /* invoke-custom */);
        W = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 n(long j) {
        Object obj = b ^ j;
        try {
            obj = Q;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30309, 595383523573931405L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4712925711063112054L, obj) /* invoke-custom */;
        }
    }

    public static final void f(@NotNull c6 c6Var, long a2) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10284, 8669395669667616976L ^ (b ^ a2)) /* invoke-custom */);
        Q = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 d(long j) {
        Object obj = b ^ j;
        try {
            obj = T;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20014, 3381219060338720307L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7309139926537731453L, obj) /* invoke-custom */;
        }
    }

    public static final void G(@NotNull c6 c6Var, long a2) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207187855501553396L ^ (b ^ a2)) /* invoke-custom */);
        T = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 k(long j) {
        Object obj = b ^ j;
        try {
            obj = Y;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31131, 2380187207634934717L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -622893558654800055L, obj) /* invoke-custom */;
        }
    }

    public static final void Q(int a2, long a3, @NotNull c6 c6Var) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207273318434055286L ^ (((((long) a2) << 32) | ((a3 << 32) >>> 32)) ^ b)) /* invoke-custom */);
        Y = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 t(long j) {
        Object obj = b ^ j;
        try {
            obj = c;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21318, 5935656650022965116L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3940830709063265955L, obj) /* invoke-custom */;
        }
    }

    public static final void a(@NotNull c6 c6Var, long a2) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207245291986646299L ^ (b ^ a2)) /* invoke-custom */);
        c = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 i(long j) {
        Object obj = b ^ j;
        try {
            obj = L;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26730, 6150109604045579376L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6440845915381743984L, obj) /* invoke-custom */;
        }
    }

    public static final void e(long a2, @NotNull c6 c6Var) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207221067969922042L ^ (b ^ a2)) /* invoke-custom */);
        L = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 h(long j) {
        Object obj = b ^ j;
        try {
            obj = t;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11835, 8103414831646284059L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2137385967964620220L, obj) /* invoke-custom */;
        }
    }

    public static final void g(long a2, @NotNull c6 c6Var) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207203430670074546L ^ (b ^ a2)) /* invoke-custom */);
        t = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 v(long j) {
        Object obj = b ^ j;
        try {
            obj = K;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23039, 5180734098759974459L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -956409432239674712L, obj) /* invoke-custom */;
        }
    }

    public static final void i(long a2, @NotNull c6 c6Var) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207214303433388897L ^ (b ^ a2)) /* invoke-custom */);
        K = c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean.c6] */
    @NotNull
    public static final c6 M(long j) {
        Object obj = b ^ j;
        try {
            obj = a;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9041, 7800176329367967765L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5895109419028826590L, obj) /* invoke-custom */;
        }
    }

    public static final void q(long a2, @NotNull c6 c6Var) {
        Intrinsics.checkNotNullParameter(c6Var, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16893, 2207284108708090002L ^ (b ^ a2)) /* invoke-custom */);
        a = c6Var;
    }

    @NotNull
    public static final List b() {
        return R;
    }

    @NotNull
    public static final Font G(int a2, float size, int a3, int a4, @NotNull String name) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ b;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26329, 2791113554767752725L ^ j) /* invoke-custom */);
        Font fontDeriveFont = Font.createFont(0, (InputStream) Objects.requireNonNull(CatLean.class.getClassLoader().getResourceAsStream((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15081, 1454630147495293483L ^ j) /* invoke-custom */ + name + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25283, 1082016091763354123L ^ j) /* invoke-custom */))).deriveFont(0, size);
        Intrinsics.checkNotNullExpressionValue(fontDeriveFont, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13008, 6094419458082208272L ^ j) /* invoke-custom */);
        return fontDeriveFont;
    }

    @NotNull
    public static final c6 x(char a2, int a3, float size, short a4, @NotNull String name) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ b;
        long j2 = j ^ 43462366376044L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11301, 1548740246323361302L ^ j) /* invoke-custom */);
        c6 c6Var = new c6(G(i, size, i2, i3, name), G(i, size, i2, i3, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24321, 8578778762292987188L ^ j) /* invoke-custom */), j ^ 77577180628333L, size);
        R.add(c6Var);
        return c6Var;
    }

    static {
        int i;
        long j = b ^ 54978020664727L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[1], -4147898798867597018L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[18];
        int i3 = 0;
        String str = "\fòfAÝIØjU\u009aþ´«üeþ\u0010¢ÕÜ\u0083'\u008eÚ?Ãå\u0088Ö\u00861f×\u0010&0`\u0000\u0089\u0016(-@.Ê¯C\u0001n1\u0010ËAÕnfµ\u0015X\u001eçÃ\u0089-x\u0001Y\u0010Êù\u001e3\nrª>%Ô\u009câ\u000e\u00858z\u0010ÝJM{Ä\u0091P\u008c.°ÃG\u0001è\u00adY\u0010ð\u0085\f\u0085Ù6s¤k¨\u000fbhK\u009bµ\u0010×Pû\u0011v\b)\u0016ûø]8ùÏBç(@DM\u0088Y$\u0018ÌÁ\u001eþÏ\u008bX\u0089Aj\u0004r|3Í£\u000fÌ+\u001c£\u001eª\u009fa «Ïn\u007f¾Ða\u0010zìKE\u0003ó\u0010\u008b©0Âõü¥ñI u\u0097_s«\"'§rÛ\u009fÚb´µ\t\u001e\u0094eúo.í\u0083\u008d,(\u0016;?IT\u0010\u0019¤6Õ!W@çñ¼ \u0087\u0086Þ=ú\u0010¶LßøÕçuè\u0007\u009f+$SAöy\u0010´!S:\u0014\u0085\u0018¢É\u001a\u000e¤5\u0011e\b\u0010²r1S\u007fÝÞ\u0090CYk\u0096¨\u001eJD\u0010öT×÷ù7\u001fbuK\u001cíï´¨\u007f";
        int length = "\fòfAÝIØjU\u009aþ´«üeþ\u0010¢ÕÜ\u0083'\u008eÚ?Ãå\u0088Ö\u00861f×\u0010&0`\u0000\u0089\u0016(-@.Ê¯C\u0001n1\u0010ËAÕnfµ\u0015X\u001eçÃ\u0089-x\u0001Y\u0010Êù\u001e3\nrª>%Ô\u009câ\u000e\u00858z\u0010ÝJM{Ä\u0091P\u008c.°ÃG\u0001è\u00adY\u0010ð\u0085\f\u0085Ù6s¤k¨\u000fbhK\u009bµ\u0010×Pû\u0011v\b)\u0016ûø]8ùÏBç(@DM\u0088Y$\u0018ÌÁ\u001eþÏ\u008bX\u0089Aj\u0004r|3Í£\u000fÌ+\u001c£\u001eª\u009fa «Ïn\u007f¾Ða\u0010zìKE\u0003ó\u0010\u008b©0Âõü¥ñI u\u0097_s«\"'§rÛ\u009fÚb´µ\t\u001e\u0094eúo.í\u0083\u008d,(\u0016;?IT\u0010\u0019¤6Õ!W@çñ¼ \u0087\u0086Þ=ú\u0010¶LßøÕçuè\u0007\u009f+$SAöy\u0010´!S:\u0014\u0085\u0018¢É\u001a\u000e¤5\u0011e\b\u0010²r1S\u007fÝÞ\u0090CYk\u0096¨\u001eJD\u0010öT×÷ù7\u001fbuK\u001cíï´¨\u007f".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            d = strArr;
                            e = new String[18];
                            R = new ArrayList();
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
                        str = "\u0011k³qúÊáo\u0010J\u001cvÖöÓU\u0010*m9\u0002\u0083:|ëÇ\u000b'¿\u0081)ûL";
                        length = "\u0011k³qúÊáo\u0010J\u001cvÖöÓU\u0010*m9\u0002\u0083:|ëÇ\u000b'¿\u0081)ûL".length();
                        cCharAt = 16;
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void A(String[] strArr) {
        J = strArr;
    }

    public static String[] E() {
        return J;
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21691;
        if (e[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i2] = a(((Cipher) objArr[0]).doFinal(d[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/b8", e2);
            }
        }
        return e[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 2
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/b8"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.b8.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
