package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.awt.Font;
import java.io.Closeable;
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
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/c6.class */
public final class c6 implements Closeable {

    @NotNull
    private Font h;

    @NotNull
    private Font t;
    private final float m;

    @NotNull
    private final Object2ObjectOpenHashMap M;

    @NotNull
    private final Object2ObjectOpenHashMap w;

    @NotNull
    private final ObjectArrayList D;

    @NotNull
    private final Char2ObjectArrayMap V;
    private int y;
    private float i;
    private static int[] I;
    private static final long a = yz.a(6736742733309809660L, -9218772071814161005L, MethodHandles.lookup().lookupClass()).a(1594835597882L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public c6(@NotNull Font font, @NotNull Font fallBack, long a2, float size) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(font, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27153, 3016822751050632091L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(fallBack, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19609, 5219290038900993304L ^ j) /* invoke-custom */);
        this.h = font;
        this.t = fallBack;
        this.m = size;
        this.M = new Object2ObjectOpenHashMap();
        this.w = new Object2ObjectOpenHashMap();
        this.D = new ObjectArrayList();
        this.V = new Char2ObjectArrayMap();
        F(j ^ 115346155808634L);
    }

    public final float J() {
        return this.i;
    }

    public final void b(float f2) {
        this.i = f2;
    }

    public final void F(long j) {
        long j2 = a ^ j;
        this.y = zf.F(j2 ^ 101048953319893L).method_22683().method_4495();
        Font fontDeriveFont = this.h.deriveFont(this.m * this.y);
        Intrinsics.checkNotNullExpressionValue(fontDeriveFont, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19199, 6397190035156566258L ^ j2) /* invoke-custom */);
        this.h = fontDeriveFont;
        Font fontDeriveFont2 = this.t.deriveFont(this.m * this.y);
        Intrinsics.checkNotNullExpressionValue(fontDeriveFont2, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20066, 2622515511379854441L ^ j2) /* invoke-custom */);
        this.t = fontDeriveFont2;
    }

    public final void e(@NotNull class_332 context, @NotNull String s, long a2, float x, float y, @NotNull Color color) throws Throwable {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15468, 6914308122302651183L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12395, 1153435409164015402L ^ j) /* invoke-custom */);
        Matrix3x2fStack matrix3x2fStackMethod_51448 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24506, 5674438031609690358L ^ j) /* invoke-custom */);
        v(this, matrix3x2fStackMethod_51448, s, (short) (j >>> 48), x, y, ((j ^ 34791294620017L) << 16) >>> 16, color, false, 0, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15317, 7062647088452828649L ^ j) /* invoke-custom */, null);
    }

    public final void s(@NotNull Matrix3x2fStack m, long a2, @NotNull String s, float x, float y, @NotNull Color color, boolean gradient, int offset) throws Throwable {
        long j = a ^ a2;
        long j2 = j ^ 21090385204602L;
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26189, 2825046110318547260L ^ j) /* invoke-custom */);
        y3 y3Var = y3.i;
        float f2 = this.y;
        Char2ObjectArrayMap char2ObjectArrayMap = this.V;
        ObjectArrayList objectArrayList = this.D;
        Font font = this.h;
        Font font2 = this.t;
        float f3 = this.i;
        this.i += 0.1f;
        Unit unit = Unit.INSTANCE;
        y3Var.c(m, s, x, y, color, gradient, offset, f2, j2, char2ObjectArrayMap, objectArrayList, font, font2, f3, this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static /* synthetic */ void W(c6 c6Var, Matrix3x2fStack matrix3x2fStack, String str, float f2, float f3, long j, Color color, boolean z, int i, int i2, Object obj) throws Throwable {
        long j2 = a ^ j;
        long j3 = j2 ^ 102354437818449L;
        ?? M = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3156336699797693130L, j2) /* invoke-custom */;
        try {
            M = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1254, 6222021185736808003L ^ j2) /* invoke-custom */;
            ?? M2 = M;
            if (M != 0) {
                if (M != 0) {
                    z = false;
                }
                M2 = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26958, 702633764895095791L ^ j2) /* invoke-custom */;
            }
            ?? r20 = i;
            ?? r0 = M2;
            if (M == 0) {
                r20 = r0;
            } else if (M2 != 0) {
                r0 = 0;
                r20 = r0;
            }
            c6Var.s(matrix3x2fStack, j3, str, f2, f3, color, z, r20 == true ? 1 : 0);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M, -3122764474237612486L, j2) /* invoke-custom */;
        }
    }

    public final void e(long a2, @NotNull Matrix3x2fStack m, @NotNull String s, float x, float y, @NotNull Color color, boolean gradient, int offset) throws Throwable {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26189, 2825027537706605287L ^ j) /* invoke-custom */);
        y3.i.e(m, s, (int) (j >>> 32), x, y, (int) (((j ^ 78317654340373L) << 32) >>> 40), color, gradient, offset, this.y, this.V, (byte) ((r1 << 56) >>> 56), this.D, this.h, this.t, this.M);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static /* synthetic */ void v(c6 c6Var, Matrix3x2fStack matrix3x2fStack, String str, short s, float f2, float f3, long j, Color color, boolean z, int i, int i2, Object obj) throws Throwable {
        long j2 = ((((long) s) << 48) | ((j << 16) >>> 16)) ^ a;
        long j3 = j2 ^ 60451435465361L;
        ?? M = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2510461605286144979L, j2) /* invoke-custom */;
        try {
            M = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10444, 3082181633719677809L ^ j2) /* invoke-custom */;
            ?? M2 = M;
            if (M != 0) {
                if (M != 0) {
                    z = false;
                }
                M2 = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17759, 212301408918167268L ^ j2) /* invoke-custom */;
            }
            ?? r21 = i;
            ?? r0 = M2;
            if (M == 0) {
                r21 = r0;
            } else if (M2 != 0) {
                r0 = 0;
                r21 = r0;
            }
            c6Var.e(j3, matrix3x2fStack, str, f2, f3, color, z, r21 == true ? 1 : 0);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M, -2471690837294741727L, j2) /* invoke-custom */;
        }
    }

    public final void U(@NotNull Matrix3x2fStack m, @NotNull String s, float x, float y, long a2, @NotNull Color color) throws Throwable {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26189, 2825142269264889973L ^ j) /* invoke-custom */);
        float fD = x - (D(j ^ 59900836795598L, s) / 2.0f);
        v(this, m, s, (short) (j >>> 48), fD, y - (y3.i.l(s, this.V, this.D, j >>> 8, this.h, (byte) (((j ^ 117605970826437L) << 56) >>> 56), this.t, this.y) / 2.0f), ((j ^ 103929427597315L) << 16) >>> 16, color, false, 0, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2825, 2335382811096286276L ^ j) /* invoke-custom */, null);
    }

    public final void I(@NotNull class_332 context, @NotNull String s, float x, float y, @NotNull Color color, long a2) throws Throwable {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15468, 6914309930825111445L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26189, 2825081226876849597L ^ j) /* invoke-custom */);
        Matrix3x2fStack matrix3x2fStackMethod_51448 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6021, 8754234424432753778L ^ j) /* invoke-custom */);
        float fD = x - (D(j ^ 116541169225990L, s) / 2.0f);
        v(this, matrix3x2fStackMethod_51448, s, (short) (j >>> 48), fD, y - (y3.i.l(s, this.V, this.D, j >>> 8, this.h, (byte) (((j ^ 58767449936141L) << 56) >>> 56), this.t, this.y) / 2.0f), ((j ^ 1105660091851L) << 16) >>> 16, color, false, 0, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2825, 2335307513761989004L ^ j) /* invoke-custom */, null);
    }

    public final void g(int i, char c2, short s) {
        y3.i.F(this.w, ((((((long) i) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 228582250798L);
        this.i = 0.0f;
    }

    public final float D(long a2, @NotNull String s) {
        long j = (((a ^ a2) ^ 132821835272198L) << 16) >>> 16;
        Intrinsics.checkNotNullParameter(s, "s");
        return y3.i.p(s, this.V, this.D, (char) (r0 >>> 48), this.h, j, this.t, this.y);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            Result.Companion companion = Result.Companion;
            c6 c6Var = this;
            ObjectArrayList objectArrayList = c6Var.D;
            Function1 function1 = c6::z;
            objectArrayList.removeIf((v1) -> {
                return B(r1, v1);
            });
            c6Var.V.clear();
            Result.m185constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void A(@NotNull class_332 context, @NotNull String s, long a2, float x, float y, int offset) throws Throwable {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15468, 6914329501615531019L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(s, "s");
        Matrix3x2fStack matrix3x2fStackMethod_51448 = context.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6021, 8754289454472630252L ^ j) /* invoke-custom */);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19004, 2508132227816313424L ^ j) /* invoke-custom */);
        e(j ^ 138142124648502L, matrix3x2fStackMethod_51448, s, x, y, color, true, offset);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0047: INVOKE 
          (r-1 I:su.catlean.c6)
          (r0 I:net.minecraft.class_332)
          (r1 I:java.lang.String)
          (r2 I:long)
          (r3 I:float)
          (r4 I:float)
          (r5 I:int)
         VIRTUAL call: su.catlean.c6.A(net.minecraft.class_332, java.lang.String, long, float, float, int):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void g(long r10, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r12, @org.jetbrains.annotations.NotNull java.lang.String r13, float r14, float r15, int r16) {
        /*
            r9 = this;
            long r0 = su.catlean.c6.a
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 405227637233(0x5e597309f1, double:2.00209054302E-312)
            long r1 = r1 ^ r2
            r17 = r1
            r1 = r0; r2 = r0; 
            r2 = 39548728223643(0x23f827e5a79b, double:1.9539667952014E-310)
            long r1 = r1 ^ r2
            r19 = r1
            r0 = r12
            r1 = 25291(0x62cb, float:3.544E-41)
            r2 = 196229219828596642(0x2b9256f8e6f7fa2, double:1.5380030970692458E-295)
            r3 = r10
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/c6;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "j"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r13
            java.lang.String r1 = "s"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r9
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r9
            r5 = r19
            r6 = r13
            float r4 = r4.D(r5, r6)
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 - r4
            r4 = r17
            r5 = r4; r4 = r3; r3 = r5; 
            r4 = r15
            r5 = r16
            r-1.A(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c6.g(long, net.minecraft.class_332, java.lang.String, float, float, int):void");
    }

    private static final boolean z(fj fjVar) {
        fjVar.q((a ^ 38967728241588L) ^ 50430882285468L);
        return true;
    }

    private static final boolean B(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static void M(int[] iArr) {
        I = iArr;
    }

    public static int[] t() {
        return I;
    }

    static {
        int i;
        long j = a ^ 7374643077087L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[3], -7869436503064945672L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i3 = 0;
        String str = "ºyÓ^\u008dËö¢o\u0087Í¶\u0095¾YÄ<\u0005µ_\u0095×©\u0081FÒe\u0088\fíþ\u00ad\u0010\u0092¬\u0086hÐh\u0014\u0097ý_E§ýv,Ê ß¢n¼\u0092|-;«%W\t÷\u008a2T(\u0093Ü°>ÛÈú\u001a\u0091éO\u0091£\u0007H\u0010êÆarI\u0094¨DaÑMÝ:ð\u0019\u009a A\\Ê\u008a\u0097X\u001e!ø&nàå6?VÓz$\u001eÔ\u0015\r.¬D\u00993îåvÇ\u0018rv´\u000ePÇá\u0081FÈÉ\u0001LÈ$\u0086Ñv}î\u0016Ù/\u001e\u00181ï»ª\u0099\u008bD¿T,C\u0083qñ\u0017ðx;»hqæøH\u0010_\u0010\u0099y\"¹³KÛ\\Búu\u009b½Z\u0010¦\u008cY¡¯©ÿÙ/\u0010T#\u0014Ú\u007fº";
        int length = "ºyÓ^\u008dËö¢o\u0087Í¶\u0095¾YÄ<\u0005µ_\u0095×©\u0081FÒe\u0088\fíþ\u00ad\u0010\u0092¬\u0086hÐh\u0014\u0097ý_E§ýv,Ê ß¢n¼\u0092|-;«%W\t÷\u008a2T(\u0093Ü°>ÛÈú\u001a\u0091éO\u0091£\u0007H\u0010êÆarI\u0094¨DaÑMÝ:ð\u0019\u009a A\\Ê\u008a\u0097X\u001e!ø&nàå6?VÓz$\u001eÔ\u0015\r.¬D\u00993îåvÇ\u0018rv´\u000ePÇá\u0081FÈÉ\u0001LÈ$\u0086Ñv}î\u0016Ù/\u001e\u00181ï»ª\u0099\u008bD¿T,C\u0083qñ\u0017ðx;»hqæøH\u0010_\u0010\u0099y\"¹³KÛ\\Búu\u009b½Z\u0010¦\u008cY¡¯©ÿÙ/\u0010T#\u0014Ú\u007fº".length();
        char cCharAt = ' ';
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
                            c = new String[11];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i9 = 0;
                            String str3 = "Z\u0016\u0018Ò\u0010\u0091¹'FgbÇ \u0000\u0089 K\u0010\u0004¸h\u0099ô\"L\böÌ¿\u008bª\u0085";
                            int length2 = "Z\u0016\u0018Ò\u0010\u0091¹'FgbÇ \u0000\u0089 K\u0010\u0004¸h\u0099ô\"L\böÌ¿\u008bª\u0085".length();
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
                                                f = new Integer[6];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "¿=â+\u0093ÅúË\\¤\u0099ù\u001a©Mo";
                                                length2 = "¿=â+\u0093ÅúË\\¤\u0099ù\u001a©Mo".length();
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
                        str = "6Ò/³\u008bÉ¹*ÈV\u008d`\u001b÷èZ\u0010S¨Ú½\u0083¾;.\u0096ïÌs©j\u0084-";
                        length = "6Ò/³\u008bÉ¹*ÈV\u008d`\u001b÷èZ\u0010S¨Ú½\u0083¾;.\u0096ïÌs©j\u0084-".length();
                        cCharAt = 16;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 9879;
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
                throw new RuntimeException("su/catlean/c6", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/c6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c6.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 18403;
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
                    throw new RuntimeException("su/catlean/c6", e2);
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
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 2
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
            java.lang.String r1 = "su/catlean/c6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.c6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
