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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;
import su.catlean.api.event.events.client.InitEvent;
import su.catlean.api.event.events.client.PostTitleScreenInitEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: compiled from: CatLean.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/CatLean.class */
@ExcludeCommon
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsu/catlean/CatLean;", "Lsu/catlean/api/IPasteable;", "CatLean", "()V", "", "onInitializeClient", "Lsu/catlean/api/event/events/client/InitEvent;", "event", "M", "(Lsu/catlean/api/event/events/client/InitEvent;)V", "Lsu/catlean/api/event/events/client/PostTitleScreenInitEvent;", "X", "(Lsu/catlean/api/event/events/client/PostTitleScreenInitEvent;)V", "catlean"})
public final class CatLean implements IPasteable {

    @NotNull
    public static final CatLean INSTANCE;
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(898947561653736876L, -2409245294003337710L, MethodHandles.lookup().lookupClass()).a(59484523516562L);
    private static final Map d = new HashMap(13);

    private CatLean() {
    }

    public void onInitializeClient() {
        long j = a ^ 111274068642529L;
        ts.l(this, j ^ 134509087378048L);
        mr.t(j ^ 120695299351714L, this);
    }

    @Flow
    private final void M(InitEvent event) {
        long j = a ^ 24129198870584L;
        long j2 = j ^ 29502266757797L;
        int i = (int) ((j2 << 32) >>> 48);
        int i2 = (int) ((j2 << 48) >>> 48);
        PreLaunch.INSTANCE.L();
        cv.K(this, (int) (j >>> 32), (char) i, (char) i2);
        i4.h.y((short) (j >>> 48), (char) ((r1 << 16) >>> 48), (int) (((j ^ 53848494592964L) << 32) >>> 32));
        System.setProperty((String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25733, 4958189276859768870L ^ j) /* invoke-custom */, (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24705, 7071336512583967779L ^ j) /* invoke-custom */ + System.getProperty((String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29840, 8484118454674599985L ^ j) /* invoke-custom */));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.minecraft.class_310] */
    @Flow
    private final void X(PostTitleScreenInitEvent event) {
        long j = a ^ 59852727727436L;
        Object objF = j;
        long j2 = objF ^ 72659473070024L;
        long j3 = objF ^ 105557133716979L;
        try {
            if (sc.V()) {
                objF = zf.F(j2);
                objF.method_1507(new d7(j3));
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objF, 3147750806345838348L, j) /* invoke-custom */;
        }
    }

    static {
        long j = a ^ 56238235032608L;
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
        int length = "@8¤Ù^²-\u000eK\u00899ñßÈ\u009dÇôE\u008a¼îÿeáüeñ\u0094g\"\u001bê\u0010\u0083x»ÂÑ¶\u008f\b\u0016\u0088h Ç\u0010\u000bª Bð\u009f¼\u008bQÿ\u001cÜë(2<Ú?K@y\u0010¸¨PFX\u0018Ü)\u0084®Pôf".length();
        char cCharAt = ' ';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("@8¤Ù^²-\u000eK\u00899ñßÈ\u009dÇôE\u008a¼îÿeáüeñ\u0094g\"\u001bê\u0010\u0083x»ÂÑ¶\u008f\b\u0016\u0088h Ç\u0010\u000bª Bð\u009f¼\u008bQÿ\u001cÜë(2<Ú?K@y\u0010¸¨PFX\u0018Ü)\u0084®Pôf".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                b = strArr;
                c = new String[3];
                INSTANCE = new CatLean();
                return;
            }
            cCharAt = "@8¤Ù^²-\u000eK\u00899ñßÈ\u009dÇôE\u008a¼îÿeáüeñ\u0094g\"\u001bê\u0010\u0083x»ÂÑ¶\u008f\b\u0016\u0088h Ç\u0010\u000bª Bð\u009f¼\u008bQÿ\u001cÜë(2<Ú?K@y\u0010¸¨PFX\u0018Ü)\u0084®Pôf".charAt(i3);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 2902;
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
                throw new RuntimeException("su/catlean/CatLean", e);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/CatLean"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.CatLean.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
