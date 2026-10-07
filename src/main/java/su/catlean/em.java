package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/em.class */
public final class em extends _g {

    @NotNull
    public static final em U = null;

    @NotNull
    private static final bg i = null;
    private static final long a = 0;
    private static final String b = null;
    private static final long c = 0;

    private em(long j) {
        super(b, jt.v(), null, 4, null, (a ^ j) ^ 50772685901445L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.api.event.events.network.SendPacket] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.network.SendPacket r7) {
        /*
            r6 = this;
            long r0 = su.catlean.em.a
            r1 = 50900202367278(0x2e4b207b292e, double:2.51480413560394E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 6656686404892688781(0x5c614d0440cd018d, double:1.0059939954516318E137)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = r7
            java.lang.String r2 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r10 = r0
            r0 = r7
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: java.lang.NumberFormatException -> L2b
            boolean r0 = r0 instanceof net.minecraft.class_2793     // Catch: java.lang.NumberFormatException -> L2b
            r1 = r10
            if (r1 != 0) goto L4c
            if (r0 == 0) goto L60
            goto L35
        L2b:
            r1 = 6634397954407428333(0x5c121dc9fb0870ed, double:3.2919185846210146E135)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L42
            throw r0     // Catch: java.lang.NumberFormatException -> L42
        L35:
            su.catlean.bg r0 = su.catlean.em.i     // Catch: java.lang.NumberFormatException -> L42
            long r0 = r0.N()     // Catch: java.lang.NumberFormatException -> L42
            long r1 = su.catlean.em.c     // Catch: java.lang.NumberFormatException -> L42
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            goto L4c
        L42:
            r1 = 6634397954407428333(0x5c121dc9fb0870ed, double:3.2919185846210146E135)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4c:
            if (r0 >= 0) goto L60
            r0 = r7
            r0.cancel()     // Catch: java.lang.NumberFormatException -> L56
            goto L60
        L56:
            r1 = 6634397954407428333(0x5c121dc9fb0870ed, double:3.2919185846210146E135)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L60:
            r0 = 6634798286229815938(0x5c1389e37f194282, double:3.5503577845096903E135)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)     // Catch: java.lang.NumberFormatException -> L7d
            if (r0 == 0) goto L87
            int r10 = r10 + 1
            r0 = r10
            r1 = 6689964417732420850(0x5cd7873166f1a4f2, double:1.7511559598499983E139)
            r2 = r8
            call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (I, J, J)V}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L7d
            goto L87
        L7d:
            r1 = 6634397954407428333(0x5c121dc9fb0870ed, double:3.2919185846210146E135)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.em.t(su.catlean.api.event.events.network.SendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [su.catlean.bg] */
    @Flow
    public final void m(@NotNull PlayerUpdateEvent e) {
        long j = a ^ 76742679321026L;
        long j2 = j ^ 85473274970214L;
        long j3 = j ^ 87599114649281L;
        Intrinsics.checkNotNullParameter(e, "e");
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5998290407914128890L, j) /* invoke-custom */;
        int iMethod_23317 = (int) (zf.v(j3).method_23317() - ((double) 2));
        int iMethod_233172 = (int) (zf.v(j3).method_23317() + ((double) 2));
        do {
            int iMethod_23318 = iMethod_23317;
            while (iMethod_23318 < iMethod_233172) {
                int iMethod_23321 = (int) (zf.v(j3).method_23321() - ((double) 2));
                int iMethod_233212 = (int) (zf.v(j3).method_23321() + ((double) 2));
                do {
                    ?? AreEqual = iMethod_23321;
                    while (AreEqual < iMethod_233212) {
                        int iMethod_233182 = (int) (zf.v(j3).method_23318() - ((double) 2));
                        iMethod_23318 = (int) (zf.v(j3).method_23318() + ((double) 2));
                        if (i2 != 0) {
                            while (true) {
                                if (iMethod_233182 >= iMethod_23318) {
                                    break;
                                }
                                AreEqual = Intrinsics.areEqual(zf.z(j2).method_8320(class_2338.method_49637(iMethod_23317, iMethod_233182, iMethod_23321)).method_26204(), class_2246.field_10316);
                                if (i2 != 0) {
                                    if (AreEqual != 0) {
                                        try {
                                            AreEqual = i;
                                            AreEqual.l();
                                        } catch (NumberFormatException unused) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, -5981213174109536255L, j) /* invoke-custom */;
                                        }
                                    }
                                    iMethod_233182++;
                                    if (i2 == 0) {
                                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[1], -6014059362228656460L, j) /* invoke-custom */;
                                        break;
                                    }
                                }
                            }
                            iMethod_23321++;
                        }
                    }
                    break;
                } while (i2 != 0);
                iMethod_23317++;
            }
            return;
        } while (i2 != 0);
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
}
