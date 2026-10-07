package su.catlean;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.awt.Color;
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
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_2338;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import su.catlean.api.event.events.client.InputSuggestorEvent;
import su.catlean.api.event.events.network.SendMessageEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pf.class */
public final class pf implements ym {

    @NotNull
    public static final pf E;

    @NotNull
    private static String o;

    @Nullable
    private static class_2338 Y;

    @NotNull
    private static final List R;

    @NotNull
    private static final CommandDispatcher I;
    private static final long a = yz.a(-121892667972105778L, 725839728142484046L, MethodHandles.lookup().lookupClass()).a(180540112065643L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private pf() {
    }

    @NotNull
    public final String Z() {
        return o;
    }

    public final void E(int a2, byte a3, @NotNull String str, int a4) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17865, 7398130347326456112L ^ ((((((long) a2) << 32) | ((((long) a3) << 56) >>> 32)) | ((((long) a4) << 40) >>> 40)) ^ a)) /* invoke-custom */);
        o = str;
    }

    @Nullable
    public final class_2338 i() {
        return Y;
    }

    public final void W(@Nullable class_2338 class_2338Var) {
        Y = class_2338Var;
    }

    @NotNull
    public final List d() {
        return R;
    }

    @NotNull
    public final CommandDispatcher m() {
        return I;
    }

    private final void e(a3 a3Var, long j) {
        a3Var.q((a ^ j) ^ 108222498918684L, I);
        R.add(a3Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.mojang.brigadier.exceptions.CommandSyntaxException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Flow
    private final void b(SendMessageEvent sendMessageEvent) throws CommandSyntaxException {
        long j = a ^ 5089764962315L;
        long j2 = j ^ 136263564589459L;
        Object objStartsWith$default = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2675343858335439961L, j) /* invoke-custom */;
        try {
            objStartsWith$default = StringsKt.startsWith$default(sendMessageEvent.getMessage(), o, false, 2, (Object) null);
            if (objStartsWith$default != 0) {
                if (objStartsWith$default == 0) {
                    return;
                }
                try {
                    CommandDispatcher commandDispatcher = I;
                    String strSubstring = sendMessageEvent.getMessage().substring(o.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28019, 4354274356282308323L ^ j) /* invoke-custom */);
                    class_634 class_634VarMethod_1562 = zf.F(j2).method_1562();
                    Intrinsics.checkNotNull(class_634VarMethod_1562);
                    commandDispatcher.execute(strSubstring, class_634VarMethod_1562.method_2875());
                } catch (CommandSyntaxException e2) {
                }
            }
            sendMessageEvent.cancel();
        } catch (CommandSyntaxException unused) {
            throw (CommandSyntaxException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(CommandSyntaxException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objStartsWith$default, 2692202846336844959L, j) /* invoke-custom */;
        }
    }

    @Flow
    private final void r(InputSuggestorEvent inputSuggestorEvent) {
        class_634 class_634VarMethod_1562 = zf.F((a ^ 57858764633618L) ^ 83357058858890L).method_1562();
        Intrinsics.checkNotNull(class_634VarMethod_1562);
        inputSuggestorEvent.setSource(class_634VarMethod_1562.method_2875());
        inputSuggestorEvent.setPrefix(o);
        inputSuggestorEvent.setDispatcher(I);
        inputSuggestorEvent.cancel();
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [int, su.catlean.dm] */
    /* JADX WARN: Type inference failed for: r1v61, types: [double, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int, su.catlean.dm] */
    @Flow
    private final void u(Render2DEvent render2DEvent) throws Throwable {
        long j = a ^ 73612587649674L;
        long j2 = j ^ 67878147474194L;
        long j3 = j ^ 573252104522L;
        ?? r2 = (int) (j >>> 32);
        int i = (int) ((j3 << 32) >>> 48);
        int i2 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 44904245910337L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j4 << 32) >>> 48);
        int i5 = (int) ((j4 << 48) >>> 48);
        long j5 = j ^ 2567371702200L;
        int i6 = (int) (j >>> 48);
        int i7 = (int) ((j5 << 16) >>> 48);
        int i8 = (int) ((j5 << 32) >>> 32);
        long j6 = j ^ 121918406925750L;
        long j7 = j ^ 119747229024825L;
        long j8 = j ^ 39957711438696L;
        long j9 = j ^ 137977898426317L;
        long j10 = j ^ 41230469005500L;
        int i9 = (int) (j >>> 32);
        int i10 = (int) ((j10 << 32) >>> 40);
        int i11 = (int) ((j10 << 56) >>> 56);
        long j11 = j ^ 31995718028596L;
        if (Y != null) {
            float fMethod_4486 = zf.F(j2).method_22683().method_4486() / 2.0f;
            class_4587 class_4587Var = new class_4587();
            class_4587Var.method_22903();
            class_4587Var.method_46416(fMethod_4486, 40.0f, 0.0f);
            class_4587Var.method_22907(class_7833.field_40714.rotationDegrees((90.0f / Math.abs(90.0f / Math.clamp(55.0f, zf.v(j11).method_36455(), 90.0f))) - (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2589, 6766493654877555588L ^ j) /* invoke-custom */));
            class_4587Var.method_46416(-fMethod_4486, -40.0f, 0.0f);
            class_4587Var.method_22903();
            double dW = jl.y.W(zf.v(j11).field_6014, zf.v(j11).method_23317(), zi.v.n(i3, (char) i4, i5));
            double dW2 = jl.y.W(zf.v(j11).field_5969, zf.v(j11).method_23321(), zi.v.n(i3, (char) i4, i5));
            class_2338 class_2338Var = Y;
            Intrinsics.checkNotNull(class_2338Var);
            double dMethod_10260 = ((double) class_2338Var.method_10260()) - dW2;
            class_2338 class_2338Var2 = Y;
            Intrinsics.checkNotNull(class_2338Var2);
            float fMethod_15338 = ((float) class_3532.method_15338(Math.toDegrees(Math.atan2(dMethod_10260, ((double) class_2338Var2.method_10263()) - dW)) - 90.0d)) - zf.v(j11).method_36454();
            class_4587Var.method_46416(fMethod_4486, 40.0f, 0.0f);
            class_4587Var.method_22907(class_7833.field_40718.rotationDegrees(fMethod_15338));
            class_4587Var.method_46416(-fMethod_4486, -40.0f, 0.0f);
            kv.K.L(i9, i10, class_4587Var, fMethod_4486, (byte) i11, 40.0f, 32.0f, jh.f.Z(j6, 0));
            class_4587Var.method_46416(fMethod_4486, 40.0f, 0.0f);
            class_4587Var.method_22907(class_7833.field_40718.rotationDegrees(-fMethod_15338));
            class_4587Var.method_46416(-fMethod_4486, -40.0f, 0.0f);
            class_4587Var.method_22909();
            class_4587Var.method_22909();
            ?? r0 = dm.h;
            class_2338 class_2338Var3 = Y;
            Intrinsics.checkNotNull(class_2338Var3);
            ?? r1 = class_2338Var3.method_46558().field_1352;
            class_2338 class_2338Var4 = Y;
            Intrinsics.checkNotNull(class_2338Var4);
            String str = ((int) r2.r(i, r0, i2, r1, class_2338Var4.method_46558().field_1350)) + "m";
            float fD = b8.f(j8).D(j7, str);
            Matrix3x2fStack matrix3x2fStackMethod_51448 = render2DEvent.getContext().method_51448();
            Intrinsics.checkNotNullExpressionValue(matrix3x2fStackMethod_51448, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5600, 1344516731447112947L ^ j) /* invoke-custom */);
            x1.n(matrix3x2fStackMethod_51448, (char) i6, (fMethod_4486 - (fD / 2.0f)) - 2.0f, 56.0f, fD + 4.0f, 11.0f, 3.0f, 1.5f, 0.0f, 1.0f, jh.f.T(), jh.f.F(), 0.0f, (short) i7, 0.0f, i8, 0.0f, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27004, 3325976866499209444L ^ j) /* invoke-custom */, null);
            c6 c6VarF = b8.f(j8);
            class_332 context = render2DEvent.getContext();
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, (String) a(MethodHandles.lookup(), "d", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31820, 7889304040172395870L ^ j) /* invoke-custom */);
            c6VarF.I(context, str, fMethod_4486, 60.0f, color, j9);
        }
    }

    static {
        int i;
        long j = (a ^ 138495540677814L) ^ 56578279649875L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((r0 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[4];
        int i3 = 0;
        String str = "õV\u0095û\u001a\u0010¨\u009c9\u0016\u0086ðPîÐK\u0018 pZ¶}x\u009e:Ê1\u0013ç\u000fq\u000bÙgÒ]EjE\u001dÇ";
        int length = "õV\u0095û\u001a\u0010¨\u009c9\u0016\u0086ðPîÐK\u0018 pZ¶}x\u009e:Ê1\u0013ç\u000fq\u000bÙgÒ]EjE\u001dÇ".length();
        char cCharAt = 16;
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
                            c = new String[4];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (r0 >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((r0 << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i9 = 0;
                            int length2 = "\u0001q\u0098%D?©'X(L¾ûçä÷".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "\u0001q\u0098%D?©'X(L¾ûçä÷".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            e = jArr;
                            f = new Integer[2];
                            E = new pf();
                            o = "^";
                            R = new ArrayList();
                            I = new CommandDispatcher();
                            E.e(ad.x, j);
                            E.e(a5.t, j);
                            E.e(ac.P, j);
                            E.e(ay.T, j);
                            E.e(ae.M, j);
                            E.e(ai.W, j);
                            E.e(a4.r, j);
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
                        str = "ùy\u00adÉCvfZØaÌß\u0086Ðãi Y\fö\u0080]f~#-Ç\u008fÞ\u0007v\u0084\næ\u0014\u009c\u0096«ìqdSux½@¤\u008aÃ";
                        length = "ùy\u00adÉCvfZØaÌß\u0086Ðãi Y\fö\u0080]f~#-Ç\u008fÞ\u0007v\u0084\næ\u0014\u009c\u0096«ìqdSux½@¤\u008aÃ".length();
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

    private static CommandSyntaxException a(CommandSyntaxException commandSyntaxException) {
        return commandSyntaxException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 32587;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/pf", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/pf"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pf.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 24515;
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
                    throw new RuntimeException("su/catlean/pf", e2);
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/pf"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pf.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
