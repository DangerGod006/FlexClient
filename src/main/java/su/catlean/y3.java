package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.awt.Font;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/y3.class */
public final class y3 {

    @NotNull
    public static final y3 i;
    private static final char S;

    @NotNull
    private static final Char2IntArrayMap C;
    private static final long a = yz.a(-8434565965091478071L, 633131840613666972L, MethodHandles.lookup().lookupClass()).a(118144023414312L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private y3() {
    }

    @NotNull
    public final Char2IntArrayMap e() {
        return C;
    }

    public final int D(int x, int n) {
        return n * ((int) Math.floor(((double) x) / ((double) n)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v34 */
    @NotNull
    public final String A(char a2, int a3, int a4, @NotNull String text) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j2 = j ^ 126203863740344L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 32);
        int i4 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(text, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9745, 5897082012921721003L ^ j) /* invoke-custom */);
        char[] charArray = text.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14389, 8680235666935574149L ^ j) /* invoke-custom */);
        StringBuilder sb = new StringBuilder(charArray.length);
        int i5 = 0;
        while (i5 < charArray.length) {
            char c2 = charArray[i5];
            Object obj = a4;
            if (obj >= 0) {
                try {
                    obj = c2;
                    if (obj == (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6068, 2622761447471246389L ^ j) /* invoke-custom */) {
                        if (i5 + 1 >= charArray.length) {
                            String string = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3669, 2721883389180467434L ^ j) /* invoke-custom */);
                            return string;
                        }
                        char c3 = charArray[i5 + 1];
                        if (a2 >= 0) {
                            Object obj2 = c3;
                            try {
                                switch (obj2) {
                                    case 88:
                                    case 120:
                                        obj2 = a4;
                                        if (obj2 >= 0) {
                                            try {
                                                if (!U(charArray, i5, (short) i2, i3, i4)) {
                                                    i5 += 2;
                                                } else {
                                                    i5 += 14;
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 4457441758934094680L, j) /* invoke-custom */;
                                            }
                                        }
                                        break;
                                    default:
                                        i5 += 2;
                                        break;
                                }
                            } catch (NumberFormatException unused2) {
                                obj2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 4457441758934094680L, j) /* invoke-custom */;
                                throw obj2;
                            }
                        }
                        if (a2 >= 0) {
                            continue;
                        }
                    }
                    sb.append(c2);
                    i5++;
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 4457441758934094680L, j) /* invoke-custom */;
                }
            }
            if (a4 < 0) {
                String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3669, 2721883389180467434L ^ j) /* invoke-custom */);
                return string2;
            }
        }
        String string22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string22, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3669, 2721883389180467434L ^ j) /* invoke-custom */);
        return string22;
    }

    @NotNull
    public final class_2960 n(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 603358048552L;
        long j4 = j2 ^ 13526064116084L;
        int i2 = (int) (j2 >>> 48);
        return l6.J((String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7775, 471844887905103503L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26639, 6983197658547001561L ^ j2) /* invoke-custom */ + H((short) i2, (int) ((j4 << 16) >>> 32), (int) ((j4 << 48) >>> 48)), j3);
    }

    @NotNull
    public final String H(short s, int i2, int i3) {
        long j = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ a;
        Object objCollect = IntStream.range(0, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4746, 4538732396000204480L ^ j) /* invoke-custom */).mapToObj(y3::t).collect(Collectors.joining());
        Intrinsics.checkNotNullExpressionValue(objCollect, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19304, 5034096409759785481L ^ j) /* invoke-custom */);
        return (String) objCollect;
    }

    @NotNull
    public final int[] b(int i2, long a2) {
        long j = a ^ a2;
        return new int[]{(i2 >> (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23793, 7028914271734276860L ^ j) /* invoke-custom */) & (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30133, 1557276049564175265L ^ j) /* invoke-custom */, (i2 >> (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18075, 1652654939044001958L ^ j) /* invoke-custom */) & (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1331, 6834564071064271660L ^ j) /* invoke-custom */, i2 & (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1331, 6834564071064271660L ^ j) /* invoke-custom */};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String[]] */
    public final float K(int i2, float f2, long j) {
        long j2 = ((((long) i2) << 32) | ((j << 32) >>> 32)) ^ a;
        Object objIsNaN = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2151921980995097817L, j2) /* invoke-custom */;
        try {
            try {
                objIsNaN = Float.isNaN(f2);
                int iRoundToInt = objIsNaN;
                if (objIsNaN != 0) {
                    if (objIsNaN != 0) {
                        return 1.0f;
                    }
                    iRoundToInt = MathKt.roundToInt((MathKt.roundToInt(f2 * 100.0f) / 100.0f) * 10.0f);
                }
                return iRoundToInt / 10.0f;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsNaN, 2104649995240371121L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            objIsNaN = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsNaN, 2104649995240371121L, j2) /* invoke-custom */;
            throw objIsNaN;
        }
    }

    @NotNull
    public final fj V(char from, char to, long a2, @NotNull Font font, @NotNull ObjectArrayList maps, int padding) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(font, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32442, 2942907923613922027L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(maps, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27612, 6136495475736455058L ^ j) /* invoke-custom */);
        fj fjVar = new fj(j ^ 51664472824577L, from, to, font, n(j ^ 71455825400908L), padding);
        maps.add(fjVar);
        return fjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.ze] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41, types: [su.catlean.ze] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    @Nullable
    public final ze g(long j, char c2, @NotNull ObjectArrayList objectArrayList, @NotNull Font font, @NotNull Font font2) throws Throwable {
        long j2 = a ^ j;
        long j3 = j2 ^ 105927138144800L;
        long j4 = j2 ^ 134971474964223L;
        long j5 = j2 ^ 131475407390308L;
        Intrinsics.checkNotNullParameter(objectArrayList, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27612, 6136500404634313122L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(font, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32442, 2942895302738474203L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(font2, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11392, 1119409907160524539L ^ j2) /* invoke-custom */);
        int iJ = (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11813, 5014467788017764731L ^ j2) /* invoke-custom */;
        ObjectListIterator it = objectArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13604, 4156320245684453207L ^ j2) /* invoke-custom */);
        while (it.hasNext()) {
            ?? next = it.next();
            do {
                fj fjVar = (fj) next;
                if (fjVar.U(c2, j3)) {
                    next = fjVar.z(j5, c2);
                }
            } while (j2 <= 0);
            return next;
        }
        int iD = D(c2, iJ);
        boolean zCanDisplay = font.canDisplay(c2);
        ?? Z = zCanDisplay;
        boolean zCanDisplay2 = zCanDisplay;
        if (j2 >= 0) {
            if (zCanDisplay) {
                ze zeVarZ = V((char) iD, (char) (iD + iJ), j4, font, objectArrayList, 5).z(j5, c2);
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                Z = i2;
                if (i2 >= 0) {
                    ze zeVar = zeVarZ;
                    Z = zeVar;
                    if (zeVar != null) {
                        return zeVarZ;
                    }
                }
            }
            try {
                zCanDisplay2 = font2.canDisplay(c2);
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Z, 6990724989465530240L, j2) /* invoke-custom */;
            }
        }
        if (!zCanDisplay2) {
            return null;
        }
        Z = V((char) iD, (char) (iD + iJ), j4, font2, objectArrayList, 5).z(j5, c2);
        return Z;
    }

    @Nullable
    public final ze y(byte a2, int a3, char glyph, @NotNull Char2ObjectArrayMap allGlyphs, int a4, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack) throws Throwable {
        long j = (((((long) a2) << 56) | ((((long) a3) << 32) >>> 8)) | ((((long) a4) << 40) >>> 40)) ^ a;
        long j2 = j ^ 120471503581885L;
        Intrinsics.checkNotNullParameter(allGlyphs, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25937, 6700538458678752604L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(maps, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27612, 6136472592316169168L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(font, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32442, 2942918162960379561L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(fallBack, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11392, 1119402568950430857L ^ j) /* invoke-custom */);
        ze zeVar = (ze) allGlyphs.get(glyph);
        if (zeVar != null) {
            return zeVar;
        }
        ze zeVarG = g(j2, glyph, maps, font, fallBack);
        ((Map) allGlyphs).put(Character.valueOf(glyph), zeVarG);
        return zeVarG;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void e(@org.jetbrains.annotations.NotNull org.joml.Matrix3x2fStack r20, @org.jetbrains.annotations.NotNull java.lang.String r21, int r22, float r23, float r24, int r25, @org.jetbrains.annotations.NotNull java.awt.Color r26, boolean r27, int r28, float r29, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap r30, byte r31, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.objects.ObjectArrayList r32, @org.jetbrains.annotations.NotNull java.awt.Font r33, @org.jetbrains.annotations.NotNull java.awt.Font r34, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.e(org.joml.Matrix3x2fStack, java.lang.String, int, float, float, int, java.awt.Color, boolean, int, float, it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap, byte, it.unimi.dsi.fastutil.objects.ObjectArrayList, java.awt.Font, java.awt.Font, it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void c(@org.jetbrains.annotations.NotNull org.joml.Matrix3x2fStack r20, @org.jetbrains.annotations.NotNull java.lang.String r21, float r22, float r23, @org.jetbrains.annotations.NotNull java.awt.Color r24, boolean r25, int r26, float r27, long r28, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap r30, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.objects.ObjectArrayList r31, @org.jetbrains.annotations.NotNull java.awt.Font r32, @org.jetbrains.annotations.NotNull java.awt.Font r33, float r34, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.c(org.joml.Matrix3x2fStack, java.lang.String, float, float, java.awt.Color, boolean, int, float, long, it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap, it.unimi.dsi.fastutil.objects.ObjectArrayList, java.awt.Font, java.awt.Font, float, it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float l(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap r12, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.objects.ObjectArrayList r13, long r14, @org.jetbrains.annotations.NotNull java.awt.Font r16, byte r17, @org.jetbrains.annotations.NotNull java.awt.Font r18, float r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.l(java.lang.String, it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap, it.unimi.dsi.fastutil.objects.ObjectArrayList, long, java.awt.Font, byte, java.awt.Font, float):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap] */
    /* JADX WARN: Type inference failed for: r0v78, types: [float] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v96, types: [su.catlean.g7] */
    public final void F(@NotNull Object2ObjectOpenHashMap object2ObjectOpenHashMap, long j) {
        String[] strArr;
        long j2 = a ^ j;
        long j3 = j2 ^ 15463090087507L;
        long j4 = j2 ^ 91064557451552L;
        long j5 = j2 ^ 65278531487457L;
        long j6 = j2 ^ 4808421174605L;
        long j7 = j2 ^ 23673536594114L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j7 << 16) >>> 32);
        int i4 = (int) ((j7 << 48) >>> 48);
        long j8 = j2 ^ 66381673594300L;
        String[] strArr2 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4210377094169850730L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(object2ObjectOpenHashMap, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17792, 3141235003883295867L ^ j2) /* invoke-custom */);
        Object objIsEmpty = object2ObjectOpenHashMap;
        Object2ObjectOpenHashMap object2ObjectOpenHashMap2 = objIsEmpty;
        if (strArr2 != null) {
            try {
                try {
                    objIsEmpty = objIsEmpty.isEmpty();
                    if (objIsEmpty != 0) {
                        return;
                    } else {
                        object2ObjectOpenHashMap2 = object2ObjectOpenHashMap;
                    }
                } catch (NumberFormatException unused) {
                    objIsEmpty = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsEmpty, 4217148322221806594L, j2) /* invoke-custom */;
                    throw objIsEmpty;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsEmpty, 4217148322221806594L, j2) /* invoke-custom */;
            }
        }
        ObjectIterator it = object2ObjectOpenHashMap2.object2ObjectEntrySet().iterator();
        Intrinsics.checkNotNullExpressionValue(it, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13211, 6402445480777867881L ^ j2) /* invoke-custom */);
        while (it.hasNext()) {
            Map.Entry entry = (Object2ObjectMap.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            class_2960 class_2960Var = (class_2960) entry.getKey();
            ObjectList objectList = (ObjectList) entry.getValue();
            GpuTextureView gpuTextureViewMethod_71659 = zf.F(j3).method_1531().method_4619(class_2960Var).method_71659();
            Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25519, 413879009715466841L ^ j2) /* invoke-custom */);
            VertexFormat vertexFormat = class_290.field_1575;
            Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7509, 5958737643611868314L ^ j2) /* invoke-custom */);
            g7 g7Var = new g7(j4, vertexFormat, objectList.size(), false, 4, null);
            if (strArr2 == null) {
                return;
            }
            ObjectListIterator it2 = objectList.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13211, 6402445480777867881L ^ j2) /* invoke-custom */);
            while (it2.hasNext()) {
                cc ccVar = (cc) it2.next();
                Matrix3x2f matrix3x2fO = ccVar.o();
                float fJ = ccVar.J();
                float fX = ccVar.X();
                float fQ = ccVar.q();
                float fI = ccVar.i();
                float fG = ccVar.G() / ccVar.K();
                float fG2 = ccVar.g() / ccVar.U();
                float fG3 = (ccVar.G() + ccVar.q()) / ccVar.K();
                Object objG = (ccVar.g() + ccVar.i()) / ccVar.U();
                try {
                    g7Var.b(j5, matrix3x2fO, fJ, fX + fI, ccVar.Z()).j(fG, j8, objG).Y(ccVar.p(), (short) i2, ccVar.L(), ccVar.u(), i3, ccVar.s(), i4);
                    g7Var.b(j5, matrix3x2fO, fJ + fQ, fX + fI, ccVar.Z()).j(fG3, j8, objG).Y(ccVar.p(), (short) i2, ccVar.L(), ccVar.u(), i3, ccVar.s(), i4);
                    g7Var.b(j5, matrix3x2fO, fJ + fQ, fX, ccVar.Z()).j(fG3, j8, fG2).Y(ccVar.p(), (short) i2, ccVar.L(), ccVar.u(), i3, ccVar.s(), i4);
                    objG = g7Var.b(j5, matrix3x2fO, fJ, fX, ccVar.Z()).j(fG, j8, fG2).Y(ccVar.p(), (short) i2, ccVar.L(), ccVar.u(), i3, ccVar.s(), i4);
                    do {
                        strArr = strArr2;
                        if (j2 <= 0) {
                            break;
                        } else if (strArr == null) {
                            break;
                        } else if (strArr2 == null) {
                        }
                    } while (j2 < 0);
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, 4217148322221806594L, j2) /* invoke-custom */;
                }
            }
            RenderPipeline renderPipelineH = b6.R.h();
            class_276 class_276VarMethod_1522 = zf.F(j3).method_1522();
            Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22891, 5670535583218567316L ^ j2) /* invoke-custom */);
            g7.R(j6, g7Var, renderPipelineH, class_276VarMethod_1522, null, null, new Matrix3x2f(), MapsKt.mapOf(TuplesKt.to((String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2649, 3219355908901624757L ^ j2) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14376, 8302209671094944978L ^ j2) /* invoke-custom */, null);
            strArr = strArr2;
            if (strArr == null) {
                break;
            }
        }
        object2ObjectOpenHashMap.clear();
        if (j2 >= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195 A[EDGE_INSN: B:28:0x0195->B:25:0x0195 BREAK  A[LOOP:0: B:3:0x011a->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:3:0x011a->B:29:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float p(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap r12, @org.jetbrains.annotations.NotNull it.unimi.dsi.fastutil.objects.ObjectArrayList r13, char r14, @org.jetbrains.annotations.NotNull java.awt.Font r15, long r16, @org.jetbrains.annotations.NotNull java.awt.Font r18, float r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.p(java.lang.String, it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap, it.unimi.dsi.fastutil.objects.ObjectArrayList, char, java.awt.Font, long, java.awt.Font, float):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int H(char r8, long r9) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.H(char, long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [char] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean, char] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v21 */
    private final boolean U(char[] cArr, int i2, short s, int i3, int i4) {
        long j = (((((long) s) << 48) | ((((long) i3) << 32) >>> 16)) | ((((long) i4) << 48) >>> 48)) ^ a;
        char cJ = j;
        long j2 = cJ ^ 54687924389008L;
        try {
            cJ = i2 + (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12332, 1666462759264111826L ^ j) /* invoke-custom */;
            if (cJ >= cArr.length) {
                return false;
            }
            try {
                cJ = cArr[i2];
                ?? r0 = cJ;
                if (i3 > 0) {
                    if (cJ != (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(676, 3453385140488732273L ^ j) /* invoke-custom */) {
                        return false;
                    }
                    r0 = cArr[i2 + 1];
                }
                ?? r17 = r0;
                try {
                    r0 = r17 == true ? 1 : 0;
                    ?? r02 = r0;
                    if (i3 >= 0) {
                        try {
                            if (r0 != (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6940, 2335672838999828454L ^ j) /* invoke-custom */) {
                                r0 = r17 == true ? 1 : 0;
                                r02 = r0;
                                if (i3 >= 0) {
                                    if (r0 != (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14477, 5692929970442159150L ^ j) /* invoke-custom */) {
                                        return false;
                                    }
                                    r02 = 0;
                                }
                            } else {
                                r02 = 0;
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4995891505912556497L, j) /* invoke-custom */;
                        }
                    }
                    ?? r18 = i2 + 2;
                    int iJ = (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26443, 2288777334271089567L ^ j) /* invoke-custom */;
                    int i5 = 0;
                    while (i5 < iJ) {
                        char cH = 0;
                        try {
                            cH = cArr[r18 == true ? 1 : 0];
                            if (i4 < 0) {
                                return cH;
                            }
                            ?? r03 = cH;
                            if (s >= 0) {
                                if (cH != (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(676, 3453385140488732273L ^ j) /* invoke-custom */) {
                                    return false;
                                }
                                try {
                                    cH = i.H(cArr[(r18 == true ? 1 : 0) + 1], j2);
                                    r03 = cH;
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(cH, -4995891505912556497L, j) /* invoke-custom */;
                                }
                            }
                            ?? r04 = r03;
                            if (i4 > 0) {
                                if (r03 < 0) {
                                    return false;
                                }
                                r04 = (r18 == true ? 1 : 0) + 2;
                            }
                            r18 = r04;
                            i5++;
                            if (s < 0) {
                                break;
                            }
                        } catch (NumberFormatException unused3) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(cH, -4995891505912556497L, j) /* invoke-custom */;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused4) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -4995891505912556497L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(cJ, -4995891505912556497L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(cJ, -4995891505912556497L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final kotlin.Triple B(short r8, int r9, char[] r10, char r11, int r12) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.B(short, int, char[], char, int):kotlin.Triple");
    }

    private static final String t(int i2) {
        long j = a ^ 17563089926991L;
        return String.valueOf((char) new Random().nextInt((int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27203, 8722727466745298490L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29206, 6365168498213742165L ^ j) /* invoke-custom */));
    }

    private static final ObjectList Z(Object obj) {
        return new ObjectArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v39, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v41, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v43, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v45, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v51, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v53, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v55, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v57, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v59, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v61, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v65, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v67, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v69, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v71, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v73, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v75, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v77, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v79, types: [char, int] */
    /* JADX WARN: Type inference failed for: r1v81, types: [char, int] */
    static {
        int i2;
        long j = a ^ 70104833297527L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[35];
        int i4 = 0;
        String str = "\u0088\u0019\u0091ç\u0013¤\r\u0012\u0089\bL¸\u0019l¥a\u0010ª$hZË~¯b\f\u000f\u0086kt¯4O\u0018\u0017E:²*D\u0018»\u0014ow7`Àt)²=\u0013\u009fcÊ~:\u0018Ç \u009c³Cû\u0005Eù\f§ø\u001a\u0007«\u001c\u007f\u008d\u0014)y<Èü\u0018ñy\u0097F{¨ÒÐñç»I\u00ado~³\u008b\u0096ÈÅ(è\u0096\u0019(¨\u0017OûÄ\u0004D}Ð\u0013³\u0082ï*3QÖ\u0099ñ@\u0019\u007f,GiéÂ\u008cIBâ\t\u0017.Àü%\u0014\u0093ñ EÒ<\u0002¤ØÚêt\u009eá\u0083$à\u0098:<Ãìb\u001bã&\u008fÀ£\f½oÀ-\u0011\u0018jm\n=H>±r:\b×ø\u0005ëy8æÑmÙé\u0018Ôñ\u0010\u00809[¯\u001d-vÞ¸ÐùLð\u008bïh(÷æÙ%M¦¤\u0003\u0090sªNb±Ás=[\\\u0010yÖ²9\u0091\u0085Ë\nýâü\u000bÝ÷\u0095î`õIã \u0019¢Úp\u0017\\ÕÁ8ï«H{Sò\u000fC\\Tdb\u00902oð:rÐLc\u0087J\u0018 Õê\u0016i|¼ó\u0004ÌÏ\u009a¼' \u0090E\u0085b\u000e°Õ\\x\u0010í\u000f6YÐ\u0001M!\u008d/F\u0001¥s`¨\u0018\u001fgñA^Z\u0099£jÔëb\u0005n#+\"\u0093\u0003Rù<>\u0087\u0010$ ÷u\u0015Þ\u0098ñ\u009b\u008av=%·º¥\u0010£\u00855³\u009c\u0099*oû9¯q\u0090{CÕ8¦D\u0019ÿ8%½íP\u009cjta4mÛjP¡X¼5\u0083Ó3ë\u001dæû[\u00851\u0098¨æo!Kþ\u0000@\u0086Oöj¢T\u0005\u0084( òúñ÷\r(¼|ö\u0019,&Û\u009e\u0099â\u0005{¼\u0014\föSM\u0084 ½JS(w¡ö{U¢®Õ\nøtGzz¿® ª&\u00adO&Þ\u0085pç-kõ3#ã\u001ce¹XÞ\t\u0094õ\u0011WÅ¯þ4z¬{\u0010òp¥&\u001c÷¼¢ô×loW9ìË Á½\u009cµîLôÚ»Ýeë÷\u0007½3r+Ù C\u0083\u0083Jz\u009eÐeþõ¸>\u0010Õ®A¬\n\u0004Å-\u0019\u0095\u008b»\u0015Sm\u009d \u0081nÿi.\u0085ý¤q\tØðDü¹Qå(\u0084Eêø\u0019ÄP/H>\u001f0Î\u008b8.\u0004ÝÞ\u0011\u0007\u001d\u0084÷Ù\u009c3\u0003\u0091iKº\u0006oA\u0080\u008cè\u0090¸\u008d\u0011\u0016/)\u0088höS\u008e \u0015ù!«f\u0010\u00adó>rùNJ97Çù\u00adj¥\u0010Ã/hAI\u0002úÝ\"\u0094²ºhqQ\u0007(\u0095$\u0092£Ç[IvL\u0015éa\u0002b]]\u0085³BóÊH\u0015\u009c¹\u0099\u001bWÈ]'a¤\u0013(1\u007f\u0086\u0015°\u0010ôp\u0080u¶\u000fèÃ\u0088\u0007\u001dL\u008eÃxØ\u0010(£¾¿¬\b¥ÂáZ\u008au\nB\u009f\u0087\u0018Ì\"(âh\u001f\u0098\r7f¦Ð#õð\bÉÛÈ·\u0014ey\u0089 #ËJ'¸õß·ÍnþwWçdEB[çáôÊÊÄaÓz>\u00810÷z \u009c\u0012Z@Ný\u001e|\u0018\u0012½e\u0098níÊ#£4¿\u009a§\u0001ÒZµã\u000få\u000ecÖ 4f÷aÕJ±\u001f\u0088¡ûé]{Æ\u0018P\u008d?÷0¥ÿC0æ4J\u008d\u0098\u008d0 W\u0013³\u0010ªeÐî\u0003Ç\u008eG\u0090Öl\u0096¦@Ýû\u0014\u0098cøUFÎV´IOÉ";
        int length = "\u0088\u0019\u0091ç\u0013¤\r\u0012\u0089\bL¸\u0019l¥a\u0010ª$hZË~¯b\f\u000f\u0086kt¯4O\u0018\u0017E:²*D\u0018»\u0014ow7`Àt)²=\u0013\u009fcÊ~:\u0018Ç \u009c³Cû\u0005Eù\f§ø\u001a\u0007«\u001c\u007f\u008d\u0014)y<Èü\u0018ñy\u0097F{¨ÒÐñç»I\u00ado~³\u008b\u0096ÈÅ(è\u0096\u0019(¨\u0017OûÄ\u0004D}Ð\u0013³\u0082ï*3QÖ\u0099ñ@\u0019\u007f,GiéÂ\u008cIBâ\t\u0017.Àü%\u0014\u0093ñ EÒ<\u0002¤ØÚêt\u009eá\u0083$à\u0098:<Ãìb\u001bã&\u008fÀ£\f½oÀ-\u0011\u0018jm\n=H>±r:\b×ø\u0005ëy8æÑmÙé\u0018Ôñ\u0010\u00809[¯\u001d-vÞ¸ÐùLð\u008bïh(÷æÙ%M¦¤\u0003\u0090sªNb±Ás=[\\\u0010yÖ²9\u0091\u0085Ë\nýâü\u000bÝ÷\u0095î`õIã \u0019¢Úp\u0017\\ÕÁ8ï«H{Sò\u000fC\\Tdb\u00902oð:rÐLc\u0087J\u0018 Õê\u0016i|¼ó\u0004ÌÏ\u009a¼' \u0090E\u0085b\u000e°Õ\\x\u0010í\u000f6YÐ\u0001M!\u008d/F\u0001¥s`¨\u0018\u001fgñA^Z\u0099£jÔëb\u0005n#+\"\u0093\u0003Rù<>\u0087\u0010$ ÷u\u0015Þ\u0098ñ\u009b\u008av=%·º¥\u0010£\u00855³\u009c\u0099*oû9¯q\u0090{CÕ8¦D\u0019ÿ8%½íP\u009cjta4mÛjP¡X¼5\u0083Ó3ë\u001dæû[\u00851\u0098¨æo!Kþ\u0000@\u0086Oöj¢T\u0005\u0084( òúñ÷\r(¼|ö\u0019,&Û\u009e\u0099â\u0005{¼\u0014\föSM\u0084 ½JS(w¡ö{U¢®Õ\nøtGzz¿® ª&\u00adO&Þ\u0085pç-kõ3#ã\u001ce¹XÞ\t\u0094õ\u0011WÅ¯þ4z¬{\u0010òp¥&\u001c÷¼¢ô×loW9ìË Á½\u009cµîLôÚ»Ýeë÷\u0007½3r+Ù C\u0083\u0083Jz\u009eÐeþõ¸>\u0010Õ®A¬\n\u0004Å-\u0019\u0095\u008b»\u0015Sm\u009d \u0081nÿi.\u0085ý¤q\tØðDü¹Qå(\u0084Eêø\u0019ÄP/H>\u001f0Î\u008b8.\u0004ÝÞ\u0011\u0007\u001d\u0084÷Ù\u009c3\u0003\u0091iKº\u0006oA\u0080\u008cè\u0090¸\u008d\u0011\u0016/)\u0088höS\u008e \u0015ù!«f\u0010\u00adó>rùNJ97Çù\u00adj¥\u0010Ã/hAI\u0002úÝ\"\u0094²ºhqQ\u0007(\u0095$\u0092£Ç[IvL\u0015éa\u0002b]]\u0085³BóÊH\u0015\u009c¹\u0099\u001bWÈ]'a¤\u0013(1\u007f\u0086\u0015°\u0010ôp\u0080u¶\u000fèÃ\u0088\u0007\u001dL\u008eÃxØ\u0010(£¾¿¬\b¥ÂáZ\u008au\nB\u009f\u0087\u0018Ì\"(âh\u001f\u0098\r7f¦Ð#õð\bÉÛÈ·\u0014ey\u0089 #ËJ'¸õß·ÍnþwWçdEB[çáôÊÊÄaÓz>\u00810÷z \u009c\u0012Z@Ný\u001e|\u0018\u0012½e\u0098níÊ#£4¿\u009a§\u0001ÒZµã\u000få\u000ecÖ 4f÷aÕJ±\u001f\u0088¡ûé]{Æ\u0018P\u008d?÷0¥ÿC0æ4J\u008d\u0098\u008d0 W\u0013³\u0010ªeÐî\u0003Ç\u008eG\u0090Öl\u0096¦@Ýû\u0014\u0098cøUFÎV´IOÉ".length();
        char cCharAt = 16;
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
                            c = new String[35];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[73];
                            int i10 = 0;
                            String str3 = "P@ãæ¬\u009b\u001eéwòI=zÏº,Íø\u001a^--Õ\u0094U\u0088\f)\u0089Qg\u001cL\u00150\u0013µ¯\u009djÁÁ¥\u0015ó\u0090Ú\u0011\u0014\u0096Û\u0003\u007fÂ\u0090õ´åØºò@J\u00ad\u0099\u000bkF¹ðm\u0003ò!¨ªpÜ\u0090\"\u0096ô#Ç\u0097Í\u008eü\u008eÓUPí¬Í\u0003Ço\u000b\u0094\u00861ã\u0000`Ï\u0002o\u0090\u0098,0É|\u0013½i]ño\u001b.\u000e\u0083ë÷RDQLHK\u0098Â~! \u0017$´\u0006ÁG\u0005\u0006\u008bIA1\u0007\u0084çXz8\u0092\u0019'^þ\u0019ò .¸ª|¬ã\u0088\u0018®ëÆpÖÛ\u0001åh<\u0018å6\u0095&Þ\u0006h1Í¥ßî\u0092\u0085\u009bR'ù\u0004àñ\u0082\u001fÎ\nÅ¢u\u0011¢Á\u009dÆGºÈ*y\u0091ì»kY¬<þ®\rM+m\u000fÚ:øß\b¡aÉ\u0091\u0011´LÞzA\u0083(ß\u008a§×Ç/¤æ6¢\u0097Áº\u009c\u009f\u0011w\u0097x\u0090\u0016R¬\u000fÇå9Nõ\u000eº\u0011KXÈÀß\u0081\nÀù\u0090\u009eí¾¼Õ'×\u0014(D\u000bÂÞ\u0002L:;v\f9ÍÎ\u0001Ã\u0090\u0017É\u0096ò¸³u\t\u0000\u009aúÕbDò]|\u0000{´MÄ\u0080ú}&\u001e\u001fù.lß¨uÔ5\u0017Ïß\"ÞrÃèç*>\u000b\b\u0096µä³\u0014ZK¶ÍÐC\tÄ±<15$äQ¶\n\u0098½*Á±îe\u0088+\u0018Â\u00ad-ÜaÏS\u0082FÉ\u0084\u001cÑ\u0006î\u000bÿ{øé $o\u0098 \u00954<vÖHô\u001dø¶f\u0091G\u001f7ë©\u009aoËæ\u0093\u0002»ÜoX´\u0015\u009f\u0011á»3³`\u0019\u0090\u0013FÏõeñ\u007fh;E}ð\u0087\u0002¥\u00ad¤EEë;Ý\u0011^:§¨j«D>\u0087\u0092^W`\u000bÃ¹}ìî÷r\u0083/\u0095\u0094 hSå¨sW²?J\u0015{\u0003}!ê\u0004\u0091J\u008eçãoíÉÍ$p\u0088»¯¼ëb\u0002=ßSÎfÛÎo¤©U~(\u007f\u0094+¹\u008a\u0093Å\u0086ÅR";
                            int length2 = "P@ãæ¬\u009b\u001eéwòI=zÏº,Íø\u001a^--Õ\u0094U\u0088\f)\u0089Qg\u001cL\u00150\u0013µ¯\u009djÁÁ¥\u0015ó\u0090Ú\u0011\u0014\u0096Û\u0003\u007fÂ\u0090õ´åØºò@J\u00ad\u0099\u000bkF¹ðm\u0003ò!¨ªpÜ\u0090\"\u0096ô#Ç\u0097Í\u008eü\u008eÓUPí¬Í\u0003Ço\u000b\u0094\u00861ã\u0000`Ï\u0002o\u0090\u0098,0É|\u0013½i]ño\u001b.\u000e\u0083ë÷RDQLHK\u0098Â~! \u0017$´\u0006ÁG\u0005\u0006\u008bIA1\u0007\u0084çXz8\u0092\u0019'^þ\u0019ò .¸ª|¬ã\u0088\u0018®ëÆpÖÛ\u0001åh<\u0018å6\u0095&Þ\u0006h1Í¥ßî\u0092\u0085\u009bR'ù\u0004àñ\u0082\u001fÎ\nÅ¢u\u0011¢Á\u009dÆGºÈ*y\u0091ì»kY¬<þ®\rM+m\u000fÚ:øß\b¡aÉ\u0091\u0011´LÞzA\u0083(ß\u008a§×Ç/¤æ6¢\u0097Áº\u009c\u009f\u0011w\u0097x\u0090\u0016R¬\u000fÇå9Nõ\u000eº\u0011KXÈÀß\u0081\nÀù\u0090\u009eí¾¼Õ'×\u0014(D\u000bÂÞ\u0002L:;v\f9ÍÎ\u0001Ã\u0090\u0017É\u0096ò¸³u\t\u0000\u009aúÕbDò]|\u0000{´MÄ\u0080ú}&\u001e\u001fù.lß¨uÔ5\u0017Ïß\"ÞrÃèç*>\u000b\b\u0096µä³\u0014ZK¶ÍÐC\tÄ±<15$äQ¶\n\u0098½*Á±îe\u0088+\u0018Â\u00ad-ÜaÏS\u0082FÉ\u0084\u001cÑ\u0006î\u000bÿ{øé $o\u0098 \u00954<vÖHô\u001dø¶f\u0091G\u001f7ë©\u009aoËæ\u0093\u0002»ÜoX´\u0015\u009f\u0011á»3³`\u0019\u0090\u0013FÏõeñ\u007fh;E}ð\u0087\u0002¥\u00ad¤EEë;Ý\u0011^:§¨j«D>\u0087\u0092^W`\u000bÃ¹}ìî÷r\u0083/\u0095\u0094 hSå¨sW²?J\u0015{\u0003}!ê\u0004\u0091J\u008eçãoíÉÍ$p\u0088»¯¼ëb\u0002=ßSÎfÛÎo¤©U~(\u007f\u0094+¹\u008a\u0093Å\u0086ÅR".length();
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
                                                f = new Integer[73];
                                                S = (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15029, j ^ 6974964047893223873L) /* invoke-custom */;
                                                i = new y3();
                                                C = new Char2IntArrayMap();
                                                y3 y3Var = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25143, 202442375002390848L ^ j) /* invoke-custom */, 0);
                                                y3 y3Var2 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19680, 5749699491522195337L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21408, 5462255243932348553L ^ j) /* invoke-custom */);
                                                y3 y3Var3 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7727, 3048525079001365883L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30510, 541936479778739308L ^ j) /* invoke-custom */);
                                                y3 y3Var4 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29054, 8199293677992251937L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12470, 1544289848344564726L ^ j) /* invoke-custom */);
                                                y3 y3Var5 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24162, 1778673973955378433L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25002, 8501589601241694940L ^ j) /* invoke-custom */);
                                                y3 y3Var6 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10046, 5676683512675583059L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9311, 7705210523058030345L ^ j) /* invoke-custom */);
                                                y3 y3Var7 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11863, 2023866345903181058L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11174, 2133481503253154011L ^ j) /* invoke-custom */);
                                                y3 y3Var8 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9067, 2160786568903180321L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10053, 4999383505629135979L ^ j) /* invoke-custom */);
                                                y3 y3Var9 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19166, 5964461576307222937L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7076, 6493983365537233140L ^ j) /* invoke-custom */);
                                                y3 y3Var10 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21822, 4138227465693050456L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13276, 6805493237591789728L ^ j) /* invoke-custom */);
                                                y3 y3Var11 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22221, 5344554010883732906L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2367, 7086918765737503348L ^ j) /* invoke-custom */);
                                                y3 y3Var12 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25262, 6106730404130357735L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13580, 3128784557796841032L ^ j) /* invoke-custom */);
                                                y3 y3Var13 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25417, 1467024629790441492L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27061, 3708123595902323453L ^ j) /* invoke-custom */);
                                                y3 y3Var14 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29434, 4311453581575491998L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30615, 6744903231849305291L ^ j) /* invoke-custom */);
                                                y3 y3Var15 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16711, 664461786437886517L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17931, 8421949701080753476L ^ j) /* invoke-custom */);
                                                y3 y3Var16 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25216, 7734089808218128864L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20633, 850706755553473479L ^ j) /* invoke-custom */);
                                                y3 y3Var17 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7057, 3503022040092571836L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3212, 8326140886392500132L ^ j) /* invoke-custom */);
                                                y3 y3Var18 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32524, 669498090082114658L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17801, 6195292343193806502L ^ j) /* invoke-custom */);
                                                y3 y3Var19 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4496, 8353447011432723189L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30684, 5658253475838923948L ^ j) /* invoke-custom */);
                                                y3 y3Var20 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17532, 2051337095551199022L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3504, 8436814532497469173L ^ j) /* invoke-custom */);
                                                y3 y3Var21 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31057, 8317338246077946414L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1129, 9027171827915319046L ^ j) /* invoke-custom */);
                                                y3 y3Var22 = i;
                                                C.put((char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20705, 4011615382369612747L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24304, 4354735945764912539L ^ j) /* invoke-custom */);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "$Bó\u0095ÂÄY\u0015\u0084õæ\u000bOÐ×\u001a";
                                                length2 = "$Bó\u0095ÂÄY\u0015\u0084õæ\u000bOÐ×\u001a".length();
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
                        str = "#\u008eÉ\u00161ÊÌµ\u0090\u0083\u0098\u0006\u0096\u0094ñïo;:~8\u0006m¶nç3\u008e\u0092C|Ò\u008e\u001d\u0081\u0083V\u0082×D\u0018\"\u0092põÂ8i\u0013\u007f\u0090ìm%CLTÇàû\u009cSP\u0087æ";
                        length = "#\u008eÉ\u00161ÊÌµ\u0090\u0083\u0098\u0006\u0096\u0094ñïo;:~8\u0006m¶nç3\u008e\u0092C|Ò\u008e\u001d\u0081\u0083V\u0082×D\u0018\"\u0092põÂ8i\u0013\u007f\u0090ìm%CLTÇàû\u009cSP\u0087æ".length();
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 27381;
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
                throw new RuntimeException("su/catlean/y3", e2);
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
            java.lang.String r1 = "su/catlean/y3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 18391;
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
                    throw new RuntimeException("su/catlean/y3", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            java.lang.String r1 = "su/catlean/y3"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.y3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
