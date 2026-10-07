package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_s.class */
public final class _s {

    @NotNull
    private final Function1 l;
    public static final _s LINEAR;
    public static final _s IN_QUAD;
    public static final _s OUT_QUAD;
    public static final _s IN_OUT_QUAD;
    public static final _s IN_CUBIC;
    public static final _s OUT_CUBIC;
    public static final _s IN_QUART;
    public static final _s OUT_QUART;
    public static final _s IN_OUT_QUART;
    public static final _s IN_QUINT;
    public static final _s OUT_QUINT;
    public static final _s IN_OUT_QUINT;
    public static final _s IN_SINE;
    public static final _s OUT_SINE;
    public static final _s IN_OUT_SINE;
    public static final _s IN_EXPO;
    public static final _s OUT_EXPO;
    public static final _s IN_OUT_EXPO;
    public static final _s IN_CIRC;
    public static final _s OUT_CIRC;
    public static final _s IN_OUT_CIRC;
    public static final _s SIGMOID;
    public static final _s SIGMOID_2;
    public static final _s SIGMOID_3;
    public static final _s SIGMOID_4;
    public static final _s SIGMOID_5;
    public static final _s SIGMOID_6;
    public static final _s SIGMOID_7;
    public static final _s OUT_ELASTIC;
    public static final _s IN_BACK;
    public static final _s OUT_BACK;
    public static final _s DECELERATE;
    public static final _s IN_OUT_CUBIC;
    private static final /* synthetic */ _s[] E;
    private static final /* synthetic */ EnumEntries y;
    private static int C;
    private static final long a = yz.a(-9013688604926029903L, 4599953073514562494L, MethodHandles.lookup().lookupClass()).a(60604735909866L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    private _s(String str, int i, Function1 function1) {
        this.l = function1;
    }

    @NotNull
    public final Function1 a() {
        return this.l;
    }

    public static _s[] values() {
        return (_s[]) E.clone();
    }

    public static _s valueOf(String value) {
        return (_s) Enum.valueOf(_s.class, value);
    }

    @NotNull
    public static EnumEntries W() {
        return y;
    }

    private static final double b(double d2) {
        return d2;
    }

    private static final double e(double d2) {
        return Math.pow(d2, 2);
    }

    private static final double W(double d2) {
        return d2 * (((double) 2) - d2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final double E(double d2) {
        long j = a ^ 39686212317962L;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5844322394492871087L, j) /* invoke-custom */;
        try {
            int i = (d2 > 0.5d ? 1 : (d2 == 0.5d ? 0 : -1));
            if (r0 != 0) {
                if (i < 0) {
                    return ((double) 2) * Math.pow(d2, 2);
                }
                i = -1;
            }
            return ((double) i) + ((((double) 4) - (((double) 2) * d2)) * d2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5840202223797153431L, j) /* invoke-custom */;
        }
    }

    private static final double F(double d2) {
        return Math.pow(d2, 3);
    }

    private static final double m(double d2) {
        return Math.pow(d2 - ((double) 1), 3) + ((double) 1);
    }

    private static final double c(double d2) {
        return Math.pow(d2, 4);
    }

    private static final double G(double d2) {
        return ((double) 1) - Math.pow(d2 - ((double) 1), 4);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final double Q(double d2) {
        long j = a ^ 101736700417135L;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5257984966461304514L, j) /* invoke-custom */;
        try {
            double d3 = d2;
            double dPow = 0.5d;
            if (r0 == 0) {
                if (d3 < 0.5d) {
                    return ((double) 8.0f) * d2 * d2 * d2 * d2;
                }
                d3 = 1.0f;
                dPow = Math.pow((((double) (-2.0f)) * d2) + ((double) 2.0f), 4) / ((double) 2.0f);
            }
            return d3 - dPow;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5302451563269862924L, j) /* invoke-custom */;
        }
    }

    private static final double p(double d2) {
        return Math.pow(d2, 5);
    }

    private static final double h(double d2) {
        return ((double) 1) + Math.pow(d2 - ((double) 1), 5);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final double S(double d2) {
        long j = a ^ 41431249461353L;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-216625432788821308L, j) /* invoke-custom */;
        try {
            double d3 = d2;
            double dPow = 0.5d;
            if (r0 == 0) {
                if (d3 < 0.5d) {
                    return ((double) 16.0f) * d2 * d2 * d2 * d2 * d2;
                }
                d3 = 1.0f;
                dPow = Math.pow((((double) (-2.0f)) * d2) + ((double) 2.0f), 5) / ((double) 2.0f);
            }
            return d3 - dPow;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -175518668403146230L, j) /* invoke-custom */;
        }
    }

    private static final double k(double d2) {
        return ((double) 1) - Math.cos((d2 * 3.141592653589793d) / ((double) 2));
    }

    private static final double P(double d2) {
        return Math.sin((d2 * 3.141592653589793d) / ((double) 2));
    }

    private static final double t(double d2) {
        return ((double) 1) - Math.cos((3.141592653589793d * d2) / ((double) 2));
    }

    private static final double D(double d2) {
        long j = a ^ 21530327668768L;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8883541118031043955L, j) /* invoke-custom */;
        int i2 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i == 0) {
            i2 = i2 == 0 ? 1 : 0;
        }
        if (i2 != 0) {
            return 0.0d;
        }
        return Math.pow(2.0d, (((double) (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10051, 525295534861678196L ^ j) /* invoke-custom */) * d2) - ((double) (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32241, 5762997225879514335L ^ j) /* invoke-custom */));
    }

    private static final double a(double d2) {
        long j = a ^ 46352983739309L;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7549603253658849024L, j) /* invoke-custom */;
        int i2 = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
        if (i == 0) {
            i2 = i2 == 0 ? 1 : 0;
        }
        if (i2 != 0) {
            return 1.0d;
        }
        return ((double) 1) - Math.pow(2.0d, ((double) (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17359, 8555492160562823527L ^ j) /* invoke-custom */) * d2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final double s(double r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._s.s(double):double");
    }

    private static final double x(double d2) {
        return ((double) 1) - Math.sqrt(((double) 1) - Math.pow(d2, 2));
    }

    private static final double K(double d2) {
        return Math.sqrt(((double) 1) - Math.pow(d2 - ((double) 1), 2));
    }

    private static final double v(double d2) {
        double d3 = d2;
        double d4 = 0.5d;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5648764102249135826L, a ^ 107053008055413L) /* invoke-custom */ != 0) {
            if (d3 < 0.5d) {
                double d5 = ((double) 2.0f) * d2;
                return (((double) 1.0f) - Math.sqrt(((double) 1.0f) - (d5 * d5))) / ((double) 2.0f);
            }
            d3 = ((double) (-2.0f)) * d2;
            d4 = 2.0f;
        }
        double d6 = d3 + d4;
        return (Math.sqrt(((double) 1.0f) - (d6 * d6)) + ((double) 1.0f)) / ((double) 2.0f);
    }

    private static final double H(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-10.0d) * (d2 - 0.5d)));
    }

    private static final double N(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-8.0d) * (d2 - 0.5d)));
    }

    private static final double j(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-12.0d) * (d2 - 0.5d)));
    }

    private static final double i(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-6.0d) * (d2 - 0.5d)));
    }

    private static final double T(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-14.0d) * (d2 - 0.5d)));
    }

    private static final double r(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-4.0d) * (d2 - 0.5d)));
    }

    private static final double C(double d2) {
        return ((double) 1) / (((double) 1) + Math.exp((-16.0d) * (d2 - 0.5d)));
    }

    private static final double U(double d2) {
        long j = a ^ 14451578397744L;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5053352676293588629L, j) /* invoke-custom */;
        int i2 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i != 0) {
            i2 = i2 == 0 ? 1 : 0;
        }
        if (i2 != 0) {
            return 0.0d;
        }
        int i3 = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
        if (i != 0) {
            i3 = i3 == 0 ? 1 : 0;
        }
        if (i3 != 0) {
            return 1.0d;
        }
        return (Math.pow(2.0d, ((double) (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27894, 4405494531056435663L ^ j) /* invoke-custom */) * d2) * Math.sin(((d2 * ((double) (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32241, 5763017360057700559L ^ j) /* invoke-custom */)) - 0.75d) * 2.0943951023931953d) * 0.5d) + ((double) 1);
    }

    private static final double B(double d2) {
        return (2.70158d * Math.pow(d2, 3)) - (1.70158d * Math.pow(d2, 2));
    }

    private static final double l(double d2) {
        return ((double) 1) + (2.70158d * Math.pow(d2 - ((double) 1), 3)) + (1.70158d * Math.pow(d2 - ((double) 1), 2));
    }

    private static final double z(double d2) {
        return ((double) 1) - Math.pow(d2 - ((double) 1), 2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final double u(double d2) {
        long j = a ^ 13033275095330L;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6506212559864085617L, j) /* invoke-custom */;
        try {
            double d3 = d2;
            double dPow = 0.5d;
            if (r0 == 0) {
                if (d3 < 0.5d) {
                    return ((double) 4.0f) * d2 * d2 * d2;
                }
                d3 = 1.0f;
                dPow = Math.pow((((double) (-2.0f)) * d2) + ((double) 2.0f), 3) / ((double) 2.0f);
            }
            return d3 - dPow;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6567584405811700927L, j) /* invoke-custom */;
        }
    }

    private static final /* synthetic */ _s[] b(long j) {
        long j2 = a ^ j;
        _s[] _sVarArr = new _s[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23475, 5698566655544488968L ^ j2) /* invoke-custom */];
        _sVarArr[0] = LINEAR;
        _sVarArr[1] = IN_QUAD;
        _sVarArr[2] = OUT_QUAD;
        _sVarArr[3] = IN_OUT_QUAD;
        _sVarArr[4] = IN_CUBIC;
        _sVarArr[5] = OUT_CUBIC;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24127, 3496570258310001025L ^ j2) /* invoke-custom */] = IN_QUART;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31180, 602137082433099346L ^ j2) /* invoke-custom */] = OUT_QUART;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12764, 5072482867129130585L ^ j2) /* invoke-custom */] = IN_OUT_QUART;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24333, 5638936874556420231L ^ j2) /* invoke-custom */] = IN_QUINT;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32241, 5763042891804430935L ^ j2) /* invoke-custom */] = OUT_QUINT;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12431, 6909714482265136939L ^ j2) /* invoke-custom */] = IN_OUT_QUINT;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6450, 4968617920639743617L ^ j2) /* invoke-custom */] = IN_SINE;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19113, 5260937971485336881L ^ j2) /* invoke-custom */] = OUT_SINE;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15919, 5615279561433452975L ^ j2) /* invoke-custom */] = IN_OUT_SINE;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16491, 3473000562656473036L ^ j2) /* invoke-custom */] = IN_EXPO;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9720, 8701049139437865565L ^ j2) /* invoke-custom */] = OUT_EXPO;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7642, 9075196139769148007L ^ j2) /* invoke-custom */] = IN_OUT_EXPO;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31814, 5751662720067752909L ^ j2) /* invoke-custom */] = IN_CIRC;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1609, 4603248810611943892L ^ j2) /* invoke-custom */] = OUT_CIRC;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26473, 4017993980672592096L ^ j2) /* invoke-custom */] = IN_OUT_CIRC;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32625, 8686132274217930945L ^ j2) /* invoke-custom */] = SIGMOID;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23551, 8190665476992038014L ^ j2) /* invoke-custom */] = SIGMOID_2;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28150, 2457825005580272196L ^ j2) /* invoke-custom */] = SIGMOID_3;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12145, 3191215024412524778L ^ j2) /* invoke-custom */] = SIGMOID_4;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27809, 6036391806821679874L ^ j2) /* invoke-custom */] = SIGMOID_5;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20838, 5759590329732923076L ^ j2) /* invoke-custom */] = SIGMOID_6;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27618, 7535411579106935917L ^ j2) /* invoke-custom */] = SIGMOID_7;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13504, 3139512218460035944L ^ j2) /* invoke-custom */] = OUT_ELASTIC;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26745, 470984910284474325L ^ j2) /* invoke-custom */] = IN_BACK;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12002, 465521585024303472L ^ j2) /* invoke-custom */] = OUT_BACK;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11128, 578472966368822468L ^ j2) /* invoke-custom */] = DECELERATE;
        _sVarArr[(int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12058, 8582555242844061876L ^ j2) /* invoke-custom */] = IN_OUT_CUBIC;
        return _sVarArr;
    }

    static {
        int i;
        long j = a ^ 66978240592258L;
        long j2 = j ^ 18631773291331L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2624705013063013593L, j) /* invoke-custom */ == 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(54, 2672546896043596119L, j) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[33];
        int i3 = 0;
        String str = "\u009f÷¥ÜiWÁldQâÉ\u009aûc3\u0010,®>\u0014S\u0094ìÒ\u00980Å+#pH<\bøÏ¶_V¥¹e\u0010\u0099µ+GZM\u0000tÉ¹¨\u0018=Bor\u0010\u0000\u009cÊ@!\u0094\u000e;\fQ\u0096\u000f\u000fÛjä\bx\u0080mµT\u000bÉ\u0017\u0010û,ù\r{@\u0003oä®©[%9\u0093\u0016\br\u0083ùÍV\"\u0094\f\u0010;\u001cè3ý<ff¥Ânrüê¨j\u0010\u0012\u0090\u0005ÓÂaíßO\u0090fw¹\u0096Ô«\u0010ìú5¿\u0088\u0090ú\u008a]sõþ\u0094ÝYj\u0010uQß1]`\u0002\u0088ri6\u00adRóÿÈ\b\u0085\u0010e\u008fÊ\u001fÉÎ\u0010|ºñßò ^BñèÇb\u001aÛµ2\u0010ìú5¿\u0088\u0090ú\u008a\u0018g\\ò5úbH\u0010\u0099µ+GZM\u0000tÍÆD|}\u0098\u00944\u0010Kè\u0003_¥\u0091uá]ÒuÓUù{8\u0010A+{¸·Ï*±\u000eHüÆ3Ì\u009f$\u0010\u0099µ+GZM\u0000tm\u0085\u0080\u000béß±Ä\u0010\u009a¢Ò\u0012\u001eªz\u009dá\f5YÈ\u008c\u008b\u0093\u0010t\u0011)\u0018h\u0087û\u0019Ê\u0084Q¤(ýU]\bÖ©â3 °ý«\u0010\u0099µ+GZM\u0000t½LØ\u0018Î\u0081í\u0013\u0010¡|ñÒé'ryÄq\u0011Ò\u0019àË:\u0010Ü4L,\u008e °\u0084ìR¨ãÒ\u001al~\b\u009cq\u008d»\u0013ü¾^\u0010ìú5¿\u0088\u0090ú\u008aåG\u008eGl\u0018Xd\u0010Bµ\"äYÍ®~E\u0006{:OýPh\u0010\u0099µ+GZM\u0000t\u0089,AUc\u001df?\u0010<ë\u0010n ½l\u001cuL\u001c\u0007\u0015O<\u0016\u0010\u009f÷¥ÜiWÁl\u0096g¡^UÎ*\u0015";
        int length = "\u009f÷¥ÜiWÁldQâÉ\u009aûc3\u0010,®>\u0014S\u0094ìÒ\u00980Å+#pH<\bøÏ¶_V¥¹e\u0010\u0099µ+GZM\u0000tÉ¹¨\u0018=Bor\u0010\u0000\u009cÊ@!\u0094\u000e;\fQ\u0096\u000f\u000fÛjä\bx\u0080mµT\u000bÉ\u0017\u0010û,ù\r{@\u0003oä®©[%9\u0093\u0016\br\u0083ùÍV\"\u0094\f\u0010;\u001cè3ý<ff¥Ânrüê¨j\u0010\u0012\u0090\u0005ÓÂaíßO\u0090fw¹\u0096Ô«\u0010ìú5¿\u0088\u0090ú\u008a]sõþ\u0094ÝYj\u0010uQß1]`\u0002\u0088ri6\u00adRóÿÈ\b\u0085\u0010e\u008fÊ\u001fÉÎ\u0010|ºñßò ^BñèÇb\u001aÛµ2\u0010ìú5¿\u0088\u0090ú\u008a\u0018g\\ò5úbH\u0010\u0099µ+GZM\u0000tÍÆD|}\u0098\u00944\u0010Kè\u0003_¥\u0091uá]ÒuÓUù{8\u0010A+{¸·Ï*±\u000eHüÆ3Ì\u009f$\u0010\u0099µ+GZM\u0000tm\u0085\u0080\u000béß±Ä\u0010\u009a¢Ò\u0012\u001eªz\u009dá\f5YÈ\u008c\u008b\u0093\u0010t\u0011)\u0018h\u0087û\u0019Ê\u0084Q¤(ýU]\bÖ©â3 °ý«\u0010\u0099µ+GZM\u0000t½LØ\u0018Î\u0081í\u0013\u0010¡|ñÒé'ryÄq\u0011Ò\u0019àË:\u0010Ü4L,\u008e °\u0084ìR¨ãÒ\u001al~\b\u009cq\u008d»\u0013ü¾^\u0010ìú5¿\u0088\u0090ú\u008aåG\u008eGl\u0018Xd\u0010Bµ\"äYÍ®~E\u0006{:OýPh\u0010\u0099µ+GZM\u0000t\u0089,AUc\u001df?\u0010<ë\u0010n ½l\u001cuL\u001c\u0007\u0015O<\u0016\u0010\u009f÷¥ÜiWÁl\u0096g¡^UÎ*\u0015".length();
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
                            d = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[58];
                            int i9 = 0;
                            String str3 = "¥\b\u008a\u001b½ìÝL\u001exST\u009bw7þ©\u0085|ó\u0019¯\fÛ\u0084\u0004\u0098qc%\u0096\u0091\to\b/ Q3\u0091³èö\u0089\u0003Vâx$Ð\u001d»Ê\rLIã\u0097h\u000fkS&ICk~}H&\u00027\u008e;k\u009fÁá\u0082<X&\u008d\u00031zè\u0015\u009cq\u0015\u0017]\f\u001cÝà¼ÇÁc~ë»\u0000¦UË¤s(Z\u008cCÈVv+Ò\u0007)\u0016\u001dò4wâ)\u001fON>ØÝ\u0091ï8Ó\u0088¿¾\u0091\u0098=YmàW \u008eåØÛ\u0096\u0097÷0Ì\u0012|ÙÐI¿ÿ#\u009fä\u001aÏUZvÄÁ¯\f\u0085\u0092½8\u001d\b^ñ}\u0007\u000e<\u0014^?-¨ûµ\u0014\u00056J¼ì\u0001y\u0016O++¹;\u008cì\u000f\u0000p+\tÑ3Í\rÇ\u0094ã(\u001cZøA6\u0095\u009f/\u008b]e-Ì\u0087\b\u0006\u001e¨\u0005Ã§*\u0017²á\u0097\u0088²Ë\u001b@ð³u\u001f\u0092\r\u007f\u009f\u0013åÚÇöh@ºàMd~\u0007dwÙ\u0089¡Rã¢m\u009ct\u001d\u0010\f\u0095{c3ú\u000fÿ\u0089£Æ=\u001b%bx¿L\u0019@º¤\u0013¬nÞÐ$C{fmw\u0010æl0\u009f¬¼±á4Y\u0083 4\u001d\u008f¹E\u0013ÂÔí\u009e1qkq\u0012£J\u0011\u0011¥\u008fó.\u0002e\u001es¤ÖzÌ,u±¾*1õÔ\u008d>÷E¿Ãr\u001aþzÜõ¡ý\u0012\u001f\u009e.\"\u0005éeÞN&?Ã\u008eÅ#¹ëy\u0093¾\u0083\u000e_%ÒN\tKàfz\u0091©àÓ\u0013iú¦\f÷z?¶?ûhDæè¼é³\u0084,¥d8";
                            int length2 = "¥\b\u008a\u001b½ìÝL\u001exST\u009bw7þ©\u0085|ó\u0019¯\fÛ\u0084\u0004\u0098qc%\u0096\u0091\to\b/ Q3\u0091³èö\u0089\u0003Vâx$Ð\u001d»Ê\rLIã\u0097h\u000fkS&ICk~}H&\u00027\u008e;k\u009fÁá\u0082<X&\u008d\u00031zè\u0015\u009cq\u0015\u0017]\f\u001cÝà¼ÇÁc~ë»\u0000¦UË¤s(Z\u008cCÈVv+Ò\u0007)\u0016\u001dò4wâ)\u001fON>ØÝ\u0091ï8Ó\u0088¿¾\u0091\u0098=YmàW \u008eåØÛ\u0096\u0097÷0Ì\u0012|ÙÐI¿ÿ#\u009fä\u001aÏUZvÄÁ¯\f\u0085\u0092½8\u001d\b^ñ}\u0007\u000e<\u0014^?-¨ûµ\u0014\u00056J¼ì\u0001y\u0016O++¹;\u008cì\u000f\u0000p+\tÑ3Í\rÇ\u0094ã(\u001cZøA6\u0095\u009f/\u008b]e-Ì\u0087\b\u0006\u001e¨\u0005Ã§*\u0017²á\u0097\u0088²Ë\u001b@ð³u\u001f\u0092\r\u007f\u009f\u0013åÚÇöh@ºàMd~\u0007dwÙ\u0089¡Rã¢m\u009ct\u001d\u0010\f\u0095{c3ú\u000fÿ\u0089£Æ=\u001b%bx¿L\u0019@º¤\u0013¬nÞÐ$C{fmw\u0010æl0\u009f¬¼±á4Y\u0083 4\u001d\u008f¹E\u0013ÂÔí\u009e1qkq\u0012£J\u0011\u0011¥\u008fó.\u0002e\u001es¤ÖzÌ,u±¾*1õÔ\u008d>÷E¿Ãr\u001aþzÜõ¡ý\u0012\u001f\u009e.\"\u0005éeÞN&?Ã\u008eÅ#¹ëy\u0093¾\u0083\u000e_%ÒN\tKàfz\u0091©àÓ\u0013iú¦\f÷z?¶?ûhDæè¼é³\u0084,¥d8".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                b = jArr;
                                                c = new Integer[58];
                                                LINEAR = new _s(strArr[32], 0, (v0) -> {
                                                    return b(v0);
                                                });
                                                IN_QUAD = new _s(strArr[21], 1, (v0) -> {
                                                    return e(v0);
                                                });
                                                OUT_QUAD = new _s(strArr[29], 2, (v0) -> {
                                                    return W(v0);
                                                });
                                                IN_OUT_QUAD = new _s(strArr[26], 3, (v0) -> {
                                                    return E(v0);
                                                });
                                                IN_CUBIC = new _s(strArr[1], 4, (v0) -> {
                                                    return F(v0);
                                                });
                                                OUT_CUBIC = new _s(strArr[4], 5, (v0) -> {
                                                    return m(v0);
                                                });
                                                IN_QUART = new _s(strArr[20], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16089, 2856573105884417610L ^ j) /* invoke-custom */, (v0) -> {
                                                    return c(v0);
                                                });
                                                OUT_QUART = new _s(strArr[16], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10982, 7049989839371360848L ^ j) /* invoke-custom */, (v0) -> {
                                                    return G(v0);
                                                });
                                                IN_OUT_QUART = new _s(strArr[10], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15191, 3252861432695114706L ^ j) /* invoke-custom */, (v0) -> {
                                                    return Q(v0);
                                                });
                                                IN_QUINT = new _s(strArr[19], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10141, 6198626296269657859L ^ j) /* invoke-custom */, (v0) -> {
                                                    return p(v0);
                                                });
                                                OUT_QUINT = new _s(strArr[9], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32241, 5763033086936255869L ^ j) /* invoke-custom */, (v0) -> {
                                                    return h(v0);
                                                });
                                                IN_OUT_QUINT = new _s(strArr[14], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6125, 7250519946152011589L ^ j) /* invoke-custom */, (v0) -> {
                                                    return S(v0);
                                                });
                                                IN_SINE = new _s(strArr[25], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6965, 8785345098767821742L ^ j) /* invoke-custom */, (v0) -> {
                                                    return k(v0);
                                                });
                                                OUT_SINE = new _s(strArr[8], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20013, 2048769779793444541L ^ j) /* invoke-custom */, (v0) -> {
                                                    return P(v0);
                                                });
                                                IN_OUT_SINE = new _s(strArr[27], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22331, 6760043912395401113L ^ j) /* invoke-custom */, (v0) -> {
                                                    return t(v0);
                                                });
                                                IN_EXPO = new _s(strArr[7], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30121, 7303856300043109667L ^ j) /* invoke-custom */, (v0) -> {
                                                    return D(v0);
                                                });
                                                OUT_EXPO = new _s(strArr[13], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17247, 7232508511420003321L ^ j) /* invoke-custom */, (v0) -> {
                                                    return a(v0);
                                                });
                                                IN_OUT_EXPO = new _s(strArr[6], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23924, 5737635764597435869L ^ j) /* invoke-custom */, (v0) -> {
                                                    return s(v0);
                                                });
                                                IN_CIRC = new _s(strArr[2], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20257, 2334566986980310924L ^ j) /* invoke-custom */, (v0) -> {
                                                    return x(v0);
                                                });
                                                OUT_CIRC = new _s(strArr[17], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19620, 3203639719583333399L ^ j) /* invoke-custom */, (v0) -> {
                                                    return K(v0);
                                                });
                                                IN_OUT_CIRC = new _s(strArr[30], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24392, 6938154230886903767L ^ j) /* invoke-custom */, (v0) -> {
                                                    return v(v0);
                                                });
                                                SIGMOID = new _s(strArr[5], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11387, 4609086689179426042L ^ j) /* invoke-custom */, (v0) -> {
                                                    return H(v0);
                                                });
                                                SIGMOID_2 = new _s(strArr[31], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9010, 5814312688150762414L ^ j) /* invoke-custom */, (v0) -> {
                                                    return N(v0);
                                                });
                                                SIGMOID_3 = new _s(strArr[28], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8072, 4656039412762079037L ^ j) /* invoke-custom */, (v0) -> {
                                                    return j(v0);
                                                });
                                                SIGMOID_4 = new _s(strArr[18], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1418, 5977287682043901194L ^ j) /* invoke-custom */, (v0) -> {
                                                    return i(v0);
                                                });
                                                SIGMOID_5 = new _s(strArr[22], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9629, 1883990817648071966L ^ j) /* invoke-custom */, (v0) -> {
                                                    return T(v0);
                                                });
                                                SIGMOID_6 = new _s(strArr[15], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12997, 1919314279118291554L ^ j) /* invoke-custom */, (v0) -> {
                                                    return r(v0);
                                                });
                                                SIGMOID_7 = new _s(strArr[3], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2558, 5105878628777425223L ^ j) /* invoke-custom */, (v0) -> {
                                                    return C(v0);
                                                });
                                                OUT_ELASTIC = new _s(strArr[11], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30640, 8587883348882655010L ^ j) /* invoke-custom */, (v0) -> {
                                                    return U(v0);
                                                });
                                                IN_BACK = new _s(strArr[12], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11970, 5371656463948799590L ^ j) /* invoke-custom */, (v0) -> {
                                                    return B(v0);
                                                });
                                                OUT_BACK = new _s(strArr[24], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28807, 6376546395870429210L ^ j) /* invoke-custom */, (v0) -> {
                                                    return l(v0);
                                                });
                                                DECELERATE = new _s(strArr[23], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22749, 8966269196745451629L ^ j) /* invoke-custom */, (v0) -> {
                                                    return z(v0);
                                                });
                                                IN_OUT_CUBIC = new _s(strArr[0], (int) a(MethodHandles.lookup(), "s", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1764, 6757058998148658762L ^ j) /* invoke-custom */, (v0) -> {
                                                    return u(v0);
                                                });
                                                E = b(j2);
                                                y = EnumEntriesKt.enumEntries(E);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                str3 = "î\u009bt<\u009aóÍ6;\u009dvÓÞ\u0014)G";
                                                length2 = "î\u009bt<\u009aóÍ6;\u009dvÓÞ\u0014)G".length();
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
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u0099µ+GZM\u0000t´\u0094gW\fU\u000b\u008c\b&Åà¾\b\u0002\bp";
                        length = "\u0099µ+GZM\u0000t´\u0094gW\fU\u000b\u008c\b&Åà¾\b\u0002\bp".length();
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

    public static void P(int i) {
        C = i;
    }

    public static int m() {
        return C;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int O() {
        return m() == 0 ? 122 : 0;
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

    private static int a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21867;
        if (c[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) b[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) d.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_s", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            c[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return c[i2].intValue();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iA)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iA;
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
            java.lang.String r1 = "su/catlean/_s"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._s.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
