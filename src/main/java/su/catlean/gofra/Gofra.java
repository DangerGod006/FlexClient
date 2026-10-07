package su.catlean.gofra;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Gofra.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gofra/Gofra.class */
public final class Gofra {

    @NotNull
    public static final Gofra INSTANCE = new Gofra();

    @NotNull
    private static final ConcurrentHashMap<Object, List<Branch>> cachedBranches = new ConcurrentHashMap<>();

    @NotNull
    private static final ConcurrentHashMap<Object, List<Branch>> branches = new ConcurrentHashMap<>();

    private Gofra() {
    }

    @Nullable
    public final Unit drain(@NotNull Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterable iterable = (List) branches.get(event.getClass());
        if (iterable == null) {
            return null;
        }
        Iterable $this$forEach$iv = iterable;
        for (Object element$iv : $this$forEach$iv) {
            Branch m = (Branch) element$iv;
            m.call(event);
        }
        return Unit.INSTANCE;
    }

    public final void plugAll(@NotNull Object... listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        for (Object element$iv : listeners) {
            INSTANCE.plug(element$iv);
        }
    }

    public final void plug(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Iterable $this$forEach$iv = getBranches(obj);
        for (Object element$iv : $this$forEach$iv) {
            Branch it = (Branch) element$iv;
            Gofra gofra = INSTANCE;
            ConcurrentHashMap<Object, List<Branch>> concurrentHashMap = branches;
            Class<?> eventTarget = it.getEventTarget();
            Function1 function1 = Gofra::plug$lambda$5$lambda$3;
            List<Branch> listComputeIfAbsent = concurrentHashMap.computeIfAbsent(eventTarget, (v1) -> {
                return plug$lambda$5$lambda$4(r3, v1);
            });
            Intrinsics.checkNotNullExpressionValue(listComputeIfAbsent, "computeIfAbsent(...)");
            gofra.insert(listComputeIfAbsent, it);
        }
    }

    private static final List plug$lambda$5$lambda$3(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new CopyOnWriteArrayList();
    }

    private static final List plug$lambda$5$lambda$4(Function1 $tmp0, Object p0) {
        return (List) $tmp0.invoke(p0);
    }

    public final void unplug(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Iterable $this$forEach$iv = getBranches(obj);
        for (Object element$iv : $this$forEach$iv) {
            Branch it = (Branch) element$iv;
            List<Branch> list = branches.get(it.getEventTarget());
            if (list != null) {
                list.remove(it);
            }
        }
    }

    private final void insert(List<Branch> bl, Branch b) {
        int i;
        int index$iv = 0;
        Iterator<Branch> it = bl.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object item$iv = it.next();
            if (b.getPriority() > ((Branch) item$iv).getPriority()) {
                i = index$iv;
                break;
            }
            index$iv++;
        }
        int it2 = i;
        bl.add(it2 == -1 ? bl.size() : it2, b);
    }

    private final List<Branch> getBranches(Object obj) {
        ConcurrentHashMap<Object, List<Branch>> concurrentHashMap = cachedBranches;
        Function1 function1 = (v1) -> {
            return getBranches$lambda$10(r2, v1);
        };
        List<Branch> listComputeIfAbsent = concurrentHashMap.computeIfAbsent(obj, (v1) -> {
            return getBranches$lambda$11(r2, v1);
        });
        Intrinsics.checkNotNullExpressionValue(listComputeIfAbsent, "computeIfAbsent(...)");
        return listComputeIfAbsent;
    }

    private static final List getBranches$lambda$11(Function1 $tmp0, Object p0) {
        return (List) $tmp0.invoke(p0);
    }

    private static final List getBranches$lambda$10(Object $obj, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CopyOnWriteArrayList $this$getBranches_u24lambda_u2410_u24lambda_u249 = new CopyOnWriteArrayList();
        INSTANCE.getBranchesRecursive($this$getBranches_u24lambda_u2410_u24lambda_u249, $obj.getClass(), $obj);
        return $this$getBranches_u24lambda_u2410_u24lambda_u249;
    }

    private final void getBranchesRecursive(List<Branch> listeners, Class<?> klass, Object obj) {
        Iterator it = ArrayIteratorKt.iterator(klass.getDeclaredMethods());
        while (it.hasNext()) {
            Method method = (Method) it.next();
            if (method.isAnnotationPresent(Flow.class)) {
                Intrinsics.checkNotNull(method);
                listeners.add(new Branch(klass, obj, method));
            }
        }
        if (klass.getSuperclass() != null) {
            Class<? super Object> superclass = klass.getSuperclass();
            Intrinsics.checkNotNullExpressionValue(superclass, "getSuperclass(...)");
            getBranchesRecursive(listeners, superclass, obj);
        }
    }
}
