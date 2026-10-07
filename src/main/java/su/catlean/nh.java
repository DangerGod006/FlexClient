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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nh.class */
@Serializable
public final class nh implements wl {

    @NotNull
    public static final jo Y;

    @NotNull
    private String r;

    @NotNull
    private lj f;
    private boolean q;

    @NotNull
    private String Q;

    @NotNull
    private String i;

    @NotNull
    private String C;

    @NotNull
    private String G;
    private boolean j;
    private static _g[] J;
    private static final long a = yz.a(-6448266468659516814L, -5397245568266820198L, MethodHandles.lookup().lookupClass()).a(167200558413576L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] g;
    private static final Map h;

    public nh(@NotNull String id, @NotNull lj bind, boolean enabled, @NotNull String module, @NotNull String setting, @NotNull String pressValue, @NotNull String releaseValue, boolean hold, long a2) {
        long j = a ^ a2;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1809004810277525509L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18313, 3653025049955594458L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(bind, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4969, 7716856197248820268L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(module, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21585, 4080901808258442002L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(setting, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27816, 1928675425761582072L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(pressValue, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11202, 1755393788124765332L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(releaseValue, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11712, 1585427144024234644L ^ j) /* invoke-custom */);
        this.r = id;
        this.f = bind;
        this.q = enabled;
        this.Q = module;
        this.i = setting;
        this.C = pressValue;
        this.G = releaseValue;
        this.j = hold;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1838083220882458388L, j) /* invoke-custom */ != null) {
            boolean z2 = z;
            if (j > 0) {
                if (z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(z2, -1858585849700715895L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean.wl
    @NotNull
    public String W() {
        return this.r;
    }

    @Override // su.catlean.wl
    public void j(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25211, 2369047179145243064L ^ a2) /* invoke-custom */);
        this.r = str;
    }

    @Override // su.catlean.wl
    @NotNull
    public lj X() {
        return this.f;
    }

    @Override // su.catlean.wl
    public void r(@NotNull lj ljVar, long a2) {
        Intrinsics.checkNotNullParameter(ljVar, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25211, 2369050572634350164L ^ a2) /* invoke-custom */);
        this.f = ljVar;
    }

    @Override // su.catlean.wl
    public boolean I() {
        return this.q;
    }

    @Override // su.catlean.wl
    public void K(boolean z) {
        this.q = z;
    }

    @NotNull
    public final String f() {
        return this.Q;
    }

    public final void l(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25211, 2369101086868183444L ^ (a ^ a2)) /* invoke-custom */);
        this.Q = str;
    }

    @NotNull
    public final String R() {
        return this.i;
    }

    public final void k(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25211, 2369078724506020547L ^ (a ^ a2)) /* invoke-custom */);
        this.i = str;
    }

    @NotNull
    public final String M() {
        return this.C;
    }

    public final void p(int a2, @NotNull String str, char a3, short a4) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25211, 2369156466915412862L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        this.C = str;
    }

    @NotNull
    public final String V() {
        return this.G;
    }

    public final void x(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10639, 308948615440604886L ^ (a ^ a2)) /* invoke-custom */);
        this.G = str;
    }

    public final boolean s() {
        return this.j;
    }

    public final void I(boolean z) {
        this.j = z;
    }

    @NotNull
    public final String H() {
        return this.r;
    }

    @NotNull
    public final lj n() {
        return this.f;
    }

    public final boolean d() {
        return this.q;
    }

    @NotNull
    public final String O() {
        return this.Q;
    }

    @NotNull
    public final String U() {
        return this.i;
    }

    @NotNull
    public final String p() {
        return this.C;
    }

    @NotNull
    public final String c() {
        return this.G;
    }

    public final boolean Q() {
        return this.j;
    }

    @NotNull
    public final nh Y(int a2, @NotNull String id, char a3, @NotNull lj bind, boolean enabled, @NotNull String module, @NotNull String setting, @NotNull String pressValue, @NotNull String releaseValue, boolean hold, short a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8410, 5409807251961219618L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(bind, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27327, 4752265787520991315L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(module, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21090, 2308452788302379138L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(setting, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7437, 179994240769505256L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(pressValue, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25748, 995126608487566967L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(releaseValue, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5162, 3899030494061706967L ^ j) /* invoke-custom */);
        return new nh(id, bind, enabled, module, setting, pressValue, releaseValue, hold, j ^ 63658249358326L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0, types: [su.catlean.nh] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static nh o(nh nhVar, long j, String str, lj ljVar, boolean z, String str2, String str3, String str4, String str5, boolean z2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 61573609222068L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(191154838269232057L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 != 0) {
                if (r0 != 0) {
                    str = ((nh) nhVar).r;
                }
                r02 = i & 2;
            }
            ?? r1 = r0;
            ?? r03 = r02;
            ?? r04 = r02;
            ?? r12 = r1;
            if (j2 > 0) {
                if (r1 != 0) {
                    if (r02 != 0) {
                        ljVar = ((nh) nhVar).f;
                    }
                    r03 = i & 4;
                }
                r12 = r0;
                r04 = r03;
            }
            ?? L = r04;
            ?? r05 = r04;
            ?? r13 = r12;
            if (j2 >= 0) {
                if (r12 != 0) {
                    if (r04 != 0) {
                        z = ((nh) nhVar).q;
                    }
                    L = i & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1259, 3371259119669331948L ^ j2) /* invoke-custom */;
                }
                r13 = r0;
                r05 = L;
            }
            ?? L2 = r05;
            ?? r06 = r05;
            ?? r14 = r13;
            if (j2 > 0) {
                if (r13 != 0) {
                    if (r05 != 0) {
                        str2 = ((nh) nhVar).Q;
                    }
                    L2 = i & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18625, 7224252767909678018L ^ j2) /* invoke-custom */;
                }
                r14 = r0;
                r06 = L2;
            }
            ?? L3 = r06;
            ?? r07 = r06;
            ?? r15 = r14;
            if (j2 > 0) {
                if (r14 != 0) {
                    if (r06 != 0) {
                        str3 = ((nh) nhVar).i;
                    }
                    L3 = i & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26219, 1118216676537541999L ^ j2) /* invoke-custom */;
                }
                r15 = r0;
                r07 = L3;
            }
            ?? L4 = r07;
            ?? L5 = r07;
            ?? r16 = r15;
            if (j2 >= 0) {
                if (r15 != 0) {
                    if (r07 != 0) {
                        str4 = ((nh) nhVar).C;
                    }
                    L4 = i & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10782, 7665976552971233564L ^ j2) /* invoke-custom */;
                }
                r16 = r0;
                L5 = L4;
            }
            try {
                if (j2 > 0) {
                    if (r16 != 0) {
                        if (L5 != 0) {
                            str5 = ((nh) nhVar).G;
                        }
                        L5 = i & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15737, 2054732491354177145L ^ j2) /* invoke-custom */;
                    }
                    r16 = r0;
                }
                if (r16 == 0) {
                    z2 = L5;
                } else if (L5 != 0) {
                    L5 = ((nh) nhVar).j;
                    z2 = L5;
                }
                return nhVar.Y(i2, str, (char) i3, ljVar, z, str2, str3, str4, str5, z2, (short) i4);
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(L5, 163761064216369966L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 163761064216369966L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 105450093724162L;
        return (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9998, 6625423501420569391L ^ j) /* invoke-custom */ + this.r + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25502, 5166122370420303805L ^ j) /* invoke-custom */ + this.f + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(559, 8259392047069464095L ^ j) /* invoke-custom */ + this.q + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24150, 5891533039963888233L ^ j) /* invoke-custom */ + this.Q + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26435, 8148267749706851193L ^ j) /* invoke-custom */ + this.i + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(910, 3549589429945960368L ^ j) /* invoke-custom */ + this.C + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30209, 4055438248094036541L ^ j) /* invoke-custom */ + this.G + (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13001, 8737426535299331824L ^ j) /* invoke-custom */ + this.j + ")";
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [int, java.lang.Object] */
    public int hashCode() {
        long j = a ^ 17016317677604L;
        int iHashCode = (((this.r.hashCode() * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27423, 8280038177195797788L ^ j) /* invoke-custom */) + this.f.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26563, 2709662868021551562L ^ j) /* invoke-custom */) + Boolean.hashCode(this.q);
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8673258855725529412L, j) /* invoke-custom */;
        ?? L = (((((((((iHashCode * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26563, 2709662868021551562L ^ j) /* invoke-custom */) + this.Q.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26563, 2709662868021551562L ^ j) /* invoke-custom */) + this.i.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26563, 2709662868021551562L ^ j) /* invoke-custom */) + this.C.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26563, 2709662868021551562L ^ j) /* invoke-custom */) + this.G.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26563, 2709662868021551562L ^ j) /* invoke-custom */) + Boolean.hashCode(this.j);
        if (!z) {
            try {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], -8697421728519254671L, j) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(L, -8700760381918634453L, j) /* invoke-custom */;
            }
        }
        return L;
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
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nh.equals(java.lang.Object):boolean");
    }

    @JvmStatic
    public static final void Z(nh self, CompositeEncoder output, SerialDescriptor serialDesc, long a2) {
        long j = a ^ a2;
        output.encodeStringElement(serialDesc, 0, self.W());
        output.encodeSerializableElement(serialDesc, 1, ss.B, self.X());
        output.encodeBooleanElement(serialDesc, 2, self.I());
        output.encodeStringElement(serialDesc, 3, self.Q);
        output.encodeStringElement(serialDesc, 4, self.i);
        output.encodeStringElement(serialDesc, 5, self.C);
        output.encodeStringElement(serialDesc, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14319, 5706314356476932477L ^ j) /* invoke-custom */, self.G);
        output.encodeBooleanElement(serialDesc, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26493, 1379786145907909088L ^ j) /* invoke-custom */, self.j);
    }

    public nh(int seen0, String id, lj bind, boolean enabled, String module, String setting, String pressValue, String releaseValue, boolean hold, SerializationConstructorMarker serializationConstructorMarker, long a2) {
        long j = a ^ a2;
        if ((int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24701, 7851344224848479870L ^ j) /* invoke-custom */ != ((int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12916, 7525988894263497855L ^ j) /* invoke-custom */ & seen0)) {
            PluginExceptionsKt.throwMissingFieldException(seen0, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12916, 7525988894263497855L ^ j) /* invoke-custom */, rg.W.getDescriptor());
        }
        this.r = id;
        this.f = bind;
        this.q = enabled;
        this.Q = module;
        this.i = setting;
        this.C = pressValue;
        this.G = releaseValue;
        this.j = hold;
    }

    static {
        int i;
        long j = a ^ 135068977646307L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 6655116067500638384L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i3 = 0;
        String str = "U=?À\u009e \r\u0017*Ç/\u009aâ0 \b\u0018UðâjFÞ\u009d\rF`h\u0007Q\u000f\u0006zóÓ|ú÷x\u001ag\u0010\u0006HÒY\u001eöàþåª\u0094Ø\u0017îúK\u0010q¡^v\u0007\bûàY?×NwA\u0006q \u0086ËäÒìCó7\u0090\u008feâ\u0092§[\u001a¥á\u0084F\u0010Ê\u0082à\nze\u0099L(ì´\u0010Xâ\u0080¤|.9Óø\u0018\u009eT®´ô- ²\b\u008f`Âëý\n\u008aõ$\u001cuÝ\u0080Ða3æ\u0082ÕNî\"\tW0P\u0003»_Á\u0010îË\u0001ÆFa¢ä¢ÙüM©&0\u008a\u00109Ñz\u0093=3ø3\u0091Åtõ1\u009eÚÔ\u0010_\u000býôgrDs¯\u0089Wbe8Ñì\u0018Ôÿ\u009a\u0091î\"ñtÌ\u0091K¢¬GqCQ#³@\t)Ñµ ¿/Õ\u0013Û÷É\u0013q\u0005\u008a´\u009f5ÌdwJ[þ)¶\u001d´\rßÓ\u0017Å\u0010U'\u0010Á;=*5Vdw\u0000ö Ö|\u0093'É æÆ¾D\t\u0000\f\u008e\u0012¿\rê,\u009cg×\u008b´ÏË$ÿS2èi\u008bcÔ3\u0005È Uæzph0\u001bìZÀEÉ4eáÍ\u0006ZÄ=>²L°vôàv£F²\u0087\u0018/\u0096õðïü\u000f\u0089ÄfÜ4ß\bÕ v\u0096^\u001b¿Ïz)(]F\u008d=Â\u008cìG\u0015\u0000\u0086\u0085O\u0080\u0090BAb»HHjý\rÈWF¬\u0099±Æì5«¡è ]ñ÷\u0018¶î\u007fìQ\u008a×ý\u0006(Ý\u0001n\u0010»J\u0088½+¤\u007fWA&\u0010ó¯k=%¯e¤IáÈE\u0094OÒG\u0010·:\u00962z÷\u008aá?\u0082\u0096)\"0ßç";
        int length = "U=?À\u009e \r\u0017*Ç/\u009aâ0 \b\u0018UðâjFÞ\u009d\rF`h\u0007Q\u000f\u0006zóÓ|ú÷x\u001ag\u0010\u0006HÒY\u001eöàþåª\u0094Ø\u0017îúK\u0010q¡^v\u0007\bûàY?×NwA\u0006q \u0086ËäÒìCó7\u0090\u008feâ\u0092§[\u001a¥á\u0084F\u0010Ê\u0082à\nze\u0099L(ì´\u0010Xâ\u0080¤|.9Óø\u0018\u009eT®´ô- ²\b\u008f`Âëý\n\u008aõ$\u001cuÝ\u0080Ða3æ\u0082ÕNî\"\tW0P\u0003»_Á\u0010îË\u0001ÆFa¢ä¢ÙüM©&0\u008a\u00109Ñz\u0093=3ø3\u0091Åtõ1\u009eÚÔ\u0010_\u000býôgrDs¯\u0089Wbe8Ñì\u0018Ôÿ\u009a\u0091î\"ñtÌ\u0091K¢¬GqCQ#³@\t)Ñµ ¿/Õ\u0013Û÷É\u0013q\u0005\u008a´\u009f5ÌdwJ[þ)¶\u001d´\rßÓ\u0017Å\u0010U'\u0010Á;=*5Vdw\u0000ö Ö|\u0093'É æÆ¾D\t\u0000\f\u008e\u0012¿\rê,\u009cg×\u008b´ÏË$ÿS2èi\u008bcÔ3\u0005È Uæzph0\u001bìZÀEÉ4eáÍ\u0006ZÄ=>²L°vôàv£F²\u0087\u0018/\u0096õðïü\u000f\u0089ÄfÜ4ß\bÕ v\u0096^\u001b¿Ïz)(]F\u008d=Â\u008cìG\u0015\u0000\u0086\u0085O\u0080\u0090BAb»HHjý\rÈWF¬\u0099±Æì5«¡è ]ñ÷\u0018¶î\u007fìQ\u008a×ý\u0006(Ý\u0001n\u0010»J\u0088½+¤\u007fWA&\u0010ó¯k=%¯e¤IáÈE\u0094OÒG\u0010·:\u00962z÷\u008aá?\u0082\u0096)\"0ßç".length();
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
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[22];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i9 = 0;
                            String str3 = "A¬ËSc¾Ï\u000bLjm\u008fåé²\u008cÄÅg´îµw\bA\u001f'~i\u008fâ\u0082.¦\u000búû¸L£¶:®c»äÇO\u0094\u0011+\u00adPç&Ø¯m<ÂjÙ\t÷\u008cÛ\u008fðêz|ÿ";
                            int length2 = "A¬ËSc¾Ï\u000bLjm\u008fåé²\u008cÄÅg´îµw\bA\u001f'~i\u008fâ\u0082.¦\u000búû¸L£¶:®c»äÇO\u0094\u0011+\u00adPç&Ø¯m<ÂjÙ\t÷\u008cÛ\u008fðêz|ÿ".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                g = new Integer[11];
                                                Y = new jo(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0096c};dìZÈ\"\u0011Ô \u009c{ô\u0081";
                                                length2 = "\u0096c};dìZÈ\"\u0011Ô \u009c{ô\u0081".length();
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
                        str = "^A\u0003fJ]f©L¸\u000fDGH-{\u008c\u0092\u0092ÛFD¨È\u0010\u00ad\\\\Z\f\u0007÷oÙ]Íþ\u008c\u0090\u0015h";
                        length = "^A\u0003fJ]f©L¸\u000fDGH-{\u008c\u0092\u0092ÛFD¨È\u0010\u00ad\\\\Z\f\u0007÷oÙ]Íþ\u008c\u0090\u0015h".length();
                        cCharAt = 24;
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

    public static void c(_g[] _gVarArr) {
        J = _gVarArr;
    }

    public static _g[] k() {
        return J;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 20604;
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
                throw new RuntimeException("su/catlean/nh", e2);
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
            java.lang.String r1 = "su/catlean/nh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nh.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16490;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/nh", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            java.lang.String r1 = "su/catlean/nh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nh.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
