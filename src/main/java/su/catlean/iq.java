package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/iq.class */
public final class iq implements ym {

    @NotNull
    public static final iq a;

    @NotNull
    private static final ArrayList k;

    @NotNull
    private static ArrayList e;

    @NotNull
    private static final ArrayList K;
    private static int L;
    private static final long b = yz.a(-1282272677367790005L, -1581970564411779349L, MethodHandles.lookup().lookupClass()).a(125164507286546L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    private iq() {
    }

    @NotNull
    public final ArrayList C() {
        return k;
    }

    @NotNull
    public final ArrayList L() {
        return e;
    }

    public final void t(long a2, @NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22245, 8447262242581645997L ^ (b ^ a2)) /* invoke-custom */);
        e = arrayList;
    }

    @NotNull
    public final ArrayList u() {
        return K;
    }

    private final boolean A(long j) {
        long j2 = b ^ j;
        ArrayList arrayList = e;
        _g[] _gVarArr = new _g[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4954, 2104405379547242192L ^ j2) /* invoke-custom */];
        _gVarArr[0] = uy.U;
        _gVarArr[1] = uz.E;
        _gVarArr[2] = uw.K;
        _gVarArr[3] = kh.W;
        _gVarArr[4] = qf.C;
        _gVarArr[5] = ku.I;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30390, 5833540214433741664L ^ j2) /* invoke-custom */] = e8.e;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25483, 2590882589145329217L ^ j2) /* invoke-custom */] = kz.e;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11777, 4305407330216813503L ^ j2) /* invoke-custom */] = kt.w;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22952, 6567335872562123832L ^ j2) /* invoke-custom */] = ky.i;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16731, 6937976815490813086L ^ j2) /* invoke-custom */] = qa.d;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2246, 3181810368437028101L ^ j2) /* invoke-custom */] = u6.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6247, 7227107101574829557L ^ j2) /* invoke-custom */] = ue.X;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18040, 2209466131184438148L ^ j2) /* invoke-custom */] = qm.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13775, 3447936635501492350L ^ j2) /* invoke-custom */] = e_.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24214, 7461183684496020374L ^ j2) /* invoke-custom */] = k2.W;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17381, 101343733692354168L ^ j2) /* invoke-custom */] = _y.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32293, 6247888963003380665L ^ j2) /* invoke-custom */] = ul.b;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21218, 8588730548273438528L ^ j2) /* invoke-custom */] = kr.j;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11545, 1929612452295778488L ^ j2) /* invoke-custom */] = _o.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30716, 8727700909406452235L ^ j2) /* invoke-custom */] = u1.A;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3238, 7679200984291639743L ^ j2) /* invoke-custom */] = q3.h;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23260, 8686064129811732271L ^ j2) /* invoke-custom */] = er.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18443, 2181986942345758167L ^ j2) /* invoke-custom */] = qr.T;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2890, 5996175847866435219L ^ j2) /* invoke-custom */] = e1.Y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2425, 6056788709212718252L ^ j2) /* invoke-custom */] = uj.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18669, 6642091833720260074L ^ j2) /* invoke-custom */] = kj.L;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9514, 1670230664907728950L ^ j2) /* invoke-custom */] = _v.V;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23000, 5426481083174769720L ^ j2) /* invoke-custom */] = _2.x;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31329, 5805210017005467569L ^ j2) /* invoke-custom */] = kb.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15652, 1920988750108668081L ^ j2) /* invoke-custom */] = kl.x;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11567, 4963216612947402989L ^ j2) /* invoke-custom */] = un.d;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27095, 3809267860358554816L ^ j2) /* invoke-custom */] = qo.e;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23096, 2537961989254961076L ^ j2) /* invoke-custom */] = q6.J;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21574, 5401177235134372336L ^ j2) /* invoke-custom */] = eg.e;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12896, 587059210969661336L ^ j2) /* invoke-custom */] = _k.h;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10649, 4440502900724737056L ^ j2) /* invoke-custom */] = en.b;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27117, 6252434930666824739L ^ j2) /* invoke-custom */] = kq.T;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25594, 8153910645112335937L ^ j2) /* invoke-custom */] = k5.A;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28760, 5950460362197958061L ^ j2) /* invoke-custom */] = kc.t;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7434, 5713664080779284690L ^ j2) /* invoke-custom */] = qn.T;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24022, 3727120764160299097L ^ j2) /* invoke-custom */] = kp.G;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31855, 8776765217275376031L ^ j2) /* invoke-custom */] = et.P;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16914, 3798992409787453429L ^ j2) /* invoke-custom */] = q0.d;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5815, 603321028830075820L ^ j2) /* invoke-custom */] = e0.Y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17228, 7176386107749912269L ^ j2) /* invoke-custom */] = _x.I;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12070, 6594716706932171517L ^ j2) /* invoke-custom */] = qg.f;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8665, 2964603703947799677L ^ j2) /* invoke-custom */] = kd.V;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25031, 7117625210335030369L ^ j2) /* invoke-custom */] = __.i;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29715, 7816658301283793285L ^ j2) /* invoke-custom */] = k_.C;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23285, 5500916276780193547L ^ j2) /* invoke-custom */] = fq.x;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27046, 7624145835520189623L ^ j2) /* invoke-custom */] = _0.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11334, 6721415994224648631L ^ j2) /* invoke-custom */] = _5.t;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30416, 6805045566759009086L ^ j2) /* invoke-custom */] = _n.e;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20236, 8883988269374390932L ^ j2) /* invoke-custom */] = _a.n;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24360, 5491302337066947111L ^ j2) /* invoke-custom */] = _1.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7250, 6596169096916472295L ^ j2) /* invoke-custom */] = _6.d;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28415, 2455788017486881565L ^ j2) /* invoke-custom */] = uo.i;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18475, 3795167001037292931L ^ j2) /* invoke-custom */] = _z.A;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21991, 1429415004102678602L ^ j2) /* invoke-custom */] = uq.h;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19342, 2949426067627001422L ^ j2) /* invoke-custom */] = ut.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1915, 4778800111272102543L ^ j2) /* invoke-custom */] = u8.d;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14490, 391623717371131161L ^ j2) /* invoke-custom */] = ub.A;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25893, 2642667456648800299L ^ j2) /* invoke-custom */] = us.z;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26560, 72307834071345784L ^ j2) /* invoke-custom */] = k4.A;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26190, 7988871548291574716L ^ j2) /* invoke-custom */] = u7.G;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25972, 3822817391018404090L ^ j2) /* invoke-custom */] = ug.X;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18233, 1051221253213473330L ^ j2) /* invoke-custom */] = u3.N;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13200, 8071863896613469756L ^ j2) /* invoke-custom */] = ud.f;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9502, 1363998824589076705L ^ j2) /* invoke-custom */] = u4.S;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15979, 5953073939272708977L ^ j2) /* invoke-custom */] = u5.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1501, 2510593365848295538L ^ j2) /* invoke-custom */] = uu.J;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25812, 2524796518039087370L ^ j2) /* invoke-custom */] = uk.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14897, 4197348153814202325L ^ j2) /* invoke-custom */] = um.E;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16193, 2546276008017769097L ^ j2) /* invoke-custom */] = ux.X;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20130, 8405279941878793075L ^ j2) /* invoke-custom */] = kw.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18095, 7162892682067790668L ^ j2) /* invoke-custom */] = _m.y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30570, 423981234993724119L ^ j2) /* invoke-custom */] = _u.n;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21285, 2404343166438923808L ^ j2) /* invoke-custom */] = q2.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5206, 2388389248374839691L ^ j2) /* invoke-custom */] = u2.u;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3344, 8791066494574657551L ^ j2) /* invoke-custom */] = _i.m;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17502, 2647964790929246629L ^ j2) /* invoke-custom */] = uv.K;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23633, 3662179411074470301L ^ j2) /* invoke-custom */] = qq.V;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14996, 5477467993836599202L ^ j2) /* invoke-custom */] = qw.x;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(492, 6967927259733724202L ^ j2) /* invoke-custom */] = eo.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30457, 8454929195293571932L ^ j2) /* invoke-custom */] = ur.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10949, 5878457874240382767L ^ j2) /* invoke-custom */] = ke.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2286, 2227013334312781159L ^ j2) /* invoke-custom */] = _e.m;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12481, 3632099257148030278L ^ j2) /* invoke-custom */] = qp.S;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10978, 4349327352872806261L ^ j2) /* invoke-custom */] = q8.K;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23177, 3276946318008243980L ^ j2) /* invoke-custom */] = qj.E;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6789, 5690520781956290342L ^ j2) /* invoke-custom */] = qb.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1029, 908880911312914916L ^ j2) /* invoke-custom */] = _9.i;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14982, 2418473373261117209L ^ j2) /* invoke-custom */] = ql.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29363, 4663857503010881320L ^ j2) /* invoke-custom */] = q7.T;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2419, 3000179763236897925L ^ j2) /* invoke-custom */] = qc.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30347, 7462976335391193856L ^ j2) /* invoke-custom */] = q4.c;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25089, 7599490504211164936L ^ j2) /* invoke-custom */] = qe.K;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13540, 5193217125438896608L ^ j2) /* invoke-custom */] = q5.E;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21261, 4541209923575111370L ^ j2) /* invoke-custom */] = u0.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16224, 3115507762428129918L ^ j2) /* invoke-custom */] = qy.E;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20999, 2246476541148848044L ^ j2) /* invoke-custom */] = qu.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4132, 1762041408293346781L ^ j2) /* invoke-custom */] = qi.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26115, 7662522135356861198L ^ j2) /* invoke-custom */] = qk.i;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13714, 2805423376220600450L ^ j2) /* invoke-custom */] = q9.w;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14253, 5033784949998959147L ^ j2) /* invoke-custom */] = ew.O;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6653, 4402742530810287358L ^ j2) /* invoke-custom */] = _c.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27453, 2494816396563998356L ^ j2) /* invoke-custom */] = _4.l;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3606, 7008985235228918531L ^ j2) /* invoke-custom */] = es.y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10910, 7670790683101341505L ^ j2) /* invoke-custom */] = q1.W;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25464, 7464548320329494201L ^ j2) /* invoke-custom */] = qv.x;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32721, 7559817915774071388L ^ j2) /* invoke-custom */] = qz.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4906, 6436933114390028024L ^ j2) /* invoke-custom */] = eq.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13099, 2695058741167439421L ^ j2) /* invoke-custom */] = ej.J;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17489, 3284279481298897335L ^ j2) /* invoke-custom */] = ep.B;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13661, 811911768723208396L ^ j2) /* invoke-custom */] = qd.d;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32647, 358967261160239764L ^ j2) /* invoke-custom */] = eb.t;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22470, 2296497905684470338L ^ j2) /* invoke-custom */] = eh.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8559, 4175056458769018101L ^ j2) /* invoke-custom */] = e7.U;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21364, 4377536321339874973L ^ j2) /* invoke-custom */] = e3.j;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25494, 9191599590123597345L ^ j2) /* invoke-custom */] = ec.l;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16550, 2264226012587576750L ^ j2) /* invoke-custom */] = ee.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12249, 6192484137522373156L ^ j2) /* invoke-custom */] = e5.X;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3410, 1430392405264564472L ^ j2) /* invoke-custom */] = ey.e;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23290, 3709635004206896951L ^ j2) /* invoke-custom */] = eu.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8138, 2159450235668501184L ^ j2) /* invoke-custom */] = ek.y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26684, 4374683214592402896L ^ j2) /* invoke-custom */] = e9.k;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20086, 2224306128934224842L ^ j2) /* invoke-custom */] = em.U;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11826, 3053706518483936141L ^ j2) /* invoke-custom */] = ex.c;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9705, 3211483989652187219L ^ j2) /* invoke-custom */] = ef.V;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20283, 1709968196257268373L ^ j2) /* invoke-custom */] = e2.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21606, 2070851499361098162L ^ j2) /* invoke-custom */] = ea.D;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30247, 6830142513627265957L ^ j2) /* invoke-custom */] = e6.f;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2854, 513749638326617617L ^ j2) /* invoke-custom */] = ev.N;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24769, 3950866861141388658L ^ j2) /* invoke-custom */] = ez.W;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24381, 8518783971234140903L ^ j2) /* invoke-custom */] = uc.Y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19196, 1903403402159277896L ^ j2) /* invoke-custom */] = k8.Y;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23998, 556902664206569553L ^ j2) /* invoke-custom */] = k7.K;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23092, 1879137462787856351L ^ j2) /* invoke-custom */] = kg.W;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12768, 5859780056583912544L ^ j2) /* invoke-custom */] = k3.P;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28863, 3409907549755407654L ^ j2) /* invoke-custom */] = ki.I;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31944, 4958454003496120796L ^ j2) /* invoke-custom */] = kk.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17804, 3941818149893818440L ^ j2) /* invoke-custom */] = k9.K;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21364, 7253488978794110695L ^ j2) /* invoke-custom */] = km.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14915, 6527458516097218369L ^ j2) /* invoke-custom */] = _f.U;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24123, 1274843328800510931L ^ j2) /* invoke-custom */] = qs.c;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28888, 6258143707847917017L ^ j2) /* invoke-custom */] = kx.E;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19098, 3242682266938492799L ^ j2) /* invoke-custom */] = k0.T;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20699, 5506605986706087184L ^ j2) /* invoke-custom */] = up.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25375, 4292160308947283475L ^ j2) /* invoke-custom */] = kn.n;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11358, 6863275401086378391L ^ j2) /* invoke-custom */] = kf.G;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(918, 5134584934363205185L ^ j2) /* invoke-custom */] = u_.c;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4008, 7235112346018382362L ^ j2) /* invoke-custom */] = ks.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28109, 6147742242689081547L ^ j2) /* invoke-custom */] = e4.j;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14720, 546243944204153935L ^ j2) /* invoke-custom */] = q_.V;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31819, 381886342805221827L ^ j2) /* invoke-custom */] = ed.h;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15988, 733710189385429994L ^ j2) /* invoke-custom */] = el.C;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14568, 4954191452974790012L ^ j2) /* invoke-custom */] = ko.u;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3665, 7913827366391645153L ^ j2) /* invoke-custom */] = ka.F;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24856, 6510280840423042232L ^ j2) /* invoke-custom */] = k1.B;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5225, 46765329450408378L ^ j2) /* invoke-custom */] = k6.b;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9385, 3235673158782200241L ^ j2) /* invoke-custom */] = kv.K;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7380, 2767725979791626694L ^ j2) /* invoke-custom */] = ei.g;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22804, 7883759299686487219L ^ j2) /* invoke-custom */] = qx.o;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9328, 7874178220850293149L ^ j2) /* invoke-custom */] = ua.c;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23275, 5821192244069914614L ^ j2) /* invoke-custom */] = ui.a;
        _gVarArr[(int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28469, 6645532483360547535L ^ j2) /* invoke-custom */] = qh.t;
        return arrayList.addAll(CollectionsKt.listOf((Object[]) _gVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [su.catlean.sd] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [su.catlean.sh] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    public final void E(long j) throws Exception {
        ?? r0;
        ?? r02;
        long j2 = b ^ j;
        long j3 = j2 ^ 76424610161937L;
        long j4 = j2 ^ 2538959604984L;
        Iterator it = e.iterator();
        do {
            Iterator it2 = it;
            while (it2.hasNext()) {
                _g _gVar = (_g) it.next();
                List<a1> listC = _gVar.c();
                if (j2 <= 0) {
                    return;
                }
                for (a1 a1Var : listC) {
                    it2 = yl.g.l().i(j4).f().iterator();
                    if (j2 >= 0) {
                        while (true) {
                            if (!it2.hasNext()) {
                                r0 = 0;
                                break;
                            }
                            Object next = it2.next();
                            Object obj = next;
                            while (Intrinsics.areEqual(((sd) obj).y(), _gVar.U())) {
                                obj = next;
                                r0 = obj;
                                if (j2 < 0) {
                                }
                            }
                        }
                        try {
                            r0 = (sd) r0;
                            if (r0 != 0) {
                                Iterator it3 = r0.p().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        r02 = 0;
                                        break;
                                    }
                                    Object next2 = it3.next();
                                    Object obj2 = next2;
                                    while (Intrinsics.areEqual(((sh) obj2).d(), a1Var.e())) {
                                        obj2 = next2;
                                        r02 = obj2;
                                        if (j2 < 0) {
                                        }
                                    }
                                }
                                try {
                                    r02 = (sh) r02;
                                    if (r02 != 0) {
                                        try {
                                            a1Var.P(r02.G(), j3);
                                        } catch (Exception e2) {
                                            a1Var.A();
                                            zf.x().warn((String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25904, 2129911411843400450L ^ j2) /* invoke-custom */ + a1Var.Q() + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21565, 8625286451290583561L ^ j2) /* invoke-custom */ + _gVar.k() + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30845, 419131892856593998L ^ j2) /* invoke-custom */ + e2.getMessage());
                                        }
                                    }
                                } catch (Exception unused) {
                                    throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 2165289268512858195L, j2) /* invoke-custom */;
                                }
                            }
                            if (j2 <= 0) {
                                break;
                            }
                        } catch (Exception unused2) {
                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2165289268512858195L, j2) /* invoke-custom */;
                        }
                    }
                }
            }
            return;
        } while (j2 >= 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[PHI: r0
  0x0088: PHI (r0v24 java.util.List) = (r0v23 java.util.List), (r0v81 java.util.List) binds: [B:12:0x007d, B:14:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[PHI: r0
  0x00de: PHI (r0v34 su.catlean.sd) = (r0v33 su.catlean.sd), (r0v69 su.catlean.sd) binds: [B:26:0x00d6, B:28:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1 A[PHI: r0
  0x00f1: PHI (r0v37 java.util.List) = (r0v36 java.util.List), (r0v68 java.util.List) binds: [B:30:0x00e6, B:32:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150 A[PHI: r0
  0x0150: PHI (r0v47 su.catlean.sh) = (r0v46 su.catlean.sh), (r0v56 su.catlean.sh) binds: [B:44:0x0148, B:46:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    /* JADX WARN: Type inference failed for: r36v0, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(char r8, int r9, char r10, @org.jetbrains.annotations.Nullable su.catlean.y_ r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iq.n(char, int, char, su.catlean.y_):void");
    }

    public static void M(short s, int i2, char c2, iq iqVar, y_ y_Var, int i3, Object obj) throws Exception {
        long j = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ b;
        long j2 = j ^ 64630222683866L;
        int i4 = (int) (j >>> 48);
        int i5 = (int) ((j2 << 16) >>> 32);
        int i6 = (int) ((j2 << 48) >>> 48);
        if ((i3 & 1) != 0) {
            y_Var = null;
        }
        iqVar.n((char) i4, i5, (char) i6, y_Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151 A[EDGE_INSN: B:62:0x0151->B:43:0x0151 BREAK  A[LOOP:3: B:35:0x011d->B:63:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[LOOP:3: B:35:0x011d->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v56, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x014e -> B:38:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0158 -> B:32:0x00fb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(@org.jetbrains.annotations.NotNull java.lang.String r8, long r9, @org.jetbrains.annotations.NotNull java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iq.D(java.lang.String, long, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    @Nullable
    public final _g R(long j, @NotNull String str) throws Exception {
        ?? r0;
        long j2 = b ^ j;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7202434909455702927L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11468, 6889139233105065846L ^ j2) /* invoke-custom */);
        Iterator it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                r0 = 0;
                break;
            }
            Object next = it.next();
            while (true) {
                ?? r15 = next;
                next = r15 == true ? 1 : 0;
                while (Intrinsics.areEqual(((_g) next).U(), str)) {
                    next = r15 == true ? 1 : 0;
                    if (j2 > 0) {
                        r0 = next;
                        if (iArr != null) {
                        }
                    }
                }
            }
        }
        try {
            r0 = (_g) r0;
            if (j2 >= 0) {
                if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7155631831900913116L, j2) /* invoke-custom */ != null) {
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[3], 7134721876286381917L, j2) /* invoke-custom */;
                }
            }
            return r0;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7171662739811458521L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030d A[Catch: NumberFormatException -> 0x0317, TRY_LEAVE, TryCatch #15 {NumberFormatException -> 0x0317, blocks: (B:135:0x02f1, B:140:0x030d, B:138:0x0303, B:139:0x030c, B:133:0x02e7, B:134:0x02f0, B:130:0x02da, B:125:0x02c1, B:128:0x02d0, B:129:0x02d9, B:120:0x02a9, B:123:0x02b7, B:124:0x02c0), top: B:163:0x02f1, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[Catch: NumberFormatException -> 0x0143, NumberFormatException -> 0x0156, TRY_ENTER, TryCatch #14 {NumberFormatException -> 0x0156, blocks: (B:58:0x0136, B:63:0x014d, B:61:0x0143, B:62:0x014c, B:56:0x012d), top: B:151:0x012d, outer: #3, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v115, types: [int] */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v125, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v134, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.api.event.events.client.InputEvent$Action] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [su.catlean.api.event.events.client.InputEvent$Device] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v86, types: [su.catlean.api.event.events.client.InputEvent$Action] */
    /* JADX WARN: Type inference failed for: r0v92, types: [su.catlean.api.event.events.client.InputEvent$Action] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.minecraft.class_437] */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(su.catlean.api.event.events.client.InputEvent r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iq.e(su.catlean.api.event.events.client.InputEvent):void");
    }

    static {
        int i2;
        long j = b ^ 125150597177549L;
        long j2 = j ^ 125385366798171L;
        long j3 = j ^ 121895766611402L;
        int i3 = (int) (j >>> 48);
        int i4 = (int) ((j3 << 16) >>> 32);
        int i5 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 5003076734529L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -7227186933685214324L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i7 = 0;
        String str = "c\u0087¬d_Ê©3)qSØ\u009c£,ï8ü §\u0090ÊY\u009f\u0090G\u009bºÓ\u0002\bP}\u0090*5¬\u009b\u0088´½ÌK°ÛfÁk?\u000b`\u0013K]È\u0017-åð(\u008dÿ\u001b*(\u0017k\u009d|(;òM\u0018\u0094Ògµ`\r×\u0005TL0±\u0001@M\u0005\u0087/CÄ\u0093çã\u0083\u0010ÎiøCÃµ\u0004\b yº¾\u0097\u0006\u0001Õ\u0010*\u001el\u0080\t7\u007fIþv ñQ(}¼\u0010.\u0088\u009f¥)gÕ\u001f\u001f\u0089.æ\n\u001bÀ\u0007";
        int length = "c\u0087¬d_Ê©3)qSØ\u009c£,ï8ü §\u0090ÊY\u009f\u0090G\u009bºÓ\u0002\bP}\u0090*5¬\u009b\u0088´½ÌK°ÛfÁk?\u000b`\u0013K]È\u0017-åð(\u008dÿ\u001b*(\u0017k\u009d|(;òM\u0018\u0094Ògµ`\r×\u0005TL0±\u0001@M\u0005\u0087/CÄ\u0093çã\u0083\u0010ÎiøCÃµ\u0004\b yº¾\u0097\u0006\u0001Õ\u0010*\u001el\u0080\t7\u007fIþv ñQ(}¼\u0010.\u0088\u009f¥)gÕ\u001f\u001f\u0089.æ\n\u001bÀ\u0007".length();
        char cCharAt = 16;
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            d = new String[8];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[Typography.cent];
                            int i13 = 0;
                            String str3 = "Ð_æ,\u0097Áæ~¥Ïrc\u0014ñðÈÓb\u0001g®!Q¡\u008f\u007f\u0099\u0004\tR\u001f3\r¢¿gÈ¼Êõ%$ý{§6¸3e\u0086\u000bôKm\u0094ý¤9Q\"¹GYTàã\u0098¡ÎÎ¶ýâS\rô>öXûâ#\u0086\u001e\u0083t\u0000?a\u001cÃÓÄ\u009fç'ÿ\u0012\u0019;\u001aÕæº\u0092ÍÅýL\u008aªv\u00ad7Z\f\u0003¨·\u0087f;\\B\u008e¹E\u0003æ|\u0094\u000f#\u0007h@®àº_=@aÏñvè\u0017oÝê\u0099\u0010ÕjQ\"j\u0093\u0014\u0001?¡\f¨3é¯Ãxe;Úç\u0086Û\u008c\u009c\u007f\u0016]£\u0096\\xìÀ\\ÈÙ\u0088\u0004\u001eo\u0082i¢ÙÌ§h,\u009f\u0011g\bG¶Î£üº\u001c¦!à\u001e&bÇ\"yø°üGµáu\u0091\u0002üñÇu\u0000BÝ¢\u008c\u001dJ\u0003lýc\u00013ïr\fT\"S\u001f$Eã\u0080a§i\n\u0095\u008d\bÇK\u0004\"õ;}Pg\\<7Ä\u001c»ÎsUhÑ\u0080T2\u0001\u0007:0$¬.¼s\u0012\u000b+\u008eo^¦d\u001e½\u001aÏq\u0093\u0007tüþ<ä\u0080\u000b\u0087÷Aõ±\u0093qü/\r\f°\u008fún'½\u0011¨»\u009cÓe\u009d²oE%\u001b\u0011ò\u0098\u0099\u0083\u008cE&\rS\u0082ü÷jw\u00120KÓÓKÆ7|©Ï«÷ê\u008a\u000fyí\u0013§\u0010Ì¨8Q'\u001aH¶\u0086\u0018\th\b`%G\u001aÂg.³\\Ä¨\u001c\u0086Bóý|5Z4ëR\u008cá/¦L\u0003\u00840ñTX\u0092áñ×\u0002q\u0097\u008bÂ1µÿU¸«N\u0003.¤e\u0011~ù\u0084W-Gç\u0016@\u008d5\u0000i2Áw¹Ö;û¾Úÿ\u0015¥ô\u001eØë·\u009fK#FÆ\u0016\tÓþ\u00ad5íÀu\u0002,>ð\u007fP\u0007uW=ðª×\u0089êâ\u0019ñ\u008f±\båÔ\u001dW0ñ\u0095ªpÐ\n¯ôçëi!º/[²ä\bkïóàô\u00adl:í5l·%;,\u0000¥\u0081\u009a\u0089í\u0000{%øI{UÅÈ\u001b\u009a\u009c^N²\u008aÅó\u009d8TN¹°[öÀ\u0089lcåDàa\u0096\\X48\u0013\u000fô\u0096\u008e`\u0080\u007f\u0005Üsi{¸\u0014÷pÓ\u008bë\u008b\"4\u0018oÿDwÖ \u0013óÁ\u0000sõ\u0091X+\u0094Ø\u0017ËS§]¶à\u0083GN\bìï\u008f\u0005â`Xú\u0007\u0081¿i\u0004\\¤®Ìèg×0E\u001c£ï\nø3AY÷×ïË\n}\u0090\u0091¤\u0007\u0000äõ[d\f°±¹Y\u0015§Áó\u009fØeÎþþo¿^\u000bö#@ãÂ\u0094Ô\u0083\u0005ÀPÅÉ\u0092ü7é\u0002 T½ky\u0090\u0096f\u000eÂf@\u0081\u000b«!¹î¡ïY\u0018\u0089,o\f\u0090è´\\\u000b®Æ\u0007P`\u0094ÈÚÞ\u0001¥\u0085}\u001f,<\u0095áæ\u0085y\u001a¢\t\u000e2<Ä*îÏ\u0099H¿´µÓ,µ'\u0095\u0086â¯å\u0012\u0093±ª\n\u0095\u001e\u0092ÁëÐÑE\\u¾Z\u001e\u008a\u001a-\b:\u0082¨\u0012\u0011)Î£\u0011\u0096/¼Æ\u00814\u0011\tkGd¡\nGÎäñ\u0097\u008c\u0096nw òi\u0089'SÁç\u0004\u000fbË¤ú\u008dõ\u0013Z¶³:M^h\u000f\u000bçrâp9yîá\u0091îÍé\u009d\u0096®cec\u0083sL\u008cÞ\u000b0$Ç\u008d{ü&Cµ,?ëù\u0084Ç\u008f\u0006èdÈï=\u009eíÔ¤X'©m)Ê?D3ðe\u00ad{\u0096+þl\u008biÊÎ¨Ê\\\u0003òo¡¿){\u008a\u0014<\u0095øöOå'ë;\u0083gÇxRØT6¹\u001a%\u00adJ\u000f\u0095cyÑ^\u0011(\u000b¬,\u00832\u0098A£RR\u0086¤Ú\u001f$\u008eeâOnCc_¦Ô\u0083Ô³ª\u008cU\u0097éQè¯e\u0082ç\u0091\u0080[OÎ²æÏ\u0092Ñ/Û}2Dë±t5è\u009b6\u000fò$\bKSµ£R¾vTüî¥Ð}Ñ\u008bRDAø\u0005ð\u00adê\u0094àøÁÆ\u008eÅE\u000e©É\u0001à\u000f(\u0003¥9ÓÒ\nË/\u0084F\u0085\u0085\u0085*\u0015GJ\u001c\u0000yÙý\u008ap(Qè·\u0087ô]÷}W\u00961 )\u0003YlË\u001aÜ\u0088;¶è×\u000f\u0099Ð\u001cjC\u0085úäÞÁùôÉc\u000e\u000e#ÙL\u000b\u000báÀ\u007fWÓ*\t:`J\t!Ùø\u008añ«\u0083ôR\u000b°Ð³|\u0016\u0097\u0085\u0016ÝÆæ3åY\u0087X\u009bXÃó§\u009blªÀzÝÙ~~Ö\u0083¼Û'#òÀ4\u0016¡fj\u0010Ù6¡O5'É\u009eÀÙy³'\u0084Â[¡k\u0086ê\u00adÃh\u0095\u000e¡Ý¤¤)139BØD²Á±";
                            int length2 = "Ð_æ,\u0097Áæ~¥Ïrc\u0014ñðÈÓb\u0001g®!Q¡\u008f\u007f\u0099\u0004\tR\u001f3\r¢¿gÈ¼Êõ%$ý{§6¸3e\u0086\u000bôKm\u0094ý¤9Q\"¹GYTàã\u0098¡ÎÎ¶ýâS\rô>öXûâ#\u0086\u001e\u0083t\u0000?a\u001cÃÓÄ\u009fç'ÿ\u0012\u0019;\u001aÕæº\u0092ÍÅýL\u008aªv\u00ad7Z\f\u0003¨·\u0087f;\\B\u008e¹E\u0003æ|\u0094\u000f#\u0007h@®àº_=@aÏñvè\u0017oÝê\u0099\u0010ÕjQ\"j\u0093\u0014\u0001?¡\f¨3é¯Ãxe;Úç\u0086Û\u008c\u009c\u007f\u0016]£\u0096\\xìÀ\\ÈÙ\u0088\u0004\u001eo\u0082i¢ÙÌ§h,\u009f\u0011g\bG¶Î£üº\u001c¦!à\u001e&bÇ\"yø°üGµáu\u0091\u0002üñÇu\u0000BÝ¢\u008c\u001dJ\u0003lýc\u00013ïr\fT\"S\u001f$Eã\u0080a§i\n\u0095\u008d\bÇK\u0004\"õ;}Pg\\<7Ä\u001c»ÎsUhÑ\u0080T2\u0001\u0007:0$¬.¼s\u0012\u000b+\u008eo^¦d\u001e½\u001aÏq\u0093\u0007tüþ<ä\u0080\u000b\u0087÷Aõ±\u0093qü/\r\f°\u008fún'½\u0011¨»\u009cÓe\u009d²oE%\u001b\u0011ò\u0098\u0099\u0083\u008cE&\rS\u0082ü÷jw\u00120KÓÓKÆ7|©Ï«÷ê\u008a\u000fyí\u0013§\u0010Ì¨8Q'\u001aH¶\u0086\u0018\th\b`%G\u001aÂg.³\\Ä¨\u001c\u0086Bóý|5Z4ëR\u008cá/¦L\u0003\u00840ñTX\u0092áñ×\u0002q\u0097\u008bÂ1µÿU¸«N\u0003.¤e\u0011~ù\u0084W-Gç\u0016@\u008d5\u0000i2Áw¹Ö;û¾Úÿ\u0015¥ô\u001eØë·\u009fK#FÆ\u0016\tÓþ\u00ad5íÀu\u0002,>ð\u007fP\u0007uW=ðª×\u0089êâ\u0019ñ\u008f±\båÔ\u001dW0ñ\u0095ªpÐ\n¯ôçëi!º/[²ä\bkïóàô\u00adl:í5l·%;,\u0000¥\u0081\u009a\u0089í\u0000{%øI{UÅÈ\u001b\u009a\u009c^N²\u008aÅó\u009d8TN¹°[öÀ\u0089lcåDàa\u0096\\X48\u0013\u000fô\u0096\u008e`\u0080\u007f\u0005Üsi{¸\u0014÷pÓ\u008bë\u008b\"4\u0018oÿDwÖ \u0013óÁ\u0000sõ\u0091X+\u0094Ø\u0017ËS§]¶à\u0083GN\bìï\u008f\u0005â`Xú\u0007\u0081¿i\u0004\\¤®Ìèg×0E\u001c£ï\nø3AY÷×ïË\n}\u0090\u0091¤\u0007\u0000äõ[d\f°±¹Y\u0015§Áó\u009fØeÎþþo¿^\u000bö#@ãÂ\u0094Ô\u0083\u0005ÀPÅÉ\u0092ü7é\u0002 T½ky\u0090\u0096f\u000eÂf@\u0081\u000b«!¹î¡ïY\u0018\u0089,o\f\u0090è´\\\u000b®Æ\u0007P`\u0094ÈÚÞ\u0001¥\u0085}\u001f,<\u0095áæ\u0085y\u001a¢\t\u000e2<Ä*îÏ\u0099H¿´µÓ,µ'\u0095\u0086â¯å\u0012\u0093±ª\n\u0095\u001e\u0092ÁëÐÑE\\u¾Z\u001e\u008a\u001a-\b:\u0082¨\u0012\u0011)Î£\u0011\u0096/¼Æ\u00814\u0011\tkGd¡\nGÎäñ\u0097\u008c\u0096nw òi\u0089'SÁç\u0004\u000fbË¤ú\u008dõ\u0013Z¶³:M^h\u000f\u000bçrâp9yîá\u0091îÍé\u009d\u0096®cec\u0083sL\u008cÞ\u000b0$Ç\u008d{ü&Cµ,?ëù\u0084Ç\u008f\u0006èdÈï=\u009eíÔ¤X'©m)Ê?D3ðe\u00ad{\u0096+þl\u008biÊÎ¨Ê\\\u0003òo¡¿){\u008a\u0014<\u0095øöOå'ë;\u0083gÇxRØT6¹\u001a%\u00adJ\u000f\u0095cyÑ^\u0011(\u000b¬,\u00832\u0098A£RR\u0086¤Ú\u001f$\u008eeâOnCc_¦Ô\u0083Ô³ª\u008cU\u0097éQè¯e\u0082ç\u0091\u0080[OÎ²æÏ\u0092Ñ/Û}2Dë±t5è\u009b6\u000fò$\bKSµ£R¾vTüî¥Ð}Ñ\u008bRDAø\u0005ð\u00adê\u0094àøÁÆ\u008eÅE\u000e©É\u0001à\u000f(\u0003¥9ÓÒ\nË/\u0084F\u0085\u0085\u0085*\u0015GJ\u001c\u0000yÙý\u008ap(Qè·\u0087ô]÷}W\u00961 )\u0003YlË\u001aÜ\u0088;¶è×\u000f\u0099Ð\u001cjC\u0085úäÞÁùôÉc\u000e\u000e#ÙL\u000b\u000báÀ\u007fWÓ*\t:`J\t!Ùø\u008añ«\u0083ôR\u000b°Ð³|\u0016\u0097\u0085\u0016ÝÆæ3åY\u0087X\u009bXÃó§\u009blªÀzÝÙ~~Ö\u0083¼Û'#òÀ4\u0016¡fj\u0010Ù6¡O5'É\u009eÀÙy³'\u0084Â[¡k\u0086ê\u00adÃh\u0095\u000e¡Ý¤¤)139BØD²Á±".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j5 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j6 = j5;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j6 >>> 56), (byte) (j6 >>> 48), (byte) (j6 >>> 40), (byte) (j6 >>> 32), (byte) (j6 >>> 24), (byte) (j6 >>> 16), (byte) (j6 >>> 8), (byte) j6});
                                    long j7 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j7;
                                            if (i14 >= length2) {
                                                g = jArr;
                                                h = new Integer[Typography.cent];
                                                a = new iq();
                                                k = CollectionsKt.arrayListOf(nt.m(), nt.J(), nt.d(), nt.h());
                                                e = new ArrayList();
                                                K = new ArrayList();
                                                a.A(j4);
                                                a.E(j2);
                                                M((short) i3, i4, (char) i5, a, null, 1, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i14 >= length2) {
                                                str3 = "É.zXÛ\u0010\u008d\u0017|FX\u009b×\u0000:ñ";
                                                length2 = "É.zXÛ\u0010\u008d\u0017|FX\u009b×\u0000:ñ".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j5 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "\u0000Æ\bOÆeòh=t\u008c©ábt°\u0010\u008eÕJºrÎ\u001f×â¤T^ð;\u0001\u008a";
                        length = "\u0000Æ\bOÆeòh=t\u008c©ábt°\u0010\u008eÕJºrÎ\u001f×â¤T^ð;\u0001\u008a".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i9 = i2 + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
        }
    }

    public static void X(int i2) {
        L = i2;
    }

    public static int U() {
        return L;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int X() {
        return U() == 0 ? 47 : 0;
    }

    private static Exception a(Exception exc) {
        return exc;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 31141;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = a(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/iq", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/iq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iq.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 25371;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/iq", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
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
            java.lang.String r1 = "su/catlean/iq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iq.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
