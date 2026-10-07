package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import net.minecraft.class_2828;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u8.class */
public final class u8 extends _g {

    @NotNull
    public static final u8 d = null;
    static final KProperty[] W = null;

    @NotNull
    private static final cw w = null;

    @NotNull
    private static final ct F = null;

    @NotNull
    private static final ct Y = null;

    @NotNull
    private static final cq k = null;

    @Nullable
    private static class_243 g;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map e = null;
    private static final long[] f = null;
    private static final Integer[] h = null;
    private static final Map i = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private u8(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4750, 27617947421014921L ^ j2) /* invoke-custom */, jt.V(), null, 4, null, j2 ^ 39626938997515L);
    }

    private final be L(long j) {
        return (be) w.E(this, (a ^ j) ^ 131989444268286L, W[0]);
    }

    private final float E(long j) {
        return ((Number) F.E(this, (a ^ j) ^ 28567959182663L, W[1])).floatValue();
    }

    private final float w(long j) {
        return ((Number) Y.E(this, (a ^ j) ^ 38409337956598L, W[2])).floatValue();
    }

    private final boolean r(long j) {
        return ((Boolean) k.E(this, (a ^ j) ^ 68799657715187L, W[3])).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01f4: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void q(su.catlean.api.event.events.player.PreSyncEvent r15) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u8.q(su.catlean.api.event.events.player.PreSyncEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153 A[PHI: r2
  0x0153: PHI (r2v29 boolean) = (r2v28 boolean), (r2v41 boolean) binds: [B:29:0x011c, B:38:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.be] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.dm] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.dm] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u8.B(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    @Flow
    private final void H(ReceivePacket receivePacket) {
        long j = a ^ 111216391954412L;
        Object obj = j;
        long j2 = obj ^ 651726045946L;
        try {
            try {
                if (L(obj ^ 103272565981974L) == be.MATRIX_JUMP) {
                    obj = receivePacket.getPacket() instanceof class_2708;
                    if (obj != 0) {
                        g = zf.v(j2).method_18798();
                    }
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8048703373270423503L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8048703373270423503L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    @Flow
    private final void Y(SendPacket sendPacket) {
        long j = a ^ 120576427063952L;
        Object obj = j;
        long j2 = obj ^ 42128827290743L;
        long j3 = obj ^ 8902585689990L;
        try {
            try {
                try {
                    if (L(obj ^ 93881308751466L) == be.MATRIX_JUMP) {
                        obj = sendPacket.getPacket() instanceof class_2828.class_2830;
                        if (obj == 0 || g == null) {
                            return;
                        }
                        class_746 class_746VarV = zf.v(j3);
                        class_243 class_243Var = g;
                        Intrinsics.checkNotNull(class_243Var);
                        double d2 = class_243Var.field_1352;
                        class_243 class_243Var2 = g;
                        Intrinsics.checkNotNull(class_243Var2);
                        double d3 = class_243Var2.field_1351;
                        class_243 class_243Var3 = g;
                        Intrinsics.checkNotNull(class_243Var3);
                        class_746VarV.method_18800(d2, d3, class_243Var3.field_1350);
                        d(j2);
                        g = null;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -778759473859064499L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -778759473859064499L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -778759473859064499L, j) /* invoke-custom */;
        }
    }

    @Flow
    public final void z(@NotNull MoveEvent event) {
        long j = a ^ 6815589672276L;
        long j2 = j ^ 30517831883988L;
        long j3 = j ^ 109417657956418L;
        Intrinsics.checkNotNullParameter(event, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6530, 5519662831669694590L ^ j) /* invoke-custom */);
        if (L(j ^ 69241077791150L) == be.GRIM_GLIDE) {
            double[] dArrO = dm.O(dm.h, 0.3f, false, 1.0f, j2, 0.0f, 0.0f, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8465, 6284429350255189884L ^ j) /* invoke-custom */, null);
            event.cancel();
            event.setY(-0.03d);
            event.setX(dArrO[0]);
            event.setZ(dArrO[1]);
            zf.v(j3).method_18800(event.getX(), -0.03d, event.getZ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // su.catlean._g
    public void b(long j) {
        long j2 = j ^ 29647348875563L;
        zf.v(j2).method_31549().field_7479 = false;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1405336142816457638L, j) /* invoke-custom */;
        zf.v(j2).method_31549().method_7248(0.05f);
        try {
            try {
                obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1375206718265298308L, j) /* invoke-custom */;
                if (obj != 0) {
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj == 0, 1350214073363911452L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused) {
                obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1413101743418305504L, j) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1413101743418305504L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.be] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean G() {
        /*
            long r0 = su.catlean.u8.a
            r1 = 2718629579749(0x278faf34be5, double:1.343181479122E-311)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 64542283798303(0x3ab36be6171f, double:3.18881251288776E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r0 = -4308262490523361975(0xc435fa174d371d49, double:-4.054025828809568E20)
            r1 = r7
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r11 = r0
            su.catlean.u8 r0 = su.catlean.u8.d     // Catch: java.lang.NumberFormatException -> L30
            r1 = r9
            su.catlean.be r0 = r0.L(r1)     // Catch: java.lang.NumberFormatException -> L30
            su.catlean.be r1 = su.catlean.be.Creative     // Catch: java.lang.NumberFormatException -> L30
            r2 = r11
            if (r2 == 0) goto L51
            if (r0 == r1) goto L54
            goto L3a
        L30:
            r1 = -4304273891338994632(0xc44425b36ac03c38, double:-7.433030276966043E20)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L47
            throw r0     // Catch: java.lang.NumberFormatException -> L47
        L3a:
            su.catlean.u8 r0 = su.catlean.u8.d     // Catch: java.lang.NumberFormatException -> L47
            r1 = r9
            su.catlean.be r0 = r0.L(r1)     // Catch: java.lang.NumberFormatException -> L47
            su.catlean.be r1 = su.catlean.be.Vanilla     // Catch: java.lang.NumberFormatException -> L47
            goto L51
        L47:
            r1 = -4304273891338994632(0xc44425b36ac03c38, double:-7.433030276966043E20)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L51:
            if (r0 != r1) goto L62
        L54:
            r0 = 1
            goto L63
        L58:
            r1 = -4304273891338994632(0xc44425b36ac03c38, double:-7.433030276966043E20)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L62:
            r0 = 0
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u8.G():boolean");
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 25296;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u8", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "([B)V"
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
            java.lang.String r0 = "su/catlean/u8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u8.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 21827;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u8", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
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
            java.lang.String r1 = "([B)V"
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
            java.lang.String r0 = "su/catlean/u8"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u8.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
