package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/jvm/internal/ModuleNameRetriever.class */
final class ModuleNameRetriever {

    @NotNull
    public static final ModuleNameRetriever INSTANCE = new ModuleNameRetriever();

    @NotNull
    private static final Cache notOnJava9 = new Cache(null, null, null);

    @Nullable
    private static Cache cache;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache.class */
    private static final class Cache {

        @JvmField
        @Nullable
        public final Method getModuleMethod;

        @JvmField
        @Nullable
        public final Method getDescriptorMethod;

        @JvmField
        @Nullable
        public final Method nameMethod;

        public Cache(@Nullable Method getModuleMethod, @Nullable Method getDescriptorMethod, @Nullable Method nameMethod) {
            this.getModuleMethod = getModuleMethod;
            this.getDescriptorMethod = getDescriptorMethod;
            this.nameMethod = nameMethod;
        }
    }

    private ModuleNameRetriever() {
    }

    @Nullable
    public final String getModuleName(@NotNull BaseContinuationImpl continuation) {
        Object module;
        Object descriptor;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Cache cacheBuildCache = cache;
        if (cacheBuildCache == null) {
            cacheBuildCache = buildCache(continuation);
        }
        Cache cache2 = cacheBuildCache;
        if (cache2 == notOnJava9) {
            return null;
        }
        Method method = cache2.getModuleMethod;
        if (method == null || (module = method.invoke(continuation.getClass(), new Object[0])) == null) {
            return null;
        }
        Method method2 = cache2.getDescriptorMethod;
        if (method2 == null || (descriptor = method2.invoke(module, new Object[0])) == null) {
            return null;
        }
        Method method3 = cache2.nameMethod;
        Object objInvoke = method3 != null ? method3.invoke(descriptor, new Object[0]) : null;
        if (objInvoke instanceof String) {
            return (String) objInvoke;
        }
        return null;
    }

    private final Cache buildCache(BaseContinuationImpl continuation) {
        try {
            Method getModuleMethod = Class.class.getDeclaredMethod("getModule", new Class[0]);
            Method getDescriptorMethod = continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]);
            Method nameMethod = continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]);
            Cache it = new Cache(getModuleMethod, getDescriptorMethod, nameMethod);
            ModuleNameRetriever moduleNameRetriever = INSTANCE;
            cache = it;
            return it;
        } catch (Exception e) {
            Cache it2 = notOnJava9;
            ModuleNameRetriever moduleNameRetriever2 = INSTANCE;
            cache = it2;
            return it2;
        }
    }
}
