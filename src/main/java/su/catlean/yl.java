package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yl.class */
public final class yl implements ym {

    @NotNull
    public static final yl g;

    @NotNull
    private static final Json N;

    @NotNull
    private static final mx X;

    @NotNull
    private static final oe P;

    @NotNull
    private static final oc C;

    @NotNull
    private static final o4 f;

    @NotNull
    private static final c_ H;

    @NotNull
    private static final g4 v;

    @NotNull
    private static final p1 J;

    @NotNull
    private static final dk O;

    @NotNull
    private static final od n;

    @NotNull
    private static final bg z;
    private static _g[] E;
    private static final long a = yz.a(-4066619958810965381L, -3923280114561898578L, MethodHandles.lookup().lookupClass()).a(88221762137594L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] h;
    private static final Map i;

    private yl() {
    }

    @NotNull
    public final mx h() {
        return X;
    }

    @NotNull
    public final oe d() {
        return P;
    }

    @NotNull
    public final oc l() {
        return C;
    }

    @NotNull
    public final o4 y() {
        return f;
    }

    @NotNull
    public final c_ f() {
        return H;
    }

    @NotNull
    public final g4 N() {
        return v;
    }

    @NotNull
    public final p1 c() {
        return J;
    }

    @NotNull
    public final dk g() {
        return O;
    }

    @NotNull
    public final od m() {
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    private final void Q(char c2, short s, int i2) throws Throwable {
        long j = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        long j2 = j ^ 79123043732771L;
        Object[] objArrL = mj.l();
        int i3 = 0;
        int length = objArrL.length;
        while (i3 < length) {
            objArrL[i3].mkdirs();
            i3++;
            if (c2 >= 0) {
                if (i2 >= 0) {
                    break;
                }
            } else {
                break;
            }
        }
        Field[] declaredFields = getClass().getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, (String) a(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11220, 5906951819931363627L ^ j) /* invoke-custom */);
        objArrL = declaredFields;
        Object[] objArr = objArrL;
        ArrayList<Field> arrayList = new ArrayList();
        int i4 = 0;
        int length2 = objArr.length;
        while (i4 < length2) {
            Object[] objArr2 = objArr[i4];
            Field field = (Field) objArr2;
            Object objIsAssignableFrom = s;
            if (objIsAssignableFrom >= 0) {
                try {
                    objIsAssignableFrom = co.class.isAssignableFrom(field.getType());
                    if (objIsAssignableFrom != 0) {
                        arrayList.add(objArr2);
                    }
                    i4++;
                } catch (NumberFormatException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsAssignableFrom, -582261244002296398L, j) /* invoke-custom */;
                }
            }
            if (c2 < 0) {
                break;
            }
        }
        for (Field field2 : arrayList) {
            field2.setAccessible(true);
            Object obj = field2.get(g);
            Intrinsics.checkNotNull(obj, (String) a(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15770, 5484234032311615342L ^ j) /* invoke-custom */);
            ((co) obj).w(j2);
            if (c2 < 0 || s <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b A[EDGE_INSN: B:46:0x012b->B:23:0x012b BREAK  A[LOOP:0: B:3:0x00c0->B:49:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:3:0x00c0->B:49:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0128 -> B:6:0x00cc). Please report as a decompilation issue!!! */
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
    public final void q(long r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yl.q(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02cf: INVOKE (r-1 I:su.catlean.jg), (r0 I:long), (r1 I:su.catlean.c2) VIRTUAL call: su.catlean.jg.B(long, su.catlean.c2):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void N(su.catlean.api.event.events.FilesDraggedEvent r17) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yl.N(su.catlean.api.event.events.FilesDraggedEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.bg] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Flow
    private final void K(PlayerUpdateEvent playerUpdateEvent) throws Throwable {
        long j = a ^ 112410264738303L;
        long j2 = j ^ 84275848155511L;
        long j3 = j ^ 12862510794033L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3654359359396017279L, j) /* invoke-custom */;
        try {
            obj = z;
            boolean z2 = zf.F(j2).field_1755 instanceof s1;
            int iQ = z2;
            if (obj != 0) {
                iQ = z2 ? (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16805, 490588052782600582L ^ j) /* invoke-custom */ : (int) b(MethodHandles.lookup(), "q", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3494, 4618734926409768320L ^ j) /* invoke-custom */;
            }
            if (obj.q(iQ, j3)) {
                bo.S.Y().execute(new f_(0));
            }
        } catch (NumberFormatException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3609830120173852738L, j) /* invoke-custom */;
        }
    }

    private static final Unit I(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, (String) a(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18716, 1274416052269543279L ^ (a ^ 114413908199289L)) /* invoke-custom */);
        jsonBuilder.setPrettyPrint(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setEncodeDefaults(true);
        return Unit.INSTANCE;
    }

    static {
        int i2;
        long j = a ^ 82336131525880L;
        long j2 = j ^ 131704182337716L;
        long j3 = j ^ 70560251688570L;
        long j4 = j ^ 28026639806211L;
        int i3 = (int) (j >>> 48);
        long j5 = ((j ^ 64408542316362L) << 16) >>> 16;
        long j6 = j ^ 21837875414622L;
        long j7 = j ^ 11886361771960L;
        int i4 = (int) (j >>> 48);
        int i5 = (int) ((j7 << 16) >>> 32);
        int i6 = (int) ((j7 << 48) >>> 48);
        long j8 = j ^ 100645423826174L;
        long j9 = j ^ 72567207824687L;
        long j10 = j ^ 54203565595338L;
        int i7 = (int) (j >>> 48);
        int i8 = (int) ((j10 << 16) >>> 48);
        int i9 = (int) ((j10 << 32) >>> 32);
        long j11 = j ^ 66430042222261L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], -563195206044474925L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i10 = 1; i10 < 8; i10++) {
            bArr[i10] = (byte) ((j << (i10 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i11 = 0;
        String str = "±5\u0014Dú*]ÀÈó]Ä\u001f\u007föC¯öÕ x\u0081\u0088ö¸f\u0084ª\u0086H¶\u008d\u0002c;ã\u0099¿-J\u00104\u0015Ø!R¦\u0012Ï\u0086Ï\u0004Ïe\u009fH\u0099(ü\u001cJÙë¿A¿þ_üÉvG¼ÆÎÌsø\u0083;-qE©\u0084\u0080íÁ\u0010Fb.\u0003\u0011\u0082\ríÌ\u0018&\u0083æ\u008c\u0093¿¯ËÐ\u0083\u008aÛÉ\u001cK´\nä«×{\u0084â0 &«\t~2FêÏ_\u000b=\u009d>k8\u0014Î'\u0016à» 7Õâ\u0082âwpÃC\u0099(\u0098yÌ_\u001c¿Õ\u000en!Ñ\u0012¨I\u0091ø%\u009bHÕ\u009dv\u0006ájõ=þ\u0099KPbvÁrÙ\u00910X¶ \u0017o\u009ca\u0091«N\u0082ÞúÇ6ß÷qÖ\u0095\u0089Jö4\u0081\u008apë\u0093LÙ9\u0016h\u0085\u0018¿f\u008c×ìQWb>M\u001bùÏ~á{U\rU&Ûw\u0011)\u0010¶<ÿêÂ¤T²K\u0098êÂáAaa\u0080«\u0005ª¼IHmL\u001dDxa½/tP\u0097**óÏ\u0092@È\u0006\u0015÷Ë.\u009f·w\u0093òL\u001d\fu·Ö¤dã\u0019þÖÐ\u0080E\u0080\u008d\u0014Õ\u0003&P=Ålc]«ae\u008aÂë\u0083¢má\u0011~ê°\u009fÎ\u0001îÓ\u009aÎÑOg\u0015u-\u0090¹\u00adáBÚß¶\u0090Òå6Ê_Ä\u0090¯\u0012\u0091\u008eÿ\u000eC\u00ad\u0011\u001dÐ¹LÚ\u0084È\u0002Xò§W·qX\u0080þ¹R4c,\u0004\u001dï\u008c¡\u001b>éÐÜW|£\u008cs\u0006\u0006<\u0018kßEæ\nþ\u0019Ëúß\u0018z½\\2ÀB\\¥\u0089½\u001dttÜ¾®ÚÎù.³\u009buE°Ó\u0016\u001e\u0015¾*\u0080\u00adÔÞÖ\u0092\b\u009e\u0093]\u0001kgès\u0087¨R\u0090\u008aV5\u0090y\u009b\u00adW°'Áâ\u0011à6\u008bVì¶Ù1úÄ7Kø\u0093ÒqH´´\u0000öæ<B7ÛL\u000f\u0096\u0010L$é>öA15 á5ÑÉ\u0081\u001f\u0080";
        int length = "±5\u0014Dú*]ÀÈó]Ä\u001f\u007föC¯öÕ x\u0081\u0088ö¸f\u0084ª\u0086H¶\u008d\u0002c;ã\u0099¿-J\u00104\u0015Ø!R¦\u0012Ï\u0086Ï\u0004Ïe\u009fH\u0099(ü\u001cJÙë¿A¿þ_üÉvG¼ÆÎÌsø\u0083;-qE©\u0084\u0080íÁ\u0010Fb.\u0003\u0011\u0082\ríÌ\u0018&\u0083æ\u008c\u0093¿¯ËÐ\u0083\u008aÛÉ\u001cK´\nä«×{\u0084â0 &«\t~2FêÏ_\u000b=\u009d>k8\u0014Î'\u0016à» 7Õâ\u0082âwpÃC\u0099(\u0098yÌ_\u001c¿Õ\u000en!Ñ\u0012¨I\u0091ø%\u009bHÕ\u009dv\u0006ájõ=þ\u0099KPbvÁrÙ\u00910X¶ \u0017o\u009ca\u0091«N\u0082ÞúÇ6ß÷qÖ\u0095\u0089Jö4\u0081\u008apë\u0093LÙ9\u0016h\u0085\u0018¿f\u008c×ìQWb>M\u001bùÏ~á{U\rU&Ûw\u0011)\u0010¶<ÿêÂ¤T²K\u0098êÂáAaa\u0080«\u0005ª¼IHmL\u001dDxa½/tP\u0097**óÏ\u0092@È\u0006\u0015÷Ë.\u009f·w\u0093òL\u001d\fu·Ö¤dã\u0019þÖÐ\u0080E\u0080\u008d\u0014Õ\u0003&P=Ålc]«ae\u008aÂë\u0083¢má\u0011~ê°\u009fÎ\u0001îÓ\u009aÎÑOg\u0015u-\u0090¹\u00adáBÚß¶\u0090Òå6Ê_Ä\u0090¯\u0012\u0091\u008eÿ\u000eC\u00ad\u0011\u001dÐ¹LÚ\u0084È\u0002Xò§W·qX\u0080þ¹R4c,\u0004\u001dï\u008c¡\u001b>éÐÜW|£\u008cs\u0006\u0006<\u0018kßEæ\nþ\u0019Ëúß\u0018z½\\2ÀB\\¥\u0089½\u001dttÜ¾®ÚÎù.³\u009buE°Ó\u0016\u001e\u0015¾*\u0080\u00adÔÞÖ\u0092\b\u009e\u0093]\u0001kgès\u0087¨R\u0090\u008aV5\u0090y\u009b\u00adW°'Áâ\u0011à6\u008bVì¶Ù1úÄ7Kø\u0093ÒqH´´\u0000öæ<B7ÛL\u000f\u0096\u0010L$é>öA15 á5ÑÉ\u0081\u001f\u0080".length();
        char cCharAt = '(';
        int i12 = -1;
        while (true) {
            int i13 = i12 + 1;
            String strSubstring = str.substring(i13, i13 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i14 = i11;
                        i11++;
                        strArr[i14] = strIntern;
                        int i15 = i13 + cCharAt;
                        i2 = i15;
                        if (i15 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[14];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i16 = 1; i16 < 8; i16++) {
                                bArr2[i16] = (byte) ((j << (i16 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i17 = 0;
                            String str3 = "\u009aäD£\u0010%tØ\n¤ý\u009aºµmÌ5ÇâÁÒ¥a\u008ce?(6ÆìE[";
                            int length2 = "\u009aäD£\u0010%tØ\n¤ý\u009aºµmÌ5ÇâÁÒ¥a\u008ce?(6ÆìE[".length();
                            int i18 = 0;
                            while (true) {
                                int i19 = i18;
                                i18 += 8;
                                byte[] bytes = str3.substring(i19, i18).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i20 = i17;
                                i17++;
                                long j12 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j13 = j12;
                                    int i21 = i20;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j13 >>> 56), (byte) (j13 >>> 48), (byte) (j13 >>> 40), (byte) (j13 >>> 32), (byte) (j13 >>> 24), (byte) (j13 >>> 16), (byte) (j13 >>> 8), (byte) j13});
                                    long j14 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i21) {
                                        case 0:
                                            jArr2[b5] = j14;
                                            if (i18 >= length2) {
                                                e = jArr;
                                                h = new Integer[6];
                                                g = new yl();
                                                N = JsonKt.Json$default(null, yl::I, 1, null);
                                                X = new mx(j3, N);
                                                Json json = N;
                                                yl ylVar = g;
                                                P = new oe((char) i4, json, i5, (short) i6, X);
                                                Json json2 = N;
                                                yl ylVar2 = g;
                                                C = new oc(json2, j4, X);
                                                Json json3 = N;
                                                yl ylVar3 = g;
                                                f = new o4(json3, X, j9);
                                                H = new c_(N, (short) i3, j5);
                                                v = new g4(N, j8);
                                                J = new p1(N, j2);
                                                O = new dk(j6, N);
                                                Json json4 = N;
                                                yl ylVar4 = g;
                                                n = new od(json4, j11, X);
                                                z = new bg();
                                                g.Q((char) i7, (short) i8, i9);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j14;
                                            if (i18 >= length2) {
                                                str3 = "ß´[ º\u008f±\\kz\u0006$R\u0082g9";
                                                length2 = "ß´[ º\u008f±\\kz\u0006$R\u0082g9".length();
                                                i18 = 0;
                                            }
                                            break;
                                    }
                                    int i22 = i18;
                                    i18 += 8;
                                    byte[] bytes2 = str3.substring(i22, i18).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i20 = i17;
                                    i17++;
                                    j12 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i23 = i11;
                        i11++;
                        strArr[i23] = strIntern;
                        int i24 = i13 + cCharAt;
                        i12 = i24;
                        if (i24 < length) {
                        }
                        str = "w×4\u001dC\u008f?}ç¯ÛÏò¡\u0012\u0000(Õ£ÚÕh\u0003\u008aâd@m¬\u0019uÛ-Þ,-ÇS\u009f\u0010\u001d\u0082\u008eð$w;7\u0088MÇ'Èª|¬·";
                        length = "w×4\u001dC\u008f?}ç¯ÛÏò¡\u0012\u0000(Õ£ÚÕh\u0003\u008aâd@m¬\u0019uÛ-Þ,-ÇS\u009f\u0010\u001d\u0082\u008eð$w;7\u0088MÇ'Èª|¬·".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i13 = i2 + 1;
                strSubstring = str.substring(i13, i13 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i12);
        }
    }

    public static void y(_g[] _gVarArr) {
        E = _gVarArr;
    }

    public static _g[] S() {
        return E;
    }

    private static Throwable a(Throwable th) {
        return th;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 29903;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/yl", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "su/catlean/yl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yl.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 23576;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/yl", e2);
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
            java.lang.String r1 = "su/catlean/yl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yl.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
