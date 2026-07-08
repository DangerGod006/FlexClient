package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.event.events.GameRenderListener;
import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.ProjectionUtils;
import dev.lvstrng.argon.utils.RenderUtils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_7833;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/BlockESP.class */
public final class BlockESP extends Module implements TickListener, GameRenderListener, HudListener {
    private final BooleanSetting fill;
    private final BooleanSetting outline;
    private final BooleanSetting tracers;
    private final NumberSetting range;
    private final NumberSetting lineWidth;
    private final NumberSetting fillAlpha;
    private final BooleanSetting findObsidian;
    private final BooleanSetting findBedrock;
    private final BooleanSetting findDiamondOre;
    private final BooleanSetting findAncientDebris;
    private final BooleanSetting findSpawner;
    private final BooleanSetting findChest;
    private final BooleanSetting findGoldOre;
    private final BooleanSetting findIronOre;
    private final NumberSetting obsidianR;
    private final NumberSetting obsidianG;
    private final NumberSetting obsidianB;
    private final NumberSetting bedrockR;
    private final NumberSetting bedrockG;
    private final NumberSetting bedrockB;
    private final NumberSetting diamondR;
    private final NumberSetting diamondG;
    private final NumberSetting diamondB;
    private final NumberSetting debrisR;
    private final NumberSetting debrisG;
    private final NumberSetting debrisB;
    private final NumberSetting spawnerR;
    private final NumberSetting spawnerG;
    private final NumberSetting spawnerB;
    private final NumberSetting chestR;
    private final NumberSetting chestG;
    private final NumberSetting chestB;
    private final NumberSetting goldOreR;
    private final NumberSetting goldOreG;
    private final NumberSetting goldOreB;
    private final NumberSetting ironOreR;
    private final NumberSetting ironOreG;
    private final NumberSetting ironOreB;
    private final List<class_2338> cachedBlocks;
    private long lastCacheTick;

    public BlockESP() {
        super(EncryptedString.of("Block ESP"), EncryptedString.of("Highlights target blocks through walls"), -1, Category.RENDER);
        this.fill = new BooleanSetting(EncryptedString.of("Fill"), true).setDescription(EncryptedString.of("Fills block boxes with color"));
        this.outline = new BooleanSetting(EncryptedString.of("Outline"), true).setDescription(EncryptedString.of("Draws outline around block boxes"));
        this.tracers = new BooleanSetting(EncryptedString.of("Tracers"), false).setDescription(EncryptedString.of("Draws lines from center screen to each block"));
        this.range = new NumberSetting(EncryptedString.of("Range"), 8.0d, 128.0d, 32.0d, 4.0d).setDescription(EncryptedString.of("Block search radius"));
        this.lineWidth = new NumberSetting(EncryptedString.of("Line Width"), 1.0d, 5.0d, 1.0d, 1.0d);
        this.fillAlpha = new NumberSetting(EncryptedString.of("Fill Alpha"), 0.0d, 255.0d, 40.0d, 5.0d);
        this.findObsidian = new BooleanSetting(EncryptedString.of("Obsidian"), false);
        this.findBedrock = new BooleanSetting(EncryptedString.of("Bedrock"), false);
        this.findDiamondOre = new BooleanSetting(EncryptedString.of("Diamond Ore"), false);
        this.findAncientDebris = new BooleanSetting(EncryptedString.of("Ancient Debris"), false);
        this.findSpawner = new BooleanSetting(EncryptedString.of("Spawner"), false);
        this.findChest = new BooleanSetting(EncryptedString.of("Chest"), false);
        this.findGoldOre = new BooleanSetting(EncryptedString.of("Gold Ore"), false);
        this.findIronOre = new BooleanSetting(EncryptedString.of("Iron Ore"), false);
        this.obsidianR = new NumberSetting(EncryptedString.of("Obsidian R"), 0.0d, 255.0d, 128.0d, 1.0d);
        this.obsidianG = new NumberSetting(EncryptedString.of("Obsidian G"), 0.0d, 255.0d, 0.0d, 1.0d);
        this.obsidianB = new NumberSetting(EncryptedString.of("Obsidian B"), 0.0d, 255.0d, 255.0d, 1.0d);
        this.bedrockR = new NumberSetting(EncryptedString.of("Bedrock R"), 0.0d, 255.0d, 80.0d, 1.0d);
        this.bedrockG = new NumberSetting(EncryptedString.of("Bedrock G"), 0.0d, 255.0d, 80.0d, 1.0d);
        this.bedrockB = new NumberSetting(EncryptedString.of("Bedrock B"), 0.0d, 255.0d, 80.0d, 1.0d);
        this.diamondR = new NumberSetting(EncryptedString.of("Diamond Ore R"), 0.0d, 255.0d, 0.0d, 1.0d);
        this.diamondG = new NumberSetting(EncryptedString.of("Diamond Ore G"), 0.0d, 255.0d, 200.0d, 1.0d);
        this.diamondB = new NumberSetting(EncryptedString.of("Diamond Ore B"), 0.0d, 255.0d, 255.0d, 1.0d);
        this.debrisR = new NumberSetting(EncryptedString.of("Ancient Debris R"), 0.0d, 255.0d, 180.0d, 1.0d);
        this.debrisG = new NumberSetting(EncryptedString.of("Ancient Debris G"), 0.0d, 255.0d, 80.0d, 1.0d);
        this.debrisB = new NumberSetting(EncryptedString.of("Ancient Debris B"), 0.0d, 255.0d, 20.0d, 1.0d);
        this.spawnerR = new NumberSetting(EncryptedString.of("Spawner R"), 0.0d, 255.0d, 255.0d, 1.0d);
        this.spawnerG = new NumberSetting(EncryptedString.of("Spawner G"), 0.0d, 255.0d, 100.0d, 1.0d);
        this.spawnerB = new NumberSetting(EncryptedString.of("Spawner B"), 0.0d, 255.0d, 0.0d, 1.0d);
        this.chestR = new NumberSetting(EncryptedString.of("Chest R"), 0.0d, 255.0d, 255.0d, 1.0d);
        this.chestG = new NumberSetting(EncryptedString.of("Chest G"), 0.0d, 255.0d, 215.0d, 1.0d);
        this.chestB = new NumberSetting(EncryptedString.of("Chest B"), 0.0d, 255.0d, 0.0d, 1.0d);
        this.goldOreR = new NumberSetting(EncryptedString.of("Gold Ore R"), 0.0d, 255.0d, 255.0d, 1.0d);
        this.goldOreG = new NumberSetting(EncryptedString.of("Gold Ore G"), 0.0d, 255.0d, 215.0d, 1.0d);
        this.goldOreB = new NumberSetting(EncryptedString.of("Gold Ore B"), 0.0d, 255.0d, 0.0d, 1.0d);
        this.ironOreR = new NumberSetting(EncryptedString.of("Iron Ore R"), 0.0d, 255.0d, 200.0d, 1.0d);
        this.ironOreG = new NumberSetting(EncryptedString.of("Iron Ore G"), 0.0d, 255.0d, 150.0d, 1.0d);
        this.ironOreB = new NumberSetting(EncryptedString.of("Iron Ore B"), 0.0d, 255.0d, 100.0d, 1.0d);
        this.cachedBlocks = new CopyOnWriteArrayList();
        this.lastCacheTick = 0L;
        addSettings(this.fill, this.outline, this.tracers, this.range, this.lineWidth, this.fillAlpha, this.findObsidian, this.obsidianR, this.obsidianG, this.obsidianB, this.findBedrock, this.bedrockR, this.bedrockG, this.bedrockB, this.findDiamondOre, this.diamondR, this.diamondG, this.diamondB, this.findAncientDebris, this.debrisR, this.debrisG, this.debrisB, this.findSpawner, this.spawnerR, this.spawnerG, this.spawnerB, this.findChest, this.chestR, this.chestG, this.chestB, this.findGoldOre, this.goldOreR, this.goldOreG, this.goldOreB, this.findIronOre, this.ironOreR, this.ironOreG, this.ironOreB);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(GameRenderListener.class, this);
        this.eventManager.add(HudListener.class, this);
        this.cachedBlocks.clear();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(GameRenderListener.class, this);
        this.eventManager.remove(HudListener.class, this);
        this.cachedBlocks.clear();
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        long currentTick = this.mc.field_1724.field_6012;
        if (currentTick - this.lastCacheTick < 10) {
            return;
        }
        this.lastCacheTick = currentTick;
        int r = this.range.getValueInt();
        class_2338 origin = this.mc.field_1724.method_24515();
        List<class_2338> newCache = new ArrayList<>();
        for (int x = -r; x <= r; x++) {
            for (int y = -r; y <= r; y++) {
                for (int z = -r; z <= r; z++) {
                    class_2338 pos = origin.method_10069(x, y, z);
                    class_2248 block = this.mc.field_1687.method_8320(pos).method_26204();
                    if (isEnabled(block)) {
                        newCache.add(pos);
                    }
                }
            }
        }
        this.cachedBlocks.clear();
        this.cachedBlocks.addAll(newCache);
    }

    @Override // dev.lvstrng.argon.event.events.GameRenderListener
    public void onGameRender(GameRenderListener.GameRenderEvent event) {
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        if (this.fill.getValue() || this.outline.getValue()) {
            class_4184 camera = this.mc.field_1773.method_19418();
            class_243 camPos = camera.method_71156();
            event.matrices.method_22903();
            event.matrices.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
            event.matrices.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
            event.matrices.method_22904(-camPos.field_1352, -camPos.field_1351, -camPos.field_1350);
            for (class_2338 pos : this.cachedBlocks) {
                if (this.mc.field_1687 == null) {
                    break;
                }
                class_2248 block = this.mc.field_1687.method_8320(pos).method_26204();
                Color color = getColor(block);
                if (color != null) {
                    class_238 box = new class_238(pos.method_10263(), pos.method_10264(), pos.method_10260(), pos.method_10263() + 1, pos.method_10264() + 1, pos.method_10260() + 1).method_1014(0.01d);
                    if (this.fill.getValue()) {
                        Color fillColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), this.fillAlpha.getValueInt());
                        RenderUtils.renderFilledBox(event.matrices, (float) box.field_1323, (float) box.field_1322, (float) box.field_1321, (float) box.field_1320, (float) box.field_1325, (float) box.field_1324, fillColor);
                    }
                    if (this.outline.getValue()) {
                        RenderUtils.renderBoxOutline(event.matrices, box, new Color(color.getRed(), color.getGreen(), color.getBlue(), 255), this.lineWidth.getValueInt());
                    }
                }
            }
            event.matrices.method_22909();
        }
    }

    @Override // dev.lvstrng.argon.event.events.HudListener
    public void onRenderHud(HudListener.HudEvent event) {
        if (!this.tracers.getValue() || this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        int screenCX = this.mc.method_22683().method_4486() / 2;
        int screenCY = this.mc.method_22683().method_4502() / 2;
        for (class_2338 pos : this.cachedBlocks) {
            if (this.mc.field_1687 != null) {
                class_2248 block = this.mc.field_1687.method_8320(pos).method_26204();
                Color color = getColor(block);
                if (color != null) {
                    class_243 center = class_243.method_24953(pos);
                    ProjectionUtils.ProjectedPoint projected = ProjectionUtils.project(center);
                    if (projected != null) {
                        event.context.method_51738(screenCX, (int) projected.x(), screenCY, color.getRGB());
                        event.context.method_51742((int) projected.x(), screenCY, (int) projected.y(), color.getRGB());
                    }
                }
            } else {
                return;
            }
        }
    }

    private boolean isEnabled(class_2248 block) {
        if (block == class_2246.field_10540) {
            return this.findObsidian.getValue();
        }
        if (block == class_2246.field_9987) {
            return this.findBedrock.getValue();
        }
        if (block == class_2246.field_10442 || block == class_2246.field_29029) {
            return this.findDiamondOre.getValue();
        }
        if (block == class_2246.field_22109) {
            return this.findAncientDebris.getValue();
        }
        if (block == class_2246.field_10260) {
            return this.findSpawner.getValue();
        }
        if (block == class_2246.field_10034 || block == class_2246.field_10380 || block == class_2246.field_10443) {
            return this.findChest.getValue();
        }
        if (block == class_2246.field_10571 || block == class_2246.field_29026 || block == class_2246.field_23077) {
            return this.findGoldOre.getValue();
        }
        if (block == class_2246.field_10212 || block == class_2246.field_29027) {
            return this.findIronOre.getValue();
        }
        return false;
    }

    private Color getColor(class_2248 block) {
        if (block == class_2246.field_10540) {
            return new Color(this.obsidianR.getValueInt(), this.obsidianG.getValueInt(), this.obsidianB.getValueInt());
        }
        if (block == class_2246.field_9987) {
            return new Color(this.bedrockR.getValueInt(), this.bedrockG.getValueInt(), this.bedrockB.getValueInt());
        }
        if (block == class_2246.field_10442 || block == class_2246.field_29029) {
            return new Color(this.diamondR.getValueInt(), this.diamondG.getValueInt(), this.diamondB.getValueInt());
        }
        if (block == class_2246.field_22109) {
            return new Color(this.debrisR.getValueInt(), this.debrisG.getValueInt(), this.debrisB.getValueInt());
        }
        if (block == class_2246.field_10260) {
            return new Color(this.spawnerR.getValueInt(), this.spawnerG.getValueInt(), this.spawnerB.getValueInt());
        }
        if (block == class_2246.field_10034 || block == class_2246.field_10380 || block == class_2246.field_10443) {
            return new Color(this.chestR.getValueInt(), this.chestG.getValueInt(), this.chestB.getValueInt());
        }
        if (block == class_2246.field_10571 || block == class_2246.field_29026 || block == class_2246.field_23077) {
            return new Color(this.goldOreR.getValueInt(), this.goldOreG.getValueInt(), this.goldOreB.getValueInt());
        }
        if (block == class_2246.field_10212 || block == class_2246.field_29027) {
            return new Color(this.ironOreR.getValueInt(), this.ironOreG.getValueInt(), this.ironOreB.getValueInt());
        }
        return null;
    }
}
