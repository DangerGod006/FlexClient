package dev.lvstrng.argon.event.events;

import dev.lvstrng.argon.event.Event;
import dev.lvstrng.argon.event.Listener;
import java.util.ArrayList;
import net.minecraft.class_4587;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/GameRenderListener.class */
public interface GameRenderListener extends Listener {
    void onGameRender(GameRenderEvent gameRenderEvent);

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/event/events/GameRenderListener$GameRenderEvent.class */
    public static class GameRenderEvent extends Event<GameRenderListener> {
        public class_4587 matrices;
        public float delta;

        public GameRenderEvent(class_4587 matrices, float delta) {
            this.matrices = matrices;
            this.delta = delta;
        }

        @Override // dev.lvstrng.argon.event.Event
        public void fire(ArrayList<GameRenderListener> listeners) {
            listeners.forEach(e -> {
                e.onGameRender(this);
            });
        }

        @Override // dev.lvstrng.argon.event.Event
        public Class<GameRenderListener> getListenerType() {
            return GameRenderListener.class;
        }
    }
}
