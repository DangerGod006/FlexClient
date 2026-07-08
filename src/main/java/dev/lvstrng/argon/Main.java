package dev.lvstrng.argon;

import java.io.IOException;
import net.fabricmc.api.ModInitializer;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/Main.class */
public final class Main implements ModInitializer {
    public void onInitialize() {
        try {
            new Argon();
        } catch (IOException | InterruptedException e) {
        }
    }
}
