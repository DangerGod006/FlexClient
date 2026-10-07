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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2378;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e9.class */
public final class e9 extends _g {

    @NotNull
    public static final e9 k;
    static final KProperty[] P;

    @NotNull
    private static final cw J;

    @NotNull
    private static final cq u;

    @NotNull
    private static final cq S;

    @NotNull
    private static final cq L;
    private static final long a = yz.a(4988594446482109599L, 1743809862500794472L, MethodHandles.lookup().lookupClass()).a(269193059696458L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private e9(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9431, 8614772067324858558L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 120928454989288L);
    }

    private final s2 I(int i, int i2, char c2) {
        return (s2) J.E(this, ((((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 36805076087774L, P[0]);
    }

    private final boolean Q(long j) {
        return ((Boolean) u.E(this, (a ^ j) ^ 85229461290945L, P[1])).booleanValue();
    }

    private final boolean r(int i, char c2, int i2) {
        return ((Boolean) S.E(this, ((((((long) i) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i2) << 48) >>> 48)) ^ a) ^ 59966546400598L, P[2])).booleanValue();
    }

    private final boolean Y(long j) {
        return ((Boolean) L.E(this, (a ^ j) ^ 9161832934112L, P[3])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:41:0x017b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void M(su.catlean.api.event.events.player.PlayerUpdateEvent r16) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e9.M(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private final float t(class_1799 class_1799Var, long j) {
        return class_1890.method_8225((class_6880) ((class_2378) zf.z((a ^ j) ^ 109431755083784L).method_30349().method_46759(class_1893.field_9098.method_58273()).get()).method_10223(class_1893.field_9098.method_29177()).get(), class_1799Var);
    }

    static {
        int i;
        long j = a ^ 44357384567478L;
        long j2 = j ^ 110610147475335L;
        long j3 = j ^ 132535589268110L;
        long j4 = j ^ 63736879173690L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i3 = 0;
        String str = "\u0007ß\u0090t\u0019«¨q\u001bD\u0001Q ë¶úU/\u001fÜí\u0098g`{W³®MÌ\u0089æ\u0010íP©¾Àÿ\u0015M0m\u0015\u0098ä\u000fÏ\u0086\u0010\u0007\u001bY¨ð¿uæö®\u001aê\u0098¦e#\u0080ÅX\u008a\u001b#¸\u0098w\u007fn\u001eGÐ/¢\u000f\u0017\u0007\u0003 *f\u0015\u009d4Ñß-r~Ùªâ\u0086r¬<C·\u0091\u0096ï\u0001`£TÃ\u0002k\u0095ü\u0082\u0088\u0086\u0012/x\u008dóåLnãb\u0085\u001e\u0083\u008fÉ¹\u0099ï\u009c«ä¶\u0093X\u0099÷3.9\u0080i úø6´\u0017\u0010\u0090WLáÀ\u0016ÚØ»\u008bì¡ý\u009bW\u0004\u0011 /\u009c·;w[}\u0080ûr\u0084I\\rõ*Ë\u000f\u0010wÙ\bàLB)\f´G\n±÷p§Q\u0010ö¡\u009cZ÷å8x\u009drJÐð\u001a/\u009e \u008d\u0010|ìB\u0015\u0010\u0094ûØ«E'¥ÑW4\u008e\u0010\u0080\u009b\u0017ÈV2PÈ«÷\u0096\u001c \u0010.91É÷¡¡\u0014Á\u008fÒ«mÂf¦\u0010\u0000O\u000fÒ³\\®¿Ú§\u0098I+®\ný\u0018Wì¸D`\u001bÎ\u000f\u008fæ\u0097·|¹æ(º\u001c³\u0013ÆyÏ¾ \u0081s¤t?<\u0096®\u008dÖx\"Dâ\u0003¦\u00ad?U\u0002Ûîã\u0015¤¤\u009d »{\u00ad\u00140/H\u0096)ôÈhª\u0081\u008e)\tazãÔ)\u008aµ\\\u008chÕX\u0094´\u0004\u0092Ç:\u0085§\u0099\u008cg'G\b\u0007\u000f\u0087h6¡ï0[\u0096 \\¶Ú)ñ$À\u0086\u0002\u001b\u009b\u0081MÞW\u001b\u0090£SñO\fi6ò*¦Å°\u008fá6";
        int length = "\u0007ß\u0090t\u0019«¨q\u001bD\u0001Q ë¶úU/\u001fÜí\u0098g`{W³®MÌ\u0089æ\u0010íP©¾Àÿ\u0015M0m\u0015\u0098ä\u000fÏ\u0086\u0010\u0007\u001bY¨ð¿uæö®\u001aê\u0098¦e#\u0080ÅX\u008a\u001b#¸\u0098w\u007fn\u001eGÐ/¢\u000f\u0017\u0007\u0003 *f\u0015\u009d4Ñß-r~Ùªâ\u0086r¬<C·\u0091\u0096ï\u0001`£TÃ\u0002k\u0095ü\u0082\u0088\u0086\u0012/x\u008dóåLnãb\u0085\u001e\u0083\u008fÉ¹\u0099ï\u009c«ä¶\u0093X\u0099÷3.9\u0080i úø6´\u0017\u0010\u0090WLáÀ\u0016ÚØ»\u008bì¡ý\u009bW\u0004\u0011 /\u009c·;w[}\u0080ûr\u0084I\\rõ*Ë\u000f\u0010wÙ\bàLB)\f´G\n±÷p§Q\u0010ö¡\u009cZ÷å8x\u009drJÐð\u001a/\u009e \u008d\u0010|ìB\u0015\u0010\u0094ûØ«E'¥ÑW4\u008e\u0010\u0080\u009b\u0017ÈV2PÈ«÷\u0096\u001c \u0010.91É÷¡¡\u0014Á\u008fÒ«mÂf¦\u0010\u0000O\u000fÒ³\\®¿Ú§\u0098I+®\ný\u0018Wì¸D`\u001bÎ\u000f\u008fæ\u0097·|¹æ(º\u001c³\u0013ÆyÏ¾ \u0081s¤t?<\u0096®\u008dÖx\"Dâ\u0003¦\u00ad?U\u0002Ûîã\u0015¤¤\u009d »{\u00ad\u00140/H\u0096)ôÈhª\u0081\u008e)\tazãÔ)\u008aµ\\\u008chÕX\u0094´\u0004\u0092Ç:\u0085§\u0099\u008cg'G\b\u0007\u000f\u0087h6¡ï0[\u0096 \\¶Ú)ñ$À\u0086\u0002\u001b\u009b\u0081MÞW\u001b\u0090£SñO\fi6ò*¦Å°\u008fá6".length();
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
                            c = new String[15];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i9 = 0;
                            String str3 = "\u0089,Â$\u0013¬1·Ü\u0011_Dg¡ùPÞRc,&\u009d\u0098Òèbê¿ÜW\u0015ó";
                            int length2 = "\u0089,Â$\u0013¬1·Ü\u0011_Dg¡ùPÞRc,&\u009d\u0098Òèbê¿ÜW\u0015ó".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j5 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j6 = j5;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                    long j7 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j7;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[6];
                                                P = new KProperty[]{Reflection.property1(new PropertyReference1Impl(e9.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23161, 5383813327064221555L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29363, 2651734991732600758L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e9.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14912, 174370311586391878L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16296, 8601625415580590752L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e9.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17435, 1861075577049766168L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4662, 2281154237395078961L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e9.class, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12194, 8859672431720706733L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32477, 8368141229126411219L ^ j) /* invoke-custom */, 0))};
                                                k = new e9(j2);
                                                J = yp.L(k, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1990, 7022057660781697743L ^ j) /* invoke-custom */, s2.Legit, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27327, 5421686474332463597L ^ j) /* invoke-custom */, null, j4);
                                                u = yp.t(k, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9067, 2471900064549650023L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11502, 4629614215953459134L ^ j) /* invoke-custom */, null);
                                                S = yp.t(k, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9579, 8895312099456006249L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11502, 4629614215953459134L ^ j) /* invoke-custom */, null);
                                                L = yp.t(k, (String) b(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19345, 3796283975607867034L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11502, 4629614215953459134L ^ j) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i10 >= length2) {
                                                str3 = "tkæ\u0097^t>^\u0013¢\\Hñ}ëÜ";
                                                length2 = "tkæ\u0097^t>^\u0013¢\\Hñ}ëÜ".length();
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
                                    j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "I ?Æÿ\r\u0015¶\u000f;¬uÈ1Õ\u008fhÙ\u0087\u0014ep¡\u0012 j±ÚàÖÜ\u001c\u0018/\n $B\u000eFäç\u0010è²Ï¿YYqüB \u0095+\u0013!";
                        length = "I ?Æÿ\r\u0015¶\u000f;¬uÈ1Õ\u008fhÙ\u0087\u0014ep¡\u0012 j±ÚàÖÜ\u001c\u0018/\n $B\u000eFäç\u0010è²Ï¿YYqüB \u0095+\u0013!".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 12626;
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
                throw new RuntimeException("su/catlean/e9", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/e9"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e9.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 9996;
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
                    throw new RuntimeException("su/catlean/e9", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/e9"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e9.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
