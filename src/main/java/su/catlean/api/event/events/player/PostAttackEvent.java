package su.catlean.api.event.events.player;

import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

/* JADX INFO: compiled from: PostAttackEvent.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/api/event/events/player/PostAttackEvent.class */
public final class PostAttackEvent extends Event {

    @NotNull
    public static final PostAttackEvent INSTANCE = new PostAttackEvent();

    private PostAttackEvent() {
    }
}
