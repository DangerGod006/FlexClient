package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1820;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/en.class */
public final class en extends _g {

    @NotNull
    public static final en b;
    static final KProperty[] Y;

    @NotNull
    private static final cw n;

    @NotNull
    private static final c8 J;

    @NotNull
    private static final i9 C;
    private static final long a = yz.a(1345393246632750891L, 5283128540758722505L, MethodHandles.lookup().lookupClass()).a(281128856108139L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    private en(byte b2, long j) {
        long j2 = ((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21502, 5252121623768221336L ^ j2) /* invoke-custom */, jt.y(), null, 4, null, j2 ^ 36390075280474L);
    }

    private final f9 Y(long j) {
        return (f9) n.E(this, (a ^ j) ^ 74490798597762L, Y[0]);
    }

    private final void W(int i, f9 f9Var, int i2, int i3) {
        n.b(this, ((((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ a) ^ 20763574947518L, Y[0], f9Var);
    }

    private final int G(long j) {
        return ((Number) J.E(this, (a ^ j) ^ 129505874635275L, Y[1])).intValue();
    }

    private final void Q(long j, int i) {
        J.b(this, (a ^ j) ^ 53545212052951L, Y[1], Integer.valueOf(i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0265: INVOKE (r-1 I:su.catlean._8), (r0 I:long), (r1 I:su.catlean.t5) VIRTUAL call: su.catlean._8.C(long, su.catlean.t5):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void l(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.en.l(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private static final boolean V(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14109, 5582633122024227258L ^ (a ^ 72141649912418L)) /* invoke-custom */);
        return class_1799Var.method_7909() instanceof class_1820;
    }

    private static final Unit y(class_1297 class_1297Var) {
        long j = a ^ 95384456230999L;
        long j2 = j ^ 132843895870997L;
        zf.Z((int) (j >>> 32), ((j ^ 111391864170266L) << 32) >>> 32).method_2905(zf.v(j2), class_1297Var, class_1268.field_5808);
        zf.v(j2).method_6104(class_1268.field_5808);
        return Unit.INSTANCE;
    }

    private static final Unit c(fg fgVar, class_1297 class_1297Var) {
        long j = a ^ 107470676002223L;
        long j2 = j ^ 62961266000907L;
        gg.P.T(j2, fgVar.a(), b.Y(j ^ 108583014674217L), () -> {
            return y(r4);
        });
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 29437419988048L;
        long j2 = j ^ 36694312030073L;
        long j3 = j ^ 31758900204233L;
        int i2 = (int) (j >>> 56);
        long j4 = ((j ^ 29584309672147L) << 8) >>> 8;
        long j5 = j ^ 125586460812571L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i4 = 0;
        String str = "U\u0083®\u0004\u0011DÉ\u0011Á=¢D¬\u000bw\u0013u\u0089FS;\u000fYúQC\u0099\u0011\u008aX=î\u0018òÏ?È~Ô&ºÝ4w\u009aB¿«\u0010ÿ\u009dfÓ\u001a÷o\u0010\u0081\\H\u0088È³Ö9\"\u008c^ê+c©¯ cI!i\u0088\u001b\u0088\u0097û\u0080û¥EÍ\u0080fzta3ª\u001eñÝk`ÊÀM©ÝS\u0010wôu.úqb®\u009bQÑ\u0014\r½ýþ\u0010áí¹#Z\u0083Y\u009cç\u0098Uu\u0092¯á\u0092(!QP\u0083Ø±\u009fÅæ»ôHw\u0081;\u0017ù=¢Í\u009cÇTgjøDû±§Ôð\t|\u009d\u0011ðO_y8v.Â!íE\u0095»¯*ù\u0002\u0007À Co\u0086WKã³ús\u008e\u0018\u0083\u00ad¿«v3¼\u0019i°\u0005Z\u0003õ\u001cø+ÔÎU\u0087_\u0098[ DÉYç[\u0018ôô³\tGûîF\tB\u0083\u0005[æÏ6ùïä\u0083QÔO¶\u0010\tý\u0019Ê\u009e\u0090¢\u0091KåIÚ\u0095\u001beV";
        int length = "U\u0083®\u0004\u0011DÉ\u0011Á=¢D¬\u000bw\u0013u\u0089FS;\u000fYúQC\u0099\u0011\u008aX=î\u0018òÏ?È~Ô&ºÝ4w\u009aB¿«\u0010ÿ\u009dfÓ\u001a÷o\u0010\u0081\\H\u0088È³Ö9\"\u008c^ê+c©¯ cI!i\u0088\u001b\u0088\u0097û\u0080û¥EÍ\u0080fzta3ª\u001eñÝk`ÊÀM©ÝS\u0010wôu.úqb®\u009bQÑ\u0014\r½ýþ\u0010áí¹#Z\u0083Y\u009cç\u0098Uu\u0092¯á\u0092(!QP\u0083Ø±\u009fÅæ»ôHw\u0081;\u0017ù=¢Í\u009cÇTgjøDû±§Ôð\t|\u009d\u0011ðO_y8v.Â!íE\u0095»¯*ù\u0002\u0007À Co\u0086WKã³ús\u008e\u0018\u0083\u00ad¿«v3¼\u0019i°\u0005Z\u0003õ\u001cø+ÔÎU\u0087_\u0098[ DÉYç[\u0018ôô³\tGûîF\tB\u0083\u0005[æÏ6ùïä\u0083QÔO¶\u0010\tý\u0019Ê\u009e\u0090¢\u0091KåIÚ\u0095\u001beV".length();
        char cCharAt = '8';
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
                            c = strArr;
                            d = new String[11];
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
                            int length2 = "r;>DÛ\u009b\u009f¥\u0083AZå\u008a\u0092ò\u0082÷Ð\u0000^\u008cpÑ-".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "r;>DÛ\u009b\u009f¥\u0083AZå\u008a\u0092ò\u0082÷Ð\u0000^\u008cpÑ-".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            Y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(en.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19254, 3558626394389117861L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20631, 9051557480774164486L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(en.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29702, 7804239632437986463L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15179, 3226257717776190416L ^ j) /* invoke-custom */, 0))};
                            b = new en((byte) i2, j4);
                            n = yp.L(b, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26495, 8103161649218082797L ^ j) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) jArr[1], null, j5);
                            J = yp.L(b, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14266, 4798443359935629098L ^ j) /* invoke-custom */, 0, new IntRange(0, (int) jArr[0]), j3, null, null, (int) jArr[2], null);
                            C = new i9(j2);
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
                        str = "V\u0014]n+ûAÔí\u0094âò[_7g\u0088®8µ\u0096ß¼ù é\u008f\u0095\u00adòÓc\u000b/â\u0092É\u0013â^®^i5OLÒ±'4LÌeaKÏì";
                        length = "V\u0014]n+ûAÔí\u0094âò[_7g\u0088®8µ\u0096ß¼ù é\u008f\u0095\u00adòÓc\u000b/â\u0092É\u0013â^®^i5OLÒ±'4LÌeaKÏì".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 27116;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/en", e2);
            }
        }
        return d[i2];
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
            java.lang.String r1 = "su/catlean/en"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.en.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
