package kotlin.reflect;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KDeclarationContainer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KDeclarationContainer.class */
public interface KDeclarationContainer {
    @NotNull
    Collection<KCallable<?>> getMembers();
}
