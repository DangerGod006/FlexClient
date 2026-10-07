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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jx.class */
@Deprecated(message = "This synthesized declaration should not be used directly", level = DeprecationLevel.HIDDEN)
public final /* synthetic */ class jx implements GeneratedSerializer {

    @NotNull
    public static final jx z;

    @NotNull
    private static final SerialDescriptor i;
    private static final long a = yz.a(-2333090486536464334L, -4329924625922885147L, MethodHandles.lookup().lookupClass()).a(277569783145539L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private jx() {
    }

    public final void p(@NotNull Encoder encoder, @NotNull o_ value, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 132343265788542L;
        Intrinsics.checkNotNullParameter(encoder, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19011, 4790838367228738982L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(value, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27423, 6882852742354836722L ^ j) /* invoke-custom */);
        SerialDescriptor serialDescriptor = i;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        o_.T(value, j2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:21:0x037e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.NotNull
    public final su.catlean.o_ G(long r21, @org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r23) {
        /*
            Method dump skipped, instruction units count: 1963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jx.G(long, kotlinx.serialization.encoding.Decoder):su.catlean.o_");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer[] childSerializers() {
        long j = a ^ 65238097945006L;
        Lazy[] lazyArrO = o_.O();
        KSerializer[] kSerializerArr = new KSerializer[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10534, 1552999767252196318L ^ j) /* invoke-custom */];
        kSerializerArr[0] = StringSerializer.INSTANCE;
        kSerializerArr[1] = lazyArrO[1].getValue();
        kSerializerArr[2] = lazyArrO[2].getValue();
        kSerializerArr[3] = lazyArrO[3].getValue();
        kSerializerArr[4] = lazyArrO[4].getValue();
        kSerializerArr[5] = lazyArrO[5].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13275, 4175543082851451176L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12300, 8463326832069755627L ^ j) /* invoke-custom */].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15234, 5883005354904275316L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19703, 1295274824443018763L ^ j) /* invoke-custom */].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17649, 1481104204281656861L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8027, 6656784374941281702L ^ j) /* invoke-custom */].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23048, 7554838042649471219L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13823, 3791278234437043985L ^ j) /* invoke-custom */].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19522, 7733456587874025121L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12216, 4346869393102921042L ^ j) /* invoke-custom */].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25645, 7424054926255363796L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6581, 9012791592927161176L ^ j) /* invoke-custom */].getValue();
        kSerializerArr[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4148, 4859308766734082753L ^ j) /* invoke-custom */] = lazyArrO[(int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31809, 4967663957454360245L ^ j) /* invoke-custom */].getValue();
        return kSerializerArr;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object value) {
        p(encoder, (o_) value, (a ^ 2095656882023L) ^ 101575214851702L);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: deserialize */
    public Object mo1886deserialize(Decoder decoder) {
        return G((a ^ 76579940551674L) ^ 93813144759558L, decoder);
    }

    static {
        int i2;
        long j = a ^ 140354012465302L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[17];
        int i4 = 0;
        String str = "WJ\u001d1<tÐ\u001a\búÄ¼ò&Ü|´ð¶á$\u0097\u0093Q\u0005\u0085ªÞP\u0088\u001bà ¡1åOc=D¢©±¹î\u001eR}FZ¸¾ú\u0005¨ë3M©|ñ½C\u0096À(jE<T\\ô<T\u0080\u0089ï¼Çë`\u000f\u001a\u0003ö\u0019\u001ak\u00ad\u000e[\u0019\u0083\u0017HAÞÃ0 Æ´ù\u0093ÃD\u0010$\u0089\u0002ÖWë\u001e6JÁ`²\u0082dþª\u0018ODÑm\u0088\u0088k\u0096^kÑM×/\u0082þTG\u0001ú/å¿\u008e(\u000e» \u008f¬t\u000e8¤?Éµ»_\u009bäc\u0082ÒÐ\u009c\u009fcîûN%Mð»¤ï\u0004\bwQ\u0014¾\u0003ù\u0018óÿIå¤0¥±_dÂ6\u0005C'ÚWíw$¸Bñs0\u0092rôp¹Èäe\u0004\\ëþñ¦\u000e\u0019\u001c\u009e½¤2TrM÷ñ\u008bó)ê\u001d3\u0011tæ\u007f/ uÒÄÔ\u0087l,òo§\u0018\u000fÉv\u0005û%%ª\u0003±t\u0095!\u0088oqÜ®+\u009b$Ñ9\u000b bÔÌ\u0087äVÀ¶ñ\f\u0007)\u009aÝ-¶j\u001fsu÷¸¦A}Aª kçv\u008f íÜtUí\u0094T³\u0088A[üÀóï\u0019\u0006xVóû®aPNZñËï.U \u0010T#ö(\u0005t©ÆWyÚ¿<\u0017*¹\u0010\u0087¨46wócç,wÊ\u001c\u009e¶l² '\u008b\u009cz&ð4câÊ»\\¢<\u0093ý\u0086\u0094\u0082\u0017ñ0´,\u0093æ\u0005¦\u0092\u0093ò!\u0010Dq\u0097ÖBÝ\u009f¥Aì\u0084]¸Wí\u0099";
        int length = "WJ\u001d1<tÐ\u001a\búÄ¼ò&Ü|´ð¶á$\u0097\u0093Q\u0005\u0085ªÞP\u0088\u001bà ¡1åOc=D¢©±¹î\u001eR}FZ¸¾ú\u0005¨ë3M©|ñ½C\u0096À(jE<T\\ô<T\u0080\u0089ï¼Çë`\u000f\u001a\u0003ö\u0019\u001ak\u00ad\u000e[\u0019\u0083\u0017HAÞÃ0 Æ´ù\u0093ÃD\u0010$\u0089\u0002ÖWë\u001e6JÁ`²\u0082dþª\u0018ODÑm\u0088\u0088k\u0096^kÑM×/\u0082þTG\u0001ú/å¿\u008e(\u000e» \u008f¬t\u000e8¤?Éµ»_\u009bäc\u0082ÒÐ\u009c\u009fcîûN%Mð»¤ï\u0004\bwQ\u0014¾\u0003ù\u0018óÿIå¤0¥±_dÂ6\u0005C'ÚWíw$¸Bñs0\u0092rôp¹Èäe\u0004\\ëþñ¦\u000e\u0019\u001c\u009e½¤2TrM÷ñ\u008bó)ê\u001d3\u0011tæ\u007f/ uÒÄÔ\u0087l,òo§\u0018\u000fÉv\u0005û%%ª\u0003±t\u0095!\u0088oqÜ®+\u009b$Ñ9\u000b bÔÌ\u0087äVÀ¶ñ\f\u0007)\u009aÝ-¶j\u001fsu÷¸¦A}Aª kçv\u008f íÜtUí\u0094T³\u0088A[üÀóï\u0019\u0006xVóû®aPNZñËï.U \u0010T#ö(\u0005t©ÆWyÚ¿<\u0017*¹\u0010\u0087¨46wócç,wÊ\u001c\u009e¶l² '\u008b\u009cz&ð4câÊ»\\¢<\u0093ý\u0086\u0094\u0082\u0017ñ0´,\u0093æ\u0005¦\u0092\u0093ò!\u0010Dq\u0097ÖBÝ\u009f¥Aì\u0084]¸Wí\u0099".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[17];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[34];
                            int i10 = 0;
                            String str3 = "ê$.©ü¿+\u0005º{§Æ\u0092À*QÅ5SJØ\u008dÓÍ¢ú\\j\u009càp\tÒJÀ\u0017X<ò\u0096=\u00864Ä$>½Ûg,lYßI©|Dã$ð\u0083Töd\u0006É\b\u0085ÿ¥ñî0ff\u000bËÜ1\u0094ÒOÁe°Z5¼\u0085@!i\u0003Í\u0087(ÙÐnV¾ÍQÕ#Þ:P\bõó\u001a~\u007fdRûÊÝÜÚ\u0092\u0010\u0093\\J½\u0096R³}.ôçäþÈ%2\u000f²\u001d7â®Â\u0080@µ\u001fÒSÐÚñ\u0085ò\u008eW;ªaé\u0095\u0014\r*\u009eVì\u0019ÁÓ5ÌñÞ\u0096\u009b¯\u0002aõ¸¯*\u009e:\u0096PN}£Rk\u0086\u0094ç|\u0005\u0096Ð¼SÛ'.5¤d.\u001eM z\u0090$¶üxò#\u009eÚ\u0000ØÇ\u00ad\u00192¶Q/·Ø÷#P\u008añCOì-¸\u0000\u0002ú(Êîì²\u001d¾\u0094";
                            int length2 = "ê$.©ü¿+\u0005º{§Æ\u0092À*QÅ5SJØ\u008dÓÍ¢ú\\j\u009càp\tÒJÀ\u0017X<ò\u0096=\u00864Ä$>½Ûg,lYßI©|Dã$ð\u0083Töd\u0006É\b\u0085ÿ¥ñî0ff\u000bËÜ1\u0094ÒOÁe°Z5¼\u0085@!i\u0003Í\u0087(ÙÐnV¾ÍQÕ#Þ:P\bõó\u001a~\u007fdRûÊÝÜÚ\u0092\u0010\u0093\\J½\u0096R³}.ôçäþÈ%2\u000f²\u001d7â®Â\u0080@µ\u001fÒSÐÚñ\u0085ò\u008eW;ªaé\u0095\u0014\r*\u009eVì\u0019ÁÓ5ÌñÞ\u0096\u009b¯\u0002aõ¸¯*\u009e:\u0096PN}£Rk\u0086\u0094ç|\u0005\u0096Ð¼SÛ'.5¤d.\u001eM z\u0090$¶üxò#\u009eÚ\u0000ØÇ\u00ad\u00192¶Q/·Ø÷#P\u008añCOì-¸\u0000\u0002ú(Êîì²\u001d¾\u0094".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                e = jArr;
                                                f = new Integer[34];
                                                z = new jx();
                                                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26128, 8692538524442035162L ^ j) /* invoke-custom */, z, (int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23255, 7295504323165880582L ^ j) /* invoke-custom */);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20352, 3615300970172820034L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2857, 8758082648675741414L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22549, 2018691202570665435L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26443, 1062013376332104341L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2365, 5533738866191002869L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32666, 2375498514092628573L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4660, 6564735096308725751L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20942, 7009671499281773573L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2608, 911414952898883574L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18406, 3718709448230511143L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17510, 6605982596057440674L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22672, 9051158431043370332L ^ j) /* invoke-custom */, false);
                                                pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22088, 5304452080901305217L ^ j) /* invoke-custom */, false);
                                                i = pluginGeneratedSerialDescriptor;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "ìÔ\u008b^pÝäN¼Íu\u0016Il\u0099D";
                                                length2 = "ìÔ\u008b^pÝäN¼Íu\u0016Il\u0099D".length();
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
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u0098L§\u0014\u0007,v\u0095«\u0019Ë\u008c\u0011iY\u008f\u000fõ\u001d¾þªw\u0093\u0003«¸¯!0Î·ë®²~]\u008dñi ¬\u0093\u0001\u0091g»áN \u0014a¨1Pa\u0096åiÝ«úû$\u0017oÇ±H\u001bÕÉ.";
                        length = "\u0098L§\u0014\u0007,v\u0095«\u0019Ë\u008c\u0011iY\u008f\u000fõ\u001d¾þªw\u0093\u0003«¸¯!0Î·ë®²~]\u008dñi ¬\u0093\u0001\u0091g»áN \u0014a¨1Pa\u0096åiÝ«úû$\u0017oÇ±H\u001bÕÉ.".length();
                        cCharAt = '(';
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

    private static UnknownFieldException a(UnknownFieldException unknownFieldException) {
        return unknownFieldException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 24311;
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
                throw new RuntimeException("su/catlean/jx", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            java.lang.String r1 = "su/catlean/jx"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jx.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 24827;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/jx", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            java.lang.String r1 = "su/catlean/jx"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jx.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
