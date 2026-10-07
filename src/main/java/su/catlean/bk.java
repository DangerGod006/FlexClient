package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bk.class */
public final class bk {

    @NotNull
    private gi L;

    @NotNull
    private class_243 o;
    private float S;
    private float G;
    private int U;

    @NotNull
    private class_243 j;

    @NotNull
    private Color u;
    private float i;
    private float h;
    private boolean R;
    private final int v;

    @NotNull
    private class_243 m;
    private float w;
    private float W;
    private int a;
    private static String E;
    private static final long b = yz.a(270678252329196635L, -7554518609380639848L, MethodHandles.lookup().lookupClass()).a(280052282091776L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map k;

    public bk(@NotNull gi tex, @NotNull class_243 pos, float rotationSpeed, float scale, int lifetime, @NotNull class_243 velocity, @NotNull Color color, float gravity, float drag, boolean useAgeFactor, long a) {
        long j = b ^ a;
        Intrinsics.checkNotNullParameter(tex, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28886, 3087324134013547702L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5058, 6977834250436401062L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(velocity, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4596, 6949330651231180184L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21619, 1095454716712390683L ^ j) /* invoke-custom */);
        this.L = tex;
        this.o = pos;
        this.S = rotationSpeed;
        this.G = scale;
        this.U = lifetime;
        this.j = velocity;
        this.u = color;
        this.i = gravity;
        this.h = drag;
        this.R = useAgeFactor;
        this.v = this.U;
        this.m = this.o;
        this.a = mf.f(new IntRange(0, 3), false, j ^ 96708512786462L, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bk(gi giVar, class_243 class_243Var, float f2, long j, float f3, int i, class_243 class_243Var2, Color color, float f4, float f5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = b ^ j;
        long j3 = j2 ^ 22275298021336L;
        if ((i2 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10486, 2949522228689550998L ^ j2) /* invoke-custom */) != 0) {
            Color color2 = Color.BLACK;
            Intrinsics.checkNotNullExpressionValue(color2, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16393, 1381503776711047966L ^ j2) /* invoke-custom */);
            color = color2;
        }
        this(giVar, class_243Var, f2, f3, i, class_243Var2, color, (i2 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15029, 8295706591558544598L ^ j2) /* invoke-custom */) != 0 ? 0.03f : f4, (i2 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9088, 8532848865498510818L ^ j2) /* invoke-custom */) != 0 ? 0.99f : f5, (i2 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16078, 7177765101557164207L ^ j2) /* invoke-custom */) != 0 ? true : z, j3);
    }

    @NotNull
    public final gi h() {
        return this.L;
    }

    public final void D(long a, @NotNull gi giVar) {
        Intrinsics.checkNotNullParameter(giVar, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24, 6060054919676968336L ^ (b ^ a)) /* invoke-custom */);
        this.L = giVar;
    }

    @NotNull
    public final class_243 r() {
        return this.o;
    }

    public final void e(@NotNull class_243 class_243Var, long a) {
        Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31859, 4200000997216421041L ^ (b ^ a)) /* invoke-custom */);
        this.o = class_243Var;
    }

    public final float y() {
        return this.G;
    }

    public final void h(float f2) {
        this.G = f2;
    }

    @NotNull
    public final class_243 d() {
        return this.j;
    }

    public final void M(@NotNull class_243 class_243Var, long a) {
        Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31859, 4199930256512230004L ^ (b ^ a)) /* invoke-custom */);
        this.j = class_243Var;
    }

    @NotNull
    public final Color k() {
        return this.u;
    }

    public final void L(long a, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31859, 4199985500144299777L ^ (b ^ a)) /* invoke-custom */);
        this.u = color;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    public final boolean v(long j) {
        long j2 = b ^ j;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8497745605581118447L, j2) /* invoke-custom */;
        try {
            try {
                this.U--;
                obj = this.U;
                if (obj != 0) {
                    return obj;
                }
                if (obj < 0) {
                    return true;
                }
                this.m = this.o;
                class_243 class_243VarMethod_1019 = this.o.method_1019(this.j);
                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1019, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20454, 798950129936879091L ^ j2) /* invoke-custom */);
                this.o = class_243VarMethod_1019;
                class_243 class_243VarMethod_1021 = this.j.method_1021(this.h);
                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1021, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(404, 1419952303571370893L ^ j2) /* invoke-custom */);
                this.j = class_243VarMethod_1021;
                class_243 class_243VarMethod_1031 = this.j.method_1031(0.0d, -this.i, 0.0d);
                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30419, 6531878187225806044L ^ j2) /* invoke-custom */);
                this.j = class_243VarMethod_1031;
                this.W = this.w;
                this.w += this.S;
                return false;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8469923256208175193L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8469923256208175193L, j2) /* invoke-custom */;
            throw obj;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x025a: INVOKE (r-1 I:net.minecraft.class_4587), (r0 I:long), (r1 I:org.joml.Quaternionfc) STATIC call: su.catlean.m8.y(net.minecraft.class_4587, long, org.joml.Quaternionfc):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void f(int r11, short r12, @org.jetbrains.annotations.NotNull net.minecraft.class_4587 r13, char r14, @org.jetbrains.annotations.NotNull org.joml.Quaternionfc r15, @org.jetbrains.annotations.NotNull su.catlean.g7 r16) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bk.f(int, short, net.minecraft.class_4587, char, org.joml.Quaternionfc, su.catlean.g7):void");
    }

    public static void s(String str) {
        E = str;
    }

    public static String G() {
        return E;
    }

    static {
        int i;
        long j = b ^ 53591139172290L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("ryXZi", 1051447840270442886L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[17];
        int i3 = 0;
        String str = "çÙ\u0093Ða\u001d7mpÓoÊfã(I\u0018ÃÔÃ§V\u0006ãµ\u0087UßþÄ\u0004\u0018\u0004~fU»qäy\u0012(\u0092¬\u009b\u0090ÉW \u008dòRæÞ\u00adÇ3)ÕÄ«ë\u0002ó>gþ%\u0019\u0094Å\u009b\u0091xa+t:kTÕ{\u00100\n,ÛfÌ)\u0084¨\u0086\u0006\u0090FvÉ\u007f\u0010å¹[\u0000J\u0090ö\u0003`\u0083{\u0092\u0094\u0017Ë¤\u0010b¼|tÆ«\u000b\n®rõ\u000eÓÏÛU Õó\u008bQÞ\u0095\u0004\u0018\u009089\u0087¦iÛ¬ÙäÕô:ªAþe\"¼I7A1Ï\u0010tûVðyµÁùe·ÍN\u0096É\u0083Û ì\\AûÐß°!õ\u0093çJWn\u0010m\u0003'ï\u0083Ól%yç¸ÊÚË\u0089Dz(Ý\n\u0011ï\u0081kê\u0015\u009e°êü©§ó\u0097\u000f9\rØ\u001dç1y\u0097\u008e!x\u000fbÐîÿ,i\u0092ÕÅÁ\u0089 \u0006{\u0000Í pÝ¨\u0092n»9ï\n]\u0099¼[Óc´Ëx¹H\u0017\u0090àÃ\fEJ [)ÌÂ\u009e´o\u001e2éÒYù¡¯\u0011\r=\u0094îÙÑ\u0006\u0083»wÖ8\u008dÛçñ\u0010\u0093\u0014\u000bL[F\u0001¿ýÊ+`'|&½\u0010\u001cyîX¥\u008f×yé@1DÖUc\u001a Äk\u009e\u00957\u001d³(\u0004'¥\n3\u009aù\u009fl\fÈß\u0091}u©\u0099ð\u00029ã\u009dµo";
        int length = "çÙ\u0093Ða\u001d7mpÓoÊfã(I\u0018ÃÔÃ§V\u0006ãµ\u0087UßþÄ\u0004\u0018\u0004~fU»qäy\u0012(\u0092¬\u009b\u0090ÉW \u008dòRæÞ\u00adÇ3)ÕÄ«ë\u0002ó>gþ%\u0019\u0094Å\u009b\u0091xa+t:kTÕ{\u00100\n,ÛfÌ)\u0084¨\u0086\u0006\u0090FvÉ\u007f\u0010å¹[\u0000J\u0090ö\u0003`\u0083{\u0092\u0094\u0017Ë¤\u0010b¼|tÆ«\u000b\n®rõ\u000eÓÏÛU Õó\u008bQÞ\u0095\u0004\u0018\u009089\u0087¦iÛ¬ÙäÕô:ªAþe\"¼I7A1Ï\u0010tûVðyµÁùe·ÍN\u0096É\u0083Û ì\\AûÐß°!õ\u0093çJWn\u0010m\u0003'ï\u0083Ól%yç¸ÊÚË\u0089Dz(Ý\n\u0011ï\u0081kê\u0015\u009e°êü©§ó\u0097\u000f9\rØ\u001dç1y\u0097\u008e!x\u000fbÐîÿ,i\u0092ÕÅÁ\u0089 \u0006{\u0000Í pÝ¨\u0092n»9ï\n]\u0099¼[Óc´Ëx¹H\u0017\u0090àÃ\fEJ [)ÌÂ\u009e´o\u001e2éÒYù¡¯\u0011\r=\u0094îÙÑ\u0006\u0083»wÖ8\u008dÛçñ\u0010\u0093\u0014\u000bL[F\u0001¿ýÊ+`'|&½\u0010\u001cyîX¥\u008f×yé@1DÖUc\u001a Äk\u009e\u00957\u001d³(\u0004'¥\n3\u009aù\u009fl\fÈß\u0091}u©\u0099ð\u00029ã\u009dµo".length();
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
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            c = strArr;
                            d = new String[17];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "`_íGÊ\u0096\u0004µÂ\u0001ë\n<Åêp";
                            int length2 = "`_íGÊ\u0096\u0004µÂ\u0001ë\n<Åêp".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                f = jArr;
                                                g = new Integer[4];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0002Ð¢¹7ÝÃ\u0007\u0012©î\u0093Í8&^";
                                                length2 = "\u0002Ð¢¹7ÝÃ\u0007\u0012©î\u0093Í8&^".length();
                                                i10 = 0;
                                            }
                                            break;
                                    }
                                    int i14 = i10;
                                    i10 += 8;
                                    byte[] bytes2 = str3.substring(i14, i10).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i12 = i9;
                                    i9++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i15 = i3;
                        i3++;
                        strArr[i15] = strIntern;
                        int i16 = i5 + cCharAt;
                        i4 = i16;
                        if (i16 < length) {
                        }
                        str = "@\u009cí\u0097k½C\u0015TÑc©d1¼B VØ\n«ú®\u00862²;\u00adsoÒÝ;>ô/\u001aJZö«\u0003Õê±`Ú\u0090ï";
                        length = "@\u009cí\u0097k½C\u0015TÑc©d1¼B VØ\n«ú®\u00862²;\u00adsoÒÝ;>ô/\u001aJZö«\u0003Õê±`Ú\u0090ï".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 30394;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/bk", e2);
            }
        }
        return d[i2];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/bk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bk.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 23496;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/bk", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/bk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bk.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
