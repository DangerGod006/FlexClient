package su.catlean.api.event.events.network;

import io.netty.channel.ChannelPipeline;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_2598;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: AddHandlersEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/network/AddHandlersEvent.class */
public final class AddHandlersEvent extends Event {
    private static AtomicReference<ChannelPipeline> pipeline;
    private static class_2598 side;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AddHandlersEvent.class, "local", "getLocal()Z", 0))};

    @NotNull
    public static final AddHandlersEvent INSTANCE = new AddHandlersEvent();

    @NotNull
    private static final ReadWriteProperty local$delegate = Delegates.INSTANCE.notNull();

    private AddHandlersEvent() {
    }

    @NotNull
    public final AtomicReference<ChannelPipeline> getPipeline() {
        AtomicReference<ChannelPipeline> atomicReference = pipeline;
        if (atomicReference != null) {
            return atomicReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pipeline");
        return null;
    }

    @NotNull
    public final class_2598 getSide() {
        class_2598 class_2598Var = side;
        if (class_2598Var != null) {
            return class_2598Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("side");
        return null;
    }

    public final boolean getLocal() {
        return ((Boolean) local$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setLocal(boolean z) {
        local$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final boolean call(@NotNull AtomicReference<ChannelPipeline> pipeline2, @NotNull class_2598 side2, boolean local) {
        Intrinsics.checkNotNullParameter(pipeline2, "pipeline");
        Intrinsics.checkNotNullParameter(side2, "side");
        setCancelled(false);
        pipeline = pipeline2;
        side = side2;
        setLocal(local);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
