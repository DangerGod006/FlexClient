package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_n.class */
public final class _n extends _g {

    @NotNull
    public static final _n e;
    static final KProperty[] O;

    @NotNull
    private static final cw F;

    @NotNull
    private static List V;

    @NotNull
    private static final LinkedList c;

    @NotNull
    private static final AtomicBoolean k;
    private static boolean Y;
    private static boolean A;
    private static int K;
    private static boolean D;
    private static boolean f;

    @NotNull
    private static final Map U;

    @NotNull
    private static final Map d;
    private static boolean N;
    private static _g[] m;
    private static final long a = yz.a(-4133011456643079438L, 4599371866093213342L, MethodHandles.lookup().lookupClass()).a(211928457330695L);
    private static final String[] b;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map l;

    /* JADX WARN: Illegal instructions before constructor call */
    private _n(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9753, 1914785684798170493L ^ j3) /* invoke-custom */, jt.c(), null, 4, null, j3 ^ 113016968695007L);
    }

    @NotNull
    public final su i(long j2) {
        return (su) F.E(this, (a ^ j2) ^ 123482039398188L, O[0]);
    }

    @NotNull
    public final Map Y() {
        return U;
    }

    @NotNull
    public final Map j() {
        return d;
    }

    public final boolean e() {
        return N;
    }

    public final void m(boolean z) {
        N = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x040b: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void D(su.catlean.api.event.events.player.PlayerUpdateEvent r11) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.D(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x026b: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void x(su.catlean.api.event.events.player.ClickSlotEvent r13) {
        /*
            Method dump skipped, instruction units count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.x(su.catlean.api.event.events.player.ClickSlotEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:15:0x0047
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void j(su.catlean.api.event.events.network.ReceivePacket r8) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.j(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:15:0x0047
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void C(su.catlean.api.event.events.network.SendPacket r8) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.C(su.catlean.api.event.events.network.SendPacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0097: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void r(su.catlean.api.event.events.network.AfterSendPacket r8) {
        /*
            r7 = this;
            long r0 = su.catlean._n.a
            r1 = 87570782229351(0x4fa5295e1367, double:4.32657150789675E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 139826697597007(0x7f2bf0a3f04f, double:6.9083567654114E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 62916286608447(0x3938d6e9f43f, double:3.10847757771353E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 63127846797434(0x396a18e2407a, double:3.11893003985415E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = -7871826681550883363(0x92c1a75700b7b5dd, double:-2.500507655492911E-218)
            r1 = r9
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r17 = r0
            boolean r0 = su.catlean._n.N     // Catch: java.lang.NumberFormatException -> L38
            r1 = r17
            if (r1 == 0) goto L4a
            if (r0 == 0) goto L43
            goto L42
        L38:
            r1 = -7919280910506674196(0x92190ff854b7b7ec, double:-1.7333471955905092E-221)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L42:
            return
        L43:
            r0 = r8
            net.minecraft.class_2596 r0 = r0.getPacket()
            boolean r0 = r0 instanceof net.minecraft.class_2813
        L4a:
            r1 = r17
            if (r1 == 0) goto L62
            if (r0 == 0) goto Lab
            goto L5f
        L55:
            r1 = -7919280910506674196(0x92190ff854b7b7ec, double:-1.7333471955905092E-221)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5f:
            boolean r0 = su.catlean._n.A
        L62:
            if (r0 == 0) goto Lab
            r0 = r7
            r1 = r11
            su.catlean.su r0 = r0.i(r1)     // Catch: java.lang.NumberFormatException -> L74 java.lang.NumberFormatException -> La1
            su.catlean.su r1 = su.catlean.su.STRICT_NCP     // Catch: java.lang.NumberFormatException -> L74 java.lang.NumberFormatException -> La1
            if (r0 != r1) goto Lab
            goto L7e
        L74:
            r1 = -7919280910506674196(0x92190ff854b7b7ec, double:-1.7333471955905092E-221)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> La1
            throw r0     // Catch: java.lang.NumberFormatException -> La1
        L7e:
            net.minecraft.class_2848 r0 = new net.minecraft.class_2848     // Catch: java.lang.NumberFormatException -> La1
            r1 = r0
            r2 = r15
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)     // Catch: java.lang.NumberFormatException -> La1
            net.minecraft.class_1297 r2 = (net.minecraft.class_1297) r2     // Catch: java.lang.NumberFormatException -> La1
            net.minecraft.class_2848$class_2849 r3 = net.minecraft.class_2848.class_2849.field_12981     // Catch: java.lang.NumberFormatException -> La1
            r1.<init>(r2, r3)     // Catch: java.lang.NumberFormatException -> La1
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> La1
            r1 = r13
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> La1
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> La1
            r-1 = 0
            su.catlean._n.A = r-1     // Catch: java.lang.NumberFormatException -> La1
            goto Lab
        La1:
            r1 = -7919280910506674196(0x92190ff854b7b7ec, double:-1.7333471955905092E-221)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.r(su.catlean.api.event.events.network.AfterSendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_1703] */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    private final void R(int i2, byte b2, int i3, int i4, int i5, int i6, class_1713 class_1713Var, class_1657 class_1657Var) {
        Object obj = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i6) << 40) >>> 40)) ^ a;
        try {
            if (i3 == class_1657Var.field_7512.field_7763) {
                obj = class_1657Var.field_7512;
                obj.method_7593(i4, i5, class_1713Var, class_1657Var);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5641862498806426559L, obj) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[LOOP:0: B:3:0x001d->B:12:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0059 -> B:6:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t(long r8, java.util.Map r10) {
        /*
            r7 = this;
            long r0 = su.catlean._n.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 61400919415974(0x37d803fd9ca6, double:3.03360849064995E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 5628841910759614721(0x4e1da9e51ba86901, double:1.9993262005492908E68)
            r1 = r8
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r1 = 0
            r14 = r1
            r13 = r0
        L1d:
            r0 = r14
            r1 = 25167(0x624f, float:3.5266E-41)
            r2 = 4130832109043783566(0x3953a9eac655178e, double:1.5148393217040422E-32)
            r3 = r8
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_n;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "b"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            if (r0 >= r1) goto L56
            r0 = r10
            r1 = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r11
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)
            net.minecraft.class_1703 r2 = r2.field_7512
            r3 = r14
            net.minecraft.class_1735 r2 = r2.method_7611(r3)
            net.minecraft.class_1799 r2 = r2.method_7677()
            net.minecraft.class_1799 r2 = r2.method_7972()
            java.lang.Object r0 = r0.put(r1, r2)
            int r14 = r14 + 1
        L51:
            r0 = r13
            if (r0 != 0) goto L1d
        L56:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.t(long, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[LOOP:0: B:3:0x0037->B:12:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x007d -> B:6:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.util.Map r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            r0 = r9
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r10
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r11
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean._n.a
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 138310258489141(0x7dcaddd37735, double:6.8334347186907E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = -6517020957448174958(0xa58ee3f7c5868292, double:-8.912853776944845E-128)
            r1 = r12
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r1 = 0
            r17 = r1
            r16 = r0
        L37:
            r0 = r17
            r1 = 930(0x3a2, float:1.303E-42)
            r2 = 3445781852107054577(0x2fd1e05684541df1, double:2.4122330297187775E-78)
            r3 = r12
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_n;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "b"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            if (r0 >= r1) goto L7c
            r0 = r14
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)
            net.minecraft.class_1703 r0 = r0.field_7512
            r1 = r17
            r2 = r14
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)
            net.minecraft.class_1703 r2 = r2.field_7512
            int r2 = r2.method_37421()
            r3 = r8
            r4 = r17
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            r4 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            net.minecraft.class_1799 r3 = (net.minecraft.class_1799) r3
            r0.method_7619(r1, r2, r3)
            int r17 = r17 + 1
        L77:
            r0 = r16
            if (r0 != 0) goto L37
        L7c:
            r0 = r9
            if (r0 <= 0) goto L77
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.c(java.util.Map, int, int, int):void");
    }

    static {
        int i2;
        long j2 = a ^ 135887530408709L;
        long j3 = j2 ^ 66427617748739L;
        long j4 = j2 ^ 83245950191377L;
        h = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 4217146355126499820L, j2) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i4 = 0;
        String str = "\u000eÜÙw32¼]\u009e`\u0086H\u0099,Q\nþÿ\u0002Æ\u0010\u008fÚ\u0083¼ö\u00ad«´=Fz\u0010_\"¼Ð÷Ý\b3?Ùä\u0006~\u008a\u00adÜ\u00106W\u0083mIë\rÏx}V¡\u0012\u0097©\u001a ÅÌÂµ\\\u001b\u0018JºGi\u0091\u009f}\u00076´ñD{`¡\u0004H¹ÿ\u0095m×ë\u001e¿\u0010×Ë\u0087\fx\u008b?¾\u009c\u000f\"b\fWÄ¼@*z\u0005®l\u0019\u0082\u0082è\u000bG\u001aêH \u00ade)t\u0092f\u0014[z÷Ú32¤ÉªHè<\u008f\u0019+$Oñ<\u0085\u008d#VæTN\u0016Úí,Jû<D\u007f\u0012\u0093Ì\u0096ZÐ\u008c\u0010ó\u000e\u0081\n\u008aP\u008dr3À¥Q\u0089\u0086¹\u0099 æ\u009föIÙ\u0092\u0004\u009bXã\tMDÊn±\u0000;Ë\u000f\u0084`u\u0013A\u0016r·ô¹\u0094\u0014 îâpt°\u009e·ÊêØübw\u008d¤m,Â|¬\u0092¨©\u00914õh\u009aw\u0082\u0000V";
        int length = "\u000eÜÙw32¼]\u009e`\u0086H\u0099,Q\nþÿ\u0002Æ\u0010\u008fÚ\u0083¼ö\u00ad«´=Fz\u0010_\"¼Ð÷Ý\b3?Ùä\u0006~\u008a\u00adÜ\u00106W\u0083mIë\rÏx}V¡\u0012\u0097©\u001a ÅÌÂµ\\\u001b\u0018JºGi\u0091\u009f}\u00076´ñD{`¡\u0004H¹ÿ\u0095m×ë\u001e¿\u0010×Ë\u0087\fx\u008b?¾\u009c\u000f\"b\fWÄ¼@*z\u0005®l\u0019\u0082\u0082è\u000bG\u001aêH \u00ade)t\u0092f\u0014[z÷Ú32¤ÉªHè<\u008f\u0019+$Oñ<\u0085\u008d#VæTN\u0016Úí,Jû<D\u007f\u0012\u0093Ì\u0096ZÐ\u008c\u0010ó\u000e\u0081\n\u008aP\u008dr3À¥Q\u0089\u0086¹\u0099 æ\u009föIÙ\u0092\u0004\u009bXã\tMDÊn±\u0000;Ë\u000f\u0084`u\u0013A\u0016r·ô¹\u0094\u0014 îâpt°\u009e·ÊêØübw\u008d¤m,Â|¬\u0092¨©\u00914õh\u009aw\u0082\u0000V".length();
        char cCharAt = ' ';
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
                            g = new String[11];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i10 = 0;
                            String str3 = "\u0017jÅx8P\u009fB¡\u008e°²ÍÐ \u0015";
                            int length2 = "\u0017jÅx8P\u009fB¡\u008e°²ÍÐ \u0015".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j5 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j6 = j5;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                    long j7 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                i = jArr;
                                                j = new Integer[4];
                                                O = new KProperty[]{Reflection.property1(new PropertyReference1Impl(_n.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29256, 3082603230057403994L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14238, 2943157118245000078L ^ j2) /* invoke-custom */, 0))};
                                                e = new _n(j3);
                                                F = yp.L(e, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29140, 4491878986860402117L ^ j2) /* invoke-custom */, su.NONE, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17034, 4603028648168571894L ^ j2) /* invoke-custom */, null, j4);
                                                V = CollectionsKt.emptyList();
                                                c = new LinkedList();
                                                k = new AtomicBoolean();
                                                U = new LinkedHashMap();
                                                d = new LinkedHashMap();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                str3 = "\u008b\u0006|9å5\u0081\u009aü²¢DìÕ!\u0005";
                                                length2 = "\u008b\u0006|9å5\u0081\u009aü²¢DìÕ!\u0005".length();
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
                                    j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "®°-®T\u0005\n½yemGîgoÞPäòkOb©\u0014#\u001aÍ»\u00128\u0099ÍÉ#\u0098,\u008a,¡|_ts{\u001crkµ\u0094;i\u0089KñÏfV\u001bÆv\u0089/\u0003gû\u0092\rÆ~%\r\u0001a\u0085\u0093\rwþ&\u0080QÞ¡\u001aÌç¦q]\u001d\\Záæ\u009d\u008eãô\u0095g!Ùx´CE0ªÔØ\u0085Çtè7h\u0015QJô\u009av\u0012\rM\u0015@V\u0010eÞÌFÉÑnà\u007f»9ÖÈi\u0087Ï";
                        length = "®°-®T\u0005\n½yemGîgoÞPäòkOb©\u0014#\u001aÍ»\u00128\u0099ÍÉ#\u0098,\u008a,¡|_ts{\u001crkµ\u0094;i\u0089KñÏfV\u001bÆv\u0089/\u0003gû\u0092\rÆ~%\r\u0001a\u0085\u0093\rwþ&\u0080QÞ¡\u001aÌç¦q]\u001d\\Záæ\u009d\u008eãô\u0095g!Ùx´CE0ªÔØ\u0085Çtè7h\u0015QJô\u009av\u0012\rM\u0015@V\u0010eÞÌFÉÑnà\u007f»9ÖÈi\u0087Ï".length();
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

    public static void Y(_g[] _gVarArr) {
        m = _gVarArr;
    }

    public static _g[] M() {
        return m;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 24418;
        if (g[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                g[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/_n", e2);
            }
        }
        return g[i3];
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/_n"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 14857;
        if (j[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) i[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/_n", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            j[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return j[i3].intValue();
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/_n"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._n.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
