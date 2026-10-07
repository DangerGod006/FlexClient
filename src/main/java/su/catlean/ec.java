package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ec.class */
public final class ec extends _g {

    @NotNull
    public static final ec l;
    static final /* synthetic */ KProperty[] Y;

    @NotNull
    private static final cq L;

    @NotNull
    private static final cq z;

    @NotNull
    private static final bg O;
    private static final long a = yz.a(-7438319786699045345L, 6538543648046080450L, MethodHandles.lookup().lookupClass()).a(52321821731271L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private ec(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26175, 945921915166814511L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 39101393605629L);
    }

    private final boolean i(long j) {
        return ((Boolean) L.E(this, (a ^ j) ^ 35775105826500L, Y[0])).booleanValue();
    }

    private final void e(long j, boolean z2) {
        L.b(this, (a ^ j) ^ 84477805502581L, Y[0], Boolean.valueOf(z2));
    }

    private final boolean p(int i, int i2, byte b2) {
        return ((Boolean) z.E(this, ((((((long) i) << 32) | ((((long) i2) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ a) ^ 20039836298614L, Y[1])).booleanValue();
    }

    private final void Z(boolean z2, long j) {
        z.b(this, (a ^ j) ^ 71298477183158L, Y[1], Boolean.valueOf(z2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0176: INVOKE (r-1 I:su.catlean.c7), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.c7.Y(long, java.lang.String):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void M(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.network.ReceivePacket r9) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ec.M(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.mojang.authlib.GameProfile] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r19v0 */
    private final String J(long j, String str) {
        ?? Method_2966;
        long j2 = a ^ j;
        Collection collectionMethod_45732 = zf.k(j2 ^ 135792186527048L).method_45732();
        Intrinsics.checkNotNullExpressionValue(collectionMethod_45732, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32579, 4288589759953531647L ^ j2) /* invoke-custom */);
        Collection collection = collectionMethod_45732;
        boolean z2 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6371488952520947348L, j2) /* invoke-custom */;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            while (true) {
                ?? r19 = next;
                next = r19 == true ? 1 : 0;
                do {
                    String strName = ((class_640) next).method_2966().name();
                    Intrinsics.checkNotNullExpressionValue(strName, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28392, 7517469012602872668L ^ j2) /* invoke-custom */);
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) strName, false, 2, (Object) null)) {
                        next = r19 == true ? 1 : 0;
                        Method_2966 = j2 >= 0 ? next : 0;
                    }
                } while (!z2);
            }
        }
        try {
            try {
                try {
                    class_640 class_640Var = (class_640) Method_2966;
                    if (class_640Var != null) {
                        Method_2966 = class_640Var.method_2966();
                        if (Method_2966 != 0) {
                            String strName2 = Method_2966.name();
                            if (strName2 != null) {
                                return strName2;
                            }
                        }
                    }
                    return "-";
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_2966, 6358995331499022419L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_2966, 6358995331499022419L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_2966, 6358995331499022419L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 98761874256384L;
        long j2 = j ^ 25206761121196L;
        long j3 = j ^ 100569879671076L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i3 = 0;
        String str = "\u0094j\u0097\u0019\u0018\u0018\u009d\u007f¤73À;b¬\u008e\u00106ë$ÏÆW\u0080\u00062;é W\u0014\u0086(\u0010²¹0\u0080A»u\u0007Õö\\\u0005£3Ì_(\u0004\u0087-¸:F9\u0097¦P\u000fk#Êý\u0098$Å\u0012bÎâ»ò³\u0005áA\u001aÞ\u009d®E\u0005*÷\u0089çfÁ #e\u0099µ'\u0099\u0091A\u009dõÓ$µ:ljéa\u008fº®^õß\r\u0013<\u0083\u00ad\b\u009cu Ý.nÙ\u009a\u0014ô\nX\u001b\u0004LZ?B9æ_Ñ\u0002\u008fÏ¶Ý\u009fõ+&Ø¡\u0018Ü\u0018\u0086ùw©t\u0019½1\tá6clæÖa~ë\u000e&:Ód\u001b@VÚ9\u0016¡õ\tÞ\u0085[\u00ady\u001b\u00adÝa\u001f\u0003\u0001\u001b£ ÙX\u0007áXz85\u008eñ0/N?\u0001&ü[òw\u0081ê\u008bbá`\u0090}\u0007b\n£\u001cÏi\u0080õáu©\u0087\u0085\u0018¾A\u007f´U=\u0081K¥©\u0081h\u0016j\u0096\u0099Ö\u0081\u0096®Àý'ç\u0018\u0000´²¡Ê\u0085\u0082D\u0007ù\u0099\u0083¨\u0002ö S\u0005K²ì¨8d 2\u0081\u0088\u009e,\u0098\u001cvË\u008e¾`öpó§7\u0018{\u0085\u0004ú·\u0006Ò\u0012³\u0001Tì\u0093  #kvÂo(x\u0087Î\u009eí\u0099º\u0007èÀt£©iøÑL¦\u0082\u0085ØÛÊo\fÖ";
        int length = "\u0094j\u0097\u0019\u0018\u0018\u009d\u007f¤73À;b¬\u008e\u00106ë$ÏÆW\u0080\u00062;é W\u0014\u0086(\u0010²¹0\u0080A»u\u0007Õö\\\u0005£3Ì_(\u0004\u0087-¸:F9\u0097¦P\u000fk#Êý\u0098$Å\u0012bÎâ»ò³\u0005áA\u001aÞ\u009d®E\u0005*÷\u0089çfÁ #e\u0099µ'\u0099\u0091A\u009dõÓ$µ:ljéa\u008fº®^õß\r\u0013<\u0083\u00ad\b\u009cu Ý.nÙ\u009a\u0014ô\nX\u001b\u0004LZ?B9æ_Ñ\u0002\u008fÏ¶Ý\u009fõ+&Ø¡\u0018Ü\u0018\u0086ùw©t\u0019½1\tá6clæÖa~ë\u000e&:Ód\u001b@VÚ9\u0016¡õ\tÞ\u0085[\u00ady\u001b\u00adÝa\u001f\u0003\u0001\u001b£ ÙX\u0007áXz85\u008eñ0/N?\u0001&ü[òw\u0081ê\u008bbá`\u0090}\u0007b\n£\u001cÏi\u0080õáu©\u0087\u0085\u0018¾A\u007f´U=\u0081K¥©\u0081h\u0016j\u0096\u0099Ö\u0081\u0096®Àý'ç\u0018\u0000´²¡Ê\u0085\u0082D\u0007ù\u0099\u0083¨\u0002ö S\u0005K²ì¨8d 2\u0081\u0088\u009e,\u0098\u001cvË\u008e¾`öpó§7\u0018{\u0085\u0004ú·\u0006Ò\u0012³\u0001Tì\u0093  #kvÂo(x\u0087Î\u009eí\u0099º\u0007èÀt£©iøÑL¦\u0082\u0085ØÛÊo\fÖ".length();
        char cCharAt = 16;
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
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[14];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i9 = 0;
                            int length2 = "Æ\u0012bT'În!¦\u0082ÛÓ»KbZ1±r¨ïo\u009a¶".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "Æ\u0012bT'În!¦\u0082ÛÓ»KbZ1±r¨ïo\u009a¶".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            e = jArr;
                            f = new Integer[3];
                            Y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(ec.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5153, 549058039775617901L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18238, 4728594193490358392L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ec.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23097, 3397716552464706929L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20714, 5006563047996860325L ^ j) /* invoke-custom */, 0))};
                            l = new ec(j3);
                            L = yp.t(l, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12875, 7875281981413115142L ^ j) /* invoke-custom */, false, j2, null, null, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16966, 1199050727170654844L ^ j) /* invoke-custom */, null);
                            z = yp.t(l, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31412, 7803953142963965428L ^ j) /* invoke-custom */, true, j2, null, null, (int) c(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14734, 6648404840455518647L ^ j) /* invoke-custom */, null);
                            O = new bg();
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i12 = i3;
                        i3++;
                        strArr[i12] = strIntern;
                        int i13 = i5 + cCharAt;
                        i4 = i13;
                        if (i13 < length) {
                        }
                        str = "\u008e\u0005¨3·\u0016xkà\u0086@;>Újp\u000e\u0004Ç\u001aR\u0081)Ö+Äè5\u0093m\u008b\u00060\u001e\u0018\u008døóGç\u0082Zo² \u0097ë\u0087\u0084Î\u008fã\u0085û\u0005àÎ@ÏÙ\u0015ì\u0001úg\u0006\u0015û\u001e\u0003\u0004\u0090êÒ7íHÌ`o\u0086";
                        length = "\u008e\u0005¨3·\u0016xkà\u0086@;>Újp\u000e\u0004Ç\u001aR\u0081)Ö+Äè5\u0093m\u008b\u00060\u001e\u0018\u008døóGç\u0082Zo² \u0097ë\u0087\u0084Î\u008fã\u0085û\u0005àÎ@ÏÙ\u0015ì\u0001úg\u0006\u0015û\u001e\u0003\u0004\u0090êÒ7íHÌ`o\u0086".length();
                        cCharAt = ' ';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 21554;
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
                throw new RuntimeException("su/catlean/ec", e2);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/ec"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ec.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 9029;
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
                    throw new RuntimeException("su/catlean/ec", e2);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/ec"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ec.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
