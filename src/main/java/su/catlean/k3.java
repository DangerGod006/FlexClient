package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/k3.class */
public final class k3 extends _g {

    @NotNull
    public static final k3 P = null;
    static final KProperty[] G = null;

    @NotNull
    private static final cq A = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final cw o = null;

    @NotNull
    private static final ct b = null;

    @NotNull
    private static final c8 j = null;

    @NotNull
    private static final c8 f = null;

    @NotNull
    private static final ct I = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct g = null;

    @NotNull
    private static final List B = null;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] d = null;
    private static final Map e = null;
    private static final long[] h = null;
    private static final Integer[] i = null;
    private static final Map k = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private k3(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15576, 2918120875220154649L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 62439613565038L);
    }

    private final boolean Z(long j2) {
        return ((Boolean) A.E(this, (a ^ j2) ^ 115402573648746L, G[0])).booleanValue();
    }

    private final void V(long j2, boolean z) {
        A.b(this, (a ^ j2) ^ 121734373060545L, G[0], Boolean.valueOf(z));
    }

    private final boolean l(long j2) {
        return ((Boolean) T.E(this, (a ^ j2) ^ 129100266795344L, G[1])).booleanValue();
    }

    private final void E(boolean z, long j2) {
        T.b(this, (a ^ j2) ^ 44583403777124L, G[1], Boolean.valueOf(z));
    }

    private final fo a(int i2, int i3, short s) {
        return (fo) o.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 101305267803914L, G[2]);
    }

    private final void H(fo foVar, long j2) {
        o.b(this, (a ^ j2) ^ 109557474822141L, G[2], foVar);
    }

    private final float r(long j2) {
        return ((Number) b.E(this, (a ^ j2) ^ 65467375514301L, G[3])).floatValue();
    }

    private final void N(float f2, long j2) {
        b.b(this, (a ^ j2) ^ 48514803688613L, G[3], Float.valueOf(f2));
    }

    private final int q(long j2) {
        return ((Number) j.E(this, (a ^ j2) ^ 10886772371591L, G[4])).intValue();
    }

    private final void G(long j2, int i2) {
        j.b(this, (a ^ j2) ^ 22789098934214L, G[4], Integer.valueOf(i2));
    }

    private final int G(long j2) {
        return ((Number) f.E(this, (a ^ j2) ^ 93572249339748L, G[5])).intValue();
    }

    private final void Q(long j2, int i2) {
        f.b(this, (a ^ j2) ^ 34801158228811L, G[5], Integer.valueOf(i2));
    }

    private final float g(long j2) {
        long j3 = a ^ j2;
        return ((Number) I.E(this, j3 ^ 100409027565991L, G[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16946, 8217903588791541288L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void T(long j2, float f2) {
        long j3 = a ^ j2;
        I.b(this, j3 ^ 78128357703343L, G[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16946, 8217928500048342732L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float H(long j2) {
        long j3 = a ^ j2;
        return ((Number) N.E(this, j3 ^ 31585336317786L, G[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21680, 5729422025495545408L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void d(long j2, float f2) {
        long j3 = a ^ j2;
        N.b(this, j3 ^ 69795145263629L, G[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21680, 5729397644546567419L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float L(char c2, int i2, char c3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a;
        return ((Number) g.E(this, j2 ^ 32138682683201L, G[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23708, 4170315710977349225L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void q(long j2, float f2) {
        long j3 = a ^ j2;
        g.b(this, j3 ^ 74419288997316L, G[(int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23708, 4170222660213224192L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    @Flow
    private final void i(SendPacket sendPacket) {
        zf.F((a ^ 17431992150514L) ^ 121072140337196L).method_40000(() -> {
            z(r1);
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01b8: INVOKE 
          (r-1 I:su.catlean.zi)
          (r0 I:net.minecraft.class_2960)
          (r1 I:net.minecraft.class_243)
          (r2 I:float)
          (r3 I:float)
          (r4 I:float)
          (r5 I:float)
          (r6 I:long)
          (r7 I:java.awt.Color)
          (r8 I:boolean)
          (r9 I:su.catlean.g7)
          (r10 I:float)
          (r11 I:float)
          (r12 I:float)
          (r13 I:float)
          (r14 I:boolean)
          (r15 I:int)
          (r16 I:java.lang.Object)
         STATIC call: su.catlean.zi.e(su.catlean.zi, net.minecraft.class_2960, net.minecraft.class_243, float, float, float, float, long, java.awt.Color, boolean, su.catlean.g7, float, float, float, float, boolean, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void Q(su.catlean.api.event.events.render.Render3DEvent r24) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k3.Q(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    private static final boolean P() {
        return P.l((a ^ 40640580743259L) ^ 19089486499087L);
    }

    private static final boolean s() {
        return P.l((a ^ 72691019585721L) ^ 131625497765357L);
    }

    private static final boolean Q() {
        return P.l((a ^ 51848296769261L) ^ 29193398164409L);
    }

    private static final boolean z() {
        return P.l((a ^ 65208926269591L) ^ 16374085569987L);
    }

    private static final boolean M() {
        return P.l((a ^ 128692106463711L) ^ 71063289836683L);
    }

    private static final boolean Y() {
        return P.l((a ^ 48947536019154L) ^ 27688531133318L);
    }

    private static final boolean j() {
        return P.l((a ^ 109422368747028L) ^ 94756105638720L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0171: INVOKE (r-1 I:su.catlean.u2), (r0 I:long), (r1 I:net.minecraft.class_2824) VIRTUAL call: su.catlean.u2.G(long, net.minecraft.class_2824):net.minecraft.class_1297
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final void z(su.catlean.api.event.events.network.SendPacket r24) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k3.z(su.catlean.api.event.events.network.SendPacket):void");
    }

    private static final boolean f(nu nuVar) {
        long j2 = a ^ 43984575763614L;
        long j3 = j2 ^ 26875514063542L;
        Intrinsics.checkNotNullParameter(nuVar, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31216, 5912554980429071533L ^ j2) /* invoke-custom */);
        return nuVar.m().c((int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17749, 8346492178335640808L ^ j2) /* invoke-custom */, j3);
    }

    private static final boolean J(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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
                char c2 = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c2 | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 23924;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/k3", e2);
            }
        }
        return d[i3];
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/k3"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 18879;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/k3", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/k3"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k3.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
