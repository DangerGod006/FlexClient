package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/es.class */
public final class es extends _g {

    @NotNull
    public static final es y;
    static final KProperty[] I;

    @NotNull
    private static final cl F;

    @NotNull
    private static final av d;

    @NotNull
    private static final av U;

    @NotNull
    private static final cq g;

    @NotNull
    private static final AtomicBoolean L;
    private static final long a = yz.a(-8572507584014296308L, -7513811025867688681L, MethodHandles.lookup().lookupClass()).a(95022117766332L);
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private es(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4811, 4123304082238406394L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 107940650123533L);
    }

    private final String z(int i2, int i3, short s) {
        return (String) F.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 84053927410542L, I[0]);
    }

    private final lj p(long j) {
        return (lj) d.E(this, (a ^ j) ^ 92669255142021L, I[1]);
    }

    private final lj Y(int i2, long j) {
        return (lj) U.E(this, (((((long) i2) << 32) | ((j << 32) >>> 32)) ^ a) ^ 60996966650991L, I[2]);
    }

    private final boolean T(long j) {
        return ((Boolean) g.E(this, (a ^ j) ^ 27807446698427L, I[3])).booleanValue();
    }

    @NotNull
    public final AtomicBoolean W() {
        return L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x009c: INVOKE (r-1 I:su.catlean._g), (r0 I:java.lang.String), (r1 I:boolean), (r2 I:long) STATIC call: su.catlean.o2.j(su.catlean._g, java.lang.String, boolean, long):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void k(su.catlean.api.event.events.network.SendPacket r11) {
        /*
            r10 = this;
            long r0 = su.catlean.es.a
            r1 = 53894319391277(0x31043fc3422d, double:2.66273317172257E-310)
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 82749369824893(0x4b4296cb367d, double:4.0883620845492E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 107014130606907(0x61542b3da33b, double:5.2872005552441E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r0 = -5171136611723433312(0xb83c6ea645352aa0, double:-8.355479844975225E-38)
            r1 = r12
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r18 = r0
            r0 = r11
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: java.lang.NumberFormatException -> L35
            boolean r0 = r0 instanceof net.minecraft.class_2797     // Catch: java.lang.NumberFormatException -> L35
            r1 = r18
            if (r1 == 0) goto L52
            if (r0 == 0) goto Laa
            goto L3f
        L35:
            r1 = -5180972747706747001(0xb8197cbc65f5b787, double:-1.8725073796980663E-38)
            r2 = r12
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L48
            throw r0     // Catch: java.lang.NumberFormatException -> L48
        L3f:
            java.util.concurrent.atomic.AtomicBoolean r0 = su.catlean.es.L     // Catch: java.lang.NumberFormatException -> L48
            boolean r0 = r0.get()     // Catch: java.lang.NumberFormatException -> L48
            goto L52
        L48:
            r1 = -5180972747706747001(0xb8197cbc65f5b787, double:-1.8725073796980663E-38)
            r2 = r12
            java.lang.Exception r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Exception;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            if (r0 == 0) goto L56
            return
        L56:
            r0 = r11
            net.minecraft.class_2596 r0 = r0.getPacket()
            r1 = r0
            r2 = 6496(0x1960, float:9.103E-42)
            r3 = 5509113854734015928(0x4c744ddcc29a9db8, double:2.0392194214041005E60)
            r4 = r12
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/es;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "t"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            net.minecraft.class_2797 r0 = (net.minecraft.class_2797) r0
            r19 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = su.catlean.es.L
            r1 = 1
            r0.set(r1)
            r0 = r10
            su.catlean._g r0 = (su.catlean._g) r0
            r1 = r10
            r2 = r19
            java.lang.String r2 = r2.comp_945
            r3 = r2
            r4 = 30049(0x7561, float:4.2108E-41)
            r5 = 6014325372067017105(0x53772d0f85ac7191, double:1.20858579601062E94)
            r6 = r12
            long r5 = r5 ^ r6
            java.lang.String r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/es;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "t"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r4, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r3 = r14
            r4 = r3; r3 = r2; r2 = r4; 
            java.lang.String r0 = r0.O(r1, r2)
            r1 = 1
            r2 = r16
            su.catlean.o2.j(r-1, r0, r1, r2)
            java.util.concurrent.atomic.AtomicBoolean r-1 = su.catlean.es.L
            r0 = 0
            r-1.set(r0)
            r-1 = r11
            r-1.cancel()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.es.k(su.catlean.api.event.events.network.SendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.api.event.events.client.InputEvent$Action] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Flow
    private final void Y(InputEvent inputEvent) throws Exception {
        long j = a ^ 84957198387758L;
        long j2 = j ^ 98733300419759L;
        int i2 = (int) (j >>> 32);
        long j3 = ((j ^ 64862256616005L) << 32) >>> 32;
        long j4 = j ^ 22876904214417L;
        long j5 = j ^ 31974813035320L;
        long j6 = j ^ 125924149076586L;
        ?? action = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8130582018893628734L, j) /* invoke-custom */;
        try {
            action = inputEvent;
            ?? key = action;
            if (action == 0) {
                try {
                    action = action.getAction();
                    if (action != InputEvent.Action.Press) {
                        return;
                    } else {
                        key = inputEvent;
                    }
                } catch (NumberFormatException unused) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(action, 8077769968161619844L, j) /* invoke-custom */;
                }
            }
            try {
                try {
                    try {
                        key = key.getKey();
                        int iX = Y(i2, j3).X();
                        es esVar = key;
                        if (action == 0) {
                            if (key == iX) {
                                o2.j(this, T(j4) ? (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12502, 756348955041201193L ^ j) /* invoke-custom */ : (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4326, 8895602711513685011L ^ j) /* invoke-custom */, true, j5);
                            }
                            int key2 = inputEvent.getKey();
                            iX = p(j2).X();
                            esVar = key2;
                        }
                        if (esVar == iX) {
                            try {
                                esVar = this;
                                o2.j(esVar, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22532, 8993727119694992601L ^ j) /* invoke-custom */ + ((int) zf.v(j6).method_23317()) + (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21267, 564380405856837572L ^ j) /* invoke-custom */ + ((int) zf.v(j6).method_23321()) + (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9046, 4085573498492252058L ^ j) /* invoke-custom */, true, j5);
                            } catch (NumberFormatException unused2) {
                                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(esVar, 8077769968161619844L, j) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, 8077769968161619844L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused4) {
                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, 8077769968161619844L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused5) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, 8077769968161619844L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(action, 8077769968161619844L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:55:0x0242
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void g(su.catlean.api.event.events.network.ReceivePacket r10) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.es.g(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    @NotNull
    public final String O(long a2, @NotNull String input) {
        long j = a ^ a2;
        long j2 = j ^ 59344671560624L;
        long j3 = j ^ 127834911832081L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8466931062649340011L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(input, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28745, 3182889768727951810L ^ j) /* invoke-custom */);
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18296, 1479480160093572803L ^ j) /* invoke-custom */);
        byte[] bytes2 = z((int) (j >>> 32), (int) ((j3 << 32) >>> 48), (short) ((j3 << 48) >>> 48)).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31553, 4241366092871086846L ^ j) /* invoke-custom */);
        byte[] bArr = new byte[bytes.length];
        int i3 = 0;
        int length = bytes.length;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            bArr[i3] = (byte) (bytes[i3] ^ bytes2[i3 % bytes2.length]);
            i3++;
            int i4 = i2;
            while (i4 != 0) {
                i4 = 2;
                if (j >= 0) {
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[2], 8464458629204246346L, j) /* invoke-custom */;
                    break loop0;
                }
            }
        }
        return (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10086, 46560303089184458L ^ j) /* invoke-custom */ + T(j2, bArr) + (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10699, 5957051652998553723L ^ j) /* invoke-custom */;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[EDGE_INSN: B:19:0x00b7->B:10:0x00b7 BREAK  A[LOOP:0: B:3:0x008d->B:21:?], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[LOOP:0: B:3:0x008d->B:21:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x00b4 -> B:6:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r(@org.jetbrains.annotations.NotNull java.lang.String r9, long r10) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.es.r(java.lang.String, long):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [char, int] */
    @NotNull
    public final String T(long a2, @NotNull byte[] bytes) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(bytes, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32692, 7986119169587256987L ^ j) /* invoke-custom */);
        String strEncodeToString = Base64.getEncoder().encodeToString(bytes);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25464, 6971036100515431018L ^ j) /* invoke-custom */);
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strEncodeToString, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17067, 2314159550092639152L ^ j) /* invoke-custom */, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18435, 6031319534558834969L ^ j) /* invoke-custom */, false, 4, (Object) null), (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15489, 8490916326258705816L ^ j) /* invoke-custom */, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13237, 6205662011046202020L ^ j) /* invoke-custom */, false, 4, (Object) null), (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4852, 3024953357691694050L ^ j) /* invoke-custom */, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28600, 4800303708453197479L ^ j) /* invoke-custom */, false, 4, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [char, int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [char, int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [char, int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [char, int] */
    @NotNull
    public final byte[] q(@NotNull String string, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(string, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24931, 760366038933013176L ^ j) /* invoke-custom */);
        byte[] bArrDecode = Base64.getDecoder().decode(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(string, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19005, 4273569269232759234L ^ j) /* invoke-custom */, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14718, 1746807281443242626L ^ j) /* invoke-custom */, false, 4, (Object) null), (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19457, 3778517472278149115L ^ j) /* invoke-custom */, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28331, 6122812239530743123L ^ j) /* invoke-custom */, false, 4, (Object) null), (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29547, 5281366441604008080L ^ j) /* invoke-custom */, (char) (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22030, 6477339378694909439L ^ j) /* invoke-custom */, false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(bArrDecode, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31902, 1874711614888353622L ^ j) /* invoke-custom */);
        return bArrDecode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:0: B:3:0x006b->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007c A[PHI: r0
  0x007c: PHI (r0v19 ??) = (r0v38 ??), (r0v39 ??) binds: [B:29:0x010b, B:5:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010b -> B:6:0x007c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String K(@org.jetbrains.annotations.NotNull java.lang.String r10, long r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.es.K(java.lang.String, long):java.lang.String");
    }

    static {
        int i2;
        long j = a ^ 108478741258037L;
        long j2 = j ^ 37073050226401L;
        long j3 = j ^ 100025273819852L;
        long j4 = j ^ 16121081972478L;
        long j5 = j ^ 47922878195181L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j5 << 32) >>> 48);
        int i5 = (int) ((j5 << 48) >>> 48);
        long j6 = j ^ 73876825150729L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[49];
        int i7 = 0;
        String str = "!\u0007\u0004¢pÑ¤ì\bÒv\u009cr\u000bGóåj½\u0018e«¹\u0015\u00825ýV\u0085æÍÜ\u0093³RØDAAèÏÞ¦R·¹\u0090\u0010\u0018ð´\u0088¦s\u0091\u008d a\fª\u0094{\"¯çmvù\u009b?ÄÛ\u001c \u0005â\u001c¶7i\u0088\u0012\u008bíÀÒÇÄõ\u0006ú;\t¤_¼\u0007\u0080\u0098±\u00861%ç@Z\u0018m6®\u0006î!\n º¤)~t\u0084GÕ\fq\u008f\u0085.\u0013Ná\u0010#\u009e\u001cô\u0092\r9\u0097\u0080\u0089·\u0096mú¯Í\u0010Êó\u001dl7T¬»×\u0094Fß\u008b\u008aØ\u0092\u0010>\u0005{2½nsqÜÒÁå\u000e\u008daI\u0010m\u001d\u0004P0ª\n\u000f\u009aÃ\"\u0083©©ÏÌ\u0010é;7\u0092\u001bí©Ê\u008dï\u0017 ÅÿRÙ\u0018\u0006¿\u0013\u001di0\b~¿Nh/L\u0089ýê4í-Õ5(æÝ\u0010£6\u001f\u0016GMªûø\u0086¿J=°Îæ\u0010\u0081 Çr_ër\u0084àÌ»A^\u0098f\u00830ç8cz\u0086Ù'þ,»Ú~²Q\u0000\u008dÕ\u000fßÃçã\u0006ý;\u009fç7\u008e9[iRO8\u0011\u009fÃ\u008a³ÆÅèÁP\u0094\u0090¦8o¬¹\u0084Að§WK=ì£\u0001Bâ(ç½\u0097tf5ÞQ§ÊõE\u009e±gí5\u000e½C´T0\u001cïs\u000fd\u008cþn\u0019\u001dÆö-2OóÐ\u0010épéH«Õg\u0019~\u0088i:Ú\u008b`\u0017\u0010ªÙIÀL\u0015\u0013È>\u0090³\u0013\u0093ëGO\u0018Úg1\u0088íQE\u0013Î\u0019úÿRíà*\"8\u0098Õë3\r| %+\u0088<\u0088%úÕ\u009e|3\u0007=yX\n$o¡U,\u001fÕY,X\u0092\u00ad®aº\u009f Îaî\u0083ü³\u0093_\u0014þ\u009d<Æ0sí\u0017ïl\u009f<*;\u0099\u0010PýÂ\u009d\u0089?¼ \u0002T#êâ\u008bQ'¬\u0090²]»PV@£¶E\u0088í° .Úb\u0089#h\u0080\u0089\u0085!ÇI\u000e\u0094õ\";[Ïçt¡ \u009f\u0092Á7å0'8}\u000e\u0019´ÉùÑI°ëÞ§&9\u0014\u0085[ô\u008bW#\u0000J`a\u001d%j\u0003iO-\u0093Ñ=D\u0097\u0017ßðð\u0082p\u0098¶Ó\u0006d\u009b\u0094\r¬Ñp=\u008a×\u000fÞ\nQöÛ¯Ù\u0010\u0081xcSº\rê1\u001bO@~¬\u0090tjº\t2X\u008c\u000ehî\u001cvo\u0086Åÿ\u0080&Yöy\u009dg\u0084¯1\u0018<e&Fíõ\u009c\u0001¤¥\u0092'\u00adaé]\u0001²\u001fJ(\u0004õÞ \u009føâ¢ï»_1\u001b¯ñFÄ\u0098:\u008cë=\u0084¬\u0007C\u001d5\u000fËA?\u0094Áu\u001c\u0018\u0019ÏLìî~\u008fEÓ\u0004c¾\u0094\u0016)=q¸Ólõ\u008d-\u008f\u0010\u0097\\GXI\u0002N\u0094\u0002\t³Ágsw¦\u0010\u0012\u0089§À5Î\\\u0084;a\nTþ~6\u0018\u0010×\u0082\u0081jÛ\u0081|/\u009f`t\u0092\u009b\\rO\u0010XyÆÓ\u0086-\u008bhØ¢Uþ0ÛÝ¸\u0018ÌuËà·\u0000Åê\u0007\u0088\u0015\u0082Æã#ü£\u0090k^AúüT(óZøÛa,\u009c»\u0085Éi\u0013ZÀCüð\u0014\u009fs\u0084\\Ä\u008b\u0092¶{Àáâ\u0012\u0082\u0082dSýV\u009d¨¡\u0010\u008d)\u0086\u0002\u009cB,\u0098ùÒ\u0098`\u0086 \u0080\u0006\u0010*\u000fµ\u001a®ÅÀ»C\u0004 5@5\u0083ô 6,[ÔF\u0085D'¨¡\u0098h7\rì3ý.é¦±\rcr&¶cé\u001d\u0080½\u000b0ï\u0003\u000b©E,ÄT\u0005y©Ôºk\u0083ä¬³ÈøÚÄÜªm\u0005ú\u008a~¯p¢\u0012\u0001\u0089¶\u0086=ò\"4Ý£\"\u001aú\u00971\u0010Ð\fv9{Ê-ÓA·\u0091+)P\u000b\u0018\u0010\u0003¹\u0095²q'\u009dLÒ\u009b\u0093\u008fà\fí\u009f EÌmÉM¬Y*ôlMÂ©t\u00ad\nkCO\u0000\u0093+\u000f=\u009b?\u008e\u0016\nø\u0004\u009e\u0010w>\u000b\u008e±\u008e\u008c\u00810|üS\u0087éqk\u0010\u0084k\u009ffjx£\u00891õwa\u0094{90\u0018Pu1\u0086É\u00ad\u000e{äêg,ÂJ\r/8\rù\u0093ûóìÃ\u0090¸ÅÙ\u000eß·2Êù\b\u0013>®ñ°ßE ý§1_´\u001enèlñà÷\u0094ªyK\u0089\u0010`ë¤]{ðJÅ}Ág\u0011+FnË=c5Ký5Ý#9ÿï=Ø¢ò\u0092L<\u00adÛAU\u008dÇËè\u009a®]\u001c¨÷lSÈ\u0015\u008e:0À\u0017\u0098\u000eð\\\u000e\u0017m.ô'¹&\u001fõ¥K\u000fsïx*\u0081ýhåËzBÚX\u0018y\t«ätçÄn\u0080{ÛF\u0011\u0011¼ë\u0010\u0000ì¬\u0018GnGâ\u001d\u0004¶\u008dÇ\u001fÛh¨½\u0086\u008f\u009c^ÿÅÝW¤\u0090 \u0080ø\u0018§uÒ?\u0017³àñ±¢\u0080¡\r÷xïP«Äº\u001c\u0090î\u0000Ã\u0094/\u0012\u008f\u0010OÎ\u008b\u008d!\u009c´\u0091XfÄü\"Ò¡\u0006\u0010¿\u0013>\u000e¹\u008dëøûKL\bx?ô\n\u0018µgÎ¡k+¯uwV\u001f¾\u0097\u0003RÖÐ\u0001\u001fç\"¤]Í\u00100_\u0092\u0088u<g\u008aegcl)ã\f\u008b\u0018ñ\u0004²4&\u0001ìÎdð¼\u0084í\u0017S`\u008bT<úhÙ/X";
        int length = "!\u0007\u0004¢pÑ¤ì\bÒv\u009cr\u000bGóåj½\u0018e«¹\u0015\u00825ýV\u0085æÍÜ\u0093³RØDAAèÏÞ¦R·¹\u0090\u0010\u0018ð´\u0088¦s\u0091\u008d a\fª\u0094{\"¯çmvù\u009b?ÄÛ\u001c \u0005â\u001c¶7i\u0088\u0012\u008bíÀÒÇÄõ\u0006ú;\t¤_¼\u0007\u0080\u0098±\u00861%ç@Z\u0018m6®\u0006î!\n º¤)~t\u0084GÕ\fq\u008f\u0085.\u0013Ná\u0010#\u009e\u001cô\u0092\r9\u0097\u0080\u0089·\u0096mú¯Í\u0010Êó\u001dl7T¬»×\u0094Fß\u008b\u008aØ\u0092\u0010>\u0005{2½nsqÜÒÁå\u000e\u008daI\u0010m\u001d\u0004P0ª\n\u000f\u009aÃ\"\u0083©©ÏÌ\u0010é;7\u0092\u001bí©Ê\u008dï\u0017 ÅÿRÙ\u0018\u0006¿\u0013\u001di0\b~¿Nh/L\u0089ýê4í-Õ5(æÝ\u0010£6\u001f\u0016GMªûø\u0086¿J=°Îæ\u0010\u0081 Çr_ër\u0084àÌ»A^\u0098f\u00830ç8cz\u0086Ù'þ,»Ú~²Q\u0000\u008dÕ\u000fßÃçã\u0006ý;\u009fç7\u008e9[iRO8\u0011\u009fÃ\u008a³ÆÅèÁP\u0094\u0090¦8o¬¹\u0084Að§WK=ì£\u0001Bâ(ç½\u0097tf5ÞQ§ÊõE\u009e±gí5\u000e½C´T0\u001cïs\u000fd\u008cþn\u0019\u001dÆö-2OóÐ\u0010épéH«Õg\u0019~\u0088i:Ú\u008b`\u0017\u0010ªÙIÀL\u0015\u0013È>\u0090³\u0013\u0093ëGO\u0018Úg1\u0088íQE\u0013Î\u0019úÿRíà*\"8\u0098Õë3\r| %+\u0088<\u0088%úÕ\u009e|3\u0007=yX\n$o¡U,\u001fÕY,X\u0092\u00ad®aº\u009f Îaî\u0083ü³\u0093_\u0014þ\u009d<Æ0sí\u0017ïl\u009f<*;\u0099\u0010PýÂ\u009d\u0089?¼ \u0002T#êâ\u008bQ'¬\u0090²]»PV@£¶E\u0088í° .Úb\u0089#h\u0080\u0089\u0085!ÇI\u000e\u0094õ\";[Ïçt¡ \u009f\u0092Á7å0'8}\u000e\u0019´ÉùÑI°ëÞ§&9\u0014\u0085[ô\u008bW#\u0000J`a\u001d%j\u0003iO-\u0093Ñ=D\u0097\u0017ßðð\u0082p\u0098¶Ó\u0006d\u009b\u0094\r¬Ñp=\u008a×\u000fÞ\nQöÛ¯Ù\u0010\u0081xcSº\rê1\u001bO@~¬\u0090tjº\t2X\u008c\u000ehî\u001cvo\u0086Åÿ\u0080&Yöy\u009dg\u0084¯1\u0018<e&Fíõ\u009c\u0001¤¥\u0092'\u00adaé]\u0001²\u001fJ(\u0004õÞ \u009føâ¢ï»_1\u001b¯ñFÄ\u0098:\u008cë=\u0084¬\u0007C\u001d5\u000fËA?\u0094Áu\u001c\u0018\u0019ÏLìî~\u008fEÓ\u0004c¾\u0094\u0016)=q¸Ólõ\u008d-\u008f\u0010\u0097\\GXI\u0002N\u0094\u0002\t³Ágsw¦\u0010\u0012\u0089§À5Î\\\u0084;a\nTþ~6\u0018\u0010×\u0082\u0081jÛ\u0081|/\u009f`t\u0092\u009b\\rO\u0010XyÆÓ\u0086-\u008bhØ¢Uþ0ÛÝ¸\u0018ÌuËà·\u0000Åê\u0007\u0088\u0015\u0082Æã#ü£\u0090k^AúüT(óZøÛa,\u009c»\u0085Éi\u0013ZÀCüð\u0014\u009fs\u0084\\Ä\u008b\u0092¶{Àáâ\u0012\u0082\u0082dSýV\u009d¨¡\u0010\u008d)\u0086\u0002\u009cB,\u0098ùÒ\u0098`\u0086 \u0080\u0006\u0010*\u000fµ\u001a®ÅÀ»C\u0004 5@5\u0083ô 6,[ÔF\u0085D'¨¡\u0098h7\rì3ý.é¦±\rcr&¶cé\u001d\u0080½\u000b0ï\u0003\u000b©E,ÄT\u0005y©Ôºk\u0083ä¬³ÈøÚÄÜªm\u0005ú\u008a~¯p¢\u0012\u0001\u0089¶\u0086=ò\"4Ý£\"\u001aú\u00971\u0010Ð\fv9{Ê-ÓA·\u0091+)P\u000b\u0018\u0010\u0003¹\u0095²q'\u009dLÒ\u009b\u0093\u008fà\fí\u009f EÌmÉM¬Y*ôlMÂ©t\u00ad\nkCO\u0000\u0093+\u000f=\u009b?\u008e\u0016\nø\u0004\u009e\u0010w>\u000b\u008e±\u008e\u008c\u00810|üS\u0087éqk\u0010\u0084k\u009ffjx£\u00891õwa\u0094{90\u0018Pu1\u0086É\u00ad\u000e{äêg,ÂJ\r/8\rù\u0093ûóìÃ\u0090¸ÅÙ\u000eß·2Êù\b\u0013>®ñ°ßE ý§1_´\u001enèlñà÷\u0094ªyK\u0089\u0010`ë¤]{ðJÅ}Ág\u0011+FnË=c5Ký5Ý#9ÿï=Ø¢ò\u0092L<\u00adÛAU\u008dÇËè\u009a®]\u001c¨÷lSÈ\u0015\u008e:0À\u0017\u0098\u000eð\\\u000e\u0017m.ô'¹&\u001fõ¥K\u000fsïx*\u0081ýhåËzBÚX\u0018y\t«ätçÄn\u0080{ÛF\u0011\u0011¼ë\u0010\u0000ì¬\u0018GnGâ\u001d\u0004¶\u008dÇ\u001fÛh¨½\u0086\u008f\u009c^ÿÅÝW¤\u0090 \u0080ø\u0018§uÒ?\u0017³àñ±¢\u0080¡\r÷xïP«Äº\u001c\u0090î\u0000Ã\u0094/\u0012\u008f\u0010OÎ\u008b\u008d!\u009c´\u0091XfÄü\"Ò¡\u0006\u0010¿\u0013>\u000e¹\u008dëøûKL\bx?ô\n\u0018µgÎ¡k+¯uwV\u001f¾\u0097\u0003RÖÐ\u0001\u001fç\"¤]Í\u00100_\u0092\u0088u<g\u008aegcl)ã\f\u008b\u0018ñ\u0004²4&\u0001ìÎdð¼\u0084í\u0017S`\u008bT<úhÙ/X".length();
        char cCharAt = '0';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[49];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[16];
                            int i13 = 0;
                            String str3 = "×\u008d#\u009a\u0016 &U\u0003ì\"@Õ*|[#\u0005W¢c®¤Úã\u007fç\u0092\b\u0091\u0099¸\u008dß}#: \u009a\u0017\u0099¥*Ö\u001d×Ü¶\u009d!vþ\u00ad£ò\u0000/\u000fà¹N\u0099¦\u0005\u0082¶\u001c½\bØ)ùDs\u0010Ç\u001f\u008a:$\u0099ò¼\u0087(Å\u0011gÃJß+:w,KÚÅ\b\u0006\u0002\u008a\u0099\u00887\u001a´ñUI\u00049";
                            int length2 = "×\u008d#\u009a\u0016 &U\u0003ì\"@Õ*|[#\u0005W¢c®¤Úã\u007fç\u0092\b\u0091\u0099¸\u008dß}#: \u009a\u0017\u0099¥*Ö\u001d×Ü¶\u009d!vþ\u00ad£ò\u0000/\u000fà¹N\u0099¦\u0005\u0082¶\u001c½\bØ)ùDs\u0010Ç\u001f\u008a:$\u0099ò¼\u0087(Å\u0011gÃJß+:w,KÚÅ\b\u0006\u0002\u008a\u0099\u00887\u001a´ñUI\u00049".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i14 >= length2) {
                                                f = jArr;
                                                h = new Integer[16];
                                                I = new KProperty[]{Reflection.property1(new PropertyReference1Impl(es.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12419, 7574436192642787650L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32239, 2046912359115990020L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(es.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11755, 8811628373723739172L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1949, 5053422642017787511L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(es.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31456, 3582379696984597251L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18522, 926553268695994770L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(es.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20392, 6033301022599190081L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18718, 4021228784432255194L ^ j) /* invoke-custom */, 0))};
                                                y = new es(j2);
                                                F = yp.x(y, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19477, 3109441337271817704L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13142, 2212263074683546267L ^ j) /* invoke-custom */, (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14326, 7630411782147159614L ^ j) /* invoke-custom */, j6, (Object) null);
                                                d = yp.J(y, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10540, 2605600277256925415L ^ j) /* invoke-custom */, new lj(0, false, j4, false, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19310, 8384756746372467369L ^ j) /* invoke-custom */, null), null, i3, null, i4, (char) i5, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10087, 6060062798399219370L ^ j) /* invoke-custom */, null);
                                                U = yp.J(y, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19013, 5912985173578159036L ^ j) /* invoke-custom */, new lj(0, false, j4, false, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30807, 153447650633578910L ^ j) /* invoke-custom */, null), null, i3, null, i4, (char) i5, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10087, 6060062798399219370L ^ j) /* invoke-custom */, null);
                                                g = yp.t(y, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28453, 8659378660940887773L ^ j) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10087, 6060062798399219370L ^ j) /* invoke-custom */, null);
                                                L = new AtomicBoolean(false);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i14 >= length2) {
                                                str3 = "V\u0092\u001aéö?EG»\u0004ý¦\fÈ\u0000\u008a";
                                                length2 = "V\u0092\u001aéö?EG»\u0004ý¦\fÈ\u0000\u008a".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "i\u0007ÉF\u008au\u008cqÍ\u008cyP6å?\u007fyl\u0094?\u0081æz+p?¥sÌxG\u008ap×\u009b\u00008}çCâìª§\u0000I»EÂ:\u0015¨¶±cz\u0010\u001cã¡\u0095H<\u008as®\u0085ð^pôý¯";
                        length = "i\u0007ÉF\u008au\u008cqÍ\u008cyP6å?\u007fyl\u0094?\u0081æz+p?¥sÌxG\u008ap×\u009b\u00008}çCâìª§\u0000I»EÂ:\u0015¨¶±cz\u0010\u001cã¡\u0095H<\u008as®\u0085ð^pôý¯".length();
                        cCharAt = '8';
                        i2 = -1;
                        break;
                        break;
                }
                i9 = i2 + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
        }
    }

    private static Exception a(Exception exc) {
        return exc;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 15865;
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
                throw new RuntimeException("su/catlean/es", e2);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/es"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.es.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 26072;
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
                    throw new RuntimeException("su/catlean/es", e2);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/es"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.es.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
