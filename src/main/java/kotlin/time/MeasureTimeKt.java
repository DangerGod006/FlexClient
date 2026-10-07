package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/MeasureTimeKt.class */
public final class MeasureTimeKt {
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long measureTime(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TimeSource.Monotonic $this$measureTime$iv = TimeSource.Monotonic.INSTANCE;
        long mark$iv = $this$measureTime$iv.m1755markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m1757elapsedNowUwyO8pc(mark$iv);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long measureTime(@NotNull TimeSource $this$measureTime, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter($this$measureTime, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimeMark mark = $this$measureTime.markNow();
        block.invoke();
        return mark.mo1618elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long measureTime(@NotNull TimeSource.Monotonic $this$measureTime, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter($this$measureTime, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        long mark = $this$measureTime.m1755markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m1757elapsedNowUwyO8pc(mark);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TimeSource.Monotonic $this$measureTimedValue$iv = TimeSource.Monotonic.INSTANCE;
        long mark$iv = $this$measureTimedValue$iv.m1755markNowz9LOYto();
        Object result$iv = block.invoke();
        return new TimedValue<>(result$iv, TimeSource.Monotonic.ValueTimeMark.m1757elapsedNowUwyO8pc(mark$iv), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource $this$measureTimedValue, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter($this$measureTimedValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimeMark mark = $this$measureTimedValue.markNow();
        Object result = block.invoke();
        return new TimedValue<>(result, mark.mo1618elapsedNowUwyO8pc(), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource.Monotonic $this$measureTimedValue, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter($this$measureTimedValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        long mark = $this$measureTimedValue.m1755markNowz9LOYto();
        Object result = block.invoke();
        return new TimedValue<>(result, TimeSource.Monotonic.ValueTimeMark.m1757elapsedNowUwyO8pc(mark), null);
    }
}
