package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uh.class */
public final class uh extends _g {

    @NotNull
    public static final uh V = null;
    static final /* synthetic */ KProperty[] i = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final ct l = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final ct n = null;

    @NotNull
    private static final ct g = null;
    private static float t;
    private static float D;
    private static int J;

    @Nullable
    private static class_243 S;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map e = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private uh(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20811, 747699906193913553L ^ j2) /* invoke-custom */, jt.V(), null, 4, null, j2 ^ 127030015165050L);
    }

    private final boolean n(long j) {
        return ((Boolean) E.E(this, (a ^ j) ^ 42085952628165L, i[0])).booleanValue();
    }

    private final float K(long j) {
        return ((Number) l.E(this, (a ^ j) ^ 18122593981144L, i[1])).floatValue();
    }

    private final boolean a(char c2, int i2, char c3) {
        return ((Boolean) d.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a) ^ 36909373937399L, i[2])).booleanValue();
    }

    private final float E(long j) {
        return ((Number) n.E(this, (a ^ j) ^ 51489257237641L, i[3])).floatValue();
    }

    private final float z(long j) {
        return ((Number) g.E(this, (a ^ j) ^ 136013499573708L, i[4])).floatValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:66:0x02af
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    public final void N(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.MoveEvent r11) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uh.N(su.catlean.api.event.events.player.MoveEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.uh] */
    @Flow
    public final void e(@NotNull ReceivePacket e2) {
        long j = a ^ 47167855835037L;
        Object obj = j;
        long j2 = obj ^ 100128393753659L;
        try {
            Intrinsics.checkNotNullParameter(e2, "e");
            if (e2.getPacket() instanceof class_2708) {
                obj = this;
                obj.d(j2);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7701404555136663811L, j) /* invoke-custom */;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_746 */
    @Override // su.catlean._g
    public void O(long j) throws class_746 {
        Z(j ^ 41571510600469L);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_746 */
    private final void Z(long j) throws class_746 {
        long j2 = a ^ j;
        long j3 = j2 ^ 100037299640426L;
        int i2 = (int) (j2 >>> 56);
        long j4 = ((j2 ^ 27570695116365L) << 8) >>> 8;
        long j5 = j2 ^ 134545051719244L;
        class_746 class_746Var = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4900802357603821927L, j2) /* invoke-custom */;
        if (class_746Var != null) {
            try {
                try {
                    class_746Var = zf.F(j3).field_1724;
                    if (class_746Var == null) {
                        return;
                    }
                    S = J((byte) i2, j4, (class_1297) zf.v(j5));
                    t = 0.0f;
                    D = 0.0f;
                    J = 0;
                } catch (NumberFormatException unused) {
                    class_746Var = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 4943002246094270331L, j2) /* invoke-custom */;
                    throw class_746Var;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 4943002246094270331L, j2) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private final float p(long j) {
        long j2 = a ^ j;
        Object objMethod_6059 = j2;
        try {
            objMethod_6059 = zf.v(objMethod_6059 ^ 23546813700791L).method_6059(class_1294.field_5913);
            return objMethod_6059 != 0 ? 0.2f : 0.0f;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6059, -8619188821824838784L, j2) /* invoke-custom */;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_746 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.uh] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Flow
    public final void r(@NotNull PreSyncEvent preSyncEvent) throws class_746 {
        ?? r0;
        ?? r02;
        ?? r03;
        long j = a ^ 64283411759459L;
        long j2 = j ^ 121793419046655L;
        long j3 = j ^ 137838678049856L;
        long j4 = j ^ 111917809905972L;
        ?? Y = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7168387349377797663L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(preSyncEvent, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30125, 2646087309748789953L ^ j) /* invoke-custom */);
        try {
            Y = Y;
            if (Y != 0) {
                try {
                    Y = dm.h.Y(j2);
                    r0 = Y;
                    if (Y != 0) {
                        D = (float) Math.hypot(zf.v(j4).method_23317() - zf.v(j4).field_6014, zf.v(j4).method_23321() - zf.v(j4).field_5969);
                        r03 = Y;
                        r02 = r03;
                        r0 = r03;
                        if (r03 == 0) {
                        }
                    }
                    try {
                        r0 = this;
                        r0.Z(j3);
                        r02 = r0;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7197048855129884675L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 7197048855129884675L, j) /* invoke-custom */;
                }
            } else {
                r03 = Y;
                r02 = r03;
                r0 = r03;
                if (r03 == 0) {
                    r0 = this;
                    r0.Z(j3);
                    r02 = r0;
                }
            }
            try {
                if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7136736489564568987L, j) /* invoke-custom */ != null) {
                    r02 = "oxTDcc";
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("oxTDcc", 7163213073872731619L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 7197048855129884675L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 7197048855129884675L, j) /* invoke-custom */;
        }
    }

    private static final boolean e() {
        return V.n((a ^ 55241200621654L) ^ 93164291994007L);
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 30012;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/uh", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "su/catlean/uh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uh.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
