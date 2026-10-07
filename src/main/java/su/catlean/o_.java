package su.catlean;

import java.awt.Color;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/o_.class */
@Serializable
public final class o_ {

    @NotNull
    public static final a9 q;

    @NotNull
    private final String d;

    @NotNull
    private Color B;

    @NotNull
    private Color l;

    @NotNull
    private Color f;

    @NotNull
    private Color n;

    @NotNull
    private Color j;

    @NotNull
    private Color H;

    @NotNull
    private Color i;

    @NotNull
    private Color w;

    @NotNull
    private Color F;

    @NotNull
    private Color b;

    @NotNull
    private Color O;

    @NotNull
    private Color M;

    @JvmField
    @NotNull
    private static final Lazy[] e;
    private static String[] E;
    private static final long a = yz.a(-6889449822042566940L, -4261506346066865672L, MethodHandles.lookup().lookupClass()).a(79524301000234L);
    private static final String[] c;
    private static final String[] g;
    private static final Map h;
    private static final long[] k;
    private static final Integer[] m;
    private static final Map o;

    public o_(@NotNull String id, @NotNull Color primaryColor, @NotNull Color secondaryColor, @NotNull Color blurColor, @NotNull Color widgetBlurColor, long a2, @NotNull Color outlineColor, @NotNull Color textColor, @NotNull Color nonactiveTextColor, @NotNull Color slidersColor, char a3, @NotNull Color nonActiveModuleColor, @NotNull Color moduleColor, @NotNull Color moduleOutlineColor, @NotNull Color nonActiveOutlineModuleColor) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13908, 4594016183064692825L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(primaryColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2926, 671783985353733453L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(secondaryColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19608, 5406229948889526931L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(blurColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4319, 4923514853613842166L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(widgetBlurColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2507, 4268819463535704056L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(outlineColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7810, 2676886322629681316L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(textColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23258, 7905275511820641519L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(nonactiveTextColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7954, 1268813305529573694L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(slidersColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2518, 4981828949851355115L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(nonActiveModuleColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9907, 1817999944862406844L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(moduleColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25169, 3279079271708777582L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(moduleOutlineColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6784, 3564755711408972961L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(nonActiveOutlineModuleColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7439, 309281115957764915L ^ j) /* invoke-custom */);
        this.d = id;
        this.B = primaryColor;
        this.l = secondaryColor;
        this.f = blurColor;
        this.n = widgetBlurColor;
        this.j = outlineColor;
        this.H = textColor;
        this.i = nonactiveTextColor;
        this.w = slidersColor;
        this.F = nonActiveModuleColor;
        this.b = moduleColor;
        this.O = moduleOutlineColor;
        this.M = nonActiveOutlineModuleColor;
    }

    @NotNull
    public final String z() {
        return this.d;
    }

    @NotNull
    public final Color b() {
        return this.B;
    }

    public final void t(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115839123053178407L ^ (a ^ a2)) /* invoke-custom */);
        this.B = color;
    }

    @NotNull
    public final Color V() {
        return this.l;
    }

    public final void V(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115747190221870838L ^ (a ^ a2)) /* invoke-custom */);
        this.l = color;
    }

    @NotNull
    public final Color t() {
        return this.f;
    }

    public final void D(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115792958939554731L ^ (a ^ a2)) /* invoke-custom */);
        this.f = color;
    }

    @NotNull
    public final Color X() {
        return this.n;
    }

    public final void l(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115765533824846444L ^ (a ^ a2)) /* invoke-custom */);
        this.n = color;
    }

    @NotNull
    public final Color a() {
        return this.j;
    }

    public final void g(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115770070186678380L ^ (a ^ a2)) /* invoke-custom */);
        this.j = color;
    }

    @NotNull
    public final Color I() {
        return this.H;
    }

    public final void q(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115860575641403120L ^ (a ^ a2)) /* invoke-custom */);
        this.H = color;
    }

    @NotNull
    public final Color P() {
        return this.i;
    }

    public final void Q(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115847726261048303L ^ (a ^ a2)) /* invoke-custom */);
        this.i = color;
    }

    @NotNull
    public final Color U() {
        return this.w;
    }

    public final void j(int a2, char a3, @NotNull Color color, short a4) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115789174337041151L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        this.w = color;
    }

    @NotNull
    public final Color F() {
        return this.F;
    }

    public final void Z(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115760711585482782L ^ (a ^ a2)) /* invoke-custom */);
        this.F = color;
    }

    @NotNull
    public final Color M() {
        return this.b;
    }

    public final void X(int a2, @NotNull Color color, int a3, byte a4) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21450, 1584064405225543750L ^ ((((((long) a2) << 32) | ((((long) a3) << 40) >>> 32)) | ((((long) a4) << 56) >>> 56)) ^ a)) /* invoke-custom */);
        this.b = color;
    }

    @NotNull
    public final Color Y() {
        return this.O;
    }

    public final void G(@NotNull Color color, long a2) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115809902521744518L ^ (a ^ a2)) /* invoke-custom */);
        this.O = color;
    }

    @NotNull
    public final Color H() {
        return this.M;
    }

    public final void i(long a2, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2689, 4115807748365798690L ^ (a ^ a2)) /* invoke-custom */);
        this.M = color;
    }

    @NotNull
    public final String y() {
        return this.d;
    }

    @NotNull
    public final Color f() {
        return this.B;
    }

    @NotNull
    public final Color Q() {
        return this.l;
    }

    @NotNull
    public final Color A() {
        return this.f;
    }

    @NotNull
    public final Color C() {
        return this.n;
    }

    @NotNull
    public final Color B() {
        return this.j;
    }

    @NotNull
    public final Color d() {
        return this.H;
    }

    @NotNull
    public final Color S() {
        return this.i;
    }

    @NotNull
    public final Color j() {
        return this.w;
    }

    @NotNull
    public final Color L() {
        return this.F;
    }

    @NotNull
    public final Color v() {
        return this.b;
    }

    @NotNull
    public final Color E() {
        return this.O;
    }

    @NotNull
    public final Color Z() {
        return this.M;
    }

    @NotNull
    public final o_ z(@NotNull String id, @NotNull Color primaryColor, @NotNull Color secondaryColor, @NotNull Color blurColor, @NotNull Color widgetBlurColor, @NotNull Color outlineColor, @NotNull Color textColor, @NotNull Color nonactiveTextColor, @NotNull Color slidersColor, @NotNull Color nonActiveModuleColor, long a2, @NotNull Color moduleColor, @NotNull Color moduleOutlineColor, @NotNull Color nonActiveOutlineModuleColor) {
        long j = a ^ a2;
        int i = (int) (((j ^ 35207203168403L) << 48) >>> 48);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4713, 6237261669590129650L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(primaryColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19978, 4482083731824773035L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(secondaryColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13295, 4310222152329624190L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(blurColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19372, 452985159154139678L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(widgetBlurColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32667, 290253878963975718L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(outlineColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23299, 3174157303392834234L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(textColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11488, 4783519835844339031L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(nonactiveTextColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26174, 2028417951002439563L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(slidersColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18729, 4869784931214884996L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(nonActiveModuleColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2634, 947316802830189527L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(moduleColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5399, 4136465748817239218L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(moduleOutlineColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14197, 3757094800936042219L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(nonActiveOutlineModuleColor, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10395, 6517384125028491559L ^ j) /* invoke-custom */);
        return new o_(id, primaryColor, secondaryColor, blurColor, widgetBlurColor, j >>> 16, outlineColor, textColor, nonactiveTextColor, slidersColor, (char) i, nonActiveModuleColor, moduleColor, moduleOutlineColor, nonActiveOutlineModuleColor);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:86:0x01b0
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.o_ T(su.catlean.o_ r17, java.lang.String r18, java.awt.Color r19, java.awt.Color r20, java.awt.Color r21, java.awt.Color r22, java.awt.Color r23, java.awt.Color r24, java.awt.Color r25, java.awt.Color r26, java.awt.Color r27, java.awt.Color r28, java.awt.Color r29, java.awt.Color r30, int r31, java.lang.Object r32, long r33) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o_.T(su.catlean.o_, java.lang.String, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, int, java.lang.Object, long):su.catlean.o_");
    }

    @NotNull
    public String toString() {
        long j = a ^ 59587321329984L;
        return (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11275, 7249911821779393229L ^ j) /* invoke-custom */ + this.d + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11458, 4582594550803585597L ^ j) /* invoke-custom */ + this.B + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31124, 3920830779260735316L ^ j) /* invoke-custom */ + this.l + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26185, 257835960026337468L ^ j) /* invoke-custom */ + this.f + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14313, 399314529527709982L ^ j) /* invoke-custom */ + this.n + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23078, 6199030922842647744L ^ j) /* invoke-custom */ + this.j + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9105, 4104180632313812321L ^ j) /* invoke-custom */ + this.H + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3333, 8057464516099210212L ^ j) /* invoke-custom */ + this.i + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19628, 3455123753120283206L ^ j) /* invoke-custom */ + this.w + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30687, 2229995170320515366L ^ j) /* invoke-custom */ + this.F + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25211, 2218522763491087512L ^ j) /* invoke-custom */ + this.b + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11386, 5179367322627955347L ^ j) /* invoke-custom */ + this.O + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4489, 4728767706187065203L ^ j) /* invoke-custom */ + this.M + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    public int hashCode() {
        long j = a ^ 79019259054012L;
        int iHashCode = (((this.d.hashCode() * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15885, 2581922681786745883L ^ j) /* invoke-custom */) + this.B.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.l.hashCode();
        (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7940124964974373113L, j) /* invoke-custom */;
        Object objM = (((((((((((((((((((iHashCode * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.f.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.n.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.j.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.H.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.i.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.w.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.F.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.b.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.O.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18476, 545973369095107129L ^ j) /* invoke-custom */) + this.M.hashCode();
        try {
            objM = objM;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7932571634991657096L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], -7949392373634348974L, j) /* invoke-custom */;
            }
            return objM;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objM, -7926498407666191842L, j) /* invoke-custom */;
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
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o_.equals(java.lang.Object):boolean");
    }

    @JvmStatic
    public static final void T(o_ self, long a2, CompositeEncoder output, SerialDescriptor serialDesc) {
        long j = a ^ a2;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-208185465767740460L, j) /* invoke-custom */;
        Lazy[] lazyArr = e;
        output.encodeStringElement(serialDesc, 0, self.d);
        output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy) lazyArr[1].getValue(), self.B);
        try {
            output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy) lazyArr[2].getValue(), self.l);
            output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy) lazyArr[3].getValue(), self.f);
            output.encodeSerializableElement(serialDesc, 4, (SerializationStrategy) lazyArr[4].getValue(), self.n);
            output.encodeSerializableElement(serialDesc, 5, (SerializationStrategy) lazyArr[5].getValue(), self.j);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17053, 6578702079718151246L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17053, 6578702079718151246L ^ j) /* invoke-custom */].getValue(), self.H);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14898, 4896116384154954982L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14898, 4896116384154954982L ^ j) /* invoke-custom */].getValue(), self.i);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5600, 4264399878555599650L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5600, 4264399878555599650L ^ j) /* invoke-custom */].getValue(), self.w);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9580, 7310567834712388537L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9580, 7310567834712388537L ^ j) /* invoke-custom */].getValue(), self.F);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10343, 5315455971076652710L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10343, 5315455971076652710L ^ j) /* invoke-custom */].getValue(), self.b);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5276, 4443720296674558547L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5276, 4443720296674558547L ^ j) /* invoke-custom */].getValue(), self.O);
            output.encodeSerializableElement(serialDesc, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23308, 2862991145951153618L ^ j) /* invoke-custom */, (SerializationStrategy) lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23308, 2862991145951153618L ^ j) /* invoke-custom */].getValue(), self.M);
            if (_gVarArr == null) {
                _gVarArr = new _g[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -194608480517359759L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -203777212734431539L, j) /* invoke-custom */;
        }
    }

    public o_(int seen0, String id, Color primaryColor, Color secondaryColor, Color blurColor, Color widgetBlurColor, Color outlineColor, Color textColor, long a2, Color nonactiveTextColor, Color slidersColor, Color nonActiveModuleColor, Color moduleColor, Color moduleOutlineColor, Color nonActiveOutlineModuleColor, SerializationConstructorMarker serializationConstructorMarker) {
        long j = a ^ a2;
        if ((int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22858, 7582176664950039664L ^ j) /* invoke-custom */ != ((int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(661, 6323597543719747507L ^ j) /* invoke-custom */ & seen0)) {
            PluginExceptionsKt.throwMissingFieldException(seen0, (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(661, 6323597543719747507L ^ j) /* invoke-custom */, jx.z.getDescriptor());
        }
        this.d = id;
        this.B = primaryColor;
        this.l = secondaryColor;
        this.f = blurColor;
        this.n = widgetBlurColor;
        this.j = outlineColor;
        this.H = textColor;
        this.i = nonactiveTextColor;
        this.w = slidersColor;
        this.F = nonActiveModuleColor;
        this.b = moduleColor;
        this.O = moduleOutlineColor;
        this.M = nonActiveOutlineModuleColor;
    }

    private static final KSerializer x() {
        long j = a ^ 85295456470888L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 80551158658411L) << 48) >>> 48));
    }

    private static final KSerializer D() {
        long j = a ^ 27969901982662L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 32581122949573L) << 48) >>> 48));
    }

    private static final KSerializer r() {
        long j = a ^ 86757216232190L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 81596314996989L) << 48) >>> 48));
    }

    private static final KSerializer m() {
        long j = a ^ 15108773816303L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 10361261020652L) << 48) >>> 48));
    }

    private static final KSerializer c() {
        long j = a ^ 41480950904334L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 36746314581005L) << 48) >>> 48));
    }

    private static final KSerializer T() {
        long j = a ^ 107722412330577L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 111225531792466L) << 48) >>> 48));
    }

    private static final KSerializer l() {
        long j = a ^ 20160010281729L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 24758272954626L) << 48) >>> 48));
    }

    private static final KSerializer o() {
        long j = a ^ 51403174712535L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 46255080793812L) << 48) >>> 48));
    }

    private static final KSerializer g() {
        long j = a ^ 1831027558237L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 6029931689310L) << 48) >>> 48));
    }

    private static final KSerializer J() {
        long j = a ^ 59023771768153L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 54422212437850L) << 48) >>> 48));
    }

    private static final KSerializer s() {
        long j = a ^ 20855888634217L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 24353563841386L) << 48) >>> 48));
    }

    private static final KSerializer k() {
        long j = a ^ 86940490033141L;
        return new yf((int) (j >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j ^ 83304302155254L) << 48) >>> 48));
    }

    public static final Lazy[] O() {
        return e;
    }

    static {
        int i;
        long j = a ^ 63985561554119L;
        h = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -7345432533947841759L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[41];
        int i3 = 0;
        String str = "smè\u0091¤ûæØ>\u0084@_Î\u008b?Ö\u009fJ\u0015»:æãm³û²Î\u000f~\u009e´(ë\b\u0093Ý5\u0090\u0005ÊªøÌ+B¸õ0Å\u009ejvX\u0018=\u008dfÈ!=©Õ]È3\"ÎÕZ+ôg(:Ø\u0085£\u0013K\u0095%`$\u001f\u0005îX\u009f>ÕÏobðYv¬\u0006\u009cè\u000fß\n±\u001a¤©\u0016\n\u0095bþ)\u0018òy\u0011+©³vM;Bl\u009eõ\u009b\u0000\u0010êâ\u001b\u009eq\\R\u001c\u0018\u001d\u0015ø\u0005Ð}\u009a\u007f_fb8Îº\\X\u0091¢êó\u0003]\u0080ð8e\u0015\u0085,ç\u0012\u0013ªDA\u0093Q\u001c<\u0097$Ú±\u0003¹ãr\u0086vùî.\u0013O\u0018\u0082NN¼²¾§_5\u0014àÜ\u009fÂ»ß»µKáÍ*Ä´¢r\u0018ç`U·ä[u\rÛýÆ(]ZI©\u0007ÒÖÓ+)\u0006\u0091\u0018\u00163; U<Aw\u001fv\u009fô\u0082õ5I%ÆÛój\u008fqè\u0018)jÙ\u008b\u001a\u0084¤\u001a«Úú>¥\u0085&\u001d\u001d\u0098n¡\u0090>\nú ¨ÇÅÂDØ»56\u008f{\"\u0007Ã\u0096æÄuË\r·7ógb÷ùs\u0089\u0088\"\u008d\u0018¸\b\fòsíÑGÈ²\u0018ÿ\u0094W\u0094z¾£\\<\u0095\u0082Dn\u0018£\"¥#\u008b\u0084^\nYÎ\u008buÎx½\u0098P\u0018pû\u00ad\u008e\u000fP(\\Qº\t\u0087ÉZ\"¤!S\u008f\u001e_H\u001eøÇfæßQ\u0087\u007fä\u0013³BLÅ\u0091\u0095ê\u007f\bHa'¾Ö F7úe¨\u0094Ã(\u0098Zogæéý_=\u0083#\u001b/áÂ2dÇ2@Üô7E\u0018\u0094ì\b¾á\u0086ôïu\u0010l[U£%$\u0014{\u008fÜ\u007få:o(Ç°\u0081_çÏ\u0090Ö¹\u0010ïÅ£ÅL\u009cüÜe «\u0019öyj*÷\u0016\u009ft#u®â\u0002ê\u0084\u008cyô xÄY»8÷F±°Tü\u0007²\u0018\u0087_Çï¿3\tP´ÒI8õÚàèøz\u0018b\u009a!×\u0089YyøÓ\u0001\u008d\u0093my\u0098µh©gõ\u0083Ñ\u001598(LÆ.±¦¤<\u009d¨\u0099BÀÒwHv5\u001b|²É¬õóqMÙ\u0004Â\u0093È!Nl\u00169*\u0095\u0098\u001cÊ\u0096\u0081¡\r\u000b\u0081|7¸`#\u0011\u0017o\u0018°Mè@!ÕÆZ\u0001[mâ\u00ad>ã\u0018S;\fâÿÄàL \u001d\u0013ó§Íêøßýq\u001eu3c'\u0099Î}*³\u0097\u0004\u001c#«Vç¤<¶<ú 0U\u001cÜ,Ã\u00834v\u0018ÿ:\u001d\u0084¯g.úc\u00ad\u0083³4P\"¨¦#¸ÿj\u0091\u0010¸\u009fa\u0000mvÀö^Ç1°È\u0019\u009a\\0Y\\\u0015â¹\rRÊ\u0092§B\u0012ÝÜµØº8ì\b\u009aE~\u0000\u0004H^¥ÿ\u0019\u0004i¥7\u0098}v[-\u0082U\u0080\u0094ªÓ\u007f=0 Ê\u0015ÅÏ\u0003å\u009eêdi\u0007\u0016-Lè\u001fÆïÜáz\u0016\u0093cçÔîù\u0092 \u009d\u00980ÒÕôÖc»áöÔ]¬¦\u008c\u0089r\u0084ÂC¡r\"\u0003ç\u0005\u0000$\u008dyöN\tÝ\u008a.\u0092 d¼¯½\u0087%L\u0089a\u00046M0\u001e3W«S\u0087&e6\"\u0012[P\u008b\u0088\u0091\u0011ô3Ü`öö.\u008fw\u0096\u009eo´\u001eÎ-4\u0087¥Aû×\u001b\u009a¤t\fÙ|Æ\u009c\u0018NÍ\u0001O\u000e»\u0013\u008ci\\øýÀÅ\u007fwÈ'Ç\u0004Ö\u0012\b\u0086\u0018è ôW\u000bó´\u0006´T\u0007)\u0083ÖÕ\"\u008fÒÐ<Ô³qE Ã#ß¢O<¼\u001c\u0083Ã³ó\u001f\u008cCF¶·¤SQ1\nZ\u0015\u0018¼j&¦ú$\u0010LhPªÉ\r¿\u0094½=X÷#S\r\u00ad\u0018QØ\u0083\u000fuÀ@\n\u0004½ºëß\u0014CÜú*l\u0095å8Y\u008a( ·6z\u0093²&\u001d\u0081{T%ræ\u001bÕ¿A\u0098éñ±\u0000Û¼¸Z*ùîäO1¯P]»\u0099¢ê(?m\u007f\u0016¥\u0083NÿØ+*2®hñÆýÏ¨\u009c\u0092®Æ\u0003o\u0006\u009fJrv}\u009cé®ó8|'óÇ\u0010/ÞI\\É¼áe2÷$fÝK!Î\u0010@â]õûÜ/:a\u008fv£ÎÞ\u0007\u0091(IºþC|²ÎÞ|\u0095ÎÛÏ\u0003²\u0092b°\u001d\u000f6Ê\u0001úäµR\u000eå\u008c\u0017Ô¥ñ¯\u0010|\u0003&q\u0018\u0017\u007f\u0095×ÞØè1)0Ñ;_2\u009d¡\u0089øvO.\u0089Õ2\u0018ívÂP}\u000f+\u009cÒÈ\u0004Í4N[\rO\u0092òBèÉ r";
        int length = "smè\u0091¤ûæØ>\u0084@_Î\u008b?Ö\u009fJ\u0015»:æãm³û²Î\u000f~\u009e´(ë\b\u0093Ý5\u0090\u0005ÊªøÌ+B¸õ0Å\u009ejvX\u0018=\u008dfÈ!=©Õ]È3\"ÎÕZ+ôg(:Ø\u0085£\u0013K\u0095%`$\u001f\u0005îX\u009f>ÕÏobðYv¬\u0006\u009cè\u000fß\n±\u001a¤©\u0016\n\u0095bþ)\u0018òy\u0011+©³vM;Bl\u009eõ\u009b\u0000\u0010êâ\u001b\u009eq\\R\u001c\u0018\u001d\u0015ø\u0005Ð}\u009a\u007f_fb8Îº\\X\u0091¢êó\u0003]\u0080ð8e\u0015\u0085,ç\u0012\u0013ªDA\u0093Q\u001c<\u0097$Ú±\u0003¹ãr\u0086vùî.\u0013O\u0018\u0082NN¼²¾§_5\u0014àÜ\u009fÂ»ß»µKáÍ*Ä´¢r\u0018ç`U·ä[u\rÛýÆ(]ZI©\u0007ÒÖÓ+)\u0006\u0091\u0018\u00163; U<Aw\u001fv\u009fô\u0082õ5I%ÆÛój\u008fqè\u0018)jÙ\u008b\u001a\u0084¤\u001a«Úú>¥\u0085&\u001d\u001d\u0098n¡\u0090>\nú ¨ÇÅÂDØ»56\u008f{\"\u0007Ã\u0096æÄuË\r·7ógb÷ùs\u0089\u0088\"\u008d\u0018¸\b\fòsíÑGÈ²\u0018ÿ\u0094W\u0094z¾£\\<\u0095\u0082Dn\u0018£\"¥#\u008b\u0084^\nYÎ\u008buÎx½\u0098P\u0018pû\u00ad\u008e\u000fP(\\Qº\t\u0087ÉZ\"¤!S\u008f\u001e_H\u001eøÇfæßQ\u0087\u007fä\u0013³BLÅ\u0091\u0095ê\u007f\bHa'¾Ö F7úe¨\u0094Ã(\u0098Zogæéý_=\u0083#\u001b/áÂ2dÇ2@Üô7E\u0018\u0094ì\b¾á\u0086ôïu\u0010l[U£%$\u0014{\u008fÜ\u007få:o(Ç°\u0081_çÏ\u0090Ö¹\u0010ïÅ£ÅL\u009cüÜe «\u0019öyj*÷\u0016\u009ft#u®â\u0002ê\u0084\u008cyô xÄY»8÷F±°Tü\u0007²\u0018\u0087_Çï¿3\tP´ÒI8õÚàèøz\u0018b\u009a!×\u0089YyøÓ\u0001\u008d\u0093my\u0098µh©gõ\u0083Ñ\u001598(LÆ.±¦¤<\u009d¨\u0099BÀÒwHv5\u001b|²É¬õóqMÙ\u0004Â\u0093È!Nl\u00169*\u0095\u0098\u001cÊ\u0096\u0081¡\r\u000b\u0081|7¸`#\u0011\u0017o\u0018°Mè@!ÕÆZ\u0001[mâ\u00ad>ã\u0018S;\fâÿÄàL \u001d\u0013ó§Íêøßýq\u001eu3c'\u0099Î}*³\u0097\u0004\u001c#«Vç¤<¶<ú 0U\u001cÜ,Ã\u00834v\u0018ÿ:\u001d\u0084¯g.úc\u00ad\u0083³4P\"¨¦#¸ÿj\u0091\u0010¸\u009fa\u0000mvÀö^Ç1°È\u0019\u009a\\0Y\\\u0015â¹\rRÊ\u0092§B\u0012ÝÜµØº8ì\b\u009aE~\u0000\u0004H^¥ÿ\u0019\u0004i¥7\u0098}v[-\u0082U\u0080\u0094ªÓ\u007f=0 Ê\u0015ÅÏ\u0003å\u009eêdi\u0007\u0016-Lè\u001fÆïÜáz\u0016\u0093cçÔîù\u0092 \u009d\u00980ÒÕôÖc»áöÔ]¬¦\u008c\u0089r\u0084ÂC¡r\"\u0003ç\u0005\u0000$\u008dyöN\tÝ\u008a.\u0092 d¼¯½\u0087%L\u0089a\u00046M0\u001e3W«S\u0087&e6\"\u0012[P\u008b\u0088\u0091\u0011ô3Ü`öö.\u008fw\u0096\u009eo´\u001eÎ-4\u0087¥Aû×\u001b\u009a¤t\fÙ|Æ\u009c\u0018NÍ\u0001O\u000e»\u0013\u008ci\\øýÀÅ\u007fwÈ'Ç\u0004Ö\u0012\b\u0086\u0018è ôW\u000bó´\u0006´T\u0007)\u0083ÖÕ\"\u008fÒÐ<Ô³qE Ã#ß¢O<¼\u001c\u0083Ã³ó\u001f\u008cCF¶·¤SQ1\nZ\u0015\u0018¼j&¦ú$\u0010LhPªÉ\r¿\u0094½=X÷#S\r\u00ad\u0018QØ\u0083\u000fuÀ@\n\u0004½ºëß\u0014CÜú*l\u0095å8Y\u008a( ·6z\u0093²&\u001d\u0081{T%ræ\u001bÕ¿A\u0098éñ±\u0000Û¼¸Z*ùîäO1¯P]»\u0099¢ê(?m\u007f\u0016¥\u0083NÿØ+*2®hñÆýÏ¨\u009c\u0092®Æ\u0003o\u0006\u009fJrv}\u009cé®ó8|'óÇ\u0010/ÞI\\É¼áe2÷$fÝK!Î\u0010@â]õûÜ/:a\u008fv£ÎÞ\u0007\u0091(IºþC|²ÎÞ|\u0095ÎÛÏ\u0003²\u0092b°\u001d\u000f6Ê\u0001úäµR\u000eå\u008c\u0017Ô¥ñ¯\u0010|\u0003&q\u0018\u0017\u007f\u0095×ÞØè1)0Ñ;_2\u009d¡\u0089øvO.\u0089Õ2\u0018ívÂP}\u000f+\u009cÒÈ\u0004Í4N[\rO\u0092òBèÉ r".length();
        char cCharAt = ' ';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            c = strArr;
                            g = new String[41];
                            o = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[28];
                            int i9 = 0;
                            String str3 = "F²m*\u001e¯a\u0083{v\u001dD\u009eì\u0018`í|ý\u0003~~\u0092[\u0096Zï\u008f7\u0092êÒºá¡ÉM±ìÒçü\u008bÂñ\u0088×ª[¤\u0087êNÌ³\u009e\u008dß¦\rÙ®>q\u009fñ»\nNö\u000b±ÿãªüt\u009fÁ¿¯\u0097\u0099\u0098\u0019\u0081\u0004ÒB qk\u0098*ÑòÏQ\rî\u001fí'C\u009fæÝ\u0091\u008b8KE,\u0090Kh4\u008bz\u009báìvIQZÀá\u000fùí9\u0014\u000f=\u009a;Iåôµ\u009b\u008d[¤Ò'a\u009aQa\u0089\fWbËC%«+ÆÅ\u0086T\u0081(âO®\u001a\u0007½\u00101ùÿx\u008cÏ\u0086ô*µ1ÀÎìæc\u001fo\t¸ \u009f,Ì²}¹Cõ\r\u0081xbåg";
                            int length2 = "F²m*\u001e¯a\u0083{v\u001dD\u009eì\u0018`í|ý\u0003~~\u0092[\u0096Zï\u008f7\u0092êÒºá¡ÉM±ìÒçü\u008bÂñ\u0088×ª[¤\u0087êNÌ³\u009e\u008dß¦\rÙ®>q\u009fñ»\nNö\u000b±ÿãªüt\u009fÁ¿¯\u0097\u0099\u0098\u0019\u0081\u0004ÒB qk\u0098*ÑòÏQ\rî\u001fí'C\u009fæÝ\u0091\u008b8KE,\u0090Kh4\u008bz\u009báìvIQZÀá\u000fùí9\u0014\u000f=\u009a;Iåôµ\u009b\u008d[¤Ò'a\u009aQa\u0089\fWbËC%«+ÆÅ\u0086T\u0081(âO®\u001a\u0007½\u00101ùÿx\u008cÏ\u0086ô*µ1ÀÎìæc\u001fo\t¸ \u009f,Ì²}¹Cõ\r\u0081xbåg".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                k = jArr;
                                                m = new Integer[28];
                                                q = new a9(null);
                                                Lazy[] lazyArr = new Lazy[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22302, 4149605312059876960L ^ j) /* invoke-custom */];
                                                lazyArr[0] = null;
                                                lazyArr[1] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::x);
                                                lazyArr[2] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::D);
                                                lazyArr[3] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::r);
                                                lazyArr[4] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::m);
                                                lazyArr[5] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::c);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7671, 5720496546260774023L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::T);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7282, 135385271811632413L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::l);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8385, 3764468008287818164L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::o);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12494, 2706423269813830050L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::g);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16372, 564134302604971662L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::J);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14933, 583233324462361395L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::s);
                                                lazyArr[(int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10238, 3667064895901849242L ^ j) /* invoke-custom */] = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, o_::k);
                                                e = lazyArr;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                str3 = "ò4\u0090¢ò\u001bW o_Wö\u001eÇ5\u0087";
                                                length2 = "ò4\u0090¢ò\u001bW o_Wö\u001eÇ5\u0087".length();
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
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b3 = 0;
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
                        str = "ù\u000e3\u0015_\u009dÝ}èÌ\\Á\u008f\u0088\u00ad»¤\u00129¥\u0085ÎI\u0096JC\u0095°a\u0004\u0097\u0096ïq\be6ä\u009f\u0002 RAÂ\\ÊËBU[ä\"E¤4.$VmÌ¤Ø\n\u0002\u000fNt½¥lÆ\u0005¥";
                        length = "ù\u000e3\u0015_\u009dÝ}èÌ\\Á\u008f\u0088\u00ad»¤\u00129¥\u0085ÎI\u0096JC\u0095°a\u0004\u0097\u0096ïq\be6ä\u009f\u0002 RAÂ\\ÊËBU[ä\"E¤4.$VmÌ¤Ø\n\u0002\u000fNt½¥lÆ\u0005¥".length();
                        cCharAt = '(';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void x(String[] strArr) {
        E = strArr;
    }

    public static String[] R() {
        return E;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 22692;
        if (g[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                g[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/o_", e2);
            }
        }
        return g[i2];
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
            java.lang.String r1 = "su/catlean/o_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o_.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 27325;
        if (m[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) k[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) o.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/o_", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            m[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return m[i2].intValue();
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
            java.lang.String r1 = "su/catlean/o_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o_.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
