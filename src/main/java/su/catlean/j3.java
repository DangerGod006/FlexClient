package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/j3.class */
public final class j3 {
    private static final long a = yz.a(5311751763558104881L, 2191921631743439405L, MethodHandles.lookup().lookupClass()).a(22637797381130L);

    @NotNull
    public static final j3 o = new j3();

    private j3() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float m(float r8, int r9, float r10, int r11, int r12, float r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j3.m(float, int, float, int, int, float):float");
    }

    public final double X(@NotNull Number a2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        return Math.sqrt(1.0d - ((a2.doubleValue() - 1.0d) * (a2.doubleValue() - 1.0d)));
    }

    public final double N(@NotNull Number x) {
        Intrinsics.checkNotNullParameter(x, "x");
        return 1.0d - ((0.5d * Math.sin((3.141592653589793d * x.doubleValue()) + 1.5707963267948966d)) + 0.5d);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
