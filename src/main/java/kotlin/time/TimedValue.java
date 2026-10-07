package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimedValue.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public final class TimedValue<T> {
    private final T value;
    private final long duration;

    public final T component1() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m1776component2UwyO8pc() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m1777copyRFiDyg4(T value, long duration) {
        return new TimedValue<>(value, duration, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m1778copyRFiDyg4$default(TimedValue timedValue, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i & 2) != 0) {
            j = timedValue.duration;
        }
        return timedValue.m1777copyRFiDyg4(obj, j);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m1667toStringimpl(this.duration)) + ')';
    }

    public int hashCode() {
        int result = this.value == null ? 0 : this.value.hashCode();
        return (result * 31) + Duration.m1672hashCodeimpl(this.duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m1677equalsimpl0(this.duration, timedValue.duration);
    }

    public /* synthetic */ TimedValue(Object value, long duration, DefaultConstructorMarker $constructor_marker) {
        this(value, duration);
    }

    private TimedValue(T value, long duration) {
        this.value = value;
        this.duration = duration;
    }

    public final T getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m1775getDurationUwyO8pc() {
        return this.duration;
    }
}
