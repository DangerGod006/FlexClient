package su.catlean;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ka.class */
public final class ka extends _g {

    @NotNull
    public static final ka F = null;
    static final KProperty[] m = null;

    @NotNull
    private static final cp y = null;

    @NotNull
    private static final cq z = null;

    @NotNull
    private static final cq e = null;

    @NotNull
    private static final cq X = null;

    @NotNull
    private static final cq N = null;

    @NotNull
    private static final cq U = null;

    @NotNull
    private static final cq P = null;

    @NotNull
    private static final cq w = null;

    @NotNull
    private static final cq I = null;

    @NotNull
    private static final cq D = null;

    @NotNull
    private static final cq u = null;

    @NotNull
    private static final cq J = null;

    @NotNull
    private static final cw E = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long[] f = null;
    private static final Integer[] g = null;
    private static final Map h = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ka(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4130, 4436466254171102477L ^ j2) /* invoke-custom */, jt.z(), null, 4, null, j2 ^ 6790689040642L);
    }

    private final h I(long j) {
        return (h) y.E(this, (a ^ j) ^ 22599114374420L, m[0]);
    }

    private final boolean F(short s, char c2, int i) {
        return ((Boolean) z.E(this, ((((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a) ^ 120475890040779L, m[1])).booleanValue();
    }

    private final boolean C(long j) {
        return ((Boolean) e.E(this, (a ^ j) ^ 33449127154359L, m[2])).booleanValue();
    }

    private final boolean l(long j) {
        return ((Boolean) X.E(this, (a ^ j) ^ 48195041042239L, m[3])).booleanValue();
    }

    private final boolean L(long j) {
        return ((Boolean) N.E(this, (a ^ j) ^ 23487325995376L, m[4])).booleanValue();
    }

    private final boolean M(long j) {
        return ((Boolean) U.E(this, (a ^ j) ^ 29083746881010L, m[5])).booleanValue();
    }

    private final boolean s(long j) {
        long j2 = a ^ j;
        return ((Boolean) P.E(this, j2 ^ 106806265729561L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24761, 6158852202459971983L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean g(long j) {
        long j2 = a ^ j;
        return ((Boolean) w.E(this, j2 ^ 76278337353995L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15003, 4583222365520294067L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean H(short s, long j) {
        long j2 = ((((long) s) << 48) | ((j << 16) >>> 16)) ^ a;
        return ((Boolean) I.E(this, j2 ^ 58727443758306L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24684, 3032842452667461536L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean z(long j) {
        long j2 = a ^ j;
        return ((Boolean) D.E(this, j2 ^ 114831469873251L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23178, 2259383152507691474L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean T(long j) {
        long j2 = a ^ j;
        return ((Boolean) u.E(this, j2 ^ 96266406026825L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(74, 4461115191791103294L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final boolean t(long j) {
        long j2 = a ^ j;
        return ((Boolean) J.E(this, j2 ^ 76343213551806L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22605, 4327953523331488727L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final wk E(long j) {
        long j2 = a ^ j;
        return (wk) E.E(this, j2 ^ 21678869524307L, m[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13092, 8780207544482623326L ^ j2) /* invoke-custom */]);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:163:0x03c9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void E(su.catlean.api.event.events.render.Render3DEvent r14) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ka.E(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void X(EntityRemove entityRemove) {
        long j = a ^ 76121351747804L;
        int i = (int) (j >>> 56);
        long j2 = ((j ^ 81406243844190L) << 8) >>> 8;
        long j3 = j ^ 99778121687261L;
        long j4 = j ^ 71008004031590L;
        long j5 = j ^ 40801475501621L;
        ?? T = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7104625407726497229L, j) /* invoke-custom */;
        try {
            try {
                T = t(j4);
                ?? r0 = T;
                if (T != 0) {
                    if (T == 0) {
                        return;
                    } else {
                        r0 = entityRemove.getEntity() instanceof class_1684;
                    }
                }
                ?? L = r0;
                if (T != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        L = (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13805, 1443707971693963750L ^ j) /* invoke-custom */;
                    }
                }
                ?? r36 = L;
                int i2 = 0;
                while (i2 < r36) {
                    dh dhVar = dh.S;
                    gi giVar = gi.FIREFLY;
                    ka kaVar = F;
                    class_1297 entity = entityRemove.getEntity();
                    Intrinsics.checkNotNull(entity);
                    dhVar.a(new bk(giVar, kaVar.J((byte) i, j2, entity), 0.0f, j5, 0.25f, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6526, 4600146126394475888L ^ j) /* invoke-custom */, new class_243((Math.random() / ((double) 2.0f)) - ((double) 0.25f), Math.random() / ((double) 4.0f), (Math.random() / ((double) 2.0f)) - ((double) 0.25f)), jh.f.Z(j3, i2 * (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19154, 4806224176292763339L ^ j) /* invoke-custom */), 0.0f, 0.0f, false, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21777, 8797343154815928604L ^ j) /* invoke-custom */, null));
                    i2++;
                    if (T == 0) {
                        return;
                    }
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 7195530541610443826L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 7195530541610443826L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x06b2: INVOKE 
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
    private final void H(net.minecraft.class_4587 r24, net.minecraft.class_1297 r25, su.catlean.g7 r26, byte r27, long r28) {
        /*
            Method dump skipped, instruction units count: 1892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ka.H(net.minecraft.class_4587, net.minecraft.class_1297, su.catlean.g7, byte, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    private final void Q(class_4587 class_4587Var, long j, class_243 class_243Var, class_1657 class_1657Var, float f2) {
        long j2 = a ^ j;
        long j3 = j2 ^ 102257858051744L;
        long j4 = j2 ^ 74800812929L;
        long j5 = j2 ^ 25125237962101L;
        long j6 = j2 ^ 12703739980493L;
        long j7 = j2 ^ 36655608577811L;
        long j8 = j2 ^ 36728742031349L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-201893383011159449L, j2) /* invoke-custom */;
        if (obj != 0) {
            try {
                try {
                    obj = (zf.v(j8).method_5707(class_243Var) > 1.0d ? 1 : (zf.v(j8).method_5707(class_243Var) == 1.0d ? 0 : -1));
                    if (obj < 0) {
                        return;
                    } else {
                        zi.Q(zi.v, class_4587Var, class_243Var, class_1657Var, 0.45f, false, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23775, 4382760294491135841L ^ j2) /* invoke-custom */, null, j7);
                    }
                } catch (NumberFormatException unused) {
                    obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -256246938600162408L, j2) /* invoke-custom */;
                    throw obj;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -256246938600162408L, j2) /* invoke-custom */;
            }
        }
        VertexFormat vertexFormat = class_290.field_1576;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26427, 5501978762576637763L ^ j2) /* invoke-custom */);
        g7 g7Var = new g7(j3, vertexFormat, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5269, 1166393149552187189L ^ j2) /* invoke-custom */, false, 4, null);
        class_238 class_238Var = new class_238(class_243Var.field_1352 - ((double) 0.6f), class_243Var.field_1351 + ((double) (f2 * 1.8f)), class_243Var.field_1350 - ((double) 0.6f), class_243Var.field_1352 + ((double) 0.6f), class_243Var.field_1351 + ((double) 1.8f) + ((double) 0.5f), class_243Var.field_1350 + ((double) 0.6f));
        cz czVar = cz.H;
        Color color = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23146, 4777050677961822728L ^ j2) /* invoke-custom */);
        Color color2 = Color.BLACK;
        Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1445, 1667217302081162715L ^ j2) /* invoke-custom */);
        czVar.a(j5, g7Var, class_238Var, color, color2);
        g7.R(j6, g7Var, b6.R.C(), null, null, class_4587Var.method_23760().method_23761(), null, null, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3283, 7320135062297595761L ^ j2) /* invoke-custom */, null);
        zi.v.D(class_4587Var, class_243Var, class_1657Var, j4, 1.0f, true);
    }

    private static final boolean h() {
        return F.F((short) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 45085683419129L) ^ 4756951135286L) << 32) >>> 32));
    }

    private static final boolean j() {
        return F.F((short) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 123264264075078L) ^ 102570108945545L) << 32) >>> 32));
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 13521;
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
                throw new RuntimeException("su/catlean/ka", e2);
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/ka"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ka.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16168;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ka", e2);
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/ka"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ka.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
