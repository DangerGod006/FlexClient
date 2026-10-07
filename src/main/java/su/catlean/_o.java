package su.catlean;

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
import kotlin.text.Typography;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_o.class */
public final class _o extends _g {

    @NotNull
    public static final _o g;
    private static final long a = yz.a(-326384636009805114L, 7373203785871281281L, MethodHandles.lookup().lookupClass()).a(214987073862819L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private _o(char c2, long j) {
        long j2 = ((((long) c2) << 48) | ((j << 16) >>> 16)) ^ a;
        super((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5879, 4603854463563188696L ^ j2) /* invoke-custom */, jt.c(), null, 4, null, j2 ^ 1220526230706L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.fg] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Flow(priority = -10)
    private final void x(PlayerUpdateEvent playerUpdateEvent) {
        long j = a ^ 108696413001506L;
        long j2 = j ^ 117546984635735L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 110367053181767L;
        long j4 = j ^ 5259708786036L;
        long j5 = j ^ 59154030298279L;
        long j6 = j ^ 35265549037890L;
        ?? Method_6128 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2550353017258469599L, j) /* invoke-custom */;
        try {
            Method_6128 = zf.v(j6).method_6128();
            ?? Z = Method_6128;
            if (Method_6128 != 0) {
                if (Method_6128 == 0) {
                    return;
                } else {
                    Z = dm.h.Z();
                }
            }
            if (Z >= (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3753, 2936926674801757622L ^ j) /* invoke-custom */) {
                gg ggVar = gg.P;
                class_1792[] class_1792VarArr = new class_1792[(int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25069, 4012019247825543920L ^ j) /* invoke-custom */];
                class_1792 class_1792Var = class_1802.field_22028;
                Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8955, 1759618126000505755L ^ j) /* invoke-custom */);
                class_1792VarArr[0] = class_1792Var;
                class_1792 class_1792Var2 = class_1802.field_8058;
                Intrinsics.checkNotNullExpressionValue(class_1792Var2, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30592, 4283568271591446242L ^ j) /* invoke-custom */);
                class_1792VarArr[1] = class_1792Var2;
                class_1792 class_1792Var3 = class_1802.field_8523;
                Intrinsics.checkNotNullExpressionValue(class_1792Var3, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(Typography.lowSingleQuote, 6157446028616384894L ^ j) /* invoke-custom */);
                class_1792VarArr[2] = class_1792Var3;
                class_1792 class_1792Var4 = class_1802.field_8678;
                Intrinsics.checkNotNullExpressionValue(class_1792Var4, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21892, 1180233050960835815L ^ j) /* invoke-custom */);
                class_1792VarArr[3] = class_1792Var4;
                class_1792 class_1792Var5 = class_1802.field_8577;
                Intrinsics.checkNotNullExpressionValue(class_1792Var5, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32686, 510524137367281355L ^ j) /* invoke-custom */);
                class_1792VarArr[4] = class_1792Var5;
                class_1792 class_1792Var6 = class_1802.field_8873;
                Intrinsics.checkNotNullExpressionValue(class_1792Var6, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18889, 1037284383068301487L ^ j) /* invoke-custom */);
                class_1792VarArr[5] = class_1792Var6;
                ?? Y = ggVar.Y(i, class_1792VarArr, i2, (char) i3);
                try {
                    Y = Method_6128;
                    if (Y != 0) {
                        try {
                            Y = Y.R();
                            if (Y == 0) {
                                F((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13252, 2068837477975544492L ^ j) /* invoke-custom */, j3);
                            }
                            gg.N(j4, gg.P, Y.a(), 0, 2, null);
                            o8.p(o8.g, j5, 0, (byte) 0, false, () -> {
                                F(r5);
                            }, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32226, 2988489720657510140L ^ j) /* invoke-custom */, null);
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 2556751896497418697L, j) /* invoke-custom */;
                        }
                    }
                    dm.h.I(0);
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 2556751896497418697L, j) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_6128, 2556751896497418697L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(su.catlean.api.event.events.network.ReceivePacket r7) {
        /*
            r6 = this;
            long r0 = su.catlean._o.a
            r1 = 53594824384018(0x30be84781e12, double:2.6479361523038E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -1561342881981750801(0xea54feebd2e4a1ef, double:-1.6456944811085726E204)
            r1 = r8
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r7
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: java.lang.NumberFormatException -> L25
            boolean r0 = r0 instanceof net.minecraft.class_2767     // Catch: java.lang.NumberFormatException -> L25
            r1 = r10
            if (r1 == 0) goto L63
            if (r0 == 0) goto L6a
            goto L2f
        L25:
            r1 = -1564092498234230535(0xea4b3a28e6e538f9, double:-1.0670624807958534E204)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L38
            throw r0     // Catch: java.lang.NumberFormatException -> L38
        L2f:
            r0 = r7
            r1 = r10
            if (r1 == 0) goto L67
            goto L42
        L38:
            r1 = -1564092498234230535(0xea4b3a28e6e538f9, double:-1.0670624807958534E204)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L59
            throw r0     // Catch: java.lang.NumberFormatException -> L59
        L42:
            net.minecraft.class_2596 r0 = r0.getPacket()     // Catch: java.lang.NumberFormatException -> L59
            net.minecraft.class_2767 r0 = (net.minecraft.class_2767) r0     // Catch: java.lang.NumberFormatException -> L59
            net.minecraft.class_6880 r0 = r0.method_11894()     // Catch: java.lang.NumberFormatException -> L59
            java.lang.Object r0 = r0.comp_349()     // Catch: java.lang.NumberFormatException -> L59
            net.minecraft.class_6880 r1 = net.minecraft.class_3417.field_14966     // Catch: java.lang.NumberFormatException -> L59
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L59
            goto L63
        L59:
            r1 = -1564092498234230535(0xea4b3a28e6e538f9, double:-1.0670624807958534E204)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            if (r0 == 0) goto L6a
            r0 = r7
        L67:
            r0.cancel()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._o.y(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x002f: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final void C() {
        /*
            long r0 = su.catlean._o.a
            r1 = 30940737925170(0x1c23f3b17032, double:1.5286755665804E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 104144369803799(0x5eb8002ae217, double:5.14541553278436E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 104362573649490(0x5eeace215652, double:5.156196235179E-310)
            long r1 = r1 ^ r2
            r11 = r1
            net.minecraft.class_2848 r0 = new net.minecraft.class_2848
            r1 = r0
            r2 = r11
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)
            net.minecraft.class_1297 r2 = (net.minecraft.class_1297) r2
            net.minecraft.class_2848$class_2849 r3 = net.minecraft.class_2848.class_2849.field_12982
            r1.<init>(r2, r3)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r9
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
            r-1 = r11
            su.catlean.zf.v(r-1)
            r-1.method_23669()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._o.C():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static final void F(fg fgVar) {
        long j = a ^ 124105689559283L;
        long j2 = j ^ 132958411086470L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 130174358148246L;
        long j4 = j ^ 25069179716261L;
        long j5 = j ^ 43742604632950L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8883985186562846962L, j) /* invoke-custom */;
        gg ggVar = gg.P;
        class_1792 class_1792Var = class_1802.field_8833;
        Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12396, 7449655367048656604L ^ j) /* invoke-custom */);
        fg fgVarY = ggVar.Y(i, new class_1792[]{class_1792Var}, i2, (char) i3);
        Object objR = iArr;
        if (objR != 0) {
            try {
                try {
                    objR = fgVar.R();
                    if (objR == 0) {
                        g.F((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19266, 6307397460139904500L ^ j) /* invoke-custom */, j3);
                    }
                    gg.N(j4, gg.P, fgVarY.a(), 0, 2, null);
                    o8.p(o8.g, j5, 1, (byte) 0, false, _o::C, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32226, 2988469947693127981L ^ j) /* invoke-custom */, null);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -8887156456531995112L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -8887156456531995112L, j) /* invoke-custom */;
            }
        }
    }

    static {
        int i;
        long j = a ^ 65038909976290L;
        int i2 = (int) (j >>> 48);
        long j2 = ((j ^ 29748371141257L) << 16) >>> 16;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[10];
        int i4 = 0;
        String str = "[iáø}\u0094,á\u001f^\u0085sé<@Óñ\b\u0007¸ÖZÂ\u008cÈIöºï\fP\u000f\u00897B8\n\b\u0081=\u0010-hÝ\u008d(\u0082+ª9\u0083ýâ¤¯.\f0×X\u009a \u0093ÅÝò7`ù\u0096i¯\u0088[\u0088äI_\\\u0086\u0014ó¼¡\u0011Dzö¦[E\\\nN(¯,Î\u0013\u0081LN\u008fÏ\u0094%(´<\u008f7ç.<hH` i\u0086\u0093tËz§\u0086\u009b-A\u007f\u008f\u0081æÅ\u001f\u0015\u000b\u0080ÈÈ\u000bñ?¯ëG] éþX¼oKXñ\røÝïø?^önb\u001a\bgGî\u0081\u00957\u0017ç#\u0007\u009f¬(ý\u009e»\u009f\u0010Ö¾wãA\u0099²H(,yÞ\u007fÈ\u007fb-ÉêU~\u008d4Á^/\u0015â7J\u009a\u0096t£#($\u0010!a\u009a2×wgDK¸\nã\u009cÏ\u0098\u00ad\u009f¿1fÖ\u0000À\u000eòø\u000e\u0092\u0001Htà\u009d\u009bM{ó²0§~\u007fñ\u009a\u00adV\u000b2\u0012t\u0016Óþ\u008c²\u0003z ä¯c\u0016\u0093÷Gì\\<Õ\u009fp¯\u0003\u008bt\u0098Êi)\u008f¹\tàz!ÃÊ";
        int length = "[iáø}\u0094,á\u001f^\u0085sé<@Óñ\b\u0007¸ÖZÂ\u008cÈIöºï\fP\u000f\u00897B8\n\b\u0081=\u0010-hÝ\u008d(\u0082+ª9\u0083ýâ¤¯.\f0×X\u009a \u0093ÅÝò7`ù\u0096i¯\u0088[\u0088äI_\\\u0086\u0014ó¼¡\u0011Dzö¦[E\\\nN(¯,Î\u0013\u0081LN\u008fÏ\u0094%(´<\u008f7ç.<hH` i\u0086\u0093tËz§\u0086\u009b-A\u007f\u008f\u0081æÅ\u001f\u0015\u000b\u0080ÈÈ\u000bñ?¯ëG] éþX¼oKXñ\røÝïø?^önb\u001a\bgGî\u0081\u00957\u0017ç#\u0007\u009f¬(ý\u009e»\u009f\u0010Ö¾wãA\u0099²H(,yÞ\u007fÈ\u007fb-ÉêU~\u008d4Á^/\u0015â7J\u009a\u0096t£#($\u0010!a\u009a2×wgDK¸\nã\u009cÏ\u0098\u00ad\u009f¿1fÖ\u0000À\u000eòø\u000e\u0092\u0001Htà\u009d\u009bM{ó²0§~\u007fñ\u009a\u00adV\u000b2\u0012t\u0016Óþ\u008c²\u0003z ä¯c\u0016\u0093÷Gì\\<Õ\u009fp¯\u0003\u008bt\u0098Êi)\u008f¹\tàz!ÃÊ".length();
        char cCharAt = '(';
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
                        i = i8;
                        if (i8 >= length) {
                            b = strArr;
                            c = new String[10];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i10 = 0;
                            int length2 = "döxX(º\u0015Q\u000fO\u009e\u001b;iU\u0004\u0090·Ã\r\u009cc÷\t".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "döxX(º\u0015Q\u000fO\u009e\u001b;iU\u0004\u0090·Ã\r\u009cc÷\t".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            e = jArr;
                            f = new Integer[3];
                            g = new _o((char) i2, j2);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i13 = i4;
                        i4++;
                        strArr[i13] = strIntern;
                        int i14 = i6 + cCharAt;
                        i5 = i14;
                        if (i14 < length) {
                        }
                        str = "¹\u0014¼$ù\u0000í\u0098q\u0010_QE±r.s\u009a\rÛ»\u007fmÖ ÍUæ#\u001fõ\u0016!ë5\u0017ÐË!rL#fSEqwî¿MÙµ¥\u0092e¿º";
                        length = "¹\u0014¼$ù\u0000í\u0098q\u0010_QE±r.s\u009a\rÛ»\u007fmÖ ÍUæ#\u001fõ\u0016!ë5\u0017ÐË!rL#fSEqwî¿MÙµ¥\u0092e¿º".length();
                        cCharAt = 24;
                        i = -1;
                        break;
                        break;
                }
                i6 = i + 1;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 17229;
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
                throw new RuntimeException("su/catlean/_o", e2);
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
            java.lang.String r1 = "su/catlean/_o"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._o.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 8498;
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
                    throw new RuntimeException("su/catlean/_o", e2);
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
            java.lang.String r1 = "su/catlean/_o"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._o.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
