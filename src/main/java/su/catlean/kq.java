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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1794;
import net.minecraft.class_1799;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kq.class */
public final class kq extends _g {

    @NotNull
    public static final kq T;
    static final KProperty[] B;

    @NotNull
    private static final cw L;

    @NotNull
    private static final c8 f;

    @NotNull
    private static final i9 G;
    private static final long a = yz.a(6399819449303119250L, 8299625213245895197L, MethodHandles.lookup().lookupClass()).a(164289998049550L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private kq(int i, byte b2, int i2) {
        long j = (((((long) i) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i2) << 40) >>> 40)) ^ a;
        super((String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3993, 4133875631634725116L ^ j) /* invoke-custom */, jt.y(), null, 4, null, j ^ 36648310481389L);
    }

    private final f9 T(long j) {
        return (f9) L.E(this, (a ^ j) ^ 62444488181023L, B[0]);
    }

    private final void j(f9 f9Var, long j) {
        L.b(this, (a ^ j) ^ 113376829438068L, B[0], f9Var);
    }

    private final int v(long j) {
        return ((Number) f.E(this, (a ^ j) ^ 33472314783351L, B[1])).intValue();
    }

    private final void q(int i, long j) {
        f.b(this, (a ^ j) ^ 40226335396339L, B[1], Integer.valueOf(i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02dd: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:su.catlean.n5), (r2 I:su.catlean.f9) VIRTUAL call: su.catlean.gg.X(long, su.catlean.n5, su.catlean.f9):su.catlean.fg
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void r(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kq.r(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private static final boolean k(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12362, 9221174982013859035L ^ (a ^ 2918729978881L)) /* invoke-custom */);
        return class_1799Var.method_7909() instanceof class_1794;
    }

    private static final Unit h(class_3965 class_3965Var) {
        long j = a ^ 60621628107539L;
        long j2 = j ^ 29081597669051L;
        zf.Z((int) (j >>> 32), ((j ^ 8719975554996L) << 32) >>> 32).method_2896(zf.v(j2), class_1268.field_5808, class_3965Var);
        zf.v(j2).method_6104(class_1268.field_5808);
        return Unit.INSTANCE;
    }

    private static final Unit X(fg fgVar, class_3965 class_3965Var) {
        long j = a ^ 127781657193048L;
        gg.P.T(j ^ 52267832311830L, fgVar.a(), T.T(j ^ 13457191969603L), () -> {
            return h(r4);
        });
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 137425063108877L;
        long j2 = j ^ 74927529484750L;
        long j3 = j ^ 137015507456057L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j3 << 32) >>> 56);
        int i4 = (int) ((j3 << 40) >>> 40);
        long j4 = j ^ 133696197721214L;
        long j5 = j ^ 25574446386092L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i6 = 0;
        String str = "Ç~\u009fzy*0!b#Zo\u0090#EÒºÅ¿Íì\u001a!w\u0090\u0019ÜKà\u007ft¥\u009cèJ\u008dâÏmäXl8\u0088|Ç»º\u0080y®V\u0004×\u001as\u0010&Í&¼÷z\u0083!Ö-G\u008eZöþy(ä'<o¹\u0093Æ\ty\u0081¼L%ÍÏ\u0091/\u007f$®\u009d\u0012Ò4\u0015m\u0004'5\u0083%kñCk\u000b2ïRi\u0018ö\"\u0015}\u0015v\u0087ÔÆó¨\u007fQ¨/ÞdÁéh4Ò\u009cÅ\u0018+QÑü7;\u008a\u001dÑ®µ~nö\u009d\u0006@\u000f!\u0018ägB\u0098\u0010,)\u001b«ý:\u0086t!â\u001d¹\u0002\u001crÉ\u0010¥Ëq\u001f\u001bÇöÅÛR¡tZ\u0005j\u0083 \u0004\nGû)\u0010\u0086\u0012\u0087æ\u0083ô(;Pd\u008d·\u000f0ý¯Cê~©»\u001f=ë¾\u0082 0l\f1\u008e«zê6Ô\u0002\u008a$ãªzz\u0088nw¦\u009f²\u0089X=î\u0080Ö+H\u0014";
        int length = "Ç~\u009fzy*0!b#Zo\u0090#EÒºÅ¿Íì\u001a!w\u0090\u0019ÜKà\u007ft¥\u009cèJ\u008dâÏmäXl8\u0088|Ç»º\u0080y®V\u0004×\u001as\u0010&Í&¼÷z\u0083!Ö-G\u008eZöþy(ä'<o¹\u0093Æ\ty\u0081¼L%ÍÏ\u0091/\u007f$®\u009d\u0012Ò4\u0015m\u0004'5\u0083%kñCk\u000b2ïRi\u0018ö\"\u0015}\u0015v\u0087ÔÆó¨\u007fQ¨/ÞdÁéh4Ò\u009cÅ\u0018+QÑü7;\u008a\u001dÑ®µ~nö\u009d\u0006@\u000f!\u0018ägB\u0098\u0010,)\u001b«ý:\u0086t!â\u001d¹\u0002\u001crÉ\u0010¥Ëq\u001f\u001bÇöÅÛR¡tZ\u0005j\u0083 \u0004\nGû)\u0010\u0086\u0012\u0087æ\u0083ô(;Pd\u008d·\u000f0ý¯Cê~©»\u001f=ë¾\u0082 0l\f1\u008e«zê6Ô\u0002\u008a$ãªzz\u0088nw¦\u009f²\u0089X=î\u0080Ö+H\u0014".length();
        char cCharAt = '8';
        int i7 = -1;
        while (true) {
            int i8 = i7 + 1;
            String strSubstring = str.substring(i8, i8 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i9 = i6;
                        i6++;
                        strArr[i9] = strIntern;
                        int i10 = i8 + cCharAt;
                        i = i10;
                        if (i10 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[11];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i12 = 0;
                            String str3 = "\u0086|\u0014·ýå\u0003ãì\u0004\b¼#Ü\u009b?";
                            int length2 = "\u0086|\u0014·ýå\u0003ãì\u0004\b¼#Ü\u009b?".length();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = str3.substring(i14, i13).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i15 = i12;
                                i12++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i16 = i15;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i16) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i13 >= length2) {
                                                e = jArr;
                                                g = new Integer[4];
                                                B = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(kq.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14147, 4349096696419600091L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31557, 2909434049252068057L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(kq.class, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10057, 3706712194223036115L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8926, 6189496397632099137L ^ j) /* invoke-custom */, 0))};
                                                T = new kq(i2, (byte) i3, i4);
                                                L = yp.L(T, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(137, 4690376212406694172L ^ j) /* invoke-custom */, f9.SILENT_FULL, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26994, 5568711660460710184L ^ j) /* invoke-custom */, null, j5);
                                                f = yp.L(T, (String) b(MethodHandles.lookup(), "e", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4150, 5794972163853279663L ^ j) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29011, 794568378398277899L ^ j) /* invoke-custom */), j4, null, null, (int) c(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3025, 5006484092840311688L ^ j) /* invoke-custom */, null);
                                                G = new i9(j2);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i13 >= length2) {
                                                str3 = "õ\u0095\u001dó8\r\u0005\u0093\u009f]!ÉMV[¡";
                                                length2 = "õ\u0095\u001dó8\r\u0005\u0093\u009f]!ÉMV[¡".length();
                                                i13 = 0;
                                            }
                                            break;
                                    }
                                    int i17 = i13;
                                    i13 += 8;
                                    byte[] bytes2 = str3.substring(i17, i13).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i15 = i12;
                                    i12++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i18 = i6;
                        i6++;
                        strArr[i18] = strIntern;
                        int i19 = i8 + cCharAt;
                        i7 = i19;
                        if (i19 < length) {
                        }
                        str = "ßCQ\u001e\u0094å·ÀÌ\"w¹\u0085XÃ\u009a 7\u001a\"\u0098äb½Î¥\u008aXónGÃómqbÍ±#\u0002kE\u0087h\u00891gÙn";
                        length = "ßCQ\u001e\u0094å·ÀÌ\"w¹\u0085XÃ\u009a 7\u001a\"\u0098äb½Î¥\u008aXónGÃómqbÍ±#\u0002kE\u0087h\u00891gÙn".length();
                        cCharAt = 16;
                        i = -1;
                        break;
                        break;
                }
                i8 = i + 1;
                strSubstring = str.substring(i8, i8 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i7);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 18006;
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
                throw new RuntimeException("su/catlean/kq", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/kq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kq.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 18320;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kq", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/kq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kq.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
