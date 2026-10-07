package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ip.class */
@Serializable
public final class ip {

    @NotNull
    public static final e u;

    @NotNull
    private final List b;

    @JvmField
    @NotNull
    private static final Lazy[] U;
    private static final String[] c;
    private static final String[] d;
    private static final long a = yz.a(529438658226126684L, -7499037509600963616L, MethodHandles.lookup().lookupClass()).a(262750791792157L);
    private static final Map e = new HashMap(13);

    public ip(long a2, @NotNull List players) {
        Intrinsics.checkNotNullParameter(players, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25766, 5897612146831382036L ^ (a ^ a2)) /* invoke-custom */);
        this.b = players;
    }

    @NotNull
    public final List o() {
        return this.b;
    }

    @NotNull
    public final List h() {
        return this.b;
    }

    @NotNull
    public final ip K(char a2, @NotNull List players, long a3) {
        long j = ((((long) a2) << 48) | ((a3 << 16) >>> 16)) ^ a;
        Intrinsics.checkNotNullParameter(players, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10498, 343409215856708230L ^ j) /* invoke-custom */);
        return new ip(j ^ 58804615262368L, players);
    }

    public static ip P(ip ipVar, short s, List list, int i, short s2, Object obj, int i2) {
        long j = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        int i3 = (int) (j >>> 48);
        long j2 = ((j ^ 15062162319528L) << 16) >>> 16;
        if ((i & 1) != 0) {
            list = ipVar.b;
        }
        return ipVar.K((char) i3, list, j2);
    }

    @NotNull
    public String toString() {
        long j = a ^ 31767118431327L;
        return (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19031, 4144336726445777753L ^ j) /* invoke-custom */ + this.b + ")";
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            long r0 = su.catlean.ip.a
            r1 = 60162745433835(0x36b7bb11feeb, double:2.972434567835E-310)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 6811666791029284937(0x5e87e6db4fa02049, double:2.3876914977565353E147)
            r1 = r8
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r6
            r1 = r10
            if (r1 != 0) goto L37
            r1 = r7
            if (r0 != r1) goto L36
            goto L2a
        L20:
            r1 = 6781778234451977064(0x5e1db75f71fc6368, double:2.3191704212153825E145)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L2c
            throw r0     // Catch: java.lang.NumberFormatException -> L2c
        L2a:
            r0 = 1
            return r0
        L2c:
            r1 = 6781778234451977064(0x5e1db75f71fc6368, double:2.3191704212153825E145)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L36:
            r0 = r7
        L37:
            r1 = r10
            if (r1 != 0) goto L5c
            boolean r0 = r0 instanceof su.catlean.ip     // Catch: java.lang.NumberFormatException -> L45 java.lang.NumberFormatException -> L51
            if (r0 != 0) goto L5b
            goto L4f
        L45:
            r1 = 6781778234451977064(0x5e1db75f71fc6368, double:2.3191704212153825E145)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L51
            throw r0     // Catch: java.lang.NumberFormatException -> L51
        L4f:
            r0 = 0
            return r0
        L51:
            r1 = 6781778234451977064(0x5e1db75f71fc6368, double:2.3191704212153825E145)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5b:
            r0 = r7
        L5c:
            su.catlean.ip r0 = (su.catlean.ip) r0
            r11 = r0
            r0 = r6
            java.util.List r0 = r0.b     // Catch: java.lang.NumberFormatException -> L78
            r1 = r11
            java.util.List r1 = r1.b     // Catch: java.lang.NumberFormatException -> L78
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L78
            r1 = r10
            if (r1 != 0) goto L8f
            if (r0 != 0) goto L8e
            goto L82
        L78:
            r1 = 6781778234451977064(0x5e1db75f71fc6368, double:2.3191704212153825E145)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L84
            throw r0     // Catch: java.lang.NumberFormatException -> L84
        L82:
            r0 = 0
            return r0
        L84:
            r1 = 6781778234451977064(0x5e1db75f71fc6368, double:2.3191704212153825E145)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8e:
            r0 = 1
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ip.equals(java.lang.Object):boolean");
    }

    @JvmStatic
    public static final void S(ip self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy) U[0].getValue(), self.b);
    }

    public ip(int seen0, long a2, List players, SerializationConstructorMarker serializationConstructorMarker) {
        long j = a ^ a2;
        if (1 != (1 & seen0)) {
            PluginExceptionsKt.throwMissingFieldException(seen0, 1, zc.y.getDescriptor());
        }
        this.b = players;
    }

    private static final KSerializer y() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    public static final Lazy[] i() {
        return U;
    }

    static {
        long j = a ^ 115362654863634L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = "\u0018i\u0092.\u001fô·½«\u0015\u0083\u0018¨\u001f\"h0\u008b\u0086T®\bÕ \b1R\u00190\u009b@\u0081\u0091V*=´=vkêüvP\u009b\"n\u00adÖ\u0087Á\u000e2\u0092nÃ¶\u0003¶¿¥\u001f&\u008a\"\u0010ÂÑ`\u001f`d¥Êf%\u0011æ²ù'\u0014".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("\u0018i\u0092.\u001fô·½«\u0015\u0083\u0018¨\u001f\"h0\u008b\u0086T®\bÕ \b1R\u00190\u009b@\u0081\u0091V*=´=vkêüvP\u009b\"n\u00adÖ\u0087Á\u000e2\u0092nÃ¶\u0003¶¿¥\u001f&\u008a\"\u0010ÂÑ`\u001f`d¥Êf%\u0011æ²ù'\u0014".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                c = strArr;
                d = new String[3];
                u = new e(null);
                U = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ip::y)};
                return;
            }
            cCharAt = "\u0018i\u0092.\u001fô·½«\u0015\u0083\u0018¨\u001f\"h0\u008b\u0086T®\bÕ \b1R\u00190\u009b@\u0081\u0091V*=´=vkêüvP\u009b\"n\u00adÖ\u0087Á\u000e2\u0092nÃ¶\u0003¶¿¥\u001f&\u008a\"\u0010ÂÑ`\u001f`d¥Êf%\u0011æ²ù'\u0014".charAt(i3);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 19652;
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
                d[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ip", e2);
            }
        }
        return d[i2];
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
            java.lang.String r1 = "su/catlean/ip"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ip.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
