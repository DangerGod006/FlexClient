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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e3.class */
public final class e3 extends _g {

    @NotNull
    public static final e3 j;
    static final KProperty[] O;

    @NotNull
    private static final cq z;

    @NotNull
    private static final cw B;

    @NotNull
    private static final cl t;

    @NotNull
    private static final cl f;

    @NotNull
    private static final cw V;
    private static boolean m;
    private static int S;
    private static final long a = yz.a(7811351097077925840L, -1408723325581327534L, MethodHandles.lookup().lookupClass()).a(231759894766863L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private e3(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31712, 7768679920939630300L ^ j3) /* invoke-custom */, jt.v(), null, 4, null, j3 ^ 49598004558103L);
    }

    private final boolean n(long j2) {
        return ((Boolean) z.E(this, (a ^ j2) ^ 33211590268322L, O[0])).booleanValue();
    }

    private final b3 j(long j2) {
        return (b3) B.E(this, (a ^ j2) ^ 98200574968283L, O[1]);
    }

    private final String Q(long j2) {
        return (String) t.E(this, (a ^ j2) ^ 21393475063332L, O[2]);
    }

    private final String g(long j2) {
        return (String) f.E(this, (a ^ j2) ^ 107450145326162L, O[3]);
    }

    private final xo h(long j2) {
        return (xo) V.E(this, (a ^ j2) ^ 114982732105517L, O[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void P(su.catlean.api.event.events.player.PlayerUpdateEvent r12) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e3.P(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.minecraft.class_2663] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [byte] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void p(ReceivePacket receivePacket) {
        long j2 = a ^ 5160374565088L;
        long j3 = j2 ^ 111403959593272L;
        long j4 = j2 ^ 111855836689820L;
        long j5 = j2 ^ 49350252704713L;
        long j6 = j2 ^ 79030735542713L;
        long j7 = j2 ^ 76930527667998L;
        class_310 class_310VarF = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-722649007744880334L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    if (receivePacket.getPacket() instanceof class_2663) {
                        class_310VarF = zf.F(j3);
                        if (class_310VarF == null) {
                            if (class_310VarF.field_1724 == null) {
                                return;
                            } else {
                                class_310VarF = zf.F(j3);
                            }
                        }
                        if (class_310VarF.field_1687 != null) {
                            class_2596<?> packet = receivePacket.getPacket();
                            Intrinsics.checkNotNull(packet, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14757, 4612650451948757283L ^ j2) /* invoke-custom */);
                            ?? Method_11470 = (class_2663) packet;
                            try {
                                try {
                                    try {
                                        Method_11470 = Method_11470.method_11470();
                                        try {
                                            if (class_310VarF == null) {
                                                if (Method_11470 != 3) {
                                                    Method_11470 = Method_11470.method_11470();
                                                    if (class_310VarF == null) {
                                                        if (Method_11470 != (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26918, 8536181686061804297L ^ j2) /* invoke-custom */) {
                                                            return;
                                                        } else {
                                                            Method_11470 = Intrinsics.areEqual(Method_11470.method_11469(zf.z(j6)), zf.v(j7));
                                                        }
                                                    }
                                                } else {
                                                    Method_11470 = Intrinsics.areEqual(Method_11470.method_11469(zf.z(j6)), zf.v(j7));
                                                }
                                            }
                                            try {
                                                try {
                                                    if (Method_11470 != 0) {
                                                        e3 e3Var = this;
                                                        if (class_310VarF == null) {
                                                            if (e3Var.h(j5) != xo.INSTANT) {
                                                                return;
                                                            } else {
                                                                e3Var = this;
                                                            }
                                                        }
                                                        e3Var.r(j4);
                                                    }
                                                } catch (NoWhenBranchMatchedException unused) {
                                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11470, -790179883823373270L, j2) /* invoke-custom */;
                                                }
                                            } catch (NoWhenBranchMatchedException unused2) {
                                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11470, -790179883823373270L, j2) /* invoke-custom */;
                                            }
                                        } catch (NoWhenBranchMatchedException unused3) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11470, -790179883823373270L, j2) /* invoke-custom */;
                                        }
                                    } catch (NoWhenBranchMatchedException unused4) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11470, -790179883823373270L, j2) /* invoke-custom */;
                                    }
                                } catch (NoWhenBranchMatchedException unused5) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11470, -790179883823373270L, j2) /* invoke-custom */;
                                }
                            } catch (NoWhenBranchMatchedException unused6) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11470, -790179883823373270L, j2) /* invoke-custom */;
                            }
                        }
                    }
                } catch (NoWhenBranchMatchedException unused7) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, -790179883823373270L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused8) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, -790179883823373270L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused9) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, -790179883823373270L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(long r8) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e3.r(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.b3] */
    private static final boolean I() {
        long j2 = a ^ 2949325372582L;
        Object objJ = j2;
        try {
            objJ = j.j(objJ ^ 29953470706041L);
            return objJ == b3.KIT;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, -5670399671273840532L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.b3] */
    private static final boolean x() {
        long j2 = a ^ 32172880721854L;
        Object objJ = j2;
        try {
            objJ = j.j(objJ ^ 5301896411745L);
            return objJ == b3.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 8815425076542761844L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j2 = a ^ 116532479366824L;
        long j3 = j2 ^ 51851499461867L;
        long j4 = j2 ^ 111956095188838L;
        long j5 = j2 ^ 121311897183839L;
        long j6 = j2 ^ 60338472315694L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j2 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[25];
        int i3 = 0;
        String str = "á~ß,S\u0014½z¯\u0090\u008dGµ\u0089¿\u009eøì7*O.=(\u008e\"~\"Z±\u0002räWýÿ>nk\f\u009aø¸@0N5sEÌ\u0080TÙ72¾ÈÛÿ±{|]\u0087\u0010\u0092E¢«¤P\u001a\u009a©\u0007Ù0âÔ\u0089\u0088\u0010²â±*a\u0091¬aÏgÕV qfÕ\u0010\u0012^ï§ÌSú1AÛG%}4?ß\u0010kG\u0017Ûhzíó·æ¥\u0002\u001b\u0095|á@Ï/8±jÙÑ8´òR\u0010Ñ<;\u0080ÑçhnÑVæ\u000e\u00ad<ý¼ÆW\tK\u0017ç\u001f©]ö_\t¶_\u0095AmßprùàjóîÄ\u0010R±\u008avV¸üÚ· Ô\u0087nçE\u001dØô&¯«S¨\u007f\u0002ð\u0092J\u0018©9n[¼/ÉVI\u008a\u0088¥í\u0010ìDpË\n\u0004¤øÊ1\u008a¥ÀÖ\u0089\u001e 9s\u0013\u008fÒý\u0090 R£±ç\u001bLÊq§ÝX*!W×g\u0016ëÄå\u001fÎ\u0001*\u0010%ö¿[õó\u0006\u0080\u0096\b\u0085\u000e\u008c\u000f.É \u000eo ¹`\u009dM}|\u008bL(\u0081%¯e¡\u0015öT\u000bØÃ<v¢$:n~®4 .\u0099<#ÑZ·w\u0001ñi64Û\u0004AÎ~ÇlB<\u0003á\u0013N\u008b2\u0089\\ø\u0091\u0018P\u0092Û\u008cE1ÁÍ\u0019H\u008b\u000fAvþ1yEÔ§\u0092\u008f3X\u0010#\u0095ôÍÛyÝÊunZÈõ·\fj \u0002\u0084<~É\u0001xA ³êÝiû¶A\u001cç·XÇ\f\u009c©Ä»a\u0084ïù#5\u0083\u0006Þ£\u000eü\u008bø\u0004>~wf\u00919¸\u0006N\u0018<Z®<>'\u008694}¶ QRèàðØì\u0004]Y×å±E:ÔÇ\u0012ÜÂ\\8%l®ý1¢ÞË\u001b\u0015Czó\u001d6\u0004ÀöÚò\u0003)ä\u0089\\÷àTr_ú¤\u009f@æt°N\u0007¾E\u0006¨\u0019!W=\u0007²`\u0083@ØÏj Ë\u001a1åÅ%µÑzé\u0017R¯\f>\u009bÂç£0ÞØ\u0099Í\u0097¢ÛæC÷»»Øy%Q`b]PãH²AÛ@¦ \u0002¾àüÙ\u0083~ö\u0002:\u0019Ë\u0086\u0096E´Í+Áÿ\u0018\u00ad\u0017vùs\u0011ÊÌ\u0017M.è\u0083\u001f\u009b\u0002\u0017udpÊu®È \u0010î}©Sq%âõR\u001b'\u009e\u008aµ×x\u009fm\u0090\u008eÄ<<\u009dÄMó\u0007³A\u00058pÁØ\u0003JÚj\u008cÞ\u009d¨Æ\u0089ÁV\u0088ÑL\u0088ä\u008bÇ»¥~ºêj¥\u0004\u0089\u0096\u0082X\u009f`g /I\u0003×Ëm\u009fërì\u0089Þ®³\u0091\u000f·P \u0081Ó\u007fßâ\u0082bpmUô»\u0082 édxX!ËøYT45\u0084F½«x\u0010\u007f\u0018³¡G\u0095 á#\fÂ2\u0099|0\u0097\u001f×rÀ'×Á½÷Ó\u0010ÿ1]L\u0080û¸9\\âPæß9»x(§[@K¾a\u001cê\u0097{d·ÂxÕåc\u008a\u0003b«2q\b>\td½\u0000\u0097¹»[\u0006\r\u009d\u001d\u001e\u0018\u0015";
        int length = "á~ß,S\u0014½z¯\u0090\u008dGµ\u0089¿\u009eøì7*O.=(\u008e\"~\"Z±\u0002räWýÿ>nk\f\u009aø¸@0N5sEÌ\u0080TÙ72¾ÈÛÿ±{|]\u0087\u0010\u0092E¢«¤P\u001a\u009a©\u0007Ù0âÔ\u0089\u0088\u0010²â±*a\u0091¬aÏgÕV qfÕ\u0010\u0012^ï§ÌSú1AÛG%}4?ß\u0010kG\u0017Ûhzíó·æ¥\u0002\u001b\u0095|á@Ï/8±jÙÑ8´òR\u0010Ñ<;\u0080ÑçhnÑVæ\u000e\u00ad<ý¼ÆW\tK\u0017ç\u001f©]ö_\t¶_\u0095AmßprùàjóîÄ\u0010R±\u008avV¸üÚ· Ô\u0087nçE\u001dØô&¯«S¨\u007f\u0002ð\u0092J\u0018©9n[¼/ÉVI\u008a\u0088¥í\u0010ìDpË\n\u0004¤øÊ1\u008a¥ÀÖ\u0089\u001e 9s\u0013\u008fÒý\u0090 R£±ç\u001bLÊq§ÝX*!W×g\u0016ëÄå\u001fÎ\u0001*\u0010%ö¿[õó\u0006\u0080\u0096\b\u0085\u000e\u008c\u000f.É \u000eo ¹`\u009dM}|\u008bL(\u0081%¯e¡\u0015öT\u000bØÃ<v¢$:n~®4 .\u0099<#ÑZ·w\u0001ñi64Û\u0004AÎ~ÇlB<\u0003á\u0013N\u008b2\u0089\\ø\u0091\u0018P\u0092Û\u008cE1ÁÍ\u0019H\u008b\u000fAvþ1yEÔ§\u0092\u008f3X\u0010#\u0095ôÍÛyÝÊunZÈõ·\fj \u0002\u0084<~É\u0001xA ³êÝiû¶A\u001cç·XÇ\f\u009c©Ä»a\u0084ïù#5\u0083\u0006Þ£\u000eü\u008bø\u0004>~wf\u00919¸\u0006N\u0018<Z®<>'\u008694}¶ QRèàðØì\u0004]Y×å±E:ÔÇ\u0012ÜÂ\\8%l®ý1¢ÞË\u001b\u0015Czó\u001d6\u0004ÀöÚò\u0003)ä\u0089\\÷àTr_ú¤\u009f@æt°N\u0007¾E\u0006¨\u0019!W=\u0007²`\u0083@ØÏj Ë\u001a1åÅ%µÑzé\u0017R¯\f>\u009bÂç£0ÞØ\u0099Í\u0097¢ÛæC÷»»Øy%Q`b]PãH²AÛ@¦ \u0002¾àüÙ\u0083~ö\u0002:\u0019Ë\u0086\u0096E´Í+Áÿ\u0018\u00ad\u0017vùs\u0011ÊÌ\u0017M.è\u0083\u001f\u009b\u0002\u0017udpÊu®È \u0010î}©Sq%âõR\u001b'\u009e\u008aµ×x\u009fm\u0090\u008eÄ<<\u009dÄMó\u0007³A\u00058pÁØ\u0003JÚj\u008cÞ\u009d¨Æ\u0089ÁV\u0088ÑL\u0088ä\u008bÇ»¥~ºêj¥\u0004\u0089\u0096\u0082X\u009f`g /I\u0003×Ëm\u009fërì\u0089Þ®³\u0091\u000f·P \u0081Ó\u007fßâ\u0082bpmUô»\u0082 édxX!ËøYT45\u0084F½«x\u0010\u007f\u0018³¡G\u0095 á#\fÂ2\u0099|0\u0097\u001f×rÀ'×Á½÷Ó\u0010ÿ1]L\u0080û¸9\\âPæß9»x(§[@K¾a\u001cê\u0097{d·ÂxÕåc\u008a\u0003b«2q\b>\td½\u0000\u0097¹»[\u0006\r\u009d\u001d\u001e\u0018\u0015".length();
        char cCharAt = '@';
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
                            c = new String[25];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j2 << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "\u009fú\f\u0000öæÏê\n¯l±\u0090g®2";
                            int length2 = "\u009fú\f\u0000öæÏê\n¯l±\u0090g®2".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                g = new Integer[4];
                                                O = new KProperty[]{Reflection.property1(new PropertyReference1Impl(e3.class, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12658, 4907917072924346275L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21154, 5492618800260768884L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e3.class, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1816, 950399937113829836L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24320, 7319079822493772224L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e3.class, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9188, 2245506444293084476L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27206, 2404485457757822100L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e3.class, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3207, 5267549450531879491L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(962, 9112769684691170573L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e3.class, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2358, 228995447479615472L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32505, 536238305826883644L ^ j2) /* invoke-custom */, 0))};
                                                j = new e3(j4);
                                                z = yp.t(j, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20705, 1983419124681106985L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16547, 7536412740580928709L ^ j2) /* invoke-custom */, null);
                                                B = yp.L(j, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4032, 6981671901398448396L ^ j2) /* invoke-custom */, b3.KIT, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20866, 2705564274042502630L ^ j2) /* invoke-custom */, null, j5);
                                                t = yp.x(j, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30824, 5013326586039258808L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18939, 3747756762486964024L ^ j2) /* invoke-custom */, (h) null, e3::I, 4, j6, (Object) null);
                                                f = yp.x(j, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21095, 2769235947818738862L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16421, 1607422092899612388L ^ j2) /* invoke-custom */, (h) null, e3::x, 4, j6, (Object) null);
                                                V = yp.L(j, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27497, 2025487785762905530L ^ j2) /* invoke-custom */, xo.DELAYED, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20866, 2705564274042502630L ^ j2) /* invoke-custom */, null, j5);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i10 >= length2) {
                                                str3 = "u5Î\u001djÁRÖ²ªmó1øæ\r";
                                                length2 = "u5Î\u001djÁRÖ²ªmó1øæ\r".length();
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
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "V\u001dZ\u0010\u0007\u0096|K>fR\u009e{;Ü\u008a\u0010KGcÖuH@å\u0017\u0084R\u0007\u000b\u007füõ";
                        length = "V\u001dZ\u0010\u0007\u0096|K>fR\u009e{;Ü\u008a\u0010KGcÖuH@å\u0017\u0084R\u0007\u000b\u007füõ".length();
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

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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

    private static String b(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 11513;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/e3", e2);
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
            java.lang.String r1 = "su/catlean/e3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j2) {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 13918;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/e3", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            java.lang.String r1 = "su/catlean/e3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e3.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
