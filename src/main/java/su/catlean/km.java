package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2761;
import net.minecraft.class_638;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.ClearColorEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/km.class */
public final class km extends _g {

    @NotNull
    public static final km g;
    static final /* synthetic */ KProperty[] S;

    @NotNull
    private static final cq a;

    @NotNull
    private static final c8 O;

    @NotNull
    private static final c8 z;

    @NotNull
    private static final cs h;

    @NotNull
    private static final cq L;

    @NotNull
    private static final cq N;

    @NotNull
    private static final c8 n;
    private static long A;
    private static final long b = yz.a(-6005477155652132014L, 4869941492332302944L, MethodHandles.lookup().lookupClass()).a(5715448013098L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] i;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private km(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20293, 7790707156121369090L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 22717286115603L);
    }

    private final boolean I(int i2, int i3, short s) {
        return ((Boolean) a.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ b) ^ 26315158077030L, S[0])).booleanValue();
    }

    private final int p(int i2, int i3, int i4) {
        return ((Number) O.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ b) ^ 118199470562158L, S[1])).intValue();
    }

    private final int z(long j2) {
        return ((Number) z.E(this, (b ^ j2) ^ 98527474888145L, S[2])).intValue();
    }

    private final Color q(long j2, int i2) {
        return (Color) h.E(this, (((j2 << 32) | ((((long) i2) << 32) >>> 32)) ^ b) ^ 110338222552552L, S[3]);
    }

    private final boolean V(long j2) {
        return ((Boolean) L.E(this, (b ^ j2) ^ 116368162239894L, S[4])).booleanValue();
    }

    private final boolean n(long j2) {
        return ((Boolean) N.E(this, (b ^ j2) ^ 50493878259907L, S[5])).booleanValue();
    }

    private final int g(long j2) {
        long j3 = b ^ j2;
        return ((Number) n.E(this, j3 ^ 61829720299837L, S[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1753, 1418449391720003401L ^ j3) /* invoke-custom */])).intValue();
    }

    private final void h(long j2, int i2) {
        long j3 = b ^ j2;
        n.b(this, j3 ^ 67099513912140L, S[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32006, 6692326523235645708L ^ j3) /* invoke-custom */], Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 69599493015750L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2636128448726849311L, j2) /* invoke-custom */;
        try {
            try {
                obj = zf.F(j3).field_1687;
                class_638 class_638VarZ = obj;
                if (obj != null) {
                    if (obj == null) {
                        return;
                    } else {
                        class_638VarZ = zf.z(j4);
                    }
                }
                A = class_638VarZ.method_8532();
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2658960090954825259L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2658960090954825259L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.catlean._g
    public void b(long j2) {
        long j3 = j2 ^ 64129331416845L;
        long j4 = j2 ^ 27357895196556L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1431950576299237461L, j2) /* invoke-custom */;
        try {
            try {
                obj = zf.F(j3).field_1687;
                class_638 class_638VarZ = obj;
                if (obj != null) {
                    if (obj == null) {
                        return;
                    } else {
                        class_638VarZ = zf.z(j4);
                    }
                }
                class_638VarZ.method_29089(A, A, true);
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1417685761240353121L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1417685761240353121L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.api.event.events.network.ReceivePacket] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void U(ReceivePacket receivePacket) {
        long j2 = b ^ 85132104941593L;
        long j3 = j2 ^ 110483483081099L;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4389595421205286753L, j2) /* invoke-custom */;
        class_2761 packet = receivePacket.getPacket();
        try {
            try {
                r0 = packet instanceof class_2761;
                ?? V = r0;
                if (r0 != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        V = V(j3);
                    }
                }
                if (V != 0) {
                    try {
                        A = packet.comp_3219();
                        V = receivePacket;
                        V.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, -4366546608275875413L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4366546608275875413L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4366546608275875413L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00b2: INVOKE (r-1 I:su.catlean.km), (r0 I:long), (r1 I:int) DIRECT call: su.catlean.km.h(long, int):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void m(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.km.m(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x014a: INVOKE (r-2 I:su.catlean.api.event.events.world.ApplyFogEvent), (r-1 I:org.joml.Vector4f) VIRTUAL call: su.catlean.api.event.events.world.ApplyFogEvent.setColorVec(org.joml.Vector4f):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void O(su.catlean.api.event.events.world.ApplyFogEvent r14) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.km.O(su.catlean.api.event.events.world.ApplyFogEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Flow
    private final void F(ClearColorEvent clearColorEvent) {
        long j2 = b ^ 87618447395234L;
        long j3 = j2 ^ 27066970749888L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 >>> 32;
        int i5 = (int) (((j2 ^ 117831924740174L) << 32) >>> 32);
        ?? alpha = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3842128047590229724L, j2) /* invoke-custom */;
        try {
            try {
                alpha = q(j4, i5).getAlpha();
                ?? I = alpha;
                if (alpha != 0) {
                    if (alpha == 0) {
                        return;
                    } else {
                        I = I(i2, i3, (short) i4);
                    }
                }
                if (I == 0) {
                    return;
                }
                clearColorEvent.cancel();
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(alpha, -3828646669059715056L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(alpha, -3828646669059715056L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [double] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    public final int A(int i2, char c2, int i3) {
        long j2 = (((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ b;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5804925790757266181L, j2) /* invoke-custom */;
        Object secondOfDay = (((double) ZonedDateTime.now().toLocalTime().toSecondOfDay()) / 86400.0d) * 24000.0d;
        try {
            secondOfDay = (int) (((secondOfDay - ((double) (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19077, 7171435293468426041L ^ j2) /* invoke-custom */)) + ((double) (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1645, 6100759102190105560L ^ j2) /* invoke-custom */)) % ((double) (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30652, 7221659582919426583L ^ j2) /* invoke-custom */));
            if (strArr == null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], 5779213112573778446L, j2) /* invoke-custom */;
            }
            return secondOfDay;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(secondOfDay, 5835771790389938737L, j2) /* invoke-custom */;
        }
    }

    private static final boolean E() {
        long j2 = b ^ 2164718673510L;
        return g.I((int) (j2 >>> 32), (int) (((j2 ^ 95478264523780L) << 32) >>> 48), (short) ((r1 << 48) >>> 48));
    }

    private static final boolean x() {
        long j2 = b ^ 53975927709070L;
        return g.I((int) (j2 >>> 32), (int) (((j2 ^ 112397024800748L) << 32) >>> 48), (short) ((r1 << 48) >>> 48));
    }

    private static final boolean L() {
        long j2 = b ^ 118111927739174L;
        return g.I((int) (j2 >>> 32), (int) (((j2 ^ 66255578779972L) << 32) >>> 48), (short) ((r1 << 48) >>> 48));
    }

    private static final boolean T() {
        return g.V((b ^ 25006080842460L) ^ 69992977277774L);
    }

    private static final boolean w() {
        return g.V((b ^ 70319728954949L) ^ 25160898574295L);
    }

    static {
        int i2;
        long j2 = b ^ 104094697991104L;
        long j3 = j2 ^ 79076504661893L;
        long j4 = j2 ^ 114678878495459L;
        int i3 = (int) (j2 >>> 48);
        long j5 = ((j2 ^ 59152381060368L) << 16) >>> 16;
        long j6 = j2 ^ 117855472030218L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i5 = 0;
        String str = "ü;\u000bcÒÒB4C@43\u001fÝQs\u009añõü\u0005J¿*nÞ×ô\u007f\u0004Ã\u00138ä\u0010Î«>Ae>@ps7:\u009f +K\u009bg\u0099¼£~\u0015(BY\u001fs\u0097e°õ\u00adÓ{\u0015,HM\tZ[#UïãFp/ì=6°Æ&\u0018*Lì}\u0011}Òrý\u008ax\u0018¸èê-sóå¿@'\r×\u0018!\u0006«J®ÿ\u0082¯ö¥á¼:år&\u000f\u0099ÜçS\u0096wQ y´9\u001fÁo\u0013ÃÚ$\u0011\u0091mL\u009c\u0015\u009b\u0090l²FL¿\u0007éÿ+m\u0094\u001f#N\u0010ÈÒ¨\u00adØ]À\u0002f\u00adä:×\rç{ \u000e\u0015k\u0004+ç\u0002Po\u0005¯â\u009fÜÃ_È[WÕOR?ræ§\u0001B4U9\u0014\u0010'Ðb+\u0006Ìm\"5\u0082R÷?\f** Û|\u0094ÅHTeb6\u0082Þ¥1ú¨\u009a\u001døU\u001eÝ\u008d¦K·q\u0094C\u0015Pp\u0090 ô¯¸Ì¹v\u009d%6h\u009cÕí\b2\fÊ>þ\u0005¹ymòÆ\u001bj,q®ýl \u0016x\u001a\u001a:\u0015\u0010z@¥ß B7\u000e¦Û`®»þ~9[N{ÖgE\u00ad\u0083,(;\t|Ð¹¨©c\u0000\u0091'?0\\òÒ£1ª%¢\u0018}é3óàsó¿¾µÖÌ§}Î÷+X\u0010óê÷¹$\bs\u0080ä.0·ë\u000f>ç\u0018\u009f-\u009cÞß4Ð\u0090\u008c\u0000Þ=c\u000f\u0081bV;6QãV¾\u0082\u0018µ\u008bZ øY\u0013û¢\u0087Ýûµ¢[¶&\u0099Qñ\u0091LBh\u0018PsS¨\u0018õõ'Öý\u007f\\Êï\u0015äÌÍÓ\u008e\u0091W¨º ÕZ\u0085s\u0081b°\u0015KC\nvÔÓEÏ%¿YI\u001c@\u001a¶\u000f\bßê\u0015¸zÎ ë³9%ú\u001b'o¼ð\u0004\u0005´\u0095üqDF\u0089\u009fA\u001fæ\u0080\u0007Â\u009c\u001b\b\u0082°û \u000b*!Þ\u008büø¯_\u0091\u0006¹\u0004ýT\u0096g©å¡¾\u0086s\u001a¾\u0097\u0011³e\u007f\u0085| B\u0006¦6sä\u000b+&\rè]·!\u008c9\u0083Åá@Ãà\u0081'!\b(e\u0017/Bë";
        int length = "ü;\u000bcÒÒB4C@43\u001fÝQs\u009añõü\u0005J¿*nÞ×ô\u007f\u0004Ã\u00138ä\u0010Î«>Ae>@ps7:\u009f +K\u009bg\u0099¼£~\u0015(BY\u001fs\u0097e°õ\u00adÓ{\u0015,HM\tZ[#UïãFp/ì=6°Æ&\u0018*Lì}\u0011}Òrý\u008ax\u0018¸èê-sóå¿@'\r×\u0018!\u0006«J®ÿ\u0082¯ö¥á¼:år&\u000f\u0099ÜçS\u0096wQ y´9\u001fÁo\u0013ÃÚ$\u0011\u0091mL\u009c\u0015\u009b\u0090l²FL¿\u0007éÿ+m\u0094\u001f#N\u0010ÈÒ¨\u00adØ]À\u0002f\u00adä:×\rç{ \u000e\u0015k\u0004+ç\u0002Po\u0005¯â\u009fÜÃ_È[WÕOR?ræ§\u0001B4U9\u0014\u0010'Ðb+\u0006Ìm\"5\u0082R÷?\f** Û|\u0094ÅHTeb6\u0082Þ¥1ú¨\u009a\u001døU\u001eÝ\u008d¦K·q\u0094C\u0015Pp\u0090 ô¯¸Ì¹v\u009d%6h\u009cÕí\b2\fÊ>þ\u0005¹ymòÆ\u001bj,q®ýl \u0016x\u001a\u001a:\u0015\u0010z@¥ß B7\u000e¦Û`®»þ~9[N{ÖgE\u00ad\u0083,(;\t|Ð¹¨©c\u0000\u0091'?0\\òÒ£1ª%¢\u0018}é3óàsó¿¾µÖÌ§}Î÷+X\u0010óê÷¹$\bs\u0080ä.0·ë\u000f>ç\u0018\u009f-\u009cÞß4Ð\u0090\u008c\u0000Þ=c\u000f\u0081bV;6QãV¾\u0082\u0018µ\u008bZ øY\u0013û¢\u0087Ýûµ¢[¶&\u0099Qñ\u0091LBh\u0018PsS¨\u0018õõ'Öý\u007f\\Êï\u0015äÌÍÓ\u008e\u0091W¨º ÕZ\u0085s\u0081b°\u0015KC\nvÔÓEÏ%¿YI\u001c@\u001a¶\u000f\bßê\u0015¸zÎ ë³9%ú\u001b'o¼ð\u0004\u0005´\u0095üqDF\u0089\u009fA\u001fæ\u0080\u0007Â\u009c\u001b\b\u0082°û \u000b*!Þ\u008büø¯_\u0091\u0006¹\u0004ýT\u0096g©å¡¾\u0086s\u001a¾\u0097\u0011³e\u007f\u0085| B\u0006¦6sä\u000b+&\rè]·!\u008c9\u0083Åá@Ãà\u0081'!\b(e\u0017/Bë".length();
        char cCharAt = ' ';
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            d = new String[22];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j2 << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[17];
                            int i11 = 0;
                            String str3 = "\u0018E\u0005 BØ\r\nQþaZ\u0080Uð\u009fq.ÿè\u001axíkX\u001c\u00814vJÝ\u008e6ö[tµÄÖù\u0001u¿\u0017¼ÎAÞ0qBVMz\u008f^\\Êîr\u001c,6;5l¾h®Ë¢{{«¤)\u0010\u0092z©ù\u0088+\u00946½\u000eshí-*Þ\u008eâÄÃo1\u0002\u0003\u0013HSû9+ùn<ò\u0098\n¥#/\u0086Üo\u0007";
                            int length2 = "\u0018E\u0005 BØ\r\nQþaZ\u0080Uð\u009fq.ÿè\u001axíkX\u001c\u00814vJÝ\u008e6ö[tµÄÖù\u0001u¿\u0017¼ÎAÞ0qBVMz\u008f^\\Êîr\u001c,6;5l¾h®Ë¢{{«¤)\u0010\u0092z©ù\u0088+\u00946½\u000eshí-*Þ\u008eâÄÃo1\u0002\u0003\u0013HSû9+ùn<ò\u0098\n¥#/\u0086Üo\u0007".length();
                            int i12 = 0;
                            while (true) {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = str3.substring(i13, i12).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i14 = i11;
                                i11++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i15 = i14;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i15) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i12 >= length2) {
                                                f = jArr;
                                                i = new Integer[17];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28317, 3149690445252207468L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2141, 5862564267383287173L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18065, 5369059721732170585L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5585, 7692774076491591700L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27152, 3947634685489844176L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27045, 4743795668115950698L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30693, 6364763981059985961L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29809, 1057125349708435903L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17408, 7582799588608614859L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17423, 4765960371527098833L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20286, 2691305658420833023L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20202, 6796479243968686897L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32647, 3012632718038637144L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32006, 6692312471743082751L ^ j2) /* invoke-custom */] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(km.class, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7213, 6491830010335394287L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25859, 1650112199770341577L ^ j2) /* invoke-custom */, 0));
                                                S = kPropertyArr;
                                                g = new km(j6);
                                                a = yp.t(g, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7442, 5692911708906485973L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13949, 1087978749336812431L ^ j2) /* invoke-custom */, null);
                                                O = yp.L(g, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3616, 8739420581131152355L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10201, 6608882202961603113L ^ j2) /* invoke-custom */), j4, null, km::E, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(34, 975246895596260826L ^ j2) /* invoke-custom */, null);
                                                z = yp.L(g, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11731, 6569596502265382942L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12626, 943943010784804001L ^ j2) /* invoke-custom */, new IntRange((int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11306, 758991189579719134L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6339, 1103015998508520756L ^ j2) /* invoke-custom */), j4, null, km::x, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19644, 7513046322939920710L ^ j2) /* invoke-custom */, null);
                                                h = yp.b(g, (short) i3, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26114, 7080587265934296027L ^ j2) /* invoke-custom */, new Color((int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8953, 7724417534120849156L ^ j2) /* invoke-custom */), null, km::L, 4, null, j5);
                                                L = yp.t(g, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21865, 5063477382428635309L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13347, 7929345464457460191L ^ j2) /* invoke-custom */, null);
                                                N = yp.t(g, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1267, 9138538472975425850L ^ j2) /* invoke-custom */, false, j3, null, km::T, 4, null);
                                                n = yp.L(g, (String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22477, 3836633653265445387L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13283, 6793277593119096342L ^ j2) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14389, 7957551009364538830L ^ j2) /* invoke-custom */), j4, null, km::w, (int) c(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19644, 7513046322939920710L ^ j2) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i12 >= length2) {
                                                str3 = "ºñI/\u001d\u0093+«\u0099\u0081Î¦W\u008b\u0011\r";
                                                length2 = "ºñI/\u001d\u0093+«\u0099\u0081Î¦W\u008b\u0011\r".length();
                                                i12 = 0;
                                            }
                                            break;
                                    }
                                    int i16 = i12;
                                    i12 += 8;
                                    byte[] bytes2 = str3.substring(i16, i12).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i14 = i11;
                                    i11++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i17 = i5;
                        i5++;
                        strArr[i17] = strIntern;
                        int i18 = i7 + cCharAt;
                        i6 = i18;
                        if (i18 < length) {
                        }
                        str = "¥¦ ^hÙ#4¿\u0097\u0011\u008eâíÏ\u0018\u008eXY¶TV±è \u0099\u0096H\u0090OÔÌZtÍ=\u0085%\u0089Á \u0099¶\u000fMÕ¥\u009eçª¯Ñc\u0011bd²";
                        length = "¥¦ ^hÙ#4¿\u0097\u0011\u008eâíÏ\u0018\u008eXY¶TV±è \u0099\u0096H\u0090OÔÌZtÍ=\u0085%\u0089Á \u0099¶\u000fMÕ¥\u009eçª¯Ñc\u0011bd²".length();
                        cCharAt = 24;
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i6);
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 19613;
        if (d[i3] == null) {
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
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/km", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/km"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.km.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 25775;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/km", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
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
            java.lang.String r1 = "su/catlean/km"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.km.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
