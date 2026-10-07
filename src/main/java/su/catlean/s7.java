package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_3544;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/s7.class */
public final class s7 {

    @NotNull
    public static final s7 r;

    @NotNull
    private static final CopyOnWriteArrayList x;

    @NotNull
    private static List R;

    @NotNull
    private static final String[] h;
    private static final long a = yz.a(-7752995345005578566L, 168533173610472466L, MethodHandles.lookup().lookupClass()).a(277559414737122L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private s7() {
    }

    @NotNull
    public final List a() {
        return R;
    }

    public final void S(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15069, 3948043770115643664L ^ (a ^ a2)) /* invoke-custom */);
        R = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void B(PlayerUpdateEvent playerUpdateEvent) {
        long j = a ^ 72851184697309L;
        long j2 = j ^ 62837082750837L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 48);
        int i3 = (int) ((j2 << 32) >>> 32);
        ?? U = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5403229685894482389L, j) /* invoke-custom */;
        try {
            U = pg.k.U((short) i, (char) i2, i3);
            ?? IsEmpty = U;
            if (U != 0) {
                if (U == 0) {
                    return;
                } else {
                    IsEmpty = x.isEmpty();
                }
            }
            if (U != 0) {
                if (IsEmpty != 0) {
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = x;
                Function1 function1 = s7::G;
                copyOnWriteArrayList.removeIf((v1) -> {
                    return O(r1, v1);
                });
            }
            R = CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(x, new on()));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U, 5461148876213892672L, j) /* invoke-custom */;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_5900 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v31, types: [su.catlean.ds] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U(su.catlean.api.event.events.network.AfterReceivePacket r11) throws net.minecraft.class_5900 {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s7.U(su.catlean.api.event.events.network.AfterReceivePacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x004b: INVOKE (r-1 I:su.catlean.s7), (r0 I:net.minecraft.class_640), (r1 I:long), (r2 I:net.minecraft.class_5250) DIRECT call: su.catlean.s7.O(net.minecraft.class_640, long, net.minecraft.class_5250):net.minecraft.class_5250
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public final net.minecraft.class_5250 g(long r11, @org.jetbrains.annotations.NotNull net.minecraft.class_640 r13) {
        /*
            r10 = this;
            long r0 = su.catlean.s7.a
            r1 = r11
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 115247881178498(0x68d13d04cd82, double:5.694001884629E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = r13
            r1 = 15331(0x3be3, float:2.1483E-41)
            r2 = 4545440474536007900(0x3f14a6076066d8dc, double:7.876796744352453E-5)
            r3 = r11
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/s7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "r"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L51
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)     // Catch: java.lang.NumberFormatException -> L51
            r0 = r13
            net.minecraft.class_2561 r0 = r0.method_2971()     // Catch: java.lang.NumberFormatException -> L51
            if (r0 == 0) goto L5b
            r0 = r10
            r1 = r13
            r2 = r13
            net.minecraft.class_2561 r2 = r2.method_2971()     // Catch: java.lang.NumberFormatException -> L51
            r3 = r2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.NumberFormatException -> L51
            net.minecraft.class_5250 r2 = r2.method_27661()     // Catch: java.lang.NumberFormatException -> L51
            r3 = r2
            r4 = 21837(0x554d, float:3.06E-41)
            r5 = 5581611710244533873(0x4d75de471f493671, double:1.4393736980984333E65)
            r6 = r11
            long r5 = r5 ^ r6
            java.lang.String r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/s7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "r"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r4, r5)     // Catch: java.lang.NumberFormatException -> L51
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.NumberFormatException -> L51
            r3 = r14
            r4 = r3; r3 = r2; r2 = r4;      // Catch: java.lang.NumberFormatException -> L51
            r-1.O(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L51
            goto L8c
        L51:
            r1 = 4968018661431032184(0x44f1f2a6a01bb978, double:1.3561015824273863E24)
            r2 = r11
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5b:
            r0 = r10
            r1 = r13
            r2 = r13
            net.minecraft.class_268 r2 = r2.method_2955()
            net.minecraft.class_270 r2 = (net.minecraft.class_270) r2
            r3 = r13
            com.mojang.authlib.GameProfile r3 = r3.method_2966()
            java.lang.String r3 = r3.name()
            net.minecraft.class_5250 r3 = net.minecraft.class_2561.method_43470(r3)
            net.minecraft.class_2561 r3 = (net.minecraft.class_2561) r3
            net.minecraft.class_5250 r2 = net.minecraft.class_268.method_1142(r2, r3)
            r3 = r2
            r4 = 23252(0x5ad4, float:3.2583E-41)
            r5 = 6100612651370658285(0x54a9bae24d33b9ed, double:7.034749405422051E99)
            r6 = r11
            long r5 = r5 ^ r6
            java.lang.String r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/s7;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "r"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r4, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r3 = r14
            r4 = r3; r3 = r2; r2 = r4; 
            r-1.O(r0, r1, r2)
        L8c:
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s7.g(long, net.minecraft.class_640):net.minecraft.class_5250");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_5250] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, net.minecraft.class_5250] */
    private final class_5250 O(class_640 class_640Var, long j, class_5250 class_5250Var) {
        ?? r0;
        ?? Method_27692 = a ^ j;
        try {
            if (class_640Var.method_2958() == class_1934.field_9219) {
                Method_27692 = class_5250Var.method_27692(class_124.field_1056);
                r0 = Method_27692;
            } else {
                r0 = class_5250Var;
            }
            ?? r11 = r0;
            Intrinsics.checkNotNull(r11);
            return r11;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_27692, -239289944032935644L, Method_27692) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    private final void v(String[] strArr, long j) {
        Object length = a ^ j;
        try {
            length = strArr.length;
            if (length < 2) {
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(length, -7998400960029823626L, length) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
    private final boolean M(long j, String str) {
        long j2 = a ^ j;
        long j3 = j2 ^ 18858525433874L;
        String str2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8323227917929033899L, j2) /* invoke-custom */;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20031, 3557114060753541953L ^ j2) /* invoke-custom */);
        Object objMethod_15440 = class_3544.method_15440(lowerCase);
        Intrinsics.checkNotNullExpressionValue(objMethod_15440, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31907, 7729336395648870890L ^ j2) /* invoke-custom */);
        try {
            try {
                CharSequence charSequence = (CharSequence) objMethod_15440;
                if (str2 != null) {
                    objMethod_15440 = StringsKt.contains$default(charSequence, (CharSequence) "§", false, 2, (Object) null);
                    if (objMethod_15440 != 0) {
                        return false;
                    }
                    charSequence = (CharSequence) objMethod_15440;
                }
                for (String str3 : StringsKt.split$default(charSequence, new String[]{" "}, false, 0, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14863, 8152868012406845866L ^ j2) /* invoke-custom */, (Object) null)) {
                    Stream stream = Arrays.stream(h);
                    Function1 function1 = (v1) -> {
                        return u(r1, v1);
                    };
                    boolean zAnyMatch = stream.anyMatch((v1) -> {
                        return F(r1, v1);
                    });
                    while (zAnyMatch) {
                        zAnyMatch = true;
                        if (j2 >= 0 && str2 != null) {
                            return true;
                        }
                    }
                }
                for (Object obj : zf.v(j3).field_3944.method_2880()) {
                    Intrinsics.checkNotNullExpressionValue(obj, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26412, 5791104297859002982L ^ j2) /* invoke-custom */);
                    boolean zAreEqual = Intrinsics.areEqual(((class_640) obj).method_2966().name(), (Object) objMethod_15440);
                    while (zAreEqual) {
                        zAreEqual = true;
                        if (j2 >= 0 && str2 != null) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (NumberFormatException unused) {
                objMethod_15440 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_15440, 8266302703283507006L, j2) /* invoke-custom */;
                throw objMethod_15440;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_15440, 8266302703283507006L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.minecraft.class_1657] */
    @Nullable
    public final class_1657 q(int a2, @NotNull String name, int a3, short a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 93746405770469L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1598129414755210501L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26621, 1828274487060080838L ^ j) /* invoke-custom */);
        for (?? r0 : zf.z(j2).method_18456()) {
            while (true) {
                class_742 class_742Var = (class_742) r0;
                if (Intrinsics.areEqual(name, class_742Var.method_5477().getString())) {
                    r0 = (class_1657) class_742Var;
                    if (a2 >= 0 && str != null) {
                        return r0;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03e2, code lost:
    
        if (r0 < 0) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01c9 A[EXC_TOP_SPLITTER, PHI: r0
  0x01c9: PHI (r0v132 ??) = (r0v98 ??), (r0v29 ??) binds: [B:40:0x01c6, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02aa A[EXC_TOP_SPLITTER, PHI: r0
  0x02aa: PHI (r0v125 ??) = (r0v90 ??), (r0v29 ??) binds: [B:80:0x02a7, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038b A[EXC_TOP_SPLITTER, PHI: r0
  0x038b: PHI (r0v115 ??) = (r0v82 ??), (r0v29 ??) binds: [B:120:0x0388, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0304 A[EXC_TOP_SPLITTER, PHI: r0
  0x0304: PHI (r0v108 ??) = (r0v59 ??), (r0v29 ??) binds: [B:96:0x0301, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0223 A[EXC_TOP_SPLITTER, PHI: r0
  0x0223: PHI (r0v99 ??) = (r0v66 ??), (r0v29 ??) binds: [B:56:0x0220, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x019c A[EXC_TOP_SPLITTER, PHI: r0
  0x019c: PHI (r0v92 ??) = (r0v34 ??), (r0v29 ??) binds: [B:32:0x0199, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027d A[EXC_TOP_SPLITTER, PHI: r0
  0x027d: PHI (r0v83 ??) = (r0v50 ??), (r0v29 ??) binds: [B:72:0x027a, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035e A[EXC_TOP_SPLITTER, PHI: r0
  0x035e: PHI (r0v74 ??) = (r0v43 ??), (r0v29 ??) binds: [B:112:0x035b, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b8 A[EXC_TOP_SPLITTER, PHI: r0
  0x03b8: PHI (r0v67 ??) = (r0v123 ??), (r0v29 ??) binds: [B:128:0x03b5, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01f6 A[EXC_TOP_SPLITTER, PHI: r0
  0x01f6: PHI (r0v60 ??) = (r0v139 ??), (r0v29 ??) binds: [B:48:0x01f3, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d7 A[EXC_TOP_SPLITTER, PHI: r0
  0x02d7: PHI (r0v51 ??) = (r0v131 ??), (r0v29 ??) binds: [B:88:0x02d4, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0250 A[EXC_TOP_SPLITTER, PHI: r0
  0x0250: PHI (r0v44 ??) = (r0v106 ??), (r0v29 ??) binds: [B:64:0x024d, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0331 A[EXC_TOP_SPLITTER, PHI: r0
  0x0331: PHI (r0v35 ??) = (r0v114 ??), (r0v29 ??) binds: [B:104:0x032e, B:18:0x00df] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x047f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0186  */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [int] */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [int] */
    /* JADX WARN: Type inference failed for: r0v123, types: [int] */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v129, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v131, types: [int] */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v139, types: [int] */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v148, types: [int] */
    /* JADX WARN: Type inference failed for: r0v149, types: [int] */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [int] */
    /* JADX WARN: Type inference failed for: r0v82, types: [int] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v90, types: [int] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [int] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int u(su.catlean.ds r11, long r12) {
        /*
            Method dump skipped, instruction units count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s7.u(su.catlean.ds, long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.ds] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean G(su.catlean.ds r6) {
        /*
            long r0 = su.catlean.s7.a
            r1 = 33568249880487(0x1e87b79c1fa7, double:1.6584919056963E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = 7675958970866346415(0x6a867c03d8f629af, double:1.409902298151646E205)
            r1 = r7
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r9 = r0
            r0 = r6
            r1 = r9
            if (r1 == 0) goto L3b
            net.minecraft.class_640 r0 = r0.o()     // Catch: java.lang.NumberFormatException -> L23 java.lang.NumberFormatException -> L31
            net.minecraft.class_268 r0 = r0.method_2955()     // Catch: java.lang.NumberFormatException -> L23 java.lang.NumberFormatException -> L31
            if (r0 != 0) goto L56
            goto L2d
        L23:
            r1 = 7760750206133507642(0x6bb3b931bb20963a, double:6.484240236635723E210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L31
            throw r0     // Catch: java.lang.NumberFormatException -> L31
        L2d:
            r0 = r6
            goto L3b
        L31:
            r1 = 7760750206133507642(0x6bb3b931bb20963a, double:6.484240236635723E210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L3b:
            boolean r0 = r0.T()     // Catch: java.lang.NumberFormatException -> L48
            r1 = r9
            if (r1 == 0) goto L53
            if (r0 == 0) goto L56
            goto L52
        L48:
            r1 = 7760750206133507642(0x6bb3b931bb20963a, double:6.484240236635723E210)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L52:
            r0 = 1
        L53:
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s7.G(su.catlean.ds):boolean");
    }

    private static final boolean O(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean u(String str, String str2) {
        Intrinsics.checkNotNull(str2);
        return StringsKt.startsWith$default(str, str2, false, 2, (Object) null);
    }

    private static final boolean F(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final int C(long a2, s7 $this, ds employee) {
        return $this.u(employee, (a ^ a2) ^ 81812450278618L);
    }

    public static final boolean C(long a2, s7 $this, String name1, int a3) {
        return $this.M((((a2 << 32) | ((((long) a3) << 32) >>> 32)) ^ a) ^ 78559685655412L, name1);
    }

    public static final CopyOnWriteArrayList F() {
        return x;
    }

    public static final void E(long a2, s7 $this, String[] stringArray) {
        $this.v(stringArray, (a ^ a2) ^ 78127548642294L);
    }

    static {
        int i;
        long j = a ^ 14052665268301L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[43];
        int i3 = 0;
        String str = "ÁqK\u0005ù\u0096ÿþ4Vô\u0014\u008d£ì\u0001\u009dÓ¿þD\u0002jÈ\u00108î1pMÂ0_'JÊf¹\u008awÚ@\u0099\u0016UZx\u0012þ<\u0095)PX×}\u008eR§ì\u009b\u0098\u008a¯6ß¦Òù\u001a~Á«¦dÝî\u0001º<î*à¬X\u00826WlGyñxÞ\\\u0007Ú\u0086HM]Óòª<t0Ê\u00936r\u0081Ç=\u0083Íçf\u000f·\u00adp¡r«\rºjè\u0010ÀØr\"uh[µ\u0007ëFÅÿå\u0011\u0084ý\u001b\u008dH\u008bQ*£\u0013\u0010\u007f¿ÁMç1\u00187\u0013tr{¸\u00115¾ \u000e\u0096¨gÔ»z¦i$è»T\b?³\u0010\u0017e*ÐÝiy°\u0016ï\u0001\u0099\u009a\u009eÓ\u0018-\u00196:\"\u0005ùºc\u0004¤w~éL3dr\u008có\u0017²\u00adÏ\u0010µ`3ä¹f'ò\u001f\u0081ý\u0086\u0089õ\u001f§\u0010T\u0086¡¦oF\u0081ág\u0095Ú(§ó\u000fª\u0010;\nG\u008a¤üåUi§«z\n\u009c>\u0012 \u001e@2\u0002ò\b=è^S>¹yí{f\u00963\u000b\u0098\u008fq\b\u0095ôi\u0012ç¹G<\u008c ª}[¼(4Ã°\u00ad\u00926\u0096}2\u0097WÁ\u009aË\u0011X\fd£S\u0093TÚÁ·Ì¨ \nd\u00ad\u008aG^\u0004=\u0090^û\u001d4÷\u0000³i\u00897éöûþB[\u0003\u0005È½á\u008eê\u0018\u0082db)äÎÂØSC!]7$\u001da\tü(DÆ4i\u0018\u0018þ×qÍf\u009bsf\u00869p¾#éÓõh;f\u009a*½åÝ\u0010\u001a¹BäGG¬*\u0013Hÿ&eyÈ5 ô¾¯yP:]\u0016Çâ\u009b\u001cyLÝ\u0010uIÖþØyw\u009d\u007fæwí\u001a\u0088E\r\u0018½\u0007ße7ÌZÁJ¾cå>6»9<p\u000fæp¥Ë² /y\u0011\u0095\u001e¯OI.S\u0096VzÝ'Ó\u00062ç\u0003\fÐÄMós7Aßt¹\u009b\u0010\f\u001f6Èd´X{·ÔâÃ«E\u0089_(%ûÔ|%uk³¸da+a\u0082:OQ\u0090¦\u0015\u0094§ÃW\u0001\u008fÖ¢¡\u0016ýOå\u00adf\u0006,i-O(\u0085åG\u0080<eË©9\u0090.¯ú=\u001dÖ¦¦ù\u009d`t¬Ù\u0011\u0097üÆâ\u009cò\u0092~¥\u0082zxE96\u0010û]ö\u000eÛ&\u0095\u0014¿¹\u0001n¾Ö\tZ\u0018AÄ\u008b:ØÐö\u0085)¼;k¹¿L\u0098HR±Éíd4Ø\u0018B\u0014Àã,>ºoó¸\u0017Ñ×ÙÁ?u\u009d\t>\"©¯Û\u0018Ç\u0087ª\u0098¸0h\u008dg`\t¨\u001d\u0099ð«¤pÖ&\u008f«3\u0003\u0010¸5eîK8jf\r¬GÓ¨\u009b(c\u0010îÈî\u0093gÓÝ÷\u009d%\u0080\u0002CC\u0084Ç\u0010»Å!\u008b/Â3\u0092÷\u0010\u000f¸¾ÎÝ\u0000\u0010_\u0081~Ðé>\u0097\u0006O\u0015S\u009døä)Ù Á\u0011\u0080×Ö>\u001e~pj-âÏ¤uë>\u008c®¶¯þ«\u000b»\u001d;B\u007f\u0081µ4 Z\u0017®\u001e\u0083\u0094\f\u000f\u0083\u008eq\u001dr|\u008eâ\u0087\u0005M[æ\fé ql\u001fûàñVF \u00053C\u008f¾mÙ6Îw\u0085\u008eÆ\u001c\u0085Ë.\u0087\u001b\u0001\u0003mÜpµú\u0085ßÓe<&\u0010¹öÈ\u009f\u009aêéëCµ%î\u0014\u0017\tÈ\u0010ýîê&\u0096dI½y{£\u0012µ&ïý ÷#\u009at\u001f~\u0085òLñ\u0010\u0013:ØË·éÞËw²ç\u001amæ\u000b|óÇµ8\u008c\u0010\u0085|Y\u00ad3\u0001\b+8ºÈ¶^\u009dä( \u0004nUí;Ò\u0015Ükd¤\u000bÂ¬OZ°\u0014K\u0092Ñ\\:©+ç}\u0092Ró\u009e£×ÑÄÚ\u001bY0:æµ×Ôáq\u001a¬+1\u000eºÐ\tæÎ\u0000lv.Ðs@j\u0088ÖYä2\u0080ç§@¥®øg:jåâ-{ôª\u0002BtI\r}\u0082¨R,«í\u0006rf\u008dH0*Ücá-(\u000f'(5?QOÈÈ\u000bÛ\u0006ë±I¯\u009a?@\u0081Y\u0007\u0098«³CàßA\u0089\u0092Úå(ÂE\u001bÄ{À\u0018h#j7l\b\b}-20ß\u001cGr#\u009b\u008dìl\u0098\bÄ=\u001btÇÌKª:È©lÂDÂ\u0090\u0086ev8\u0005¡Ý\u008de_Ù\u001f¯\u009cÛMd\";\n¨(ï\u0099\u000e³?c \u009f3µJX\u001eú\u0013<\u0080lI3A|\u009b\u000bDz\u0089êXÕ\u0080\u0096¯Dì°¶\u001dµÒ\u0010g\u0018\u0091s\u001dÏù¯\u0082a5ñ÷?#²";
        int length = "ÁqK\u0005ù\u0096ÿþ4Vô\u0014\u008d£ì\u0001\u009dÓ¿þD\u0002jÈ\u00108î1pMÂ0_'JÊf¹\u008awÚ@\u0099\u0016UZx\u0012þ<\u0095)PX×}\u008eR§ì\u009b\u0098\u008a¯6ß¦Òù\u001a~Á«¦dÝî\u0001º<î*à¬X\u00826WlGyñxÞ\\\u0007Ú\u0086HM]Óòª<t0Ê\u00936r\u0081Ç=\u0083Íçf\u000f·\u00adp¡r«\rºjè\u0010ÀØr\"uh[µ\u0007ëFÅÿå\u0011\u0084ý\u001b\u008dH\u008bQ*£\u0013\u0010\u007f¿ÁMç1\u00187\u0013tr{¸\u00115¾ \u000e\u0096¨gÔ»z¦i$è»T\b?³\u0010\u0017e*ÐÝiy°\u0016ï\u0001\u0099\u009a\u009eÓ\u0018-\u00196:\"\u0005ùºc\u0004¤w~éL3dr\u008có\u0017²\u00adÏ\u0010µ`3ä¹f'ò\u001f\u0081ý\u0086\u0089õ\u001f§\u0010T\u0086¡¦oF\u0081ág\u0095Ú(§ó\u000fª\u0010;\nG\u008a¤üåUi§«z\n\u009c>\u0012 \u001e@2\u0002ò\b=è^S>¹yí{f\u00963\u000b\u0098\u008fq\b\u0095ôi\u0012ç¹G<\u008c ª}[¼(4Ã°\u00ad\u00926\u0096}2\u0097WÁ\u009aË\u0011X\fd£S\u0093TÚÁ·Ì¨ \nd\u00ad\u008aG^\u0004=\u0090^û\u001d4÷\u0000³i\u00897éöûþB[\u0003\u0005È½á\u008eê\u0018\u0082db)äÎÂØSC!]7$\u001da\tü(DÆ4i\u0018\u0018þ×qÍf\u009bsf\u00869p¾#éÓõh;f\u009a*½åÝ\u0010\u001a¹BäGG¬*\u0013Hÿ&eyÈ5 ô¾¯yP:]\u0016Çâ\u009b\u001cyLÝ\u0010uIÖþØyw\u009d\u007fæwí\u001a\u0088E\r\u0018½\u0007ße7ÌZÁJ¾cå>6»9<p\u000fæp¥Ë² /y\u0011\u0095\u001e¯OI.S\u0096VzÝ'Ó\u00062ç\u0003\fÐÄMós7Aßt¹\u009b\u0010\f\u001f6Èd´X{·ÔâÃ«E\u0089_(%ûÔ|%uk³¸da+a\u0082:OQ\u0090¦\u0015\u0094§ÃW\u0001\u008fÖ¢¡\u0016ýOå\u00adf\u0006,i-O(\u0085åG\u0080<eË©9\u0090.¯ú=\u001dÖ¦¦ù\u009d`t¬Ù\u0011\u0097üÆâ\u009cò\u0092~¥\u0082zxE96\u0010û]ö\u000eÛ&\u0095\u0014¿¹\u0001n¾Ö\tZ\u0018AÄ\u008b:ØÐö\u0085)¼;k¹¿L\u0098HR±Éíd4Ø\u0018B\u0014Àã,>ºoó¸\u0017Ñ×ÙÁ?u\u009d\t>\"©¯Û\u0018Ç\u0087ª\u0098¸0h\u008dg`\t¨\u001d\u0099ð«¤pÖ&\u008f«3\u0003\u0010¸5eîK8jf\r¬GÓ¨\u009b(c\u0010îÈî\u0093gÓÝ÷\u009d%\u0080\u0002CC\u0084Ç\u0010»Å!\u008b/Â3\u0092÷\u0010\u000f¸¾ÎÝ\u0000\u0010_\u0081~Ðé>\u0097\u0006O\u0015S\u009døä)Ù Á\u0011\u0080×Ö>\u001e~pj-âÏ¤uë>\u008c®¶¯þ«\u000b»\u001d;B\u007f\u0081µ4 Z\u0017®\u001e\u0083\u0094\f\u000f\u0083\u008eq\u001dr|\u008eâ\u0087\u0005M[æ\fé ql\u001fûàñVF \u00053C\u008f¾mÙ6Îw\u0085\u008eÆ\u001c\u0085Ë.\u0087\u001b\u0001\u0003mÜpµú\u0085ßÓe<&\u0010¹öÈ\u009f\u009aêéëCµ%î\u0014\u0017\tÈ\u0010ýîê&\u0096dI½y{£\u0012µ&ïý ÷#\u009at\u001f~\u0085òLñ\u0010\u0013:ØË·éÞËw²ç\u001amæ\u000b|óÇµ8\u008c\u0010\u0085|Y\u00ad3\u0001\b+8ºÈ¶^\u009dä( \u0004nUí;Ò\u0015Ükd¤\u000bÂ¬OZ°\u0014K\u0092Ñ\\:©+ç}\u0092Ró\u009e£×ÑÄÚ\u001bY0:æµ×Ôáq\u001a¬+1\u000eºÐ\tæÎ\u0000lv.Ðs@j\u0088ÖYä2\u0080ç§@¥®øg:jåâ-{ôª\u0002BtI\r}\u0082¨R,«í\u0006rf\u008dH0*Ücá-(\u000f'(5?QOÈÈ\u000bÛ\u0006ë±I¯\u009a?@\u0081Y\u0007\u0098«³CàßA\u0089\u0092Úå(ÂE\u001bÄ{À\u0018h#j7l\b\b}-20ß\u001cGr#\u009b\u008dìl\u0098\bÄ=\u001btÇÌKª:È©lÂDÂ\u0090\u0086ev8\u0005¡Ý\u008de_Ù\u001f¯\u009cÛMd\";\n¨(ï\u0099\u000e³?c \u009f3µJX\u001eú\u0013<\u0080lI3A|\u009b\u000bDz\u0089êXÕ\u0080\u0096¯Dì°¶\u001dµÒ\u0010g\u0018\u0091s\u001dÏù¯\u0082a5ñ÷?#²".length();
        char cCharAt = 24;
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
                            c = new String[43];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[18];
                            int i9 = 0;
                            String str3 = "eË\u0094.µ³>É\u008cÙù\u0086|K,ñ\u001f\u0012\u009bOà\u0001eÇ×©26¯4z8ï^\u0016ítbþ\u00adS\rV [®ÑQ\u0001Äì\u0019Aõ²\u009diV\u0003×{Q\u0089?+adkÞ4)=¯\u001a6èß·à²ÌWÑÓN?Ç&Å\u0000ÑÊÅ¯¾;Ã¢Wã}2\u0018Ñ\u0099\b\u0082¿É\u0081BÞ\u0091JÄ\u0089\u0000ö\u009a\u0097\u0011Àz¹ÊÇqÔ";
                            int length2 = "eË\u0094.µ³>É\u008cÙù\u0086|K,ñ\u001f\u0012\u009bOà\u0001eÇ×©26¯4z8ï^\u0016ítbþ\u00adS\rV [®ÑQ\u0001Äì\u0019Aõ²\u009diV\u0003×{Q\u0089?+adkÞ4)=¯\u001a6èß·à²ÌWÑÓN?Ç&Å\u0000ÑÊÅ¯¾;Ã¢Wã}2\u0018Ñ\u0099\b\u0082¿É\u0081BÞ\u0091JÄ\u0089\u0000ö\u009a\u0097\u0011Àz¹ÊÇqÔ".length();
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
                                                f = new Integer[18];
                                                r = new s7();
                                                x = new CopyOnWriteArrayList();
                                                R = new ArrayList();
                                                String[] strArr2 = new String[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29715, 2405398651168645461L ^ j) /* invoke-custom */];
                                                strArr2[0] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16132, 5738420539465036969L ^ j) /* invoke-custom */;
                                                strArr2[1] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20168, 2743026779890255179L ^ j) /* invoke-custom */;
                                                strArr2[2] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21002, 3052815695226247568L ^ j) /* invoke-custom */;
                                                strArr2[3] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21562, 2627163004287164316L ^ j) /* invoke-custom */;
                                                strArr2[4] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2390, 8925529144190223043L ^ j) /* invoke-custom */;
                                                strArr2[5] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28276, 1469547492519585236L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18743, 4840033079204207739L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19853, 5391424195850962435L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2499, 2302836175295224967L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30505, 5048927287915494540L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6693, 2657827395224145775L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10609, 2187256281071215315L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17364, 8535713919445784219L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27808, 3610518812935661326L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11682, 3020422183246149873L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7174, 6203439385056073602L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26948, 3744699081920609287L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12571, 5276377805554743936L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28081, 268304671217055985L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4513, 6942276865723456013L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29492, 8232237544804312694L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23400, 4830729911009480955L ^ j) /* invoke-custom */;
                                                strArr2[(int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23729, 7874331040856459764L ^ j) /* invoke-custom */] = (String) a(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8753, 7523873312439167409L ^ j) /* invoke-custom */;
                                                h = strArr2;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "vG\u0005\u007fd#ød>\u0013.6`{qÍ";
                                                length2 = "vG\u0005\u007fd#ød>\u0013.6`{qÍ".length();
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
                        str = "P-\r¤ºH+ÜÂ<ä~ä\u008dQfñ!ç\u0017x,Ù_ (\u001aë\f@Wi¯®EM\u0006 ýÞé\u00021\u001a\u0016q\u000fd]YVà»\u0001&\u0088ê";
                        length = "P-\r¤ºH+ÜÂ<ä~ä\u008dQfñ!ç\u0017x,Ù_ (\u001aë\f@Wi¯®EM\u0006 ýÞé\u00021\u001a\u0016q\u000fd]YVà»\u0001&\u0088ê".length();
                        cCharAt = 24;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 9751;
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
                throw new RuntimeException("su/catlean/s7", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/s7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 30928;
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
                    throw new RuntimeException("su/catlean/s7", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/s7"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
