package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/p7.class */
public final class p7 extends gf {

    @NotNull
    public static final p7 b = null;
    static final /* synthetic */ KProperty[] Q = null;

    @NotNull
    private static final cq n = null;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] f = null;
    private static final Map g = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private p7(int i, short s, int i2) {
        long j = (((((long) i) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) i2) << 48) >>> 48)) ^ a;
        super((char) (j >>> 48), (int) (((j ^ 71810928868541L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25217, 7318292896010249344L ^ j) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    private final boolean W(char c2, int i, char c3) {
        return ((Boolean) n.E(this, ((((((long) c2) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a) ^ 133610876093269L, Q[0])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // su.catlean.gf
    public void h(long a2, @NotNull class_332 context) {
        String str;
        long j = a2 ^ 86294490406460L;
        int i = (int) (a2 >>> 48);
        int i2 = (int) ((j << 16) >>> 32);
        int i3 = (int) ((j << 48) >>> 48);
        long j2 = a2 ^ 116853176505585L;
        long j3 = a2 ^ 28405077213452L;
        int i4 = (int) (a2 >>> 48);
        int i5 = (int) ((j3 << 16) >>> 48);
        int i6 = (int) ((j3 << 32) >>> 32);
        long j4 = a2 ^ 95236895637490L;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5990705277528627281L, a2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3023, 1301936128889837208L ^ a2) /* invoke-custom */);
        Object objW = z;
        if (objW != 0) {
            try {
                objW = W((char) i, i2, (char) i3);
                if (objW == 0) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String strI = (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21385, 5960393080136535767L ^ a2) /* invoke-custom */;
                    Object[] objArr = {Double.valueOf(((double) ((float) Math.rint(j(j4) * tq.I.C()))) * 0.1d)};
                    String str2 = String.format(strI, Arrays.copyOf(objArr, objArr.length));
                    Intrinsics.checkNotNullExpressionValue(str2, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8196, 1849357493072985426L ^ a2) /* invoke-custom */);
                    str = str2 + (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18759, 7959310330330977304L ^ a2) /* invoke-custom */;
                } else {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String strI2 = (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30310, 8706127278633659199L ^ a2) /* invoke-custom */;
                    Object[] objArr2 = {Double.valueOf(((double) ((float) Math.rint(y((short) i4, (short) i5, i6) * tq.I.C()))) * 0.1d)};
                    String str3 = String.format(strI2, Arrays.copyOf(objArr2, objArr2.length));
                    Intrinsics.checkNotNullExpressionValue(str3, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6871, 8218580168692025226L ^ a2) /* invoke-custom */);
                    str = str3 + (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24483, 2783852342651552507L ^ a2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objW, -6022023423380325186L, a2) /* invoke-custom */;
            }
        } else {
            String strI22 = (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30310, 8706127278633659199L ^ a2) /* invoke-custom */;
            Object[] objArr22 = {Double.valueOf(((double) ((float) Math.rint(y((short) i4, (short) i5, i6) * tq.I.C()))) * 0.1d)};
            String str32 = String.format(strI22, Arrays.copyOf(objArr22, objArr22.length));
            Intrinsics.checkNotNullExpressionValue(str32, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6871, 8218580168692025226L ^ a2) /* invoke-custom */);
            str = str32 + (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24483, 2783852342651552507L ^ a2) /* invoke-custom */;
        }
        X(context, j2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [float] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    private final float j(long j) {
        long j2 = a ^ j;
        Object objH = j2;
        try {
            if (!zf.v(objH ^ 31688697773552L).method_6128()) {
                return dm.h.r() * 720.0f;
            }
            objH = dm.h.H() * 720.0f;
            return objH;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 3429780157250404170L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [float] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    private final float y(short s, short s2, int i) {
        long j = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a;
        Object objH = j;
        try {
            if (!zf.v(objH ^ 91919183905550L).method_6128()) {
                return dm.h.r() * 200.0f;
            }
            objH = dm.h.H() * 200.0f;
            return objH;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, -3357634002263801420L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 28724;
        if (f[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/p7", e);
            }
        }
        return f[i2];
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
            r1 = 0
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
            java.lang.String r1 = "su/catlean/p7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
