package su.catlean.api.event.events.player;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

/* JADX INFO: compiled from: HealthEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/HealthEvent.class */
public final class HealthEvent extends Event {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthEvent.class, "health", "getHealth()F", 0))};

    @NotNull
    public static final HealthEvent INSTANCE = new HealthEvent();

    @NotNull
    private static final ReadWriteProperty health$delegate = Delegates.INSTANCE.notNull();

    private HealthEvent() {
    }

    public final float getHealth() {
        return ((Number) health$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final void setHealth(float f) {
        health$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    public final boolean call(float health) {
        setHealth(health);
        setCancelled(false);
        Gofra.INSTANCE.drain(this);
        return getCancelled();
    }
}
