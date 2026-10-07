package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i1.class */
public final class i1 {

    @NotNull
    public static final i1 C;

    @NotNull
    private static final Float[] c;
    private static final String[] b;
    private static final String[] d;
    private static final long a = yz.a(5534783901550420242L, -5998892869796493544L, MethodHandles.lookup().lookupClass()).a(91365475665220L);
    private static final Map e = new HashMap(13);

    private i1() {
    }

    @NotNull
    public final Float[] f() {
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.minecraft.class_238] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.minecraft.class_238] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final boolean C(@NotNull class_243 class_243Var, long j, @NotNull class_243 class_243Var2) {
        String str;
        ?? Method_1019;
        long j2 = a ^ j;
        long j3 = j2 ^ 35626999496542L;
        long j4 = j2 ^ 11195537662133L;
        Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(923, 5436602830957082491L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(class_243Var2, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23726, 5174715368741218378L ^ j2) /* invoke-custom */);
        class_238 class_238Var = new class_238(class_243Var.method_1023(1.0d, 0.0d, 1.0d), class_243Var.method_1031(1.0d, 2.0d, 1.0d));
        String str2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8233940979492685154L, j2) /* invoke-custom */;
        double dMethod_55755 = zf.v(j4).method_55755();
        double dMin = Double.MAX_VALUE;
        class_243 class_243VarMethod_1021 = class_243Var2.method_1020(zf.v(j4).method_33571()).method_1029().method_1021(dMethod_55755);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1021, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24744, 6457745093795419209L ^ j2) /* invoke-custom */);
        class_243 class_243VarS = dm.h.S(j3);
        int i = 0;
        int length = c.length;
        while (i < length) {
            class_243 class_243VarMethod_1031 = class_243VarS.method_1031(0.0d, r1[i].floatValue(), 0.0d);
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19252, 328465375660097495L ^ j2) /* invoke-custom */);
            Method_1019 = class_243VarMethod_1031.method_1019(class_243VarMethod_1021);
            Intrinsics.checkNotNullExpressionValue(Method_1019, (String) a(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25302, 8983649197215422004L ^ j2) /* invoke-custom */);
            try {
                try {
                    try {
                        Method_1019 = class_238Var.method_1006((class_243) Method_1019);
                        str = str2;
                        if (j2 < 0) {
                            break;
                        }
                        if (str != null) {
                            break;
                        }
                        if (str2 == null) {
                            if (j2 >= 0) {
                                if (Method_1019 == 0) {
                                    Method_1019 = class_238Var;
                                    class_243 class_243Var3 = class_243VarMethod_1031;
                                    ?? r0 = Method_1019;
                                    if (str2 == null) {
                                        try {
                                            try {
                                                if (!Method_1019.method_1006(class_243Var3)) {
                                                    r0 = class_238Var;
                                                    class_243Var3 = class_243VarMethod_1031;
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1019, 8220855384625494787L, j2) /* invoke-custom */;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1019, 8220855384625494787L, j2) /* invoke-custom */;
                                        }
                                    }
                                    Optional optionalMethod_992 = r0.method_992(class_243Var3, (class_243) Method_1019);
                                    ?? IsPresent = str2;
                                    if (j2 > 0) {
                                        if (IsPresent == 0) {
                                            try {
                                                IsPresent = optionalMethod_992.isPresent();
                                                if (IsPresent != 0) {
                                                    dMin = Math.min(dMin, class_243VarMethod_1031.method_1025((class_243) optionalMethod_992.get()));
                                                }
                                                i++;
                                            } catch (NumberFormatException unused3) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsPresent, 8220855384625494787L, j2) /* invoke-custom */;
                                            }
                                        }
                                        IsPresent = str2;
                                    }
                                    if (IsPresent != 0) {
                                        break;
                                    }
                                }
                                Method_1019 = 1;
                            }
                        }
                        return Method_1019;
                    } catch (NumberFormatException unused4) {
                        Method_1019 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1019, 8220855384625494787L, j2) /* invoke-custom */;
                        throw Method_1019;
                    }
                } catch (NumberFormatException unused5) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1019, 8220855384625494787L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused6) {
                Method_1019 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1019, 8220855384625494787L, j2) /* invoke-custom */;
                throw Method_1019;
            }
        }
        if (j2 > 0) {
            Method_1019 = (dMin > (dMethod_55755 * dMethod_55755) ? 1 : (dMin == (dMethod_55755 * dMethod_55755) ? 0 : -1));
            str = str2;
            if (str != null) {
                return Method_1019;
            }
            if (Method_1019 <= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean f(i1 i1Var, class_243 class_243Var, long j, class_243 class_243Var2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 20034891394036L;
        Object obj2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3729459883722589415L, j2) /* invoke-custom */;
        try {
            obj2 = i & 2;
            if (obj2 != 0) {
                return obj2;
            }
            if (obj2 != 0) {
                class_243Var2 = class_243Var;
            }
            return i1Var.C(class_243Var, j3, class_243Var2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 3716377724686629510L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 52994207583463L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "_1Qv!yÇª\b*\u0087Ù+d\u0004¥ Zæ[o\u000bÓÎì\u0087G\u0081ß÷¹\u001ceó\u0094òacmØµ\u0081ì<ûë=#\u0002\u0018#ðÕ|d¥ï<J XÄ?pÊÈyÎÊ¤D]äõ";
        int length = "_1Qv!yÇª\b*\u0087Ù+d\u0004¥ Zæ[o\u000bÓÎì\u0087G\u0081ß÷¹\u001ceó\u0094òacmØµ\u0081ì<ûë=#\u0002\u0018#ðÕ|d¥ï<J XÄ?pÊÈyÎÊ¤D]äõ".length();
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
                            b = strArr;
                            d = new String[5];
                            C = new i1();
                            c = new Float[]{Float.valueOf(1.62f), Float.valueOf(0.4f)};
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
                        str = "U5YZ\u000bHö<Ò\u00ad\u0083¡uÇâ@S\u001eú/Çù\u0011·0\u009f²\u0017]\u008b\u0014Û  ÐÊ \u0010<g\u0098\u0084\u0003\u0003áS(\u0014Åë/\u00828\\0\u001d¹û^Å\u0002ì¶cu";
                        length = "U5YZ\u000bHö<Ò\u00ad\u0083¡uÇâ@S\u001eú/Çù\u0011·0\u009f²\u0017]\u008b\u0014Û  ÐÊ \u0010<g\u0098\u0084\u0003\u0003áS(\u0014Åë/\u00828\\0\u001d¹û^Å\u0002ì¶cu".length();
                        cCharAt = ' ';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 1850;
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
                d[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/i1", e2);
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
            java.lang.String r1 = "su/catlean/i1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i1.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
