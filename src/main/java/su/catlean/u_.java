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
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u_.class */
public final class u_ extends _g {

    @NotNull
    public static final u_ c;
    static final KProperty[] h;

    @NotNull
    private static final c8 S;

    @NotNull
    private static final cw g;

    @NotNull
    private static final cq f;

    @NotNull
    private static i9 d;

    @NotNull
    private static i9 t;
    private static final long a = yz.a(-3669055477203919723L, -5218157628920450632L, MethodHandles.lookup().lookupClass()).a(261688049258216L);
    private static final String[] b;
    private static final String[] e;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;

    /* JADX WARN: Illegal instructions before constructor call */
    private u_(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17865, 2495862270515569594L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 23759555676765L);
    }

    private final int F(long j2) {
        return ((Number) S.E(this, (a ^ j2) ^ 28993418607929L, h[0])).intValue();
    }

    private final void A(long j2, int i2) {
        S.b(this, (a ^ j2) ^ 69106496473162L, h[0], Integer.valueOf(i2));
    }

    private final f9 P(int i2, int i3) {
        return (f9) g.E(this, (((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a) ^ 136769871100748L, h[1]);
    }

    private final void Z(int i2, f9 f9Var, int i3) {
        g.b(this, (((((long) i2) << 32) | ((((long) i3) << 32) >>> 32)) ^ a) ^ 106465045480145L, h[1], f9Var);
    }

    private final boolean h(int i2, int i3, byte b2) {
        return ((Boolean) f.E(this, ((((((long) i2) << 32) | ((((long) i3) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 118070272714922L, h[2])).booleanValue();
    }

    private final void v(long j2, boolean z, byte b2) {
        f.b(this, (((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 6130130695786L, h[2], Boolean.valueOf(z));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00db: INVOKE (r-1 I:su.catlean.u_), (r0 I:byte), (r1 I:long), (r2 I:net.minecraft.class_1297) VIRTUAL call: su.catlean.u_.J(byte, long, net.minecraft.class_1297):net.minecraft.class_243
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void d(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 1747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u_.d(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x011e: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean w(long r17, net.minecraft.class_2338 r19) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u_.w(long, net.minecraft.class_2338):boolean");
    }

    private final void s(class_2338 class_2338Var, long j2) {
        long j3 = a ^ j2;
        int i2 = (int) (j3 >>> 32);
        long j4 = ((j3 ^ 55886873776547L) << 32) >>> 32;
        long j5 = j3 ^ 51992659861676L;
        double dNextDouble = (Random.Default.nextDouble() / 10.0d) + 0.5d;
        zf.Z(i2, j4).method_2896(zf.v(j5), class_1268.field_5808, new class_3965(new class_243(((double) class_2338Var.method_10263()) + dNextDouble, class_2338Var.method_10264(), ((double) class_2338Var.method_10260()) + dNextDouble), class_2350.field_11033, class_2338Var, false));
        zf.v(j5).method_6104(class_1268.field_5808);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [float] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String[]] */
    public final float l(int a2, byte a3, @NotNull class_2338 pos, int a4) {
        long j2 = (((((long) a2) << 32) | ((((long) a3) << 56) >>> 32)) | ((((long) a4) << 40) >>> 40)) ^ a;
        long j3 = j2 ^ 25899799309527L;
        Object objAbs = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4724212003515407204L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(pos, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11572, 5443700942972694132L ^ j2) /* invoke-custom */);
        try {
            objAbs = (float) Math.abs(class_3532.method_15338(Math.toDegrees(Math.atan2(pos.method_46558().field_1350 - zf.v(j3).method_23321(), pos.method_46558().field_1352 - zf.v(j3).method_23317())) - 90.0d) - ((double) class_3532.method_15393(zf.v(j3).method_36454())));
            if (objAbs == 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], -4710874086602591070L, j2) /* invoke-custom */;
            }
            return objAbs;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAbs, -4695360500073375357L, j2) /* invoke-custom */;
        }
    }

    private static final Unit r(Map.Entry entry) {
        c.s((class_2338) entry.getKey(), (a ^ 35823385885118L) ^ 55704495573629L);
        return Unit.INSTANCE;
    }

    private static final boolean G(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22533, 4802871749963413275L ^ (a ^ 3345276760663L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_28042);
    }

    private static final class_2596 V(class_3965 class_3965Var, int i2) {
        return new class_2885(class_1268.field_5808, class_3965Var, i2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0078: MOVE (r25 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r-1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit t(net.minecraft.class_2338 r8, net.minecraft.class_3965 r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u_.t(net.minecraft.class_2338, net.minecraft.class_3965):kotlin.Unit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0044: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:int), (r2 I:su.catlean.f9), (r3 I:kotlin.jvm.functions.Function0) VIRTUAL call: su.catlean.gg.T(long, int, su.catlean.f9, kotlin.jvm.functions.Function0):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit T(su.catlean.fg r8, net.minecraft.class_2338 r9, net.minecraft.class_3965 r10) {
        /*
            long r0 = su.catlean.u_.a
            r1 = 90723010433638(0x528318cf5266, double:4.48231227425575E-310)
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 74224784789337(0x4381cdee4f59, double:3.66719162343713E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 121116228035886(0x6e2791bfa52e, double:5.98393674264057E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r15 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r16 = r2
            su.catlean.gg r0 = su.catlean.gg.P
            r1 = r8
            int r1 = r1.a()
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            su.catlean.u_ r2 = su.catlean.u_.c
            r3 = r15
            r4 = r16
            su.catlean.f9 r2 = r2.P(r3, r4)
            r3 = r9
            r4 = r10
            kotlin.Unit r3 = () -> { // kotlin.jvm.functions.Function0.invoke():java.lang.Object
                return t(r3, r4);
            }
            r-1.T(r0, r1, r2, r3)
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u_.T(su.catlean.fg, net.minecraft.class_2338, net.minecraft.class_3965):kotlin.Unit");
    }

    static {
        int i2;
        long j2 = a ^ 75894938175723L;
        long j3 = j2 ^ 60898995486553L;
        long j4 = j2 ^ 11952229589737L;
        long j5 = j2 ^ 41203622915983L;
        long j6 = j2 ^ 109971730830651L;
        long j7 = j2 ^ 124967106941551L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[20];
        int i4 = 0;
        String str = "ÒMÅr&µ\u008añ\rz¿õgfo´tÕl«\u0097ÛÄ\u007f\u0082\u0005UbÄp\u0019\u0099(é\u0081\u0014a½o\u008fv\u008dF\fÅÈn«Ý\u009f\u001bìZÎn\u0098\u0019\nOy\u0082kcq\u0001;¾þ\u0010íI×Ô(2ZEPI|\u008c\u0019Á\u009a\u0088×\u001bi14:\u0091µ°t\tê~|´orÀª)±¢ÜÿklF3Ù :õ¨\u0091=¹\u0083ñ\u007f\u000e\u0098\u0098H.»nB¼³\u009fn2n{\u007f\u00adö«S¤^q\u0010<Ø%õ\u009a°\"Ùh\u0098\u008e¹Ì¦£Ë8¾B\u0091½ ÛÃHÌ\u001f\u009e«\u009bêtÂÆ'\u008c\u008do6\bRK+\u001d\u009e=£\u0000¼\n\u0001\u0093Ä\u0014\u009b_ô\\'J ú7¦ëÛJ³¿C¿ØG8\u001f=â£\u0000\u0006\u0015ï_îý,÷Æ2*ñÁ,·Áýn\u000fû\u0086\u0090ÀH{°ÄT¤\u008b¿?6£¢qQÃ·áßnõá\\Ælï\u0085\u0013? >¿OÜI?Ïl\u0088²Ö\u0092P¶\u0007Ëù¥B\u001b* \u0015+¼ça¬\u001d\u0007³{\u0010®ÕÙå-Hw¾=ã\u0003& \u0089þæ\u0018,§Ð_ºûÝà\u008c\\Ã\u0095\u0000c#Æ\u0016\u009bq¡¶Ð«\u00ad\u0018û\u0000íYä\u008eõèÊ:^V1\u009c\u000fÛ7û\u0014+_ép«\u0018Q¡\"ñö«¼«)÷\u0081=m\u009c\u008b\u001ddDøµæüøÙ\u0018\u0090;¯\u001aââé£°á1iHÔ.\u008dÉí\u00adI\u009cÕ{$\u0010~vÖ\u0017ÐØq+í7úÄ]Dée\u0010z\u008d9÷\u000f~ÿ«fY\\\u007f¥p\u001a\u0083\u0010!Ë÷Ë§\u009bV\u0017t\u0002!Ë\u0001Ý\u0007K\u0018´r2\t´Ì½\u001eÊæ)\u0096\u0000pP¬M×\u00147)À¼Ê(\u0094\u0011;Élqz¡ß¤GÏ+\u0014\u008ct\u0086¤&J~\u00ad\"évH\nç}8\u0010\u008d¨i\u0014\u0015\u0013\u008d«M";
        int length = "ÒMÅr&µ\u008añ\rz¿õgfo´tÕl«\u0097ÛÄ\u007f\u0082\u0005UbÄp\u0019\u0099(é\u0081\u0014a½o\u008fv\u008dF\fÅÈn«Ý\u009f\u001bìZÎn\u0098\u0019\nOy\u0082kcq\u0001;¾þ\u0010íI×Ô(2ZEPI|\u008c\u0019Á\u009a\u0088×\u001bi14:\u0091µ°t\tê~|´orÀª)±¢ÜÿklF3Ù :õ¨\u0091=¹\u0083ñ\u007f\u000e\u0098\u0098H.»nB¼³\u009fn2n{\u007f\u00adö«S¤^q\u0010<Ø%õ\u009a°\"Ùh\u0098\u008e¹Ì¦£Ë8¾B\u0091½ ÛÃHÌ\u001f\u009e«\u009bêtÂÆ'\u008c\u008do6\bRK+\u001d\u009e=£\u0000¼\n\u0001\u0093Ä\u0014\u009b_ô\\'J ú7¦ëÛJ³¿C¿ØG8\u001f=â£\u0000\u0006\u0015ï_îý,÷Æ2*ñÁ,·Áýn\u000fû\u0086\u0090ÀH{°ÄT¤\u008b¿?6£¢qQÃ·áßnõá\\Ælï\u0085\u0013? >¿OÜI?Ïl\u0088²Ö\u0092P¶\u0007Ëù¥B\u001b* \u0015+¼ça¬\u001d\u0007³{\u0010®ÕÙå-Hw¾=ã\u0003& \u0089þæ\u0018,§Ð_ºûÝà\u008c\\Ã\u0095\u0000c#Æ\u0016\u009bq¡¶Ð«\u00ad\u0018û\u0000íYä\u008eõèÊ:^V1\u009c\u000fÛ7û\u0014+_ép«\u0018Q¡\"ñö«¼«)÷\u0081=m\u009c\u008b\u001ddDøµæüøÙ\u0018\u0090;¯\u001aââé£°á1iHÔ.\u008dÉí\u00adI\u009cÕ{$\u0010~vÖ\u0017ÐØq+í7úÄ]Dée\u0010z\u008d9÷\u000f~ÿ«fY\\\u007f¥p\u001a\u0083\u0010!Ë÷Ë§\u009bV\u0017t\u0002!Ë\u0001Ý\u0007K\u0018´r2\t´Ì½\u001eÊæ)\u0096\u0000pP¬M×\u00147)À¼Ê(\u0094\u0011;Élqz¡ß¤GÏ+\u0014\u008ct\u0086¤&J~\u00ad\"évH\nç}8\u0010\u008d¨i\u0014\u0015\u0013\u008d«M".length();
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
                            e = new String[20];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i10 = 0;
                            String str3 = "/n\u001f\u00131º\u0082¡OIõ\u0085\u008br×æC\u001bé\bN5\u0014òD\u0080o»\u001dë\u007fe>9¸¢ÊÃÝÊ";
                            int length2 = "/n\u001f\u00131º\u0082¡OIõ\u0085\u008br×æC\u001bé\bN5\u0014òD\u0080o»\u001dë\u007fe>9¸¢ÊÃÝÊ".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i11 >= length2) {
                                                j = jArr;
                                                k = new Integer[7];
                                                h = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(u_.class, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24369, 6726430682232031890L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28095, 8668091958064723985L ^ j2) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(u_.class, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27265, 4322493419436031807L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1698, 7734880899920253706L ^ j2) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(u_.class, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1199, 6039895447334670608L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18115, 1481534743466316642L ^ j2) /* invoke-custom */, 0))};
                                                c = new u_(j7);
                                                S = yp.L(c, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31174, 2589490881349758063L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24072, 3531144160481122017L ^ j2) /* invoke-custom */), j4, null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8592, 2900304523379206523L ^ j2) /* invoke-custom */, null);
                                                g = yp.L(c, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2159, 2725964013392256463L ^ j2) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6602, 5142997825541460258L ^ j2) /* invoke-custom */, null, j6);
                                                f = yp.t(c, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6514, 5654632897770376406L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20333, 7989104570198951811L ^ j2) /* invoke-custom */, null);
                                                d = new i9(j3);
                                                t = new i9(j3);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i11 >= length2) {
                                                str3 = "\u0092Í\u0005ëµbô\tA½Pëá\u001d=s";
                                                length2 = "\u0092Í\u0005ëµbô\tA½Pëá\u001d=s".length();
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
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "s\u008bÚ/\u0012ÅÔ\u0081\u008c#Ê4ÂÚÂåö\u0082éxÒÐy% E\u00adtÅ\u0013+K\u000b¹Èt-iÏ\u008eè\u0088rèô\u0006xvuK\u0084-¢\u0095\u008b¬Û";
                        length = "s\u008bÚ/\u0012ÅÔ\u0081\u008c#Ê4ÂÚÂåö\u0082éxÒÐy% E\u00adtÅ\u0013+K\u000b¹Èt-iÏ\u008eè\u0088rèô\u0006xvuK\u0084-¢\u0095\u008b¬Û".length();
                        cCharAt = 24;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15600;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u_", e2);
            }
        }
        return e[i3];
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/u_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u_.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 8631;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) j[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u_", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i3].intValue();
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/u_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u_.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
