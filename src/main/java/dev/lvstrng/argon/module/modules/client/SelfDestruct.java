package dev.lvstrng.argon.module.modules.client;

import com.sun.jna.Memory;
import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.gui.ClickGui;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.Setting;
import dev.lvstrng.argon.module.setting.StringSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.Utils;
import java.io.File;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/client/SelfDestruct.class */
public final class SelfDestruct extends Module {
    public static boolean destruct = false;
    private final BooleanSetting replaceMod;
    private final BooleanSetting saveLastModified;
    private final StringSetting downloadURL;

    public SelfDestruct() {
        super(EncryptedString.of("Self Destruct"), EncryptedString.of("Removes the client from your game |Credits to lwes for deletion|"), -1, Category.CLIENT);
        this.replaceMod = new BooleanSetting(EncryptedString.of("Replace Mod"), true).setDescription(EncryptedString.of("Repalces the mod with the original JAR file of the ImmediatelyFast mod"));
        this.saveLastModified = new BooleanSetting(EncryptedString.of("Save Last Modified"), true).setDescription(EncryptedString.of("Saves the last modified date after self destruct"));
        this.downloadURL = new StringSetting(EncryptedString.of("Replace URL"), "https://cdn.modrinth.com/data/5ZwdcRci/versions/FEOsWs1E/ImmediatelyFast-Fabric-1.2.11%2B1.20.4.jar");
        addSettings(this.replaceMod, this.saveLastModified, this.downloadURL);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        destruct = true;
        ((ClickGUI) Argon.INSTANCE.getModuleManager().getModule(ClickGUI.class)).setEnabled(false);
        setEnabled(false);
        Argon.INSTANCE.getProfileManager().saveProfile();
        if (this.mc.field_1755 instanceof ClickGui) {
            Argon.INSTANCE.guiInitialized = false;
            this.mc.field_1755.method_25419();
        }
        if (this.replaceMod.getValue()) {
            try {
                String modUrl = this.downloadURL.getValue();
                File currentJar = Utils.getCurrentJarPath();
                if (currentJar.exists()) {
                    Utils.replaceModFile(modUrl, Utils.getCurrentJarPath());
                }
            } catch (Exception e) {
            }
        }
        for (Module module : Argon.INSTANCE.getModuleManager().getModules()) {
            module.setEnabled(false);
            module.setName(null);
            module.setDescription(null);
            for (Setting<?> setting : module.getSettings()) {
                setting.setName(null);
                setting.setDescription(null);
                if (setting instanceof StringSetting) {
                    StringSetting set = (StringSetting) setting;
                    set.setValue(null);
                }
            }
            module.getSettings().clear();
        }
        Runtime runtime = Runtime.getRuntime();
        if (this.saveLastModified.getValue()) {
            Argon.INSTANCE.resetModifiedDate();
        }
        for (int i = 0; i <= 10; i++) {
            runtime.gc();
            runtime.runFinalization();
            try {
                Thread.sleep(100 * i);
                Memory.purge();
                Memory.disposeAll();
            } catch (InterruptedException e2) {
            }
        }
    }
}
