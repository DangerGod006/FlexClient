package su.catlean;

import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sg.class */
public final class sg implements ym {

    @NotNull
    public static final sg H;

    @NotNull
    private static final List o;

    @NotNull
    private static final bj u;

    @NotNull
    private static final bj F;

    @NotNull
    private static final bj l;

    @NotNull
    private static final bj g;

    @NotNull
    private static final bj B;

    @NotNull
    private static final bj n;
    private static boolean w;
    private static int O;
    private static final long a = yz.a(-7762248569282793520L, 4859372621254086896L, MethodHandles.lookup().lookupClass()).a(160804293708231L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    private sg() {
    }

    @NotNull
    public final bj C() {
        return u;
    }

    @NotNull
    public final bj B() {
        return F;
    }

    @NotNull
    public final bj L() {
        return l;
    }

    @NotNull
    public final bj A() {
        return g;
    }

    @NotNull
    public final bj x() {
        return B;
    }

    @NotNull
    public final bj g() {
        return n;
    }

    public final boolean u() {
        return w;
    }

    public final void t(boolean z) {
        w = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public final void A(@NotNull String str, long j, @NotNull String str2, int i, @NotNull ys ysVar, @Nullable class_1799 class_1799Var) {
        long j2 = a ^ j;
        long j3 = j2 ^ 67089986010788L;
        long j4 = j2 ^ 33901693490843L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j4 << 16) >>> 48);
        int i4 = (int) ((j4 << 32) >>> 32);
        ?? U = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7077164270549961484L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2331, 6430079183675148741L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(str2, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9451, 6221162073401189424L ^ j2) /* invoke-custom */);
        try {
            Intrinsics.checkNotNullParameter(ysVar, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(515, 2013252795683783380L ^ j2) /* invoke-custom */);
            U = pp.n.U((short) i2, (char) i3, i4);
            ?? r0 = U;
            if (U != 0) {
                if (U == 0) {
                    return;
                } else {
                    r0 = w;
                }
            }
            try {
                if (r0 != 0) {
                    return;
                }
                try {
                    class_310 class_310VarF = zf.F(j3);
                    ?? r1 = U;
                    ?? r12 = r1;
                    if (j2 > 0) {
                        if (r1 != 0) {
                            r0 = class_310VarF.field_1724;
                            if (r0 == 0) {
                                return;
                            } else {
                                class_310VarF = zf.F(j3);
                            }
                        }
                        r12 = str;
                    }
                    class_310VarF.execute(() -> {
                        q(r1, r2, r3, r4, r5);
                    });
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7084203655755953750L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7084203655755953750L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(U, 7084203655755953750L, j2) /* invoke-custom */;
        }
    }

    public static void J(int i, sg sgVar, String str, String str2, int i2, byte b2, int i3, ys ysVar, class_1799 class_1799Var, int i4, Object obj) {
        long j = (((((long) i) << 32) | ((((long) i2) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a;
        long j2 = j ^ 25265957035311L;
        if ((i4 & (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12404, 97110979414112056L ^ j) /* invoke-custom */) != 0) {
            class_1799Var = null;
        }
        sgVar.A(str, j2, str2, i3, ysVar, class_1799Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    @Flow
    public final void C(@NotNull Render2DEvent e2) {
        long j = a ^ 73881034010694L;
        long j2 = j ^ 55215087039299L;
        long j3 = j ^ 1095425635985L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j3 << 16) >>> 48);
        int i3 = (int) ((j3 << 32) >>> 32);
        Object size = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1166383534095923477L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        float fMethod_4502 = (zf.F(j2).method_22683().method_4502() / 2.0f) + (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3276, 5250884917147862285L ^ j) /* invoke-custom */;
        try {
            try {
                List list = o;
                if (size != 0) {
                    size = list.size();
                    if (size > (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29898, 680388552682077446L ^ j) /* invoke-custom */) {
                        o.removeFirst();
                    }
                    list = o;
                }
                Iterator it = Lists.newArrayList(list).iterator();
                Intrinsics.checkNotNullExpressionValue(it, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15625, 1040670329236811837L ^ j) /* invoke-custom */);
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12499, 5337988897604074988L ^ j) /* invoke-custom */);
                    M((l1) next, (short) i, e2.getContext(), fMethod_4502 + (o.size() * (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9300, 394961826222288286L ^ j) /* invoke-custom */), (char) i2, i3);
                    fMethod_4502 -= 16.0f;
                    if (size == 0) {
                        break;
                    }
                }
                synchronized (o) {
                    List list2 = o;
                    Function1 function1 = sg::K;
                    list2.removeIf((v1) -> {
                        return t(r1, v1);
                    });
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(size, -1173422432947143759L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(size, -1173422432947143759L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0298: INVOKE 
          (r-1 I:su.catlean.c6)
          (r0 I:net.minecraft.class_332)
          (r1 I:java.lang.String)
          (r2 I:long)
          (r3 I:float)
          (r4 I:float)
          (r5 I:java.awt.Color)
         VIRTUAL call: su.catlean.c6.e(net.minecraft.class_332, java.lang.String, long, float, float, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void M(su.catlean.l1 r24, short r25, net.minecraft.class_332 r26, float r27, char r28, int r29) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sg.M(su.catlean.l1, short, net.minecraft.class_332, float, char, int):void");
    }

    private final float a(float f2, float f3) {
        return f2 + ((f3 - f2) / 8.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void q(java.lang.String r14, java.lang.String r15, su.catlean.ys r16, int r17, net.minecraft.class_1799 r18) {
        /*
            long r0 = su.catlean.sg.a
            r1 = 78872668598490(0x47bbf964f0da, double:3.89682759503356E-310)
            long r0 = r0 ^ r1
            r19 = r0
            r0 = r19
            r1 = r0; r1 = r0; 
            r2 = 136943349014325(0x7c8c9bac1f35, double:6.76590041744257E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            r21 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r23 = r2
            r1 = r0; r3 = r0; 
            r2 = 25622412090378(0x174daec55c0a, double:1.2659153577443E-310)
            long r1 = r1 ^ r2
            r24 = r1
            r0 = -5815228139655903625(0xaf4c28d13ff44677, double:-7.421560525277634E-81)
            r1 = r19
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            java.util.List r1 = su.catlean.sg.o
            su.catlean.l1 r2 = new su.catlean.l1
            r3 = r2
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = 26324(0x66d4, float:3.6888E-41)
            r9 = 996656847109992331(0xdd4d61f36f3af8b, double:4.8825474040071085E-242)
            r10 = r19
            long r9 = r9 ^ r10
            int r8 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/sg;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "x"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r8, r9)
            int r7 = r7 * r8
            r8 = r21
            r9 = r8; r8 = r7; r7 = r9; 
            r9 = r23
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r1.add(r2)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto La8
            r0 = r16
            int[] r1 = su.catlean.sw.M     // Catch: java.lang.NumberFormatException -> L84 java.lang.NumberFormatException -> L9d
            r2 = r0; r0 = r1; r1 = r2;      // Catch: java.lang.NumberFormatException -> L84 java.lang.NumberFormatException -> L9d
            int r1 = r1.ordinal()     // Catch: java.lang.NumberFormatException -> L84 java.lang.NumberFormatException -> L9d
            r0 = r0[r1]     // Catch: java.lang.NumberFormatException -> L84 java.lang.NumberFormatException -> L9d
            switch(r0) {
                case 1: goto L8f;
                case 2: goto Lad;
                default: goto Lc6;
            }     // Catch: java.lang.NumberFormatException -> L84 java.lang.NumberFormatException -> L9d
        L84:
            r1 = -5824511074382595283(0xaf2b2e099518bb2d, double:-1.7908449193603422E-81)
            r2 = r19
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L9d
            throw r0     // Catch: java.lang.NumberFormatException -> L9d
        L8f:
            su.catlean.d2 r0 = su.catlean.d2.O     // Catch: java.lang.NumberFormatException -> L9d
            su.catlean.lp r0 = r0.d()     // Catch: java.lang.NumberFormatException -> L9d
            r1 = r24
            r0.L(r1)     // Catch: java.lang.NumberFormatException -> L9d
            goto La8
        L9d:
            r1 = -5824511074382595283(0xaf2b2e099518bb2d, double:-1.7908449193603422E-81)
            r2 = r19
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La8:
            r0 = r26
            if (r0 != 0) goto Lc6
        Lad:
            su.catlean.d2 r0 = su.catlean.d2.O     // Catch: java.lang.NumberFormatException -> Lbb
            su.catlean.lp r0 = r0.s()     // Catch: java.lang.NumberFormatException -> Lbb
            r1 = r24
            r0.L(r1)     // Catch: java.lang.NumberFormatException -> Lbb
            goto Lc6
        Lbb:
            r1 = -5824511074382595283(0xaf2b2e099518bb2d, double:-1.7908449193603422E-81)
            r2 = r19
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sg.q(java.lang.String, java.lang.String, su.catlean.ys, int, net.minecraft.class_1799):void");
    }

    private static final boolean K(l1 l1Var) {
        long j = a ^ 43880234139278L;
        Intrinsics.checkNotNullParameter(l1Var, (String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4377, 467835329285575402L ^ j) /* invoke-custom */);
        return l1Var.X(j ^ 132057202750466L);
    }

    private static final boolean t(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i;
        long j = a ^ 15786382409512L;
        long j2 = j ^ 76035053617063L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, 6943436246830817799L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[13];
        int i3 = 0;
        String str = "V¬Ç½Å¯\u000b\tÏ`\u0090¼~ü \u0090\u0010T\u0015\u0015@\u001b\u0003^\u001aËT\u0099Z\u0002Íª\u008e\u0010&BU¸Z?(¥`õÖ½\\!ýP\u0018S\u0087\u00adÀ\u008aJ\u00adÖ¨\u0086[£R\u0084U÷ì·l\u0015Ý\u001dÐ\u009e\u0010\u009aÐ\u001e¾÷>ó\u009e¼¸\u0083f\u00079à\u00ad\u0010\u0011\u0097»¼\u0017Ñ\u000fþZ§\u0097ñÎ\u001e\u008d^\u0010\u0014\u001f\u0003¹ßîoØBç\u001cXâl\u001e²\u0010Ò\u008bûÇÿ¦=\u008a.§ãDÝê/° ×a¯¬F±\u009d\u000búÒ\u00826Ù0ÏØ¶\"\u0080\u0001þf}|u4÷ðéìÐ×\u0010ÈÎM6ÕÖÜj\u0000Nß\u000eÜ\u0017\u0089Í æÖ\u0094ÔªÓ/T\\O\u007fìÐáºùÙH1\u001d1\u009e\u009dÒk\u0098\u0080\f\u0096ÖÕW";
        int length = "V¬Ç½Å¯\u000b\tÏ`\u0090¼~ü \u0090\u0010T\u0015\u0015@\u001b\u0003^\u001aËT\u0099Z\u0002Íª\u008e\u0010&BU¸Z?(¥`õÖ½\\!ýP\u0018S\u0087\u00adÀ\u008aJ\u00adÖ¨\u0086[£R\u0084U÷ì·l\u0015Ý\u001dÐ\u009e\u0010\u009aÐ\u001e¾÷>ó\u009e¼¸\u0083f\u00079à\u00ad\u0010\u0011\u0097»¼\u0017Ñ\u000fþZ§\u0097ñÎ\u001e\u008d^\u0010\u0014\u001f\u0003¹ßîoØBç\u001cXâl\u001e²\u0010Ò\u008bûÇÿ¦=\u008a.§ãDÝê/° ×a¯¬F±\u009d\u000búÒ\u00826Ù0ÏØ¶\"\u0080\u0001þf}|u4÷ðéìÐ×\u0010ÈÎM6ÕÖÜj\u0000Nß\u000eÜ\u0017\u0089Í æÖ\u0094ÔªÓ/T\\O\u007fìÐáºùÙH1\u001d1\u009e\u009dÒk\u0098\u0080\f\u0096ÖÕW".length();
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
                            c = new String[13];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[12];
                            int i9 = 0;
                            String str3 = "6Û½¤L\u00067\u009afFc\byî\u008e[\u008b©ÕÎ\u008f\u0084\u0004.[\u0085G-'CýôýIG\u001ct\u0087°\u009e\u0091n4I\r¯\u001e\u0005Y8\u0003Öb(~\u001fil°\u0088\u001dºí xq`¢_{É.;n/I\"ô(E";
                            int length2 = "6Û½¤L\u00067\u009afFc\byî\u008e[\u008b©ÕÎ\u008f\u0084\u0004.[\u0085G-'CýôýIG\u001ct\u0087°\u009e\u0091n4I\r¯\u001e\u0005Y8\u0003Öb(~\u001fil°\u0088\u001dºí xq`¢_{É.;n/I\"ô(E".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[12];
                                                H = new sg();
                                                o = new ArrayList();
                                                u = new bj((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24183, 6474069478631480359L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15605, 5904957093700680274L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, j2);
                                                F = new bj((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5845, 2872875705901175937L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, j2);
                                                l = new bj((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20623, 6098184931984347868L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, j2);
                                                g = new bj((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29150, 4140009972856664968L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, j2);
                                                B = new bj((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17892, 9099674116198303679L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, j2);
                                                n = new bj((String) a(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(833, 350322787676930328L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5977, 8444250528046977525L ^ j) /* invoke-custom */, j2);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                str3 = "Õ\"r&}\u0012ÒY<R[YÜ¦ðo";
                                                length2 = "Õ\"r&}\u0012ÒY<R[YÜ¦ðo".length();
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
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "bû±®\u001cÏ¨ïA\u008e)\u0087¥<ïÎ\u00108\u0084\u0013\u0010dòt:¶M\u0014Ñk$ ¼";
                        length = "bû±®\u001cÏ¨ïA\u008e)\u0087¥<ïÎ\u00108\u0084\u0013\u0010dòt:¶M\u0014Ñk$ ¼".length();
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

    public static void j(int i) {
        O = i;
    }

    public static int s() {
        return O;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int D() {
        return s() == 0 ? 90 : 0;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 9014;
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
                throw new RuntimeException("su/catlean/sg", e2);
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
            r1 = 0
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
            java.lang.String r1 = "su/catlean/sg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sg.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 26562;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/sg", e2);
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
            r1 = 0
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
            java.lang.String r1 = "su/catlean/sg"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sg.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
