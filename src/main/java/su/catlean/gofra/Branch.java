package su.catlean.gofra;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Branch.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gofra/Branch.class */
public final class Branch {

    @NotNull
    private final Class<?> eventTarget;
    private final byte priority;

    @NotNull
    private Consumer<Object> consumer;
    private Method privateLookupInMethod;

    public Branch(@NotNull Class<?> klass, @NotNull Object obj, @NotNull Method method) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(method, "method");
        Class<?> type = method.getParameters()[0].getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.eventTarget = type;
        this.priority = ((Flow) method.getAnnotation(Flow.class)).priority();
        this.privateLookupInMethod = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, MethodHandles.Lookup.class);
        Object objInvoke = this.privateLookupInMethod.invoke(null, klass, MethodHandles.lookup());
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.invoke.MethodHandles.Lookup");
        MethodHandles.Lookup l = (MethodHandles.Lookup) objInvoke;
        MethodType mT = MethodType.methodType((Class<?>) Void.TYPE, method.getParameters()[0].getType());
        MethodHandle mH = l.findVirtual(klass, method.getName(), mT);
        MethodType iT = MethodType.methodType((Class<?>) Consumer.class, klass);
        this.consumer = (Consumer) LambdaMetafactory.metafactory(l, "accept", iT, MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) Object.class), mH, mT).getTarget().invoke(obj);
    }

    @NotNull
    public final Class<?> getEventTarget() {
        return this.eventTarget;
    }

    public final byte getPriority() {
        return this.priority;
    }

    public final void call(@NotNull Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.consumer.accept(event);
    }
}
