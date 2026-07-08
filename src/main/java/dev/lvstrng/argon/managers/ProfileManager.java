package dev.lvstrng.argon.managers;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.module.setting.Setting;
import dev.lvstrng.argon.module.setting.StringSetting;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/managers/ProfileManager.class */
public final class ProfileManager {
    private JsonObject profile;
    private final Gson g = new Gson();
    private String temp = System.getProperty("java.io.tmpdir");
    private String folderName = "UJHfsGGjbPfVZ";
    Path folder = Paths.get(this.temp, this.folderName);
    private Path profileFolderPath = this.folder;
    private Path profilePath = this.profileFolderPath.resolve("a.json");

    public void loadProfile() {
        JsonObject moduleConfig;
        JsonElement enabledJson;
        JsonObject moduleConfig2;
        JsonElement enabledJson2;
        try {
            if (!System.getProperty("os.name").toLowerCase().contains("win")) {
                this.temp = System.getProperty("user.home");
                this.folderName = "UJHfsGGjbPfVZ";
                this.profileFolderPath = this.folder;
                this.profilePath = this.profileFolderPath.resolve("a.json");
                if (!Files.isRegularFile(this.profilePath, new LinkOption[0])) {
                    return;
                }
                this.profile = (JsonObject) this.g.fromJson(Files.readString(this.profilePath), JsonObject.class);
                for (Module module : Argon.INSTANCE.getModuleManager().getModules()) {
                    if (module.isEnabled()) {
                        module.setEnabled(false);
                    }
                }
                for (Module module2 : Argon.INSTANCE.getModuleManager().getModules()) {
                    JsonElement moduleJson = this.profile.get(String.valueOf(Argon.INSTANCE.getModuleManager().getModules().indexOf(module2)));
                    if (moduleJson != null && moduleJson.isJsonObject() && (enabledJson2 = (moduleConfig2 = moduleJson.getAsJsonObject()).get("enabled")) != null && enabledJson2.isJsonPrimitive()) {
                        if (enabledJson2.getAsBoolean()) {
                            module2.setEnabled(true);
                        }
                        for (Setting<?> setting : module2.getSettings()) {
                            JsonElement settingJson = moduleConfig2.get(String.valueOf(module2.getSettings().indexOf(setting)));
                            if (settingJson != null) {
                                if (setting instanceof BooleanSetting) {
                                    BooleanSetting booleanSetting = (BooleanSetting) setting;
                                    booleanSetting.setValue(settingJson.getAsBoolean());
                                } else if (setting instanceof ModeSetting) {
                                    ModeSetting<?> modeSetting = (ModeSetting) setting;
                                    modeSetting.setModeIndex(settingJson.getAsInt());
                                } else if (setting instanceof NumberSetting) {
                                    NumberSetting numberSetting = (NumberSetting) setting;
                                    numberSetting.setValue(settingJson.getAsDouble());
                                } else if (setting instanceof KeybindSetting) {
                                    KeybindSetting keybindSetting = (KeybindSetting) setting;
                                    keybindSetting.setKey(settingJson.getAsInt());
                                    if (keybindSetting.isModuleKey()) {
                                        module2.setKey(settingJson.getAsInt());
                                    }
                                } else if (setting instanceof StringSetting) {
                                    StringSetting stringSetting = (StringSetting) setting;
                                    stringSetting.setValue(settingJson.getAsString());
                                } else if (setting instanceof MinMaxSetting) {
                                    MinMaxSetting minMaxSetting = (MinMaxSetting) setting;
                                    if (settingJson.isJsonObject()) {
                                        JsonObject minMaxObject = settingJson.getAsJsonObject();
                                        double minValue = minMaxObject.get("1").getAsDouble();
                                        double maxValue = minMaxObject.get("2").getAsDouble();
                                        minMaxSetting.setMinValue(minValue);
                                        minMaxSetting.setMaxValue(maxValue);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!Files.isRegularFile(this.profilePath, new LinkOption[0])) {
                    return;
                }
                this.profile = (JsonObject) this.g.fromJson(Files.readString(this.profilePath), JsonObject.class);
                for (Module module3 : Argon.INSTANCE.getModuleManager().getModules()) {
                    if (module3.isEnabled()) {
                        module3.setEnabled(false);
                    }
                }
                for (Module module4 : Argon.INSTANCE.getModuleManager().getModules()) {
                    JsonElement moduleJson2 = this.profile.get(String.valueOf(Argon.INSTANCE.getModuleManager().getModules().indexOf(module4)));
                    if (moduleJson2 != null && moduleJson2.isJsonObject() && (enabledJson = (moduleConfig = moduleJson2.getAsJsonObject()).get("enabled")) != null && enabledJson.isJsonPrimitive()) {
                        if (enabledJson.getAsBoolean()) {
                            module4.setEnabled(true);
                        }
                        for (Setting<?> setting2 : module4.getSettings()) {
                            JsonElement settingJson2 = moduleConfig.get(String.valueOf(module4.getSettings().indexOf(setting2)));
                            if (settingJson2 != null) {
                                if (setting2 instanceof BooleanSetting) {
                                    BooleanSetting booleanSetting2 = (BooleanSetting) setting2;
                                    booleanSetting2.setValue(settingJson2.getAsBoolean());
                                } else if (setting2 instanceof ModeSetting) {
                                    ModeSetting<?> modeSetting2 = (ModeSetting) setting2;
                                    modeSetting2.setModeIndex(settingJson2.getAsInt());
                                } else if (setting2 instanceof NumberSetting) {
                                    NumberSetting numberSetting2 = (NumberSetting) setting2;
                                    numberSetting2.setValue(settingJson2.getAsDouble());
                                } else if (setting2 instanceof KeybindSetting) {
                                    KeybindSetting keybindSetting2 = (KeybindSetting) setting2;
                                    keybindSetting2.setKey(settingJson2.getAsInt());
                                    if (keybindSetting2.isModuleKey()) {
                                        module4.setKey(settingJson2.getAsInt());
                                    }
                                } else if (setting2 instanceof StringSetting) {
                                    StringSetting stringSetting2 = (StringSetting) setting2;
                                    stringSetting2.setValue(settingJson2.getAsString());
                                } else if (setting2 instanceof MinMaxSetting) {
                                    MinMaxSetting minMaxSetting2 = (MinMaxSetting) setting2;
                                    if (settingJson2.isJsonObject()) {
                                        JsonObject minMaxObject2 = settingJson2.getAsJsonObject();
                                        double minValue2 = minMaxObject2.get("1").getAsDouble();
                                        double maxValue2 = minMaxObject2.get("2").getAsDouble();
                                        minMaxSetting2.setMinValue(minValue2);
                                        minMaxSetting2.setMaxValue(maxValue2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public void saveProfile() {
        try {
            if (!System.getProperty("os.name").toLowerCase().contains("win")) {
                this.temp = System.getProperty("user.home");
                this.folderName = "UJHfsGGjbPfVZ";
                this.profileFolderPath = this.folder;
                this.profilePath = this.profileFolderPath.resolve("a.json");
                Files.createDirectories(this.profileFolderPath, new FileAttribute[0]);
                this.profile = new JsonObject();
                for (Module module : Argon.INSTANCE.getModuleManager().getModules()) {
                    JsonObject moduleConfig = new JsonObject();
                    moduleConfig.addProperty("enabled", Boolean.valueOf(module.isEnabled()));
                    for (Setting<?> setting : module.getSettings()) {
                        if (setting instanceof BooleanSetting) {
                            BooleanSetting booleanSetting = (BooleanSetting) setting;
                            moduleConfig.addProperty(String.valueOf(module.getSettings().indexOf(setting)), Boolean.valueOf(booleanSetting.getValue()));
                        } else if (setting instanceof ModeSetting) {
                            ModeSetting<?> modeSetting = (ModeSetting) setting;
                            moduleConfig.addProperty(String.valueOf(module.getSettings().indexOf(setting)), Integer.valueOf(modeSetting.getModeIndex()));
                        } else if (setting instanceof NumberSetting) {
                            NumberSetting numberSetting = (NumberSetting) setting;
                            moduleConfig.addProperty(String.valueOf(module.getSettings().indexOf(setting)), Double.valueOf(numberSetting.getValue()));
                        } else if (setting instanceof KeybindSetting) {
                            KeybindSetting keybindSetting = (KeybindSetting) setting;
                            moduleConfig.addProperty(String.valueOf(module.getSettings().indexOf(setting)), Integer.valueOf(keybindSetting.getKey()));
                        } else if (setting instanceof StringSetting) {
                            StringSetting stringSetting = (StringSetting) setting;
                            moduleConfig.addProperty(String.valueOf(module.getSettings().indexOf(setting)), stringSetting.getValue());
                        } else if (setting instanceof MinMaxSetting) {
                            MinMaxSetting minMaxSetting = (MinMaxSetting) setting;
                            JsonObject minMaxObject = new JsonObject();
                            minMaxObject.addProperty("1", Double.valueOf(minMaxSetting.getMinValue()));
                            minMaxObject.addProperty("2", Double.valueOf(minMaxSetting.getMaxValue()));
                            moduleConfig.add(String.valueOf(module.getSettings().indexOf(setting)), minMaxObject);
                        }
                    }
                    this.profile.add(String.valueOf(Argon.INSTANCE.getModuleManager().getModules().indexOf(module)), moduleConfig);
                }
                Files.writeString(this.profilePath, this.g.toJson(this.profile), new OpenOption[0]);
            } else {
                Files.createDirectories(this.profileFolderPath, new FileAttribute[0]);
                this.profile = new JsonObject();
                for (Module module2 : Argon.INSTANCE.getModuleManager().getModules()) {
                    JsonObject moduleConfig2 = new JsonObject();
                    moduleConfig2.addProperty("enabled", Boolean.valueOf(module2.isEnabled()));
                    for (Setting<?> setting2 : module2.getSettings()) {
                        if (setting2 instanceof BooleanSetting) {
                            BooleanSetting booleanSetting2 = (BooleanSetting) setting2;
                            moduleConfig2.addProperty(String.valueOf(module2.getSettings().indexOf(setting2)), Boolean.valueOf(booleanSetting2.getValue()));
                        } else if (setting2 instanceof ModeSetting) {
                            ModeSetting<?> modeSetting2 = (ModeSetting) setting2;
                            moduleConfig2.addProperty(String.valueOf(module2.getSettings().indexOf(setting2)), Integer.valueOf(modeSetting2.getModeIndex()));
                        } else if (setting2 instanceof NumberSetting) {
                            NumberSetting numberSetting2 = (NumberSetting) setting2;
                            moduleConfig2.addProperty(String.valueOf(module2.getSettings().indexOf(setting2)), Double.valueOf(numberSetting2.getValue()));
                        } else if (setting2 instanceof KeybindSetting) {
                            KeybindSetting keybindSetting2 = (KeybindSetting) setting2;
                            moduleConfig2.addProperty(String.valueOf(module2.getSettings().indexOf(setting2)), Integer.valueOf(keybindSetting2.getKey()));
                        } else if (setting2 instanceof StringSetting) {
                            StringSetting stringSetting2 = (StringSetting) setting2;
                            moduleConfig2.addProperty(String.valueOf(module2.getSettings().indexOf(setting2)), stringSetting2.getValue());
                        } else if (setting2 instanceof MinMaxSetting) {
                            MinMaxSetting minMaxSetting2 = (MinMaxSetting) setting2;
                            JsonObject minMaxObject2 = new JsonObject();
                            minMaxObject2.addProperty("1", Double.valueOf(minMaxSetting2.getMinValue()));
                            minMaxObject2.addProperty("2", Double.valueOf(minMaxSetting2.getMaxValue()));
                            moduleConfig2.add(String.valueOf(module2.getSettings().indexOf(setting2)), minMaxObject2);
                        }
                    }
                    this.profile.add(String.valueOf(Argon.INSTANCE.getModuleManager().getModules().indexOf(module2)), moduleConfig2);
                }
                Files.writeString(this.profilePath, this.g.toJson(this.profile), new OpenOption[0]);
            }
        } catch (Exception e) {
        }
    }
}
