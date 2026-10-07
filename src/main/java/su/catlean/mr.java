package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;
import su.catlean.gofra.Gofra;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mr.class */
public final class mr {
    private static final long a = yz.a(-8602483457174832485L, -907383826857794503L, MethodHandles.lookup().lookupClass()).a(4216711779853L);
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    public static final void t(long a2, @NotNull IPasteable $this$bus) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$bus, b);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7761979437811099041L, j) /* invoke-custom */;
        Gofra gofra = Gofra.INSTANCE;
        Object[] objArr = new Object[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12086, 5240559472560509307L ^ j) /* invoke-custom */];
        objArr[0] = $this$bus;
        objArr[1] = yl.g;
        objArr[2] = iq.a;
        objArr[3] = y0.c;
        objArr[4] = la.l;
        objArr[5] = w8.T;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21922, 1935997396976233440L ^ j) /* invoke-custom */] = s7.r;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3290, 6258831576435110542L ^ j) /* invoke-custom */] = nf.Z;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6389, 1965490849334961852L ^ j) /* invoke-custom */] = _8.P;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10369, 9030165511933695705L ^ j) /* invoke-custom */] = gg.P;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13714, 6327177370549685213L ^ j) /* invoke-custom */] = pf.E;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8502, 1180528765555089249L ^ j) /* invoke-custom */] = tq.I;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18925, 6174828257181464490L ^ j) /* invoke-custom */] = sg.H;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28889, 4439404969654668945L ^ j) /* invoke-custom */] = dm.h;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22881, 3683969819621484351L ^ j) /* invoke-custom */] = dx.K;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28344, 2136531727575372029L ^ j) /* invoke-custom */] = dh.S;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13742, 400822445344852962L ^ j) /* invoke-custom */] = zg.v;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(83, 7328073275127610903L ^ j) /* invoke-custom */] = iu.W;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6615, 9070483900744705934L ^ j) /* invoke-custom */] = jg.l;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12545, 2670279416078864215L ^ j) /* invoke-custom */] = bo.S;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30389, 3662904211788253435L ^ j) /* invoke-custom */] = wd.h;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12116, 6182893364259950879L ^ j) /* invoke-custom */] = j2.X;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22259, 6581794897443776672L ^ j) /* invoke-custom */] = gw.Y;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18776, 2069185646594815749L ^ j) /* invoke-custom */] = nk.f;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19661, 7309829293379875463L ^ j) /* invoke-custom */] = zw.l;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30805, 4971121175628301846L ^ j) /* invoke-custom */] = d2.O;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1296, 8163254483538656081L ^ j) /* invoke-custom */] = rq.G;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21427, 5250011132318019055L ^ j) /* invoke-custom */] = lo.k;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17793, 2463728953885162452L ^ j) /* invoke-custom */] = o8.g;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32066, 2245680509819306754L ^ j) /* invoke-custom */] = wc.g;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26536, 1406609064331663854L ^ j) /* invoke-custom */] = jl.y;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4087, 3140064283512484269L ^ j) /* invoke-custom */] = zi.v;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13329, 2575373650013325902L ^ j) /* invoke-custom */] = b6.R;
        objArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3398, 8526790151725396765L ^ j) /* invoke-custom */] = i4.h;
        gofra.plugAll(objArr);
        _g[] _gVarArr2 = _gVarArr;
        if (_gVarArr2 == null) {
            try {
                _gVarArr2 = new _g[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, 7759582632539480466L, j) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, 7750090556020686636L, j) /* invoke-custom */;
            }
        }
    }

    static {
        long j = a ^ 19059147357213L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("kà$¾è©%Ò".getBytes("ISO-8859-1"))).intern();
        e = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] bArr2 = new byte[8];
        bArr2[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr2[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[29];
        int i3 = 0;
        String str = "$Äý±Ï8Ân¸£^ÔôÀ=kü°xûMiÉ/\u0097Z~\u0010L\bº\u0087\u0007*#>¨Us\u001e\u009aOÈ$C\u00ad[%Í9\u009d\u001a\u0084ôöj¹Üs¶Æ]ÓÀY\u0081³fíZ\u008d\u009a7|¢ÓÓ~s?\u009eéY¶Vy\u001c\u0018ÔùÏ\u0093ð\"{\u0093¾\u0002Õ&á¾ô\u0018\u001c7=FÃ@b$þÅ\u0083\u0003¶ç\u0012òJ\u001c°\u008a>t\u0006w\u0014\u0090\u001aùÃ9þ\u0091c@\tÏ;,#2VÙ6bu;ß\u0085\u0087\u0019\\8_~(ç(²[$\u000eRz\u0089$\u0094>±Õä\u0086'£É\u0083<\u0012\u0099¶\u0084ãÈëeH<áð&z\u0080¾ C^\u0007;aì\u0099(Ê¼~$\u0080pÙ\u009fß\u0015w";
        int length = "$Äý±Ï8Ân¸£^ÔôÀ=kü°xûMiÉ/\u0097Z~\u0010L\bº\u0087\u0007*#>¨Us\u001e\u009aOÈ$C\u00ad[%Í9\u009d\u001a\u0084ôöj¹Üs¶Æ]ÓÀY\u0081³fíZ\u008d\u009a7|¢ÓÓ~s?\u009eéY¶Vy\u001c\u0018ÔùÏ\u0093ð\"{\u0093¾\u0002Õ&á¾ô\u0018\u001c7=FÃ@b$þÅ\u0083\u0003¶ç\u0012òJ\u001c°\u008a>t\u0006w\u0014\u0090\u001aùÃ9þ\u0091c@\tÏ;,#2VÙ6bu;ß\u0085\u0087\u0019\\8_~(ç(²[$\u000eRz\u0089$\u0094>±Õä\u0086'£É\u0083<\u0012\u0099¶\u0084ãÈëeH<áð&z\u0080¾ C^\u0007;aì\u0099(Ê¼~$\u0080pÙ\u009fß\u0015w".length();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            i4 += 8;
            byte[] bytes = str.substring(i5, i4).getBytes("ISO-8859-1");
            long[] jArr2 = jArr;
            int i6 = i3;
            i3++;
            long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
            byte b2 = -1;
            while (true) {
                byte b3 = b2;
                long j3 = j2;
                int i7 = i6;
                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                switch (i7) {
                    case 0:
                        jArr2[b3] = j4;
                        if (i4 >= length) {
                            c = jArr;
                            d = new Integer[29];
                            return;
                        }
                        break;
                        break;
                    default:
                        jArr2[b3] = j4;
                        if (i4 >= length) {
                            str = "\u0002óJa]\u009c;äEÍ¡,ª\u001f\u0087{";
                            length = "\u0002óJa]\u009c;äEÍ¡,ª\u001f\u0087{".length();
                            i4 = 0;
                        }
                        break;
                }
                int i8 = i4;
                i4 += 8;
                byte[] bytes2 = str.substring(i8, i4).getBytes("ISO-8859-1");
                jArr2 = jArr;
                i6 = i3;
                i3++;
                j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                b2 = 0;
            }
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

    private static int a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21703;
        if (d[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) c[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) e.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/mr", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            d[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return d[i2].intValue();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iA)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iA;
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/mr"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.mr.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
