package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.ButtonListener;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/MouseSimulation.class */
public final class MouseSimulation {
    public static HashMap<Integer, Boolean> mouseButtons = new HashMap<>();
    public static ExecutorService clickExecutor = Executors.newFixedThreadPool(100);

    public static boolean isMouseButtonPressed(int keyCode) {
        Boolean key = mouseButtons.get(Integer.valueOf(keyCode));
        if (key != null) {
            return key.booleanValue();
        }
        return false;
    }

    public static void mousePress(int keyCode) {
        mouseButtons.put(Integer.valueOf(keyCode), true);
        EventManager.fire(new ButtonListener.ButtonEvent(keyCode, Argon.mc.method_22683().method_4490(), 1));
    }

    public static void mouseRelease(int keyCode) {
        mouseButtons.put(Integer.valueOf(keyCode), false);
        EventManager.fire(new ButtonListener.ButtonEvent(keyCode, Argon.mc.method_22683().method_4490(), 0));
    }

    public static void mouseClick(int keyCode, int millis) {
        clickExecutor.submit(() -> {
            try {
                mousePress(keyCode);
                Thread.sleep(millis);
                mouseRelease(keyCode);
            } catch (InterruptedException e) {
            }
        });
    }

    public static void mouseClick(int keyCode) {
        mouseClick(keyCode, 35);
    }
}
