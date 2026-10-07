package kotlin.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/internal/PlatformImplementations.class */
public class PlatformImplementations {

    /* JADX INFO: compiled from: PlatformImplementations.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/internal/PlatformImplementations$ReflectThrowable.class */
    private static final class ReflectThrowable {

        @NotNull
        public static final ReflectThrowable INSTANCE = new ReflectThrowable();

        @JvmField
        @Nullable
        public static final Method addSuppressed;

        @JvmField
        @Nullable
        public static final Method getSuppressed;

        private ReflectThrowable() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
        static {
            /*
                kotlin.internal.PlatformImplementations$ReflectThrowable r0 = new kotlin.internal.PlatformImplementations$ReflectThrowable
                r1 = r0
                r1.<init>()
                kotlin.internal.PlatformImplementations.ReflectThrowable.INSTANCE = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                r4 = r0
                r0 = r4
                java.lang.reflect.Method[] r0 = r0.getMethods()
                r5 = r0
                r0 = r5
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r0 = r5
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = r6
                int r0 = r0.length
                r8 = r0
            L1f:
                r0 = r7
                r1 = r8
                if (r0 >= r1) goto L69
                r0 = r6
                r1 = r7
                r0 = r0[r1]
                r9 = r0
                r0 = r9
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = r10
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "addSuppressed"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L5a
                r0 = r10
                java.lang.Class[] r0 = r0.getParameterTypes()
                r1 = r0
                java.lang.String r2 = "getParameterTypes(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                java.lang.Object r0 = kotlin.collections.ArraysKt.singleOrNull(r0)
                r1 = r4
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L5a
                r0 = 1
                goto L5b
            L5a:
                r0 = 0
            L5b:
                if (r0 == 0) goto L63
                r0 = r9
                goto L6a
            L63:
                int r7 = r7 + 1
                goto L1f
            L69:
                r0 = 0
            L6a:
                kotlin.internal.PlatformImplementations.ReflectThrowable.addSuppressed = r0
                r0 = r5
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = r6
                int r0 = r0.length
                r8 = r0
            L75:
                r0 = r7
                r1 = r8
                if (r0 >= r1) goto L9f
                r0 = r6
                r1 = r7
                r0 = r0[r1]
                r9 = r0
                r0 = r9
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = r10
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "getSuppressed"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L99
                r0 = r9
                goto La0
            L99:
                int r7 = r7 + 1
                goto L75
            L9f:
                r0 = 0
            La0:
                kotlin.internal.PlatformImplementations.ReflectThrowable.getSuppressed = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.ReflectThrowable.m1421clinit():void");
        }
    }

    public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = ReflectThrowable.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @NotNull
    public List<Throwable> getSuppressed(@NotNull Throwable exception) {
        Object it;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = ReflectThrowable.getSuppressed;
        if (method != null && (it = method.invoke(exception, new Object[0])) != null) {
            List<Throwable> listAsList = ArraysKt.asList((Throwable[]) it);
            if (listAsList != null) {
                return listAsList;
            }
        }
        return CollectionsKt.emptyList();
    }

    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    @ExperimentalTime
    @NotNull
    public Clock getSystemClock() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
