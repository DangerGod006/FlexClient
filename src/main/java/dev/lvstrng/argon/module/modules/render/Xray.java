package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.utils.EncryptedString;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/Xray.class */
public final class Xray extends Module {
    public final BooleanSetting diamonds;
    public final BooleanSetting ancientDebris;
    public final BooleanSetting gold;
    public final BooleanSetting iron;
    public final BooleanSetting emerald;
    public final BooleanSetting lapis;
    public final BooleanSetting redstone;
    public final BooleanSetting coal;
    public final BooleanSetting copper;
    public final BooleanSetting chest;
    public final BooleanSetting spawner;

    public Xray() {
        super(EncryptedString.of("Xray"), EncryptedString.of("Only renders ores, chests, and spawners through walls"), -1, Category.RENDER);
        this.diamonds = new BooleanSetting(EncryptedString.of("Diamonds"), true);
        this.ancientDebris = new BooleanSetting(EncryptedString.of("Ancient Debris"), true);
        this.gold = new BooleanSetting(EncryptedString.of("Gold Ore"), true);
        this.iron = new BooleanSetting(EncryptedString.of("Iron Ore"), true);
        this.emerald = new BooleanSetting(EncryptedString.of("Emerald Ore"), true);
        this.lapis = new BooleanSetting(EncryptedString.of("Lapis Ore"), true);
        this.redstone = new BooleanSetting(EncryptedString.of("Redstone Ore"), true);
        this.coal = new BooleanSetting(EncryptedString.of("Coal Ore"), false);
        this.copper = new BooleanSetting(EncryptedString.of("Copper Ore"), false);
        this.chest = new BooleanSetting(EncryptedString.of("Chests"), true);
        this.spawner = new BooleanSetting(EncryptedString.of("Spawners"), true);
        addSettings(this.diamonds, this.ancientDebris, this.gold, this.iron, this.emerald, this.lapis, this.redstone, this.coal, this.copper, this.chest, this.spawner);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        reloadChunks();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        reloadChunks();
        super.onDisable();
    }

    public boolean isVisible(String blockId) {
        if (blockId.contains("diamond_ore")) {
            return this.diamonds.getValue();
        }
        if (blockId.contains("ancient_debris")) {
            return this.ancientDebris.getValue();
        }
        if (blockId.contains("gold_ore")) {
            return this.gold.getValue();
        }
        if (blockId.contains("iron_ore")) {
            return this.iron.getValue();
        }
        if (blockId.contains("emerald_ore")) {
            return this.emerald.getValue();
        }
        if (blockId.contains("lapis_ore")) {
            return this.lapis.getValue();
        }
        if (blockId.contains("redstone_ore")) {
            return this.redstone.getValue();
        }
        if (blockId.contains("coal_ore")) {
            return this.coal.getValue();
        }
        if (blockId.contains("copper_ore")) {
            return this.copper.getValue();
        }
        if (blockId.contains("chest")) {
            return this.chest.getValue();
        }
        if (blockId.contains("spawner")) {
            return this.spawner.getValue();
        }
        return false;
    }

    private void reloadChunks() {
        if (this.mc.field_1769 != null) {
            this.mc.field_1769.method_3279();
        }
    }
}
