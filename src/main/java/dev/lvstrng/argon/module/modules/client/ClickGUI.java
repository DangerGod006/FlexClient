package dev.lvstrng.argon.module.modules.client;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.PacketReceiveListener;
import dev.lvstrng.argon.gui.ClickGui;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_3944;
import net.minecraft.class_490;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/client/ClickGUI.class */
public final class ClickGUI extends Module implements PacketReceiveListener {
    private final BooleanSetting preventClose;
    public static final NumberSetting red = new NumberSetting(EncryptedString.of("Red"), 0.0d, 255.0d, 255.0d, 1.0d);
    public static final NumberSetting green = new NumberSetting(EncryptedString.of("Green"), 0.0d, 255.0d, 0.0d, 1.0d);
    public static final NumberSetting blue = new NumberSetting(EncryptedString.of("Blue"), 0.0d, 255.0d, 50.0d, 1.0d);
    public static final NumberSetting alphaWindow = new NumberSetting(EncryptedString.of("Window Alpha"), 0.0d, 255.0d, 170.0d, 1.0d);
    public static final BooleanSetting breathing = new BooleanSetting(EncryptedString.of("Breathing"), true).setDescription(EncryptedString.of("Color breathing effect (only with rainbow off)"));
    public static final BooleanSetting rainbow = new BooleanSetting(EncryptedString.of("Rainbow"), true).setDescription(EncryptedString.of("Enables LGBTQ mode"));
    public static final BooleanSetting background = new BooleanSetting(EncryptedString.of("Background"), false).setDescription(EncryptedString.of("Renders the background of the Click Gui"));
    public static final BooleanSetting customFont = new BooleanSetting(EncryptedString.of("Custom Font"), true);
    public static final NumberSetting roundQuads = new NumberSetting(EncryptedString.of("Roundness"), 1.0d, 10.0d, 5.0d, 1.0d);
    public static final ModeSetting<AnimationMode> animationMode = new ModeSetting<>(EncryptedString.of("Animations"), AnimationMode.Normal, AnimationMode.class);
    public static final BooleanSetting antiAliasing = new BooleanSetting(EncryptedString.of("MSAA"), true).setDescription(EncryptedString.of("Anti Aliasing | This can impact performance if you're using tracers but gives them a smoother look |"));

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/client/ClickGUI$AnimationMode.class */
    public enum AnimationMode {
        Normal,
        Positive,
        Off
    }

    public ClickGUI() {
        super(EncryptedString.of("DANGER"), EncryptedString.of("Settings for the client"), 344, Category.CLIENT);
        this.preventClose = new BooleanSetting(EncryptedString.of("Prevent Close"), true).setDescription(EncryptedString.of("For servers with freeze plugins that don't let you open the GUI"));
        addSettings(red, green, blue, alphaWindow, breathing, rainbow, background, this.preventClose, roundQuads, animationMode, antiAliasing);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PacketReceiveListener.class, this);
        Argon.INSTANCE.previousScreen = this.mc.field_1755;
        if (this.mc.field_1755 instanceof class_490) {
            Argon.INSTANCE.guiInitialized = true;
        }
        if (Argon.INSTANCE.clickGui != null) {
            this.mc.method_1507(Argon.INSTANCE.clickGui);
        }
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PacketReceiveListener.class, this);
        if (this.mc.field_1755 instanceof ClickGui) {
            Argon.INSTANCE.clickGui.onGuiClose();
        }
        Argon.INSTANCE.guiInitialized = false;
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.PacketReceiveListener
    public void onPacketReceive(PacketReceiveListener.PacketReceiveEvent event) {
        if (Argon.INSTANCE.guiInitialized && (event.packet instanceof class_3944) && this.preventClose.getValue()) {
            event.cancel();
        }
    }
}
