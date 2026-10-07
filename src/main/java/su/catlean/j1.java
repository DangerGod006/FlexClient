package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import net.minecraft.class_591;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/j1.class */
public final class j1 {

    @NotNull
    private class_2960 u;

    @NotNull
    private class_591 X;

    @NotNull
    private ce K;
    private double c;
    private double V;
    private double o;
    private double H;
    private double k;
    private double g;
    private double L;
    private double Q;
    private double F;
    private double y;
    private double a;
    private double N;
    private double v;
    private double Y;
    private double O;
    private int B;
    private double e;
    private double U;
    private double s;
    private static final String[] d;
    private static final String[] f;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map l;
    private static final long b = yz.a(5678269027890003128L, 8501764410288743392L, MethodHandles.lookup().lookupClass()).a(28708935639791L);
    private static final Map h = new HashMap(13);

    public j1(@NotNull class_2960 texture, @NotNull class_591 model, char a, @NotNull ce part, short a2, double x, int a3, double y, double z) {
        long j2 = (((((long) a) << 48) | ((((long) a2) << 48) >>> 16)) | ((((long) a3) << 32) >>> 32)) ^ b;
        Intrinsics.checkNotNullParameter(texture, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31483, 1399455553115618193L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(model, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5912, 4750673167367673470L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(part, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18647, 693184338268932533L ^ j2) /* invoke-custom */);
        this.u = texture;
        this.X = model;
        this.K = part;
        this.c = x;
        this.V = y;
        this.o = z;
        this.H = z();
        this.k = z();
        this.g = z();
        this.L = J() * 5.0d;
        this.Q = J() * 5.0d;
        this.F = J() * 5.0d;
        this.y = this.L;
        this.a = this.Q;
        this.N = this.F;
        this.v = J();
        this.Y = J();
        this.O = J();
        this.e = this.c;
        this.U = this.V;
        this.s = this.o;
    }

    @NotNull
    public final class_2960 S() {
        return this.u;
    }

    public final void k(@NotNull class_2960 class_2960Var, long a) {
        Intrinsics.checkNotNullParameter(class_2960Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12916, 6942579736946095062L ^ (b ^ a)) /* invoke-custom */);
        this.u = class_2960Var;
    }

    @NotNull
    public final class_591 E() {
        return this.X;
    }

    public final void g(@NotNull class_591 class_591Var, long a) {
        Intrinsics.checkNotNullParameter(class_591Var, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12916, 6942450299860660300L ^ (b ^ a)) /* invoke-custom */);
        this.X = class_591Var;
    }

    @NotNull
    public final ce e() {
        return this.K;
    }

    public final void X(@NotNull ce ceVar, short a, char a2, int a3) {
        Intrinsics.checkNotNullParameter(ceVar, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3944, 6510289771082344002L ^ ((((((long) a) << 48) | ((((long) a2) << 48) >>> 16)) | ((((long) a3) << 32) >>> 32)) ^ b)) /* invoke-custom */);
        this.K = ceVar;
    }

    public final double P() {
        return this.c;
    }

    public final void C(double d2) {
        this.c = d2;
    }

    public final double f() {
        return this.V;
    }

    public final void T(double d2) {
        this.V = d2;
    }

    public final double T() {
        return this.o;
    }

    public final void Y(double d2) {
        this.o = d2;
    }

    public final double z() {
        return (Math.random() * 0.3d) - 0.15d;
    }

    public final double J() {
        return (Math.random() * 5.0d) - 2.5d;
    }

    public final double j() {
        return this.H;
    }

    public final void D(double d2) {
        this.H = d2;
    }

    public final double Q() {
        return this.k;
    }

    public final void Z(double d2) {
        this.k = d2;
    }

    public final double B() {
        return this.g;
    }

    public final void X(double d2) {
        this.g = d2;
    }

    public final double i() {
        return this.L;
    }

    public final void m(double d2) {
        this.L = d2;
    }

    public final double K() {
        return this.Q;
    }

    public final void e(double d2) {
        this.Q = d2;
    }

    public final double V() {
        return this.F;
    }

    public final void i(double d2) {
        this.F = d2;
    }

    public final double W() {
        return this.y;
    }

    public final void R(double d2) {
        this.y = d2;
    }

    public final double l() {
        return this.a;
    }

    public final void a(double d2) {
        this.a = d2;
    }

    public final double r() {
        return this.N;
    }

    public final void z(double d2) {
        this.N = d2;
    }

    public final double U() {
        return this.v;
    }

    public final void F(double d2) {
        this.v = d2;
    }

    public final double A() {
        return this.Y;
    }

    public final void W(double d2) {
        this.Y = d2;
    }

    public final double F() {
        return this.O;
    }

    public final void K(double d2) {
        this.O = d2;
    }

    public final int H() {
        return this.B;
    }

    public final void Y(int i2) {
        this.B = i2;
    }

    public final double t() {
        return this.e;
    }

    public final void A(double d2) {
        this.e = d2;
    }

    public final double N() {
        return this.U;
    }

    public final void S(double d2) {
        this.U = d2;
    }

    public final double Y() {
        return this.s;
    }

    public final void M(double d2) {
        this.s = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v106, types: [double] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110, types: [su.catlean.j1] */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, net.minecraft.class_2680] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [su.catlean.j1] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [int] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v81, types: [su.catlean.j1] */
    /* JADX WARN: Type inference failed for: r0v82, types: [int] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0278 -> B:30:0x0219). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(char r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j1.m(char, int, int):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x022b: MOVE (r55 I:??[long, double]) = (r-1 I:??[long, double])
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void N(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r27, long r28) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j1.N(net.minecraft.class_4587, long):void");
    }

    static {
        int i2;
        long j2 = b ^ 116350064207330L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i4 = 0;
        String str = "³{\u001f¨\u0003ª2,\u001d\u0090»,srÇD\u009c\u000b\u0090&»\u00adHrÚÑ\u000fÑß\u000b\u0093\rS:}XÀ\u0098\u0089F\u0010¢\u001bÓ\u0086ºØøG\u0088¼9È\u0092\u0016¸ì\u0010DÂ\u008eÚ\u0095àØùÄ\u0019õ¨¹3½W\u0010\u0089¾!ñ\u0017«\u0015\u008fÊ\t¤>\u001b\u0094\u0000d ×îÏÓpà7NM_m\u0019¤«ªPh¨±«ê\u000bÞ¢\u009c\u007f\u0091µ\u008dRÞ¼\u0010)%i®%\u0002bfµ\u0081ê0â{\u008c\u0099('wyyeÕ\u008bÂ°\"°lUØÖÓNJüx\u000fV¹\u00009Zîòê\u009fýÜ{¦\u0081´}.,t \u009cO×Ïô}\u0088\u0000\u0006:E×pÑCä³\u0018½X¡¬\u0083\u0015#$ÕDFS\u0011Á(\u0091\u0019tÛò\u008b´%\u0000üî#ºv¸\u008ay1\u001f\u0091u\u009dGþúIÎ`À\u0085¯¯±\\|\u008fÞ´Sn\u0010\u0092ð\u009bë\u008bÂ\u0090Q\u008b\"Hi\u0019øcí\u0018Èí½Û\u009e\u0001Ð×\u001f\u0099Àé&\fÔUÜDT¯\u001b¹s\u009d\u0010\u0011\u008b\u0005C¹ø©Y\u0083\u009e½¤\b×N¦(,¡\u008c~U\u009awÄu\u0000ûß¡%ã¢&å%-\u009fÛ é³ÅèfÁ\u0089\u0010@Í#÷c/\u0084nÅ";
        int length = "³{\u001f¨\u0003ª2,\u001d\u0090»,srÇD\u009c\u000b\u0090&»\u00adHrÚÑ\u000fÑß\u000b\u0093\rS:}XÀ\u0098\u0089F\u0010¢\u001bÓ\u0086ºØøG\u0088¼9È\u0092\u0016¸ì\u0010DÂ\u008eÚ\u0095àØùÄ\u0019õ¨¹3½W\u0010\u0089¾!ñ\u0017«\u0015\u008fÊ\t¤>\u001b\u0094\u0000d ×îÏÓpà7NM_m\u0019¤«ªPh¨±«ê\u000bÞ¢\u009c\u007f\u0091µ\u008dRÞ¼\u0010)%i®%\u0002bfµ\u0081ê0â{\u008c\u0099('wyyeÕ\u008bÂ°\"°lUØÖÓNJüx\u000fV¹\u00009Zîòê\u009fýÜ{¦\u0081´}.,t \u009cO×Ïô}\u0088\u0000\u0006:E×pÑCä³\u0018½X¡¬\u0083\u0015#$ÕDFS\u0011Á(\u0091\u0019tÛò\u008b´%\u0000üî#ºv¸\u008ay1\u001f\u0091u\u009dGþúIÎ`À\u0085¯¯±\\|\u008fÞ´Sn\u0010\u0092ð\u009bë\u008bÂ\u0090Q\u008b\"Hi\u0019øcí\u0018Èí½Û\u009e\u0001Ð×\u001f\u0099Àé&\fÔUÜDT¯\u001b¹s\u009d\u0010\u0011\u008b\u0005C¹ø©Y\u0083\u009e½¤\b×N¦(,¡\u008c~U\u009awÄu\u0000ûß¡%ã¢&å%-\u009fÛ é³ÅèfÁ\u0089\u0010@Í#÷c/\u0084nÅ".length();
        char cCharAt = '(';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            d = strArr;
                            f = new String[15];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i10 = 0;
                            String str3 = "2ò\u0097\u008d-ï|:\u0094\u009e7±Ë\u008bN©";
                            int length2 = "2ò\u0097\u008d-ï|:\u0094\u009e7±Ë\u008bN©".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                i = jArr;
                                                j = new Integer[4];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                str3 = "¾\u008aö\u0097Ë\u009c\u008cÕßó\u0019{P~Âý";
                                                length2 = "¾\u008aö\u0097Ë\u009c\u008cÕßó\u0019{P~Âý".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "dc\u0085 #ÁD²âMW\u001dQù\u0016Ý-\u001ba\u008b6©YÎÚ/\u0080È³à8pºê÷xqÎT\u0080Ü\u009f1uÁDOâU£+\u008cü\u0090»k\u0010ßâ\u0084&Ñ´\u008dT½\u000bÐÇù\u0012\u0083\u0094";
                        length = "dc\u0085 #ÁD²âMW\u001dQù\u0016Ý-\u001ba\u008b6©YÎÚ/\u0080È³à8pºê÷xqÎT\u0080Ü\u009f1uÁDOâU£+\u008cü\u0090»k\u0010ßâ\u0084&Ñ´\u008dT½\u000bÐÇù\u0012\u0083\u0094".length();
                        cCharAt = '8';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 27033;
        if (f[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i3] = a(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/j1", e);
            }
        }
        return f[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/j1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j1.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 1485;
        if (j[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/j1", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            j[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return j[i3].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 4
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
            java.lang.String r1 = "su/catlean/j1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
