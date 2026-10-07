package kotlin.math;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/math/Constants.class */
final class Constants {

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @JvmField
    public static final double LN2 = Math.log(2.0d);

    @JvmField
    public static final double epsilon = Math.ulp(1.0d);

    @JvmField
    public static final double taylor_2_bound = Math.sqrt(epsilon);

    @JvmField
    public static final double taylor_n_bound = Math.sqrt(taylor_2_bound);

    @JvmField
    public static final double upper_taylor_2_bound = ((double) 1) / taylor_2_bound;

    @JvmField
    public static final double upper_taylor_n_bound = ((double) 1) / taylor_n_bound;

    private Constants() {
    }
}
