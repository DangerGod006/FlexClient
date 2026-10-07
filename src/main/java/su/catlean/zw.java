package su.catlean;

import com.mojang.blaze3d.systems.RenderSystem;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10017;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_276;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.GameRendererAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class */
public final class zw {

    @NotNull
    public static final zw l;
    private static boolean G;

    @Nullable
    private static class_6364 v;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(-6917757038483336241L, -5311254499861508910L, MethodHandles.lookup().lookupClass()).a(169292131484378L);
    private static final Map d = new HashMap(13);

    private zw() {
    }

    @Nullable
    public final class_6364 v() {
        return v;
    }

    public final void W(@Nullable class_6364 class_6364Var) {
        v = class_6364Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, su.catlean._g[]] */
    public final void I(@NotNull class_4587 stack, long a2, @NotNull class_1297 target) {
        long j = a ^ a2;
        long j2 = j ^ 132384715496687L;
        long j3 = j ^ 119899356579004L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j3 << 32) >>> 48);
        int i3 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 90244818507686L;
        Intrinsics.checkNotNullParameter(stack, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3043, 4324918683145989612L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(target, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25682, 338932000658850375L ^ j) /* invoke-custom */);
        class_4184 class_4184VarMethod_19418 = zf.F(j2).field_1773.method_19418();
        Intrinsics.checkNotNullExpressionValue(class_4184VarMethod_19418, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18990, 4853055889803127854L ^ j) /* invoke-custom */);
        K(j4);
        double dN = zi.v.n(i, (char) i2, i3);
        double dMethod_16436 = class_3532.method_16436(dN, target.field_6038, target.method_23317()) - class_4184VarMethod_19418.method_71156().field_1352;
        double dMethod_164362 = class_3532.method_16436(dN, target.field_5971, target.method_23318()) - class_4184VarMethod_19418.method_71156().field_1351;
        double dMethod_164363 = class_3532.method_16436(dN, target.field_5989, target.method_23321()) - class_4184VarMethod_19418.method_71156().field_1350;
        G = true;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9431702312054932L, j) /* invoke-custom */;
        Object objMethod_41753 = zf.F(j2).field_1690.method_42435().method_41753();
        Intrinsics.checkNotNullExpressionValue(objMethod_41753, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15899, 3705981231720454154L ^ j) /* invoke-custom */);
        boolean zBooleanValue = ((Boolean) objMethod_41753).booleanValue();
        zf.F(j2).field_1690.method_42435().method_41748(false);
        RenderSystem.backupProjectionMatrix();
        GameRendererAccessor gameRendererAccessor = zf.F(j2).field_1773;
        Intrinsics.checkNotNull(gameRendererAccessor, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1216, 8808400076697330376L ^ j) /* invoke-custom */);
        RenderSystem.setProjectionMatrix(gameRendererAccessor.getLevelProjectionMatrixBuffer().method_71123(zi.v.s()), RenderSystem.getProjectionType());
        GofraState.INSTANCE.setModifyBuffer(true);
        class_10017 class_10017VarMethod_62425 = zf.F(j2).method_1561().method_3953(target).method_62425(target, zi.v.n(i, (char) i2, i3));
        Intrinsics.checkNotNullExpressionValue(class_10017VarMethod_62425, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13439, 1620536564818694776L ^ j) /* invoke-custom */);
        GameRendererAccessor gameRendererAccessor2 = zf.F(j2).field_1773;
        Intrinsics.checkNotNull(gameRendererAccessor2, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25293, 2235021715621840093L ^ j) /* invoke-custom */);
        class_12075 class_12075Var = gameRendererAccessor2.getLevelRenderState().field_63082;
        Intrinsics.checkNotNullExpressionValue(class_12075Var, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23686, 5727171188192459407L ^ j) /* invoke-custom */);
        zf.F(j2).method_1561().method_72976(class_10017VarMethod_62425, class_12075Var, dMethod_16436, dMethod_164362, dMethod_164363, stack, zf.F(j2).field_1773.method_72910());
        zf.F(j2).field_1773.method_72911().method_73002();
        zf.F(j2).method_22940().method_23000().method_22993();
        zf.F(j2).field_1773.method_72910().method_72953();
        GofraState.INSTANCE.setModifyBuffer(false);
        try {
            zf.F(j2).field_1690.method_42435().method_41748(Boolean.valueOf(zBooleanValue));
            RenderSystem.restoreProjectionMatrix();
            G = false;
            if (obj == 0) {
                obj = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 36543053928139452L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 24197562136279429L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void C(long j, int i) {
        long j2 = ((j << 32) | ((((long) i) << 32) >>> 32)) ^ a;
        long j3 = j2 ^ 75707709163054L;
        long j4 = j2 ^ 70830402502152L;
        long j5 = j2 ^ 11756198207391L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 32);
        int i4 = (int) ((j5 << 48) >>> 48);
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8962982700938792151L, j2) /* invoke-custom */;
        try {
            obj = obj;
            if (obj != 0) {
                try {
                    obj = v;
                    if (obj == 0) {
                        return;
                    }
                    G = true;
                    GofraState.INSTANCE.setModifyBuffer(true);
                    kg kgVar = kg.W;
                    Color colorP = jl.y.p(jh.f.Z(j4, 0), (char) i2, i3, 0.4f, (short) i4);
                    class_6364 class_6364Var = v;
                    Intrinsics.checkNotNull(class_6364Var);
                    class_6364 class_6364Var2 = v;
                    Intrinsics.checkNotNull(class_6364Var2);
                    Color color = Color.WHITE;
                    Intrinsics.checkNotNullExpressionValue(color, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5523, 982106804230000596L ^ j2) /* invoke-custom */);
                    Color color2 = Color.WHITE;
                    Intrinsics.checkNotNullExpressionValue(color2, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21746, 2255694513906699965L ^ j2) /* invoke-custom */);
                    kgVar.d(null, colorP, class_6364Var, class_6364Var2, false, false, 0.0f, 0.0f, 0.0f, 4.0f, 0, color, color2, 0, j3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                    GofraState.INSTANCE.setModifyBuffer(false);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8941506595927508422L, j2) /* invoke-custom */;
                }
            }
            G = false;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8941506595927508422L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x040B: MOVE_MULTI in method: su.catlean.zw.q(net.minecraft.class_4587, long, net.minecraft.class_1297, char, float):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x040B: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[13]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    public final void q(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r1, long r2, @org.jetbrains.annotations.NotNull net.minecraft.class_1297 r4, char r5, float r6) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zw.q(net.minecraft.class_4587, long, net.minecraft.class_1297, char, float):void");
    }

    public static void Q(zw zwVar, class_4587 class_4587Var, class_1297 class_1297Var, float f2, int i, char c2, int i2, short s, Object obj) {
        long j = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ a;
        long j2 = j >>> 16;
        int i3 = (int) (((j ^ 76158855950356L) << 48) >>> 48);
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        zwVar.q(class_4587Var, j2, class_1297Var, (char) i3, f2);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x03E3: MOVE_MULTI in method: su.catlean.zw.X(net.minecraft.class_4587, int, char, net.minecraft.class_1297, char, float):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x03E3: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[13]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    public final void X(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r1, int r2, char r3, @org.jetbrains.annotations.NotNull net.minecraft.class_1297 r4, char r5, float r6) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zw.X(net.minecraft.class_4587, int, char, net.minecraft.class_1297, char, float):void");
    }

    public static void R(zw zwVar, long j, class_4587 class_4587Var, class_1297 class_1297Var, float f2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 8713413409112L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        zwVar.X(class_4587Var, i2, (char) i3, class_1297Var, (char) i4, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[PHI: r0 r1
  0x00ac: PHI (r0v16 ??) = (r0v33 ??), (r0v34 ??), (r0v35 ??) binds: [B:14:0x0073, B:16:0x0078, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00ac: PHI (r1v12 int) = (r1v11 int), (r1v11 int), (r1v22 int) binds: [B:14:0x0073, B:16:0x0078, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.minecraft.class_6364] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(long r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zw.K(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Flow
    private final void x(FrameBufferEvent frameBufferEvent) {
        Object obj = a ^ 81756662801410L;
        try {
            try {
                if (v != null) {
                    obj = G;
                    if (obj != 0) {
                        frameBufferEvent.setFrameBuffer((class_276) v);
                        frameBufferEvent.cancel();
                    }
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8794081215540904922L, obj) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8794081215540904922L, obj) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 98819290004390L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i3 = 0;
        String str = "Â-\u0001\u0004=Ú®36\u0086¨\u000f\u008cÌ\u0005\u008b ýM\u0006\u00adpÓXëS2¨\u00951\bËS\u008bè3}r\u0000\u0004Òãè&þ\u0012\fC\u008b\u0010Ößßãé7Ê9vÈ\u0087;\u0012\u009b4²(Ä8òp\u009b!¬0µ]¸/ÕmV\u0082ãí\u001e\u009b@\u000bVcyIæ\u001ck&VFÄ\u000f\"\u0083ó1\u001aZ(\u001b\u00984Ó=¢×Ú\u007fßÆÇà-©À\u001bf\u008c\u0088h9Er0`7ÑIÅÏ\u0081\u0012\u000f¸OË¶5Ô\u0010;Áæä\u0089Ä©Kïf²Ókù¤¦\u0018·\u000fR\u0088É´ñª8\u001dq¯É\u009a\u0096Ã\u0095°\u001bò\u0015ôqT(»<~Ä\u0082\u008c\nö@\u007f\u0002M\u008f\u0094\u007fH\u0091©áá(\u001aXk8bÝ\u0096¶Lvb!\u0098ÎÜ\u0014Ñë\u0088\u0010¨À\u008b\u008f\rFö\u0091/ZÂû¶\u0018\u001eæ M£»ýY(Q¶v>L\u0082ÖäêÑJãö¨´GMË\u009aï6Å/Ð\u008ck\u0018\u0093\u0091\\\b\u0095\u0092e\u007fâ\u0015j/{=q'åð¿\t\u001fÝa\u0007\u00105}\u0082æÂ\\^Ðï(¤\u000b\u0081!2ª\u0088dß ®Õ\"wJ\u001aP\\bã%6p\u000e\u009fo\u0087\u0080a$(\u009cGÅ©i\r]Ö\u009bþ\u008fSÚ\u0084\u0014ò\u001bGôÄH\u0018ØèÀÓ:\u0015r\u0083eÉÓ\u0007.ôY$\u0097ïHÊ(Ô\u0013r\u001cA\u009bç'<wÇYá\u0001ÅÜÐù»×+ 2\r\u0085\u0096Íñýî¦\u0085çÊ_c\u009f¯Ì\u0096õ\u0005g\u0096w^\u0090ï\u0090Ø\u008c§íÂbÎ\u0099\u009e\u0089\r\u0007trb\u0001\u001a\u0091\u0012\u000f 3\u0014\u0095m\u0095oE9:\u000fY\u0083ÞÅ\u0011ð\u008d~Áü\u009eQ\u0088\bù\u0092ïÓpv¶!(\u0015Úc<3ÐÌùä\t]%M4ãú\u0015e¯NÓ>9ôy\u008f,\u0086¾\u0019¤5wH1¢\u0098\r¾Ó(ðvç¤!¢ÈÉË\u009ar\u0087i\u0002\u000b¯&ì\u0012\u008cC\u009d{½\u008b§:ø9¤þ´ãèÔ\u001b±äÌ´(%¶\u0095\u0014¾S\r#\u0001É\u0098e,\u0000\u008d\u0098%(\u0003\bç\u0084\u0007yøf78P+\u0088ó¸Vjë¯8¹\u000e\u0010ÿäw\u0089\u0080H.\u0099Tº,>âëÈ\u001e0\u001e\u008cå\u008f¦\u009dV.¦ïèÕñ4ò&æÇ¡ \u0091YN4º\u0099\u001e¦m\u0014\u009b\u0098r0\b8Å\u008b£[+Ú=[\\D\u0002è\u0010×·\u009ea\u008c\u001aÌiQ\u0099Á\u001c[U\f\u0005";
        int length = "Â-\u0001\u0004=Ú®36\u0086¨\u000f\u008cÌ\u0005\u008b ýM\u0006\u00adpÓXëS2¨\u00951\bËS\u008bè3}r\u0000\u0004Òãè&þ\u0012\fC\u008b\u0010Ößßãé7Ê9vÈ\u0087;\u0012\u009b4²(Ä8òp\u009b!¬0µ]¸/ÕmV\u0082ãí\u001e\u009b@\u000bVcyIæ\u001ck&VFÄ\u000f\"\u0083ó1\u001aZ(\u001b\u00984Ó=¢×Ú\u007fßÆÇà-©À\u001bf\u008c\u0088h9Er0`7ÑIÅÏ\u0081\u0012\u000f¸OË¶5Ô\u0010;Áæä\u0089Ä©Kïf²Ókù¤¦\u0018·\u000fR\u0088É´ñª8\u001dq¯É\u009a\u0096Ã\u0095°\u001bò\u0015ôqT(»<~Ä\u0082\u008c\nö@\u007f\u0002M\u008f\u0094\u007fH\u0091©áá(\u001aXk8bÝ\u0096¶Lvb!\u0098ÎÜ\u0014Ñë\u0088\u0010¨À\u008b\u008f\rFö\u0091/ZÂû¶\u0018\u001eæ M£»ýY(Q¶v>L\u0082ÖäêÑJãö¨´GMË\u009aï6Å/Ð\u008ck\u0018\u0093\u0091\\\b\u0095\u0092e\u007fâ\u0015j/{=q'åð¿\t\u001fÝa\u0007\u00105}\u0082æÂ\\^Ðï(¤\u000b\u0081!2ª\u0088dß ®Õ\"wJ\u001aP\\bã%6p\u000e\u009fo\u0087\u0080a$(\u009cGÅ©i\r]Ö\u009bþ\u008fSÚ\u0084\u0014ò\u001bGôÄH\u0018ØèÀÓ:\u0015r\u0083eÉÓ\u0007.ôY$\u0097ïHÊ(Ô\u0013r\u001cA\u009bç'<wÇYá\u0001ÅÜÐù»×+ 2\r\u0085\u0096Íñýî¦\u0085çÊ_c\u009f¯Ì\u0096õ\u0005g\u0096w^\u0090ï\u0090Ø\u008c§íÂbÎ\u0099\u009e\u0089\r\u0007trb\u0001\u001a\u0091\u0012\u000f 3\u0014\u0095m\u0095oE9:\u000fY\u0083ÞÅ\u0011ð\u008d~Áü\u009eQ\u0088\bù\u0092ïÓpv¶!(\u0015Úc<3ÐÌùä\t]%M4ãú\u0015e¯NÓ>9ôy\u008f,\u0086¾\u0019¤5wH1¢\u0098\r¾Ó(ðvç¤!¢ÈÉË\u009ar\u0087i\u0002\u000b¯&ì\u0012\u008cC\u009d{½\u008b§:ø9¤þ´ãèÔ\u001b±äÌ´(%¶\u0095\u0014¾S\r#\u0001É\u0098e,\u0000\u008d\u0098%(\u0003\bç\u0084\u0007yøf78P+\u0088ó¸Vjë¯8¹\u000e\u0010ÿäw\u0089\u0080H.\u0099Tº,>âëÈ\u001e0\u001e\u008cå\u008f¦\u009dV.¦ïèÕñ4ò&æÇ¡ \u0091YN4º\u0099\u001e¦m\u0014\u009b\u0098r0\b8Å\u008b£[+Ú=[\\D\u0002è\u0010×·\u009ea\u008c\u001aÌiQ\u0099Á\u001c[U\f\u0005".length();
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
                            b = strArr;
                            c = new String[22];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[13];
                            int i9 = 0;
                            String str3 = "\u0080v\u0085¦º©\u000ei\u009dÍb¯o®Û\u0084£Ê\u0095~d|v'\u0085ÚØä\u0083\u0093»Kw7\u000fá¸\u0003x\u009d¢þ\t\fí\u0088*°ûr¢\u000eú\u0088\u008d=Z\u008e°h[<j\u0011E\u009c\u0081o\b\u009aî\u0093<¥{óñ¹<#ªe¤\u0015`:Á\u0018";
                            int length2 = "\u0080v\u0085¦º©\u000ei\u009dÍb¯o®Û\u0084£Ê\u0095~d|v'\u0085ÚØä\u0083\u0093»Kw7\u000fá¸\u0003x\u009d¢þ\t\fí\u0088*°ûr¢\u000eú\u0088\u008d=Z\u008e°h[<j\u0011E\u009c\u0081o\b\u009aî\u0093<¥{óñ¹<#ªe¤\u0015`:Á\u0018".length();
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
                                                e = jArr;
                                                f = new Integer[13];
                                                l = new zw();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "/IG¦\u0081f7ÆjÇ\u0095º\u0002Íì1";
                                                length2 = "/IG¦\u0081f7ÆjÇ\u0095º\u0002Íì1".length();
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
                        str = "\ry\u00adr¯jB.à\n\u0092C\u0090Ï)ySª¡U\u0001\u0006¤äPA\u0089\u009dc\u000e*\u0013H71¬\u0013\u000b%\u001aT7\u0003\u001bí\u0019HÇïÞµ/]\u0011ÄÍ¿\b\ru\u008f\u0011\u0007\u0005\u0003\u0086\u001e|\"gÕeix|'Éa\u001cËYP\\\u0096ÒUÑ\u001e_1³î\u0084\u0013\u0019¦@©\f\u0084\ng0Ù&ÓÔÓ$Zd\u0080\bBÓl\u0000¨íLF\u0092N\u000e=Ão\u0089\u0018¡j9Ý¸u½8æ\b\u0088ÕÁ\u0011\u001cÑy\u0087)*Ö¬\u001f\u0012";
                        length = "\ry\u00adr¯jB.à\n\u0092C\u0090Ï)ySª¡U\u0001\u0006¤äPA\u0089\u009dc\u000e*\u0013H71¬\u0013\u000b%\u001aT7\u0003\u001bí\u0019HÇïÞµ/]\u0011ÄÍ¿\b\ru\u008f\u0011\u0007\u0005\u0003\u0086\u001e|\"gÕeix|'Éa\u001cËYP\\\u0096ÒUÑ\u001e_1³î\u0084\u0013\u0019¦@©\f\u0084\ng0Ù&ÓÔÓ$Zd\u0080\bBÓl\u0000¨íLF\u0092N\u000e=Ão\u0089\u0018¡j9Ý¸u½8æ\b\u0088ÕÁ\u0011\u001cÑy\u0087)*Ö¬\u001f\u0012".length();
                        cCharAt = 128;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 26530;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/zw", e2);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.zw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.zw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zw.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16206;
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
                    throw new RuntimeException("su/catlean/zw", e2);
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.zw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.zw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zw.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zw.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
