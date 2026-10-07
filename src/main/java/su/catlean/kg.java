package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.reflect.KProperty;
import net.minecraft.class_241;
import net.minecraft.class_276;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kg.class */
public final class kg extends _g {

    @NotNull
    public static final kg W = null;
    static final KProperty[] h = null;

    @NotNull
    private static final cw S = null;

    @NotNull
    private static final cs z = null;

    @NotNull
    private static final cq J = null;

    @NotNull
    private static final ct o = null;

    @NotNull
    private static final cq x = null;

    @NotNull
    private static final ct I = null;

    @NotNull
    private static final ct d = null;

    @NotNull
    private static final ct E = null;

    @NotNull
    private static final ct a = null;

    @NotNull
    private static final cw N = null;

    @NotNull
    private static final cs P = null;

    @NotNull
    private static final c8 n = null;

    @NotNull
    private static final ct j = null;

    @NotNull
    private static final ct t = null;

    @NotNull
    private static final ct X = null;

    @NotNull
    private static final ct Y = null;

    @NotNull
    private static final ct f = null;

    @Nullable
    private static class_6364 w;

    @Nullable
    private static class_6364 y;

    @Nullable
    private static class_6364 B;
    private static boolean D;
    private static boolean k;

    @NotNull
    private static final float[] u = null;
    private static int A;
    private static int l;
    private static final long b = 0;
    private static final String[] c = null;
    private static final String[] e = null;
    private static final Map g = null;
    private static final long[] i = null;
    private static final Integer[] m = null;
    private static final Map C = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private kg(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19673, 6625198418052388124L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 129977037585852L);
    }

    private final rw h(char c2, short s, int i2) {
        return (rw) S.E(this, ((((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b) ^ 111268759367519L, h[0]);
    }

    private final void A(rw rwVar, int i2, int i3, int i4) {
        S.b(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ b) ^ 58079890695230L, h[0], rwVar);
    }

    private final Color e(long j2) {
        return (Color) z.E(this, (b ^ j2) ^ 62613074777367L, h[1]);
    }

    private final void N(byte b2, long j2, Color color) {
        z.b(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ b) ^ 92502818131068L, h[1], color);
    }

    private final boolean K(long j2) {
        return ((Boolean) J.E(this, (b ^ j2) ^ 33177928049829L, h[2])).booleanValue();
    }

    private final void F(int i2, int i3, boolean z2) {
        J.b(this, (((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ b) ^ 41442231926802L, h[2], Boolean.valueOf(z2));
    }

    private final float L(long j2) {
        return ((Number) o.E(this, (b ^ j2) ^ 80179311310495L, h[3])).floatValue();
    }

    private final void H(int i2, float f2, char c2, short s) {
        o.b(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ b) ^ 89621461011964L, h[3], Float.valueOf(f2));
    }

    private final boolean v(long j2) {
        return ((Boolean) x.E(this, (b ^ j2) ^ 9133284700375L, h[4])).booleanValue();
    }

    private final void w(int i2, int i3, boolean z2, byte b2) {
        x.b(this, ((((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ b) ^ 48915219019291L, h[4], Boolean.valueOf(z2));
    }

    private final float i(long j2) {
        return ((Number) I.E(this, (b ^ j2) ^ 17075534234793L, h[5])).floatValue();
    }

    private final void X(float f2, long j2) {
        I.b(this, (b ^ j2) ^ 64957859018883L, h[5], Float.valueOf(f2));
    }

    private final float j(long j2) {
        long j3 = b ^ j2;
        return ((Number) d.E(this, j3 ^ 60838987513004L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5451, 8244733780599759721L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void r(long j2, float f2) {
        long j3 = b ^ j2;
        d.b(this, j3 ^ 42569576676861L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5451, 8244694153846666708L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float D(long j2) {
        long j3 = b ^ j2;
        return ((Number) E.E(this, j3 ^ 23279350523191L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9004, 7691128080366390406L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void Q(long j2, float f2) {
        long j3 = b ^ j2;
        E.b(this, j3 ^ 97376004047737L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9004, 7691049156592729380L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float R(long j2) {
        long j3 = b ^ j2;
        return ((Number) a.E(this, j3 ^ 125090089706117L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29922, 7302976103686151395L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void e(int i2, char c2, float f2, char c3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ b;
        a.b(this, j2 ^ 19723975262378L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29922, 7302929648029968672L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final sa t(byte b2, int i2, int i3) {
        long j2 = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ b;
        return (sa) N.E(this, j2 ^ 132789897563440L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32352, 7219264193875425742L ^ j2) /* invoke-custom */]);
    }

    private final void B(sa saVar, long j2) {
        long j3 = b ^ j2;
        N.b(this, j3 ^ 94629348845769L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12045, 2929413059809106610L ^ j3) /* invoke-custom */], saVar);
    }

    private final Color I(long j2) {
        long j3 = b ^ j2;
        return (Color) P.E(this, j3 ^ 70772464060847L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(ShortCompanionObject.MAX_VALUE, 8269408252086500551L ^ j3) /* invoke-custom */]);
    }

    private final void z(long j2, Color color) {
        long j3 = b ^ j2;
        P.b(this, j3 ^ 13223983002183L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(ShortCompanionObject.MAX_VALUE, 8269364633314136259L ^ j3) /* invoke-custom */], color);
    }

    private final int l(int i2, int i3, int i4) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ b;
        return ((Number) n.E(this, j2 ^ 118315530600831L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20365, 7545012469649228927L ^ j2) /* invoke-custom */])).intValue();
    }

    private final void n(int i2, long j2) {
        long j3 = b ^ j2;
        n.b(this, j3 ^ 66818521803215L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14926, 3913871499464789743L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    private final float T(long j2) {
        long j3 = b ^ j2;
        return ((Number) j.E(this, j3 ^ 35269679429516L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20589, 1480803074461216114L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void x(float f2, short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ b;
        j.b(this, j2 ^ 81836882583030L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7851, 9051401301616369193L ^ j2) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float a(long j2) {
        long j3 = b ^ j2;
        return ((Number) t.E(this, j3 ^ 60829729128212L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30019, 3103487727926853832L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void p(float f2, long j2) {
        long j3 = b ^ j2;
        t.b(this, j3 ^ 20475023732965L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24975, 2394987992215424016L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float Q(long j2) {
        long j3 = b ^ j2;
        return ((Number) X.E(this, j3 ^ 59561034328353L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19398, 3819920914026014839L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void T(long j2, float f2) {
        long j3 = b ^ j2;
        X.b(this, j3 ^ 135740803497935L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19398, 3820017301055777141L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float w(long j2) {
        long j3 = b ^ j2;
        return ((Number) Y.E(this, j3 ^ 33440474764259L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6921, 4480594853306712682L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final void o(long j2, float f2) {
        long j3 = b ^ j2;
        Y.b(this, j3 ^ 62176661819267L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6921, 4480613607323372006L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    private final float g(int i2, int i3) {
        long j2 = ((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ b;
        return ((Number) f.E(this, j2 ^ 17452210877283L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18742, 6125453313648226524L ^ j2) /* invoke-custom */])).floatValue();
    }

    private final void z(long j2, float f2) {
        long j3 = b ^ j2;
        f.b(this, j3 ^ 2280416411589L, h[(int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18742, 6125391840855747478L ^ j3) /* invoke-custom */], Float.valueOf(f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Flow
    private final void p(FrameBufferEvent frameBufferEvent) {
        long j2 = b ^ 65785488324693L;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4238789324831716048L, j2) /* invoke-custom */;
        try {
            obj = obj;
            if (obj == 0) {
                try {
                    obj = k;
                    if (obj == 0) {
                        return;
                    } else {
                        frameBufferEvent.setFrameBuffer((class_276) w);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4242137772937542722L, j2) /* invoke-custom */;
                }
            }
            frameBufferEvent.cancel();
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4242137772937542722L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.api.event.events.render.RenderHandEvent] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @su.catlean.gofra.Flow(priority = -10)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Z(su.catlean.api.event.events.render.RenderHandEvent r7) {
        /*
            r6 = this;
            long r0 = su.catlean.kg.b
            r1 = 37706273517211(0x224b2d09ee9b, double:1.86293743775475E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -7790433444033438722(0x93e2d20ee2105bfe, double:-6.988197090223028E-213)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r10 = r0
            boolean r0 = su.catlean.kg.k     // Catch: java.lang.NumberFormatException -> L21
            r1 = r10
            if (r1 != 0) goto L2e
            if (r0 != 0) goto L31
            goto L2b
        L21:
            r1 = -7787005556741712528(0x93eeffb4166ad570, double:-1.1510085246161808E-212)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L2b:
            boolean r0 = su.catlean.kg.D
        L2e:
            if (r0 == 0) goto L42
        L31:
            r0 = r7
            r0.cancel()     // Catch: java.lang.NumberFormatException -> L38
            goto L42
        L38:
            r1 = -7787005556741712528(0x93eeffb4166ad570, double:-1.1510085246161808E-212)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.Z(su.catlean.api.event.events.render.RenderHandEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01c6: INVOKE 
          (r-1 I:su.catlean.kg)
          (r0 I:su.catlean.rw)
          (r1 I:java.awt.Color)
          (r2 I:net.minecraft.class_6364)
          (r3 I:net.minecraft.class_6364)
          (r4 I:boolean)
          (r5 I:boolean)
          (r6 I:float)
          (r7 I:float)
          (r8 I:float)
          (r9 I:float)
          (r10 I:int)
          (r11 I:java.awt.Color)
          (r12 I:java.awt.Color)
          (r13 I:int)
          (r14 I:long)
          (r15 I:float)
          (r16 I:float)
          (r17 I:float)
          (r18 I:float)
          (r19 I:float)
          (r20 I:float)
         VIRTUAL call: su.catlean.kg.d(su.catlean.rw, java.awt.Color, net.minecraft.class_6364, net.minecraft.class_6364, boolean, boolean, float, float, float, float, int, java.awt.Color, java.awt.Color, int, long, float, float, float, float, float, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void j(su.catlean.api.event.events.render.Render2DEvent r27) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.j(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    @Flow(priority = -10)
    public final void g(@NotNull Render3DEvent event) {
        long j2 = b ^ 90349734434078L;
        long j3 = j2 ^ 125918067047549L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) (((j2 ^ 9869780306906L) << 32) >>> 32);
        Intrinsics.checkNotNullParameter(event, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9668, 2144151631924902123L ^ j2) /* invoke-custom */);
        GofraState.INSTANCE.setModifyBuffer(true);
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1700211758682464133L, j2) /* invoke-custom */;
        k = true;
        n((short) i2, (short) i3, i4);
        X((short) i5, event.getStack(), (short) ((r1 << 16) >>> 48), i6);
        k = false;
        GofraState.INSTANCE.setModifyBuffer(false);
        try {
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1666098310708988303L, j2) /* invoke-custom */ != null) {
                obj++;
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1699030346204159735L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1699106297654235403L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0200 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(@org.jetbrains.annotations.Nullable su.catlean.rw r15, @org.jetbrains.annotations.NotNull java.awt.Color r16, @org.jetbrains.annotations.NotNull net.minecraft.class_6364 r17, @org.jetbrains.annotations.NotNull net.minecraft.class_6364 r18, boolean r19, boolean r20, float r21, float r22, float r23, float r24, int r25, @org.jetbrains.annotations.NotNull java.awt.Color r26, @org.jetbrains.annotations.NotNull java.awt.Color r27, int r28, long r29, float r31, float r32, float r33, float r34, float r35, float r36) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.d(su.catlean.rw, java.awt.Color, net.minecraft.class_6364, net.minecraft.class_6364, boolean, boolean, float, float, float, float, int, java.awt.Color, java.awt.Color, int, long, float, float, float, float, float, float):void");
    }

    private final void l(Color color, class_6364 class_6364Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[EDGE_INSN: B:38:0x00b4->B:28:0x00b4 BREAK  A[LOOP:0: B:14:0x007c->B:41:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [float[]] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v7, types: [float] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [int] */
    /* JADX WARN: Type inference failed for: r48v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B(long r24, java.awt.Color r26, net.minecraft.class_6364 r27, net.minecraft.class_6364 r28, float r29, float r30, float r31, float r32) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.B(long, java.awt.Color, net.minecraft.class_6364, net.minecraft.class_6364, float, float, float, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[PHI: r0 r1
  0x00cc: PHI (r0v20 ??) = (r0v101 ??), (r0v102 ??), (r0v103 ??) binds: [B:14:0x0090, B:16:0x0095, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r1v21 int) = (r1v20 int), (r1v20 int), (r1v72 int) binds: [B:14:0x0090, B:16:0x0095, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db A[PHI: r0 r1
  0x01db: PHI (r0v35 ??) = (r0v98 ??), (r0v99 ??), (r0v100 ??) binds: [B:42:0x019f, B:44:0x01a4, B:49:0x01b8] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r1v32 int) = (r1v31 int), (r1v31 int), (r1v62 int) binds: [B:42:0x019f, B:44:0x01a4, B:49:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce A[PHI: r0 r1
  0x02ce: PHI (r0v49 ??) = (r0v95 ??), (r0v96 ??), (r0v97 ??) binds: [B:69:0x0292, B:71:0x0297, B:76:0x02ab] A[DONT_GENERATE, DONT_INLINE]
  0x02ce: PHI (r1v42 int) = (r1v41 int), (r1v41 int), (r1v52 int) binds: [B:69:0x0292, B:71:0x0297, B:76:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(short r9, short r10, int r11) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.n(short, short, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    private final void X(short s, class_4587 class_4587Var, short s2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b;
        long j3 = j2 ^ 78083986326413L;
        long j4 = j2 ^ 116384926695728L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j4 << 16) >>> 48);
        int i5 = (int) ((j4 << 32) >>> 32);
        long j5 = j2 ^ 90638057642974L;
        int i6 = (int) (j2 >>> 32);
        int i7 = (int) ((j5 << 32) >>> 48);
        int i8 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 121575094087593L;
        Object objH = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6850745165111006990L, j2) /* invoke-custom */;
        RenderSystem.backupProjectionMatrix();
        try {
            boolean z2 = false;
            objH = 0;
            objH = 0;
            if (objH == 0) {
                try {
                    D = false;
                    class_4184 class_4184VarMethod_19418 = zf.F(j3).field_1773.method_19418();
                    Intrinsics.checkNotNullExpressionValue(class_4184VarMethod_19418, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16687, 7731791509383244559L ^ j2) /* invoke-custom */);
                    float fN = zi.v.n(i6, (char) i7, i8);
                    Matrix4f matrix4fMethod_23761 = class_4587Var.method_23760().method_23761();
                    Intrinsics.checkNotNullExpressionValue(matrix4fMethod_23761, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1924, 6988715324031413752L ^ j2) /* invoke-custom */);
                    v(class_4184VarMethod_19418, fN, matrix4fMethod_23761, j6);
                    objH = h((char) i3, (short) i4, i5);
                    z2 = objH == rw.MIRROR;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 6854076025732602240L, j2) /* invoke-custom */;
                }
            }
            D = z2;
            RenderSystem.restoreProjectionMatrix();
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 6854076025732602240L, j2) /* invoke-custom */;
        }
    }

    private final void o(int i2, long j2, Color color, Color color2, int i3, float f2, float f3, float f4, float f5, float f6, class_6364 class_6364Var) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 83521419773234L;
        long j5 = j3 ^ 72265296186924L;
        long j6 = j3 ^ 28972300587303L;
        long j7 = j3 ^ 22821087532552L;
        long j8 = j3 ^ 118007736601364L;
        g7 g7VarU = new g7(j3 ^ 25514285357633L, null, 0, false, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11263, 2173619882322294044L ^ j3) /* invoke-custom */, null).u(j3 ^ 127709916351860L);
        RenderPipeline renderPipelineN = b6.R.n();
        class_276 class_276VarMethod_1522 = zf.F(j4).method_1522();
        Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7752, 3434366199017812667L ^ j3) /* invoke-custom */);
        GpuBufferSlice gpuBufferSliceMethod_71102 = xc.I.V().method_71102(new i6(Math.abs(jl.y.B((zf.v(j8).field_6012 - 1) / 6.0f, zf.v(j8).field_6012 / 6.0f, jl.y.K(j6))), color, color2, i2, i3, f2, f3, 1, f4, new class_241(1.0f / class_6364Var.field_1482, 1.0f / class_6364Var.field_1481), f5, j7, f6));
        String strY = (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9435, 7670968165434427431L ^ j3) /* invoke-custom */;
        GpuTextureView gpuTextureViewMethod_71639 = class_6364Var.method_71639();
        Intrinsics.checkNotNull(gpuTextureViewMethod_71639);
        g7.R(j5, g7VarU, renderPipelineN, class_276VarMethod_1522, gpuBufferSliceMethod_71102, null, null, MapsKt.mapOf(TuplesKt.to(strY, gpuTextureViewMethod_71639)), (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8673, 505809945037045533L ^ j3) /* invoke-custom */, null);
    }

    private final void j(Color color, float f2, class_6364 class_6364Var, long j2) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 25079136443605L;
        long j5 = j3 ^ 31340288628683L;
        long j6 = j3 ^ 2866338507164L;
        g7 g7VarU = new g7(j3 ^ 81423593636774L, null, 0, false, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9004, 7691091323526816809L ^ j3) /* invoke-custom */, null).u(j3 ^ 45215833953427L);
        RenderPipeline renderPipelineP = b6.R.p();
        class_276 class_276VarMethod_1522 = zf.F(j4).method_1522();
        Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12682, 7824135816318043383L ^ j3) /* invoke-custom */);
        GpuBufferSlice gpuBufferSliceMethod_71102 = cf.O.P().method_71102(new z0(1.0f / class_6364Var.field_1482, 1.0f / class_6364Var.field_1481, j6, color, f2));
        String strY = (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31970, 8171887479097952731L ^ j3) /* invoke-custom */;
        GpuTextureView gpuTextureViewMethod_71639 = class_6364Var.method_71639();
        Intrinsics.checkNotNull(gpuTextureViewMethod_71639);
        g7.R(j5, g7VarU, renderPipelineP, class_276VarMethod_1522, gpuBufferSliceMethod_71102, null, null, MapsKt.mapOf(TuplesKt.to(strY, gpuTextureViewMethod_71639)), (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15801, 3069756268906920634L ^ j3) /* invoke-custom */, null);
    }

    private final void F(Color color, long j2, Color color2, Color color3, Color color4, float f2, class_6364 class_6364Var) {
        long j3 = b ^ j2;
        long j4 = j3 ^ 53113642273742L;
        int i2 = (int) (j3 >>> 56);
        long j5 = ((j3 ^ 119497767166676L) << 8) >>> 8;
        long j6 = j3 ^ 63778922578128L;
        long j7 = j3 ^ 107621158100955L;
        long j8 = j3 ^ 18605570901480L;
        g7 g7VarU = new g7(j3 ^ 119351279817917L, null, 0, false, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9004, 7691048987115434802L ^ j3) /* invoke-custom */, null).u(j3 ^ 17175229989768L);
        RenderPipeline renderPipelineG = b6.R.G();
        class_276 class_276VarMethod_1522 = zf.F(j4).method_1522();
        Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12682, 7824103386207179756L ^ j3) /* invoke-custom */);
        GpuBufferSlice gpuBufferSliceMethod_71102 = ol.f.g().method_71102(new lc((byte) i2, 1.0f / class_6364Var.field_1482, 1.0f / class_6364Var.field_1481, color, color2, color3, j5, color4, f2, Math.abs(jl.y.B((zf.v(j8).field_6012 - 1) / 1000.0f, zf.v(j8).field_6012 / 1000.0f, jl.y.K(j7)))));
        String strY = (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31970, 8171859438510776000L ^ j3) /* invoke-custom */;
        GpuTextureView gpuTextureViewMethod_71639 = class_6364Var.method_71639();
        Intrinsics.checkNotNull(gpuTextureViewMethod_71639);
        g7.R(j6, g7VarU, renderPipelineG, class_276VarMethod_1522, gpuBufferSliceMethod_71102, null, null, MapsKt.mapOf(TuplesKt.to(strY, gpuTextureViewMethod_71639)), (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15801, 3069715031965478305L ^ j3) /* invoke-custom */, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.g7] */
    private final void b(class_6364 class_6364Var, Color color, boolean z2, boolean z3, float f2, long j2) {
        long j3 = b ^ j2;
        Object objU = j3;
        long j4 = objU ^ 21762986141472L;
        long j5 = objU ^ 28058430958654L;
        long j6 = objU ^ 32749837289029L;
        try {
            objU = new g7(objU ^ 86903536367699L, null, 0, false, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9004, 7691088008449990620L ^ j3) /* invoke-custom */, null).u(objU ^ 48496752373606L);
            RenderPipeline renderPipelineN = b6.R.N();
            class_276 class_276VarMethod_1522 = zf.F(j4).method_1522();
            Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12682, 7824141330418138882L ^ j3) /* invoke-custom */);
            GpuBufferSlice gpuBufferSliceMethod_71102 = j5.r.W().method_71102(new c1(new class_241(0.0f, z3 ? 0.0f : 0.5f), new class_241(1.0f / class_6364Var.field_1482, 1.0f / class_6364Var.field_1481), j6, color, z2 ? 1.0f : 0.0f, f2, f2));
            String strY = (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31970, 8171892959039631918L ^ j3) /* invoke-custom */;
            GpuTextureView gpuTextureViewMethod_71639 = class_6364Var.method_71639();
            Intrinsics.checkNotNull(gpuTextureViewMethod_71639);
            g7.R(j5, objU, renderPipelineN, class_276VarMethod_1522, gpuBufferSliceMethod_71102, null, null, MapsKt.mapOf(TuplesKt.to(strY, gpuTextureViewMethod_71639), TuplesKt.to((String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13189, 3267871285696068958L ^ j3) /* invoke-custom */, dv.D.R())), (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15801, 3069750753665188175L ^ j3) /* invoke-custom */, null);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objU, 4301998792952675629L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x0255
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void v(net.minecraft.class_4184 r13, float r14, org.joml.Matrix4f r15, long r16) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.v(net.minecraft.class_4184, float, org.joml.Matrix4f, long):void");
    }

    private final float W(int i2) {
        return (float) (0.06649038007d * Math.exp(((double) (-(i2 * i2))) / 72.0d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean M() {
        long j2 = b ^ 100039296136409L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 139699426432898L) << 32) >>> 32));
            return objH == rw.MIRROR;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, -3914605528904986830L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean r() {
        long j2 = b ^ 18275551939684L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 58743942131519L) << 32) >>> 32));
            return objH == rw.MIRROR;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 8147519013638584207L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean x() {
        long j2 = b ^ 17754820589399L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 59200315298828L) << 32) >>> 32));
            return objH == rw.MIRROR;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 5342058448070970556L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean V() {
        long j2 = b ^ 136222705666488L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 103451434347235L) << 32) >>> 32));
            return objH == rw.BLOOM;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 3804879899028124243L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean P() {
        long j2 = b ^ 6219216730265L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 35573036325826L) << 32) >>> 32));
            return objH == rw.BLOOM;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 5038639952323609458L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean q() {
        long j2 = b ^ 52013966246890L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 11802737828017L) << 32) >>> 32));
            return objH == rw.BLOOM;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 4512592194923165697L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[PHI: r0 r1
  0x00a5: PHI (r0v13 ??) = (r0v11 ??), (r0v16 ??) binds: [B:13:0x0076, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r1v12 su.catlean.rw) = (r1v10 su.catlean.rw), (r1v15 su.catlean.rw) binds: [B:13:0x0076, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean Z() {
        /*
            long r0 = su.catlean.kg.b
            r1 = 20869906108624(0x12fb275710d0, double:1.03111036402035E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 60513393488779(0x37095f52b38b, double:2.9897588836079E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r0 = 7902096330767377845(0x6da9e2bee84ea5b5, double:1.827541254747911E220)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.kg r0 = su.catlean.kg.W     // Catch: java.lang.NumberFormatException -> L4e
            r1 = r10
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L4e
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L4e
            r3 = r12
            su.catlean.rw r0 = r0.h(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L4e
            su.catlean.rw r1 = su.catlean.rw.DEFAULT     // Catch: java.lang.NumberFormatException -> L4e
            r2 = r13
            if (r2 != 0) goto L74
            if (r0 == r1) goto La8
            goto L58
        L4e:
            r1 = 7900948737851403067(0x6da5cf041c342b3b, double:1.5396987570328424E220)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6a
            throw r0     // Catch: java.lang.NumberFormatException -> L6a
        L58:
            su.catlean.kg r0 = su.catlean.kg.W     // Catch: java.lang.NumberFormatException -> L6a
            r1 = r10
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L6a
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L6a
            r3 = r12
            su.catlean.rw r0 = r0.h(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L6a
            su.catlean.rw r1 = su.catlean.rw.BLOOM     // Catch: java.lang.NumberFormatException -> L6a
            goto L74
        L6a:
            r1 = 7900948737851403067(0x6da5cf041c342b3b, double:1.5396987570328424E220)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L74:
            r2 = r13
            if (r2 != 0) goto La5
            if (r0 == r1) goto La8
            goto L89
        L7f:
            r1 = 7900948737851403067(0x6da5cf041c342b3b, double:1.5396987570328424E220)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L9b
            throw r0     // Catch: java.lang.NumberFormatException -> L9b
        L89:
            su.catlean.kg r0 = su.catlean.kg.W     // Catch: java.lang.NumberFormatException -> L9b
            r1 = r10
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L9b
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L9b
            r3 = r12
            su.catlean.rw r0 = r0.h(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L9b
            su.catlean.rw r1 = su.catlean.rw.CAMOUFLAGE     // Catch: java.lang.NumberFormatException -> L9b
            goto La5
        L9b:
            r1 = 7900948737851403067(0x6da5cf041c342b3b, double:1.5396987570328424E220)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La5:
            if (r0 != r1) goto Lb6
        La8:
            r0 = 1
            goto Lb7
        Lac:
            r1 = 7900948737851403067(0x6da5cf041c342b3b, double:1.5396987570328424E220)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb6:
            r0 = 0
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.Z():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean F() {
        long j2 = b ^ 100448337755869L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 139264507043206L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 263608618343875894L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.rw] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean z() {
        /*
            long r0 = su.catlean.kg.b
            r1 = 70434748025078(0x400f5e22c8f6, double:3.47993892726756E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 112137941248941(0x65fd26276bad, double:5.5403504366466E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r10 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r11 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r0 = -5363874796864307821(0xb58fb04a913b7d93, double:-1.0587034105152082E-50)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean.kg r0 = su.catlean.kg.W     // Catch: java.lang.NumberFormatException -> L4e
            r1 = r10
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L4e
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L4e
            r3 = r12
            su.catlean.rw r0 = r0.h(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L4e
            su.catlean.rw r1 = su.catlean.rw.DOUBLE     // Catch: java.lang.NumberFormatException -> L4e
            r2 = r13
            if (r2 != 0) goto L74
            if (r0 == r1) goto L77
            goto L58
        L4e:
            r1 = -5367272675078966499(0xb5839df06541f31d, double:-6.553936257760478E-51)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6a
            throw r0     // Catch: java.lang.NumberFormatException -> L6a
        L58:
            su.catlean.kg r0 = su.catlean.kg.W     // Catch: java.lang.NumberFormatException -> L6a
            r1 = r10
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L6a
            r2 = r11
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L6a
            r3 = r12
            su.catlean.rw r0 = r0.h(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L6a
            su.catlean.rw r1 = su.catlean.rw.CAMOUFLAGE     // Catch: java.lang.NumberFormatException -> L6a
            goto L74
        L6a:
            r1 = -5367272675078966499(0xb5839df06541f31d, double:-6.553936257760478E-51)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L74:
            if (r0 != r1) goto L85
        L77:
            r0 = 1
            goto L86
        L7b:
            r1 = -5367272675078966499(0xb5839df06541f31d, double:-6.553936257760478E-51)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            r0 = 0
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.z():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean W() {
        long j2 = b ^ 65693818704659L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 33320100425800L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 3343612938938837240L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean s() {
        long j2 = b ^ 94154309963359L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 123490950098180L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 8298595197358454196L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean Y() {
        long j2 = b ^ 77623738000653L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 109312677627478L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 1763330116843691750L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean p() {
        long j2 = b ^ 121499010168569L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 82956376004002L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 832237391517601042L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean G() {
        long j2 = b ^ 79641969145963L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 120522943896368L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, -4242789352488008832L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rw] */
    private static final boolean C() {
        long j2 = b ^ 67138334714220L;
        Object objH = j2;
        try {
            objH = W.h((char) (objH >>> 48), (short) ((r1 << 16) >>> 48), (int) (((objH ^ 27477666875959L) << 32) >>> 32));
            return objH == rw.DOUBLE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 1448436080464646791L, j2) /* invoke-custom */;
        }
    }

    public static void b(int i2) {
        l = i2;
    }

    public static int E() {
        return l;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int A() {
        return E() == 0 ? 4 : 0;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 29857;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kg", e2);
            }
        }
        return e[i3];
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
            java.lang.String r0 = "su/catlean/kg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 1692;
        if (m[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) C.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    C.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kg", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            m[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return m[i3].intValue();
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
            java.lang.String r0 = "su/catlean/kg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kg.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
