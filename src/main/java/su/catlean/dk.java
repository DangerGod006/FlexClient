package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dk.class */
public final class dk implements co {

    @NotNull
    private final Json E;

    @NotNull
    private final File T;
    public List K;
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(1130710695779698727L, -7325873853899627731L, MethodHandles.lookup().lookupClass()).a(146233375789374L);
    private static final Map d = new HashMap(13);

    public dk(long a2, @NotNull Json json) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(json, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24605, 4405416984698372138L ^ j) /* invoke-custom */);
        this.E = json;
        this.T = new File(mj.v(), (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19106, 4378735865711291028L ^ j) /* invoke-custom */);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    @NotNull
    public final List P(long j) throws Exception {
        Object obj = a ^ j;
        try {
            obj = this.K;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25517, 6863529589819659957L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -809709469777168694L, obj) /* invoke-custom */;
        }
    }

    public final void x(char a2, @NotNull List list, long a3) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3857, 8603997097031021609L ^ (((((long) a2) << 48) | ((a3 << 16) >>> 16)) ^ a)) /* invoke-custom */);
        this.K = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean.dk] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // su.catlean.co
    public void w(long j) throws Exception {
        ?? r0;
        List arrayList;
        ArrayList arrayList2;
        ?? r02;
        ?? r03 = j;
        int i = (int) (r03 >>> 48);
        long j2 = ((j ^ 99836442500987L) << 16) >>> 16;
        try {
            r03 = this;
            if (this.T.createNewFile()) {
                arrayList2 = new ArrayList();
                r02 = r03;
            } else {
                try {
                    r0 = r03;
                    Json json = this.E;
                    String text$default = FilesKt.readText$default(this.T, null, 1, null);
                    json.getSerializersModule();
                    arrayList = (List) json.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), text$default);
                } catch (Exception e) {
                    r0 = r03;
                    zf.x().warn((String) a(MethodHandles.lookup(), "o", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2930, 8446054257099632961L ^ j) /* invoke-custom */);
                    arrayList = new ArrayList();
                }
                arrayList2 = arrayList;
                r02 = r0;
            }
            r02.x((char) i, arrayList2, j2);
        } catch (Exception unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -4904890097006921241L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean.co
    public void h(int i, int i2, byte b2) throws Exception {
        File file = this.T;
        Json json = this.E;
        List listP = P((((((long) i) << 32) | ((((long) i2) << 40) >>> 32)) | ((((long) b2) << 56) >>> 56)) ^ 33217499204655L);
        json.getSerializersModule();
        FilesKt.writeText$default(file, json.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), listP), null, 2, null);
    }

    static {
        int i;
        long j = a ^ 64613823944546L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "\u0013MÖ°\u009fp~ôË©áA\u0000ä\u0007âÏÍô\u0010Ei\u0090\u007f\u0010\u008d\u00adðËy\u0013à\u0001TnlÇ§C!û\u0010^ÎÿºJQ v©g£(5Tvx";
        int length = "\u0013MÖ°\u009fp~ôË©áA\u0000ä\u0007âÏÍô\u0010Ei\u0090\u007f\u0010\u008d\u00adðËy\u0013à\u0001TnlÇ§C!û\u0010^ÎÿºJQ v©g£(5Tvx".length();
        char cCharAt = 24;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[5];
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "þ¢û\u001dW\u0091çl\u0001\u0087î\u0012-2#\u009dXÈî÷\u0082utý§a\u0093W\u008bcüÌ§8\u0001BÈ\u008eirN´å\tº\u0011IG\"\u0011\u000fV\u001bøªDî\u000f;qÓ%ùç\u0080c,NÐ\u009bîi\u0004]üE\u0086Ú(Ù©ô\u0085SÍoÎ\u009d\u009c\u008f\u0098ÇÌ?m,±4æÏ½JIçò";
                        length = "þ¢û\u001dW\u0091çl\u0001\u0087î\u0012-2#\u009dXÈî÷\u0082utý§a\u0093W\u008bcüÌ§8\u0001BÈ\u008eirN´å\tº\u0011IG\"\u0011\u000fV\u001bøªDî\u000f;qÓ%ùç\u0080c,NÐ\u009bîi\u0004]üE\u0086Ú(Ù©ô\u0085SÍoÎ\u009d\u009c\u008f\u0098ÇÌ?m,±4æÏ½JIçò".length();
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

    private static Exception a(Exception exc) {
        return exc;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16678;
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
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/dk", e);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/dk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dk.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
