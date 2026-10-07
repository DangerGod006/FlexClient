package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1735;
import net.minecraft.class_1739;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2589;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q0.class */
public final class q0 extends _g {

    @NotNull
    public static final q0 d;
    static final KProperty[] Y;

    @NotNull
    private static final cw i;

    @NotNull
    private static final c8 X;

    @NotNull
    private static final cq t;

    @NotNull
    private static final cw x;

    @NotNull
    private static final cq F;

    @NotNull
    private static final bg P;

    @NotNull
    private static final Map h;

    @Nullable
    private static class_2338 o;
    private static final long a = yz.a(7132504836130794636L, 4528798078840085108L, MethodHandles.lookup().lookupClass()).a(126132845364236L);
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private q0(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19326, 8319570533379729559L ^ j3) /* invoke-custom */, jt.d(), null, 4, null, j3 ^ 84549102583903L);
    }

    private final m0 v(short s, int i2, short s2) {
        return (m0) i.E(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ a) ^ 122678970083158L, Y[0]);
    }

    private final int I(short s, short s2, int i2) {
        return ((Number) X.E(this, ((((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 8541005492523L, Y[1])).intValue();
    }

    private final boolean h(long j2) {
        return ((Boolean) t.E(this, (a ^ j2) ^ 84683596160606L, Y[2])).booleanValue();
    }

    private final mz W(long j2) {
        return (mz) x.E(this, (a ^ j2) ^ 97572539562010L, Y[3]);
    }

    private final boolean t(long j2) {
        return ((Boolean) F.E(this, (a ^ j2) ^ 120004874299518L, Y[4])).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0be6: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void l(su.catlean.api.event.events.player.PlayerUpdateEvent r14) {
        /*
            Method dump skipped, instruction units count: 3055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.l(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (r0 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6037263439941488497L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        if (r0 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6037263439941488497L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        su.catlean.ag.e(r25, r1, 0, net.minecraft.class_1713.field_7794, false, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/q0;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "j"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(23632, 1791348567955711376L ^ r0), null);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        if (r0 < 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6037263439941488497L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        r0 = W(r1);
        r1 = su.catlean.mz.THROW;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6037263439941488497L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r0 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        r0 = r25;
        su.catlean.ag.e(r0, r1, 0, net.minecraft.class_1713.field_7795, false, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/q0;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "j"}
            {METHOD_TYPE: (I, J)I}
        ).invoke(26404, 7686615183455297263L ^ r0), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -6037263439941488497L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
    
        r25 = r25 + 1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r0 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r0 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004e, code lost:
    
        if (r0 < 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        r0 = su.catlean.q0.P.c(I((short) r2, (short) r2, r2), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0068, code lost:
    
        if (r0 <= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006b, code lost:
    
        if (r0 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        r0 = W(r1);
        r1 = su.catlean.mz.TAKE;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0079, code lost:
    
        if (r0 <= 0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:41:0x0051, B:37:0x011d], limit reached: 53 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.mz] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011a -> B:37:0x011d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(long r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.z(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -7743595924912764879L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -7743595924912764879L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r0 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r0 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r0 < 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(((net.minecraft.class_1735) su.catlean.zf.v(r1).field_7512.field_7761.get(r13)).method_7677().method_7909(), net.minecraft.class_1802.field_8436);
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r0 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r1 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r1 == 0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x0022, B:21:0x0077], limit reached: 33 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:21:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean F(long r8) {
        /*
            r7 = this;
            long r0 = su.catlean.q0.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 22096137111087(0x1418a867462f, double:1.0916942252386E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r0 = -7754699358468372475(0x9461c605068b0805, double:-1.6894538959261607E-210)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = 0
            r13 = r1
            r12 = r0
        L1c:
            r0 = r13
            r1 = 3
            if (r0 >= r1) goto L77
        L22:
            r0 = r10
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L53
            net.minecraft.class_1703 r0 = r0.field_7512     // Catch: java.lang.NumberFormatException -> L53
            net.minecraft.class_2371 r0 = r0.field_7761     // Catch: java.lang.NumberFormatException -> L53
            r1 = r13
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L53
            net.minecraft.class_1735 r0 = (net.minecraft.class_1735) r0     // Catch: java.lang.NumberFormatException -> L53
            net.minecraft.class_1799 r0 = r0.method_7677()     // Catch: java.lang.NumberFormatException -> L53
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: java.lang.NumberFormatException -> L53
            net.minecraft.class_1792 r1 = net.minecraft.class_1802.field_8436     // Catch: java.lang.NumberFormatException -> L53
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L53
            r1 = r12
            r2 = r8
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L4d
            if (r1 == 0) goto L7e
            r1 = r12
        L4d:
            if (r1 == 0) goto L6e
            goto L5d
        L53:
            r1 = -7743595924912764879(0x948938889b698831, double:-9.589423136835502E-210)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L63
            throw r0     // Catch: java.lang.NumberFormatException -> L63
        L5d:
            if (r0 != 0) goto L6f
            goto L6d
        L63:
            r1 = -7743595924912764879(0x948938889b698831, double:-9.589423136835502E-210)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6d:
            r0 = 0
        L6e:
            return r0
        L6f:
            int r13 = r13 + 1
            r0 = r12
            if (r0 != 0) goto L1c
        L77:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L22
            r0 = 1
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.F(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[EXC_TOP_SPLITTER, PHI: r0
  0x0078: PHI (r0v18 ??) = (r0v42 ??), (r0v43 ??), (r0v41 ??) binds: [B:7:0x005e, B:9:0x0063, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.minecraft.class_1844] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean e(net.minecraft.class_1842 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.e(net.minecraft.class_1842, long):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_1844 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(net.minecraft.class_1842 r9, long r10) throws net.minecraft.class_1844 {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.c(net.minecraft.class_1842, long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final void y(int i2, int i3, class_1792 class_1792Var, int i4, byte b2) {
        long j2 = (((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a;
        long j3 = j2 ^ 111305092029615L;
        long j4 = j2 ^ 59326890459090L;
        long j5 = j2 ^ 26028685171120L;
        long j6 = j2 ^ 51035309087067L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j6 << 16) >>> 48);
        int i7 = (int) ((j6 << 32) >>> 32);
        ?? C = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3616026159171546698L, j2) /* invoke-custom */;
        try {
            try {
                C = P.c(I((short) i5, (short) i6, i7), j5);
                ?? Y2 = C;
                if (C != 0) {
                    if (C == 0) {
                        return;
                    } else {
                        Y2 = Y(class_1792Var, j3);
                    }
                }
                ?? r35 = Y2;
                try {
                    int i8 = r35 == true ? 1 : 0;
                    int i9 = -1;
                    if (C != 0) {
                        if (i8 == -1) {
                            return;
                        }
                        ag.e(r35 == true ? 1 : 0, j4, 0, null, false, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8373, 7577624180045498242L ^ j2) /* invoke-custom */, null);
                        ag.e(i4, j4, 1, null, false, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31510, 2883819677745847330L ^ j2) /* invoke-custom */, null);
                        i8 = r35 == true ? 1 : 0;
                        i9 = 0;
                    }
                    ag.e(i8, j4, i9, null, false, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8373, 7577624180045498242L ^ j2) /* invoke-custom */, null);
                    P.l();
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y2, 3658693315258363518L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, 3658693315258363518L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, 3658693315258363518L, j2) /* invoke-custom */;
        }
    }

    private final boolean Q(long j2) {
        return ((class_1735) zf.v((a ^ j2) ^ 114498365383195L).field_7512.field_7761.get(4)).method_7677().method_7909() instanceof class_1739;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 4112382058975471018L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, 4112382058975471018L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r0 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r0 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r0 < r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(((net.minecraft.class_1735) su.catlean.zf.v(r1).field_7512.field_7761.get(r14)).method_7677().method_7909(), r8);
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0051, code lost:
    
        if (r0 <= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (r1 != 0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x002f, B:21:0x0084], limit reached: 34 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:21:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int Y(net.minecraft.class_1792 r8, long r9) {
        /*
            r7 = this;
            long r0 = su.catlean.q0.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 54020200917940(0x31218ee2ebb4, double:2.6689525454996E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 4168806199532820037(0x39da9326b4999645, double:5.2409570396991944E-30)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = 5
            r14 = r1
            r13 = r0
        L1d:
            r0 = r14
            r1 = 29118(0x71be, float:4.0803E-41)
            r2 = 722860596243438936(0xa081de1e5379d58, double:2.450824127048726E-260)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/q0;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "j"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            if (r0 >= r1) goto L84
        L2f:
            r0 = r11
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L5f
            net.minecraft.class_1703 r0 = r0.field_7512     // Catch: java.lang.NumberFormatException -> L5f
            net.minecraft.class_2371 r0 = r0.field_7761     // Catch: java.lang.NumberFormatException -> L5f
            r1 = r14
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L5f
            net.minecraft.class_1735 r0 = (net.minecraft.class_1735) r0     // Catch: java.lang.NumberFormatException -> L5f
            net.minecraft.class_1799 r0 = r0.method_7677()     // Catch: java.lang.NumberFormatException -> L5f
            net.minecraft.class_1792 r0 = r0.method_7909()     // Catch: java.lang.NumberFormatException -> L5f
            r1 = r8
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L5f
            r1 = r13
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L59
            if (r1 != 0) goto L8b
            r1 = r13
        L59:
            if (r1 != 0) goto L7b
            goto L69
        L5f:
            r1 = 4112382058975471018(0x39121db1bdec25aa, double:8.722533528753313E-34)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6f
            throw r0     // Catch: java.lang.NumberFormatException -> L6f
        L69:
            if (r0 == 0) goto L7c
            goto L79
        L6f:
            r1 = 4112382058975471018(0x39121db1bdec25aa, double:8.722533528753313E-34)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L79:
            r0 = r14
        L7b:
            return r0
        L7c:
            int r14 = r14 + 1
            r0 = r13
            if (r0 == 0) goto L1d
        L84:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2f
            r0 = -1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.Y(net.minecraft.class_1792, long):int");
    }

    private static final Unit Q(class_3965 class_3965Var, class_2586 class_2586Var) {
        long j2 = a ^ 93506366064896L;
        zf.Z((int) (j2 >>> 32), ((j2 ^ 78372179033115L) << 32) >>> 32).method_2896(zf.v(j2 ^ 99892896976148L), class_1268.field_5808, class_3965Var);
        q0 q0Var = d;
        o = ((class_2589) class_2586Var).method_11016();
        return Unit.INSTANCE;
    }

    static {
        int i2;
        long j2 = a ^ 32043176750870L;
        long j3 = j2 ^ 64598282335193L;
        long j4 = j2 ^ 23535791865535L;
        long j5 = j2 ^ 124194484617104L;
        long j6 = j2 ^ 92472327685131L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[28];
        int i4 = 0;
        String str = "\u009b\u0013\u00814\u000b1\u001d:TÈP\u008a\u008d\"0\u009a7¤\u0093ý\u0095`è\u009a8zR~\u0093Ü&Z\u0003®TåË\u0081ÃNþ´;¤n\u009fË\u0096 ãDP¯;+}\u008dcÍ\u000f\rÆä\u000eãA\u0080¡¦o5V\u0018g9\u001fé:ôkç('\u009c\u008b>èH\u0015rF\u0006\u008cP$;¤(ÛíJkF´v¡P¤Ðz7oc(¨í¢Ç\u0087«µ¬\u0018\u0086?i\u008bËäÖwé¹^ÌÀ\u0087g\u001fú2^Jì')+HdÛ\u0092\u0086\u0086\u00847\u0013ÍJ\u000b\u0097:X\u0012«u\u0000eá\u000e§g\u0098Fm\u0088ÕÔ\u000eÖçvw´D;²õ£]À¡³ô£@±Ç\u0085ïÔn8+ñ \u0004\u009f\u008b \u0091Ò}\u0007!#\u0018_\u0004\u000e÷ ^Nª\u0013Y\u0087¨¡Ò\u000e²\u008dö\u0005\u0010òu\u009d©\u007fË\u0019èOK£Ù*a\u009c\u0001\u0094\u0010\u0000\u00854\u008fùDw;5\u009däÑ\tK¿\u0081 {sé;Úq\u001an£ \u007f.\u007fÛÖÉ\u0094\u0083\u0097Bo\u0003\u0007äs\u0015Ä\u008bàÑ¯§ ¨ÿk ãøHpÂ\u009f¿L\u007fx*\bWº\u0003e\u0007®éx>±ìS\nc®+\u0018\u0013\u009bÙÃ\n¬;ÞÃ\u000eó1\u009c\u0011\u008a[PñG59¢âå\u0018W¿hÊ:1û\u0086\u0093\u0097D\u0096ì\u0087\fzÞ\u0007uÒHØJ£ ×5½K!\u0094¶.\u0019Dd$DGW\u0015 ¹8SC\u0098k\u0093\u0001¯\u0019l\u0001J\u0017Q =vÇ#7V\u009c¥Ô¤0\u0087j*\u009f7Ö\u0097\u0017<\t\u0087\u0013ÂËöÍÏe\u000f\u009c8 \u0017Ûf\u0080g\u008c2\u0006\u0097µ\u0004\rþ}MèX~{µ\u007fJëb{¡u\u0095f:B\u009e\u0018ÙÏmûÌGjq¦`>ª»^\u0018pWÌ\u0003\u0016\u0095\u001e\u000e`\u0010\u0091n¥C\u0099\u0097Å\u0084¦\u009fg\u008a\u008a8lS\u0010êø\u00019\u008b¿hÞÔSÉë¯Ò\u0001_\u0010\u0080§¾;q¬\u0001R×\u0005\u009azÇÂä  ðmtmÇæ#\u0014¼B\u0085aj»[²?Üh\u0000Ì\u001f/¥òý%yx\u0011\u0015\u0098 þc$CÃ#´\r¤\u008dIqb\u000b,¥]\n\u001f*\u0003Æ\u0019gÀWh¢±\u0081\"S()h_\u008bh\u0002tÎ\u001em.½ãÊspgç´\tÃ\u0090\u0088«Õý\u008d;Ëj¾\u008d\u0081Ðm¨\\à\u009e\u0093 æ\u0097¯\u0007üÈcW=÷\u0005úiµ\"5\u0085\u009c¾vUp\u0093î*q\u0080¥1Ø+Á ?3Ô|5.úFÎ»7ö® \u001f\u0010ú±êÝQÖZ\u0006B(À-,Î9\u0011(Ë¯ÝüØú5A\u0082'oCØÌ÷ú,ðéA\u0092.³ý\"ó®Ý¼<Õ0EçEÍ\u00930^l\u0010\u007f§Þ\u0004èsH\\M\u00033åEÈ\u001dq\u0010\u0006ºÃ\u000fNý+7GU/X(Ì/ô";
        int length = "\u009b\u0013\u00814\u000b1\u001d:TÈP\u008a\u008d\"0\u009a7¤\u0093ý\u0095`è\u009a8zR~\u0093Ü&Z\u0003®TåË\u0081ÃNþ´;¤n\u009fË\u0096 ãDP¯;+}\u008dcÍ\u000f\rÆä\u000eãA\u0080¡¦o5V\u0018g9\u001fé:ôkç('\u009c\u008b>èH\u0015rF\u0006\u008cP$;¤(ÛíJkF´v¡P¤Ðz7oc(¨í¢Ç\u0087«µ¬\u0018\u0086?i\u008bËäÖwé¹^ÌÀ\u0087g\u001fú2^Jì')+HdÛ\u0092\u0086\u0086\u00847\u0013ÍJ\u000b\u0097:X\u0012«u\u0000eá\u000e§g\u0098Fm\u0088ÕÔ\u000eÖçvw´D;²õ£]À¡³ô£@±Ç\u0085ïÔn8+ñ \u0004\u009f\u008b \u0091Ò}\u0007!#\u0018_\u0004\u000e÷ ^Nª\u0013Y\u0087¨¡Ò\u000e²\u008dö\u0005\u0010òu\u009d©\u007fË\u0019èOK£Ù*a\u009c\u0001\u0094\u0010\u0000\u00854\u008fùDw;5\u009däÑ\tK¿\u0081 {sé;Úq\u001an£ \u007f.\u007fÛÖÉ\u0094\u0083\u0097Bo\u0003\u0007äs\u0015Ä\u008bàÑ¯§ ¨ÿk ãøHpÂ\u009f¿L\u007fx*\bWº\u0003e\u0007®éx>±ìS\nc®+\u0018\u0013\u009bÙÃ\n¬;ÞÃ\u000eó1\u009c\u0011\u008a[PñG59¢âå\u0018W¿hÊ:1û\u0086\u0093\u0097D\u0096ì\u0087\fzÞ\u0007uÒHØJ£ ×5½K!\u0094¶.\u0019Dd$DGW\u0015 ¹8SC\u0098k\u0093\u0001¯\u0019l\u0001J\u0017Q =vÇ#7V\u009c¥Ô¤0\u0087j*\u009f7Ö\u0097\u0017<\t\u0087\u0013ÂËöÍÏe\u000f\u009c8 \u0017Ûf\u0080g\u008c2\u0006\u0097µ\u0004\rþ}MèX~{µ\u007fJëb{¡u\u0095f:B\u009e\u0018ÙÏmûÌGjq¦`>ª»^\u0018pWÌ\u0003\u0016\u0095\u001e\u000e`\u0010\u0091n¥C\u0099\u0097Å\u0084¦\u009fg\u008a\u008a8lS\u0010êø\u00019\u008b¿hÞÔSÉë¯Ò\u0001_\u0010\u0080§¾;q¬\u0001R×\u0005\u009azÇÂä  ðmtmÇæ#\u0014¼B\u0085aj»[²?Üh\u0000Ì\u001f/¥òý%yx\u0011\u0015\u0098 þc$CÃ#´\r¤\u008dIqb\u000b,¥]\n\u001f*\u0003Æ\u0019gÀWh¢±\u0081\"S()h_\u008bh\u0002tÎ\u001em.½ãÊspgç´\tÃ\u0090\u0088«Õý\u008d;Ëj¾\u008d\u0081Ðm¨\\à\u009e\u0093 æ\u0097¯\u0007üÈcW=÷\u0005úiµ\"5\u0085\u009c¾vUp\u0093î*q\u0080¥1Ø+Á ?3Ô|5.úFÎ»7ö® \u001f\u0010ú±êÝQÖZ\u0006B(À-,Î9\u0011(Ë¯ÝüØú5A\u0082'oCØÌ÷ú,ðéA\u0092.³ý\"ó®Ý¼<Õ0EçEÍ\u00930^l\u0010\u007f§Þ\u0004èsH\\M\u00033åEÈ\u001dq\u0010\u0006ºÃ\u000fNý+7GU/X(Ì/ô".length();
        char cCharAt = 24;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[28];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[12];
                            int i10 = 0;
                            String str3 = "ÎHµ4té\u0019RùÓ\u0014\u0097\u009cM7\u0083Ë\u001c\u000eè@#jÆs\u0082(Û\u0094p>BvÊ\bS\u0096\u0017©ªÃÒÔl\u001f\u009c\u0099C\u008c\nèÝæ¶Ã)x´eOæä´\u0091/§\u0083ÐÇÀ%H\u0000ú\u001esfÛP½";
                            int length2 = "ÎHµ4té\u0019RùÓ\u0014\u0097\u009cM7\u0083Ë\u001c\u000eè@#jÆs\u0082(Û\u0094p>BvÊ\bS\u0096\u0017©ªÃÒÔl\u001f\u009c\u0099C\u008c\nèÝæ¶Ã)x´eOæä´\u0091/§\u0083ÐÇÀ%H\u0000ú\u001esfÛP½".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                g = new Integer[12];
                                                Y = new KProperty[]{Reflection.property1(new PropertyReference1Impl(q0.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29132, 3651671687687469769L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23402, 3441495463866683518L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q0.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15554, 5633787202384705496L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10495, 2297642330406691808L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q0.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32766, 3390135926593320166L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20141, 8259851531839030714L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q0.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22566, 578338461716501309L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17341, 3134734955974084780L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(q0.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10141, 3377107055133076622L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8660, 4207626353343834820L ^ j2) /* invoke-custom */, 0))};
                                                d = new q0(j5);
                                                i = yp.L(d, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28169, 271221341756744973L ^ j2) /* invoke-custom */, m0.STRENGTH, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28801, 8150309762247728339L ^ j2) /* invoke-custom */, null, j6);
                                                X = yp.L(d, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31469, 4381054288151867872L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16829, 5570570237496012266L ^ j2) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28425, 7051103828382384989L ^ j2) /* invoke-custom */), j3, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23321, 3594442546319177544L ^ j2) /* invoke-custom */, null);
                                                t = yp.t(d, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(442, 7438766385837542077L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31510, 2883736415814588224L ^ j2) /* invoke-custom */, null);
                                                x = yp.L(d, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24139, 8021796297347618133L ^ j2) /* invoke-custom */, mz.TAKE, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31510, 2883736415814588224L ^ j2) /* invoke-custom */, null, j6);
                                                F = yp.t(d, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30546, 8376168956476357726L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31510, 2883736415814588224L ^ j2) /* invoke-custom */, null);
                                                P = new bg();
                                                h = new LinkedHashMap();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                str3 = "â{â\u001eñ\u0082ôòóAå\u000bØG[Ð";
                                                length2 = "â{â\u001eñ\u0082ôòóAå\u000bØG[Ð".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "RØp}JH\u008bÚc\u0014Ã\u0006Z\u008d\u0013\u009dSA×6l\u000f³¥\u0081\u009d±yg¢\u008fû/l2kU¢]«\u001ac?d\u0095{¥ VÒ::Ymy\fk)É®·\tó\u008faÌ?n>âÍ¼áåVdºûaÌ!v²ëîê3Î\u0017\u0093\u0000\u009a(¢\u0088\t«\u0082Ü\u008fÅ%h9\u0081Ý\bÉBý\ngUî\u008fü¸ÙÒ?\u00011f´\u0012×TÐ\u0018\u0093$\u0019;E¢^É+6\u009fØå\\êh¥\u008báºÐ\u0006\u0081U";
                        length = "RØp}JH\u008bÚc\u0014Ã\u0006Z\u008d\u0013\u009dSA×6l\u000f³¥\u0081\u009d±yg¢\u008fû/l2kU¢]«\u001ac?d\u0095{¥ VÒ::Ymy\fk)É®·\tó\u008faÌ?n>âÍ¼áåVdºûaÌ!v²ëîê3Î\u0017\u0093\u0000\u009a(¢\u0088\t«\u0082Ü\u008fÅ%h9\u0081Ý\bÉBý\ngUî\u008fü¸ÙÒ?\u00011f´\u0012×TÐ\u0018\u0093$\u0019;E¢^É+6\u009fØå\\êh¥\u008báºÐ\u0006\u0081U".length();
                        cCharAt = 128;
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 13176;
        if (c[i3] == null) {
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
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/q0", e2);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/q0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 21564;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/q0", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i3].intValue();
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/q0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q0.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
