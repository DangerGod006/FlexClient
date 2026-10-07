package su.catlean.api.event.events.render;

import net.minecraft.class_4597;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: ItemCommandEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/render/ItemCommandEvent.class */
public final class ItemCommandEvent extends Event {

    @NotNull
    public static final ItemCommandEvent INSTANCE = new ItemCommandEvent();

    @Nullable
    private static class_4597 provider;

    private ItemCommandEvent() {
    }

    @Nullable
    public final class_4597 getProvider() {
        return provider;
    }

    public final void setProvider(@Nullable class_4597 class_4597Var) {
        provider = class_4597Var;
    }
}
