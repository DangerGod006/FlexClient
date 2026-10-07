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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_304;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.KeyMappingAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_v.class */
public final class _v extends _g {

    @NotNull
    public static final _v V;
    static final KProperty[] l;

    @NotNull
    private static final cw S;
    private static final long a = yz.a(-672488293640877659L, 3372041345910309674L, MethodHandles.lookup().lookupClass()).a(7836620945013L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private _v(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15770, 2829208215511212632L ^ j2) /* invoke-custom */, jt.c(), null, 4, null, j2 ^ 1758225847788L);
    }

    private final f9 e(long j) {
        return (f9) S.E(this, (a ^ j) ^ 114842561150845L, l[0]);
    }

    private final void T(f9 f9Var, long j) {
        S.b(this, (a ^ j) ^ 107311884753447L, l[0], f9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // su.catlean._g
    public void b(long j) {
        long j2 = j ^ 64129331416845L;
        long j3 = j ^ 44030506242343L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j3 << 16) >>> 32);
        int i3 = (int) ((j3 << 48) >>> 48);
        ?? K = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1373154656538072419L, j) /* invoke-custom */;
        try {
            try {
                class_304 class_304Var = zf.F(j2).field_1690.field_1903;
                Intrinsics.checkNotNull(class_304Var, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17572, 470467595243342866L ^ j) /* invoke-custom */);
                if (K == 0) {
                    K = bx.k((short) i, i2, (char) i3, ((KeyMappingAccessor) class_304Var).getKey().method_1444());
                    if (K == 0) {
                        class_304Var = zf.F(j2).field_1690.field_1903;
                        class_304Var.method_23481(false);
                    }
                } else {
                    class_304Var.method_23481(false);
                }
                if (j > 0) {
                    ?? r0 = K;
                    if (r0 == 0) {
                        return;
                    }
                    try {
                        r0 = new _g[3];
                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1397120299992947038L, j) /* invoke-custom */;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1417788398739624846L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K, 1417788398739624846L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K, 1417788398739624846L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    @su.catlean.gofra.Flow(priority = -10)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(su.catlean.api.event.events.player.PlayerUpdateEvent r16) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._v.n(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0068: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void w(su.catlean._w r13, long r14) {
        /*
            r12 = this;
            long r0 = su.catlean._v.a
            r1 = r14
            long r0 = r0 ^ r1
            r14 = r0
            r0 = r14
            r1 = r0; r1 = r0; 
            r2 = 105015972662253(0x5f82efbf0bed, double:5.18847843570227E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r1 = r0; r2 = r0; 
            r2 = 120675537797635(0x6dc0f6904203, double:5.96216375192283E-310)
            long r1 = r1 ^ r2
            r18 = r1
            r1 = r0; r2 = r0; 
            r2 = 109146161815536(0x634492341ff0, double:5.3925368928486E-310)
            long r1 = r1 ^ r2
            r20 = r1
            r1 = r0; r2 = r0; 
            r2 = 132951916184770(0x78eb47bc84c2, double:6.56869743356597E-310)
            long r1 = r1 ^ r2
            r22 = r1
            su.catlean.gg r0 = su.catlean.gg.P
            void r1 = su.catlean._v::r
            r2 = r20
            r3 = r2; r2 = r1; r1 = r3; 
            r3 = r12
            r4 = r18
            su.catlean.f9 r3 = r3.e(r4)
            su.catlean.fg r0 = r0.X(r1, r2, r3)
            r24 = r0
            r0 = r24
            boolean r0 = r0.R()     // Catch: java.lang.NumberFormatException -> L6e
            if (r0 == 0) goto L78
            su.catlean._8 r0 = su.catlean._8.P     // Catch: java.lang.NumberFormatException -> L6e
            su.catlean.t5 r1 = new su.catlean.t5     // Catch: java.lang.NumberFormatException -> L6e
            r2 = r1
            r3 = r13
            r4 = r22
            r5 = 10290(0x2832, float:1.442E-41)
            r6 = 3325425178926318468(0x2e264894d50b0384, double:2.2403458523274836E-86)
            r7 = r14
            long r6 = r6 ^ r7
            int r5 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_v;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "s"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r5, r6)     // Catch: java.lang.NumberFormatException -> L6e
            r6 = r24
            void r6 = () -> { // kotlin.jvm.functions.Function0.invoke():java.lang.Object
                return j(r6);
            }     // Catch: java.lang.NumberFormatException -> L6e
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.NumberFormatException -> L6e
            r2 = r16
            r3 = r2; r2 = r1; r1 = r3;      // Catch: java.lang.NumberFormatException -> L6e
            r-1.C(r0, r1)     // Catch: java.lang.NumberFormatException -> L6e
            goto L78
        L6e:
            r1 = -972051132253900128(0xf28294a5367d72a0, double:-3.964672491323394E243)
            r2 = r14
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._v.w(su.catlean._w, long):void");
    }

    private static final boolean r(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16684, 2423483384492702144L ^ (a ^ 41209188048905L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_49098);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0040: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit g() {
        /*
            long r0 = su.catlean._v.a
            r1 = 88924202013840(0x50e047791490, double:4.39343932988853E-310)
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 119491187250533(0x6cad35c51565, double:5.9036490601272E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 110615126143402(0x649a974cf1aa, double:5.4651133737851E-310)
            long r1 = r1 ^ r2
            r15 = r1
            net.minecraft.class_1268 r0 = net.minecraft.class_1268.field_5808
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = 19815(0x4d67, float:2.7767E-41)
            r5 = 447135570754765626(0x6348b6ebd47833a, double:9.054468255850112E-279)
            r6 = r11
            long r5 = r5 ^ r6
            int r4 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_v;->c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "s"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r4, r5)
            r5 = 0
            net.minecraft.class_1269 r0 = su.catlean.ag.K(r0, r1, r2, r3, r4, r5)
            net.minecraft.class_2879 r0 = new net.minecraft.class_2879
            r1 = r0
            net.minecraft.class_1268 r2 = net.minecraft.class_1268.field_5808
            r1.<init>(r2)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r15
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._v.g():kotlin.Unit");
    }

    private static final Unit j(fg fgVar) {
        long j = a ^ 22178465347543L;
        gg.P.T(j ^ 95574711372110L, fgVar.a(), V.e(j ^ 66630837486766L), _v::g);
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 45973755259595L;
        long j2 = j ^ 10429019779070L;
        long j3 = j ^ 100157637727421L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[9];
        int i3 = 0;
        String str = "¬Ð\u009d§mð;B\u007f#WÉ\u008fn\u0000q°G@\u000f{iæ=Zh\u009b\u0006\u0019FI5\u0010Sâ\u007fmo<RØ\u0092í§ØJùÀÉ\u0010@tüb\tá\u0007Ä\u0098r(³ðrÎ$0mv\u000eç\"5\u008ecnsæ6&\u0090c\u0081áp\u009c\u009d\u0003e ä5\u0087\u0004Ä\t,i¯\u009dBçÛ·\u008a2Z\u008feôÁ\u001b)\u0002[ p\u0082\"\u001c«ÓOj\u0089ìgV\u0005\u001bÓ\u0090\u0006'JÀ\u00061~_ãêt \u0089\u00ad\u008a\u0006\u00881Ã¼9wy¶\u001céF\u0093VS\u0087ã×ûíÕ\u0004¦ý]õ\u0002Þ×\u00969Ù\u0085\\*j\u0093ÿ´¦t\u0004©vhäd\u0017oÕßKË\u0007h\u0095ûÖ\u0088´2\u0014\u001c\u00184\u0080²¾¹\u000b¾\u0086è§scspvæ,Ú«N[_+\u008dn²\u0089×=\u0099+\u00ad*k`\u0000\u000bq8¶ºÄ\u0013¾\u001b\u009c1¿ÜÔqÑý\u00192\u0096Ñä\u008c\n\u0098.\u0017ùV\büÙU'\u0006\u0098lK\u0018\u0014s1\u001e05A\u0092\u0082=ÀàA§}PVù\u0001\\\u0091\u0003f%";
        int length = "¬Ð\u009d§mð;B\u007f#WÉ\u008fn\u0000q°G@\u000f{iæ=Zh\u009b\u0006\u0019FI5\u0010Sâ\u007fmo<RØ\u0092í§ØJùÀÉ\u0010@tüb\tá\u0007Ä\u0098r(³ðrÎ$0mv\u000eç\"5\u008ecnsæ6&\u0090c\u0081áp\u009c\u009d\u0003e ä5\u0087\u0004Ä\t,i¯\u009dBçÛ·\u008a2Z\u008feôÁ\u001b)\u0002[ p\u0082\"\u001c«ÓOj\u0089ìgV\u0005\u001bÓ\u0090\u0006'JÀ\u00061~_ãêt \u0089\u00ad\u008a\u0006\u00881Ã¼9wy¶\u001céF\u0093VS\u0087ã×ûíÕ\u0004¦ý]õ\u0002Þ×\u00969Ù\u0085\\*j\u0093ÿ´¦t\u0004©vhäd\u0017oÕßKË\u0007h\u0095ûÖ\u0088´2\u0014\u001c\u00184\u0080²¾¹\u000b¾\u0086è§scspvæ,Ú«N[_+\u008dn²\u0089×=\u0099+\u00ad*k`\u0000\u000bq8¶ºÄ\u0013¾\u001b\u009c1¿ÜÔqÑý\u00192\u0096Ñä\u008c\n\u0098.\u0017ùV\büÙU'\u0006\u0098lK\u0018\u0014s1\u001e05A\u0092\u0082=ÀàA§}PVù\u0001\\\u0091\u0003f%".length();
        char cCharAt = ' ';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[9];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "~\u001ekÄÈ^'n\u000f÷É\t¡ìf#";
                            int length2 = "~\u001ekÄÈ^'n\u000f÷É\t¡ìf#".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[4];
                                                l = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(_v.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19144, 7512583075081271523L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24689, 4512529183072555614L ^ j) /* invoke-custom */, 0))};
                                                V = new _v(j2);
                                                S = yp.L(V, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14186, 7041083590190777671L ^ j) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) c(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31195, 3412925358836533727L ^ j) /* invoke-custom */, null, j3);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i10 >= length2) {
                                                str3 = "\b°(\r§\u0099\u008d6JÃåh½ã£Æ";
                                                length2 = "\b°(\r§\u0099\u008d6JÃåh½ã£Æ".length();
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
                                    j4 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "Å\u0004nZÄ\u008f4Ã'\u0011M4Ó\u0003^µ\u0088È\u0090\u0086J\u0016\u009e:\u0018\u009c\u00152Ìö(_§ ÎÈ÷'\u0095ý\u008c\u0011\u0011\u0082þ\u0083ü\u0093\u0083";
                        length = "Å\u0004nZÄ\u008f4Ã'\u0011M4Ó\u0003^µ\u0088È\u0090\u0086J\u0016\u009e:\u0018\u009c\u00152Ìö(_§ ÎÈ÷'\u0095ý\u008c\u0011\u0011\u0082þ\u0083ü\u0093\u0083".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 6903;
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
                throw new RuntimeException("su/catlean/_v", e2);
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
            java.lang.String r1 = "su/catlean/_v"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._v.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 22751;
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
                    throw new RuntimeException("su/catlean/_v", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            java.lang.String r1 = "su/catlean/_v"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._v.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
