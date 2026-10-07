package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_6373;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q6.class */
public final class q6 extends _g {

    @NotNull
    public static final q6 J;
    static final KProperty[] W;

    @NotNull
    private static final c8 S;

    @NotNull
    private static final ConcurrentHashMap X;
    private static final long a = yz.a(-7834023782175520828L, -6871868618268904381L, MethodHandles.lookup().lookupClass()).a(116772024737816L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private q6(short s, int i, int i2) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) i2) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32546, 8263420776687829833L ^ j) /* invoke-custom */, jt.d(), null, 4, null, j ^ 46050909715343L);
    }

    private final int r(long j) {
        return ((Number) S.E(this, (a ^ j) ^ 25479911749370L, W[0])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @Flow
    private final void M(ReceivePacket receivePacket) throws Exception {
        long j = a ^ 119442600845078L;
        Object packet = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3904594109239414967L, j) /* invoke-custom */;
        try {
            try {
                packet = receivePacket.getPacket();
                if (packet != 0) {
                    try {
                        try {
                            packet = packet instanceof class_6373;
                            if (packet == 0) {
                                class_2596<?> packet2 = receivePacket.getPacket();
                                if (packet != 0) {
                                    if (!(packet2 instanceof class_2670)) {
                                        return;
                                    } else {
                                        X.put(receivePacket.getPacket(), Long.valueOf(zf.A()));
                                    }
                                }
                            } else {
                                X.put(receivePacket.getPacket(), Long.valueOf(zf.A()));
                            }
                        } catch (NumberFormatException unused) {
                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(packet, 3928213156624718308L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(packet, 3928213156624718308L, j) /* invoke-custom */;
                    }
                }
                receivePacket.cancel();
            } catch (NumberFormatException unused3) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(packet, 3928213156624718308L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(packet, 3928213156624718308L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.minecraft.class_2670] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(su.catlean.api.event.events.render.Render3DEvent r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q6.h(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    static {
        int i;
        long j = a ^ 120742130224340L;
        long j2 = j ^ 111081056184194L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 32);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 36631595364232L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i6 = 0;
        String str = "ö\u0094¨$¦i_ßö\u001dÙB\u001aNwùw\u0099÷êóèè8ÊIõ)LhðmÉîÂ`7\u0089÷¶\u0010¬vBÀ\u0092Ú\u0098iò\u0003³ÿqxÆY\u0018Ô÷gEdÁ¥ñ\u001a\u00adRÄ³j\u000b\u0001\u008bc¯\u0081áÁõ\u001f\u0010âs\u000f\u0082±pW¼Ésø«\u0016\b6u\u0018ïä\f\u00adR#@QÕ.g²èè\b&öþ/\r\u0015ãî]\u0018Ä\t=\u000b\u001cð\u0014¤d',]lXd\u0089iì\u0005_x\u001ae£";
        int length = "ö\u0094¨$¦i_ßö\u001dÙB\u001aNwùw\u0099÷êóèè8ÊIõ)LhðmÉîÂ`7\u0089÷¶\u0010¬vBÀ\u0092Ú\u0098iò\u0003³ÿqxÆY\u0018Ô÷gEdÁ¥ñ\u001a\u00adRÄ³j\u000b\u0001\u008bc¯\u0081áÁõ\u001f\u0010âs\u000f\u0082±pW¼Ésø«\u0016\b6u\u0018ïä\f\u00adR#@QÕ.g²èè\b&öþ/\r\u0015ãî]\u0018Ä\t=\u000b\u001cð\u0014¤d',]lXd\u0089iì\u0005_x\u001ae£".length();
        char cCharAt = '(';
        int i7 = -1;
        while (true) {
            int i8 = i7 + 1;
            String strSubstring = str.substring(i8, i8 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i9 = i6;
                        i6++;
                        strArr[i9] = strIntern;
                        int i10 = i8 + cCharAt;
                        i = i10;
                        if (i10 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[8];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i12 = 0;
                            String str3 = "H¶1\u0081Â\u001at.úm³²bH¶í";
                            int length2 = "H¶1\u0081Â\u001at.úm³²bH¶í".length();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = str3.substring(i14, i13).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i15 = i12;
                                i12++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i16 = i15;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i16) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i13 >= length2) {
                                                e = jArr;
                                                f = new Integer[4];
                                                W = new KProperty[]{Reflection.property1(new PropertyReference1Impl(q6.class, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23269, 7376013158630189536L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22340, 4805927609251554375L ^ j) /* invoke-custom */, 0))};
                                                J = new q6((short) i2, i3, i4);
                                                S = yp.L(J, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30196, 6987683002723026675L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19109, 5373156667527893955L ^ j) /* invoke-custom */, new IntRange(1, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24003, 9112359951660385447L ^ j) /* invoke-custom */), j3, null, null, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20848, 2576073105668442133L ^ j) /* invoke-custom */, null);
                                                X = new ConcurrentHashMap();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i13 >= length2) {
                                                str3 = "\u009a\u0099t\u0098kÀÖáH\u008ewªKC\u0096\u000b";
                                                length2 = "\u009a\u0099t\u0098kÀÖáH\u008ewªKC\u0096\u000b".length();
                                                i13 = 0;
                                            }
                                            break;
                                    }
                                    int i17 = i13;
                                    i13 += 8;
                                    byte[] bytes2 = str3.substring(i17, i13).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i15 = i12;
                                    i12++;
                                    j4 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i18 = i6;
                        i6++;
                        strArr[i18] = strIntern;
                        int i19 = i8 + cCharAt;
                        i7 = i19;
                        if (i19 < length) {
                        }
                        str = ":\\Ü½\u008bT ¿MEÊz\u0016xÔÆ\u0001c+çÖÁ)6\nU4{ã®êiøÈ¤\u0091}ÎÙ\u0091¸9ì\u0085=\u001cy\u0018\u0018\u0000ðçpt}hH\u00adù¬\u0091\u0007\u009b\u0003°\u0080!´\u0089àº%½";
                        length = ":\\Ü½\u008bT ¿MEÊz\u0016xÔÆ\u0001c+çÖÁ)6\nU4{ã®êiøÈ¤\u0091}ÎÙ\u0091¸9ì\u0085=\u001cy\u0018\u0018\u0000ðçpt}hH\u00adù¬\u0091\u0007\u009b\u0003°\u0080!´\u0089àº%½".length();
                        cCharAt = '0';
                        i = -1;
                        break;
                        break;
                }
                i8 = i + 1;
                strSubstring = str.substring(i8, i8 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i7);
        }
    }

    private static Exception a(Exception exc) {
        return exc;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 22328;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/q6", e2);
            }
        }
        return c[i2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
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
            java.lang.String r1 = "su/catlean/q6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 15706;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/q6", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i2].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/q6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q6.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
