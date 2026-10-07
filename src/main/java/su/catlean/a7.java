package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_9362;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/a7.class */
public final class a7 implements b4 {

    @NotNull
    public static final a7 h;
    private static int y;
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(-2519580931557730791L, -384122617207862177L, MethodHandles.lookup().lookupClass()).a(215894886613914L);
    private static final Map d = new HashMap(13);

    private a7() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final boolean r(boolean z, long j, @NotNull a0 a0Var) {
        long j2 = a ^ j;
        long j3 = j2 ^ 23391075074131L;
        long j4 = j2 ^ 97356092661267L;
        long j5 = j2 ^ 56022010728113L;
        long j6 = j2 ^ 22831998406188L;
        Intrinsics.checkNotNullParameter(a0Var, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10030, 5734815875403451008L ^ j2) /* invoke-custom */);
        Object objN = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6694829808393794591L, j2) /* invoke-custom */;
        class_1799 class_1799VarMethod_6047 = zf.v(j6).method_6047();
        Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_6047, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1033, 4851921589887969702L ^ j2) /* invoke-custom */);
        try {
            try {
                objN = z;
                try {
                    if (objN != 0) {
                        return objN;
                    }
                    if (objN == 0) {
                        return true;
                    }
                    try {
                        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                        Object objR = i;
                        if (i > 0) {
                            objN = a0Var;
                            objR = objN;
                            if (objN == a0.NONE) {
                                try {
                                    try {
                                        objN = xa.N(class_1799VarMethod_6047, j3);
                                        if (objN != 0) {
                                            return objN;
                                        }
                                        if (objN == 0) {
                                            try {
                                                try {
                                                    objN = class_1799VarMethod_6047.method_7909() instanceof class_1743;
                                                    if (objN != 0) {
                                                        return objN;
                                                    }
                                                    if (objN == 0) {
                                                        try {
                                                            boolean z2 = class_1799VarMethod_6047.method_7909() instanceof class_1835;
                                                            if (objN != 0) {
                                                                return z2;
                                                            }
                                                            if (!z2) {
                                                                boolean z3 = class_1799VarMethod_6047.method_7909() instanceof class_9362;
                                                                if (objN != 0) {
                                                                    return z3;
                                                                }
                                                                if (!z3) {
                                                                    return false;
                                                                }
                                                            }
                                                        } catch (NumberFormatException unused) {
                                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                                                        }
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                                                }
                                            } catch (NumberFormatException unused3) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                                            }
                                        }
                                        return true;
                                    } catch (NumberFormatException unused4) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused5) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                                }
                            }
                        }
                        try {
                            try {
                                try {
                                    objR = gg.P.R(j5).R();
                                    if (objN != 0) {
                                        return objR;
                                    }
                                    if (objR == 0) {
                                        boolean zR = gg.P.g(j4).R();
                                        if (objN != 0) {
                                            return zR;
                                        }
                                        if (!zR) {
                                            return false;
                                        }
                                    }
                                    return true;
                                } catch (NumberFormatException unused6) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 6699279430427049456L, j2) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused7) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 6699279430427049456L, j2) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused8) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, 6699279430427049456L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused9) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused10) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused11) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused12) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objN, 6699279430427049456L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [su.catlean.fg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(char r8, boolean r9, int r10, char r11) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a7.B(char, boolean, int, char):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [su.catlean.a7] */
    public static void y(a7 a7Var, long j, boolean z, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 1909666732361L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5911129147602381839L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r11 = z;
            ?? r02 = r0;
            if (r0 == 0) {
                r11 = r02;
            } else if (r0 != 0) {
                r02 = 0;
                r11 = r02;
            }
            a7Var.B((char) i2, r11, i3, (char) i4);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5946347768867091341L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.a0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // su.catlean.b4
    public void Q(int i, long j) {
        long j2 = (((long) i) << 32) | ((j << 32) >>> 32);
        long j3 = j2 ^ 51486216026542L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 >>> 8;
        int i5 = (int) (((j2 ^ 104070571286828L) << 56) >>> 56);
        long j5 = j2 ^ 16782221287606L;
        ?? D = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8282018332447608040L, j2) /* invoke-custom */;
        if (D != 0) {
            try {
                try {
                    D = um.E.D(j4, (byte) i5);
                    if (D != a0.SILENT) {
                        return;
                    } else {
                        y = zf.v(j5).method_31548().method_67532();
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(D, 8242296113770419050L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(D, 8242296113770419050L, j2) /* invoke-custom */;
            }
        }
        B((char) i2, true, i3, (char) i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.a7] */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    @Override // su.catlean.b4
    public void P(@NotNull _w rotation, short a2, int a3, int a4) {
        long j = (((long) a2) << 48) | ((((long) a3) << 32) >>> 16) | ((((long) a4) << 48) >>> 48);
        Object obj = j;
        long j2 = obj >>> 8;
        int i = (int) (((obj ^ 26629572807522L) << 56) >>> 56);
        long j3 = obj ^ 75397077659784L;
        try {
            Intrinsics.checkNotNullParameter(rotation, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30554, 5085493859645480483L ^ j) /* invoke-custom */);
            if (um.E.D(j2, (byte) i) == a0.SILENT) {
                obj = this;
                obj.v(j3);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2869705301105641180L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean.b4
    public void n(long j) {
        v(j ^ 102883187979937L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final void v(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 134850973125343L;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8283042558580690165L, j2) /* invoke-custom */;
        try {
            try {
                r0 = y;
                ?? r02 = r0;
                if (r0 != 0) {
                    if (r0 == -1) {
                        return;
                    }
                    gg.P.f(y, j3);
                    r02 = -1;
                }
                y = r02;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8250137378500072311L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8250137378500072311L, j2) /* invoke-custom */;
        }
    }

    static {
        long j = a ^ 66520455920268L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = " ê?/æ\u001c= I\u001d\u0013\u0005Pý\u008aUoÄ»\u0091s;çT>:\u0005ú£ æÕ\u0014z(\tí\"sK\u0018²\u0003ü]I{\u0006½\u007fmB\\µ¤Ã®éKÔ\u008dUDKr\u0018\u0018=²Ì\u009a|æÔ×I©ù\u0083Ôn|k\u0094Ì\u0002\rç\u008b\u0093".length();
        char cCharAt = '(';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal(" ê?/æ\u001c= I\u001d\u0013\u0005Pý\u008aUoÄ»\u0091s;çT>:\u0005ú£ æÕ\u0014z(\tí\"sK\u0018²\u0003ü]I{\u0006½\u007fmB\\µ¤Ã®éKÔ\u008dUDKr\u0018\u0018=²Ì\u009a|æÔ×I©ù\u0083Ôn|k\u0094Ì\u0002\rç\u008b\u0093".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                b = strArr;
                c = new String[3];
                h = new a7();
                y = -1;
                return;
            }
            cCharAt = " ê?/æ\u001c= I\u001d\u0013\u0005Pý\u008aUoÄ»\u0091s;çT>:\u0005ú£ æÕ\u0014z(\tí\"sK\u0018²\u0003ü]I{\u0006½\u007fmB\\µ¤Ã®éKÔ\u008dUDKr\u0018\u0018=²Ì\u009a|æÔ×I©ù\u0083Ôn|k\u0094Ì\u0002\rç\u008b\u0093".charAt(i3);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 28908;
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
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/a7", e);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/a7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
