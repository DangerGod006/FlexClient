package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.BlockUtils;
import dev.lvstrng.argon.utils.CrystalUtils;
import dev.lvstrng.argon.utils.DamageUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import dev.lvstrng.argon.utils.RotationUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_1511;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoDoubleHand.class */
public final class AutoDoubleHand extends Module implements HudListener {
    private final BooleanSetting stopOnCrystal;
    private final BooleanSetting checkShield;
    private final BooleanSetting onPop;
    private final BooleanSetting onHealth;
    private final BooleanSetting predict;
    private final NumberSetting health;
    private final BooleanSetting onGround;
    private final BooleanSetting checkPlayers;
    private final NumberSetting distance;
    private final BooleanSetting predictCrystals;
    private final BooleanSetting checkAim;
    private final BooleanSetting checkItems;
    private final NumberSetting activatesAbove;
    private boolean belowHealth;
    private boolean offhandHasNoTotem;

    public AutoDoubleHand() {
        super(EncryptedString.of("Auto Double Hand"), EncryptedString.of("Automatically switches to your totem when you're about to pop"), -1, Category.COMBAT);
        this.stopOnCrystal = new BooleanSetting(EncryptedString.of("Stop On Crystal"), false).setDescription(EncryptedString.of("Stops while Auto Crystal is running"));
        this.checkShield = new BooleanSetting(EncryptedString.of("Check Shield"), false).setDescription(EncryptedString.of("Checks if you're blocking with a shield"));
        this.onPop = new BooleanSetting(EncryptedString.of("On Pop"), false).setDescription(EncryptedString.of("Switches to a totem if you pop"));
        this.onHealth = new BooleanSetting(EncryptedString.of("On Health"), false).setDescription(EncryptedString.of("Switches to totem if low on health"));
        this.predict = new BooleanSetting(EncryptedString.of("Predict Damage"), true);
        this.health = new NumberSetting(EncryptedString.of("Health"), 1.0d, 20.0d, 2.0d, 1.0d).setDescription(EncryptedString.of("Health to trigger at"));
        this.onGround = new BooleanSetting(EncryptedString.of("On Ground"), true).setDescription(EncryptedString.of("Whether crystal damage is checked on ground or not"));
        this.checkPlayers = new BooleanSetting(EncryptedString.of("Check Players"), true).setDescription(EncryptedString.of("Checks for nearby players"));
        this.distance = new NumberSetting(EncryptedString.of("Distance"), 1.0d, 10.0d, 5.0d, 0.1d).setDescription(EncryptedString.of("Player distance"));
        this.predictCrystals = new BooleanSetting(EncryptedString.of("Predict Crystals"), false);
        this.checkAim = new BooleanSetting(EncryptedString.of("Check Aim"), false).setDescription(EncryptedString.of("Checks if the opponent is aiming at obsidian"));
        this.checkItems = new BooleanSetting(EncryptedString.of("Check Items"), false).setDescription(EncryptedString.of("Checks if the opponent is holding crystals"));
        this.activatesAbove = new NumberSetting(EncryptedString.of("Activates Above"), 0.0d, 4.0d, 0.2d, 0.1d).setDescription(EncryptedString.of("Height to trigger at"));
        addSettings(this.stopOnCrystal, this.checkShield, this.onPop, this.onHealth, this.predict, this.health, this.onGround, this.checkPlayers, this.distance, this.predictCrystals, this.checkAim, this.checkItems, this.activatesAbove);
        this.belowHealth = false;
        this.offhandHasNoTotem = false;
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(HudListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(HudListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.HudListener
    public void onRenderHud(HudListener.HudEvent event) {
        if (this.mc.field_1724 == null) {
            return;
        }
        if (((AutoCrystal) Argon.INSTANCE.getModuleManager().getModule(AutoCrystal.class)).crystalling && this.stopOnCrystal.getValue()) {
            return;
        }
        double squaredDistance = this.distance.getValue() * this.distance.getValue();
        this.mc.field_1724.method_31548();
        if (this.checkShield.getValue() && this.mc.field_1724.method_6039()) {
            return;
        }
        if (this.mc.field_1724.method_6079().method_7909() != class_1802.field_8288 && this.onPop.getValue() && !this.offhandHasNoTotem) {
            this.offhandHasNoTotem = true;
            InventoryUtils.selectItemFromHotbar(class_1802.field_8288);
        }
        if (this.mc.field_1724.method_6079().method_7909() == class_1802.field_8288) {
            this.offhandHasNoTotem = false;
        }
        if (this.mc.field_1724.method_6032() <= this.health.getValue() && this.onHealth.getValue() && !this.belowHealth) {
            this.belowHealth = true;
            InventoryUtils.selectItemFromHotbar(class_1802.field_8288);
        }
        if (this.mc.field_1724.method_6032() > this.health.getValue()) {
            this.belowHealth = false;
        }
        if (!this.predict.getValue() || this.mc.field_1724.method_6032() > 19.0f) {
            return;
        }
        if (!this.onGround.getValue() && this.mc.field_1724.method_24828()) {
            return;
        }
        if (this.checkPlayers.getValue() && this.mc.field_1687.method_18456().parallelStream().filter(e -> {
            return e != this.mc.field_1724;
        }).noneMatch(p -> {
            return this.mc.field_1724.method_5858(p) <= squaredDistance;
        })) {
            return;
        }
        double above = this.activatesAbove.getValue();
        int floor = (int) Math.floor(above);
        for (int i = 1; i <= floor; i++) {
            if (!this.mc.field_1687.method_8320(this.mc.field_1724.method_24515().method_10069(0, -i, 0)).method_26215()) {
                return;
            }
        }
        class_243 playerPos = this.mc.field_1724.method_73189();
        class_2338 playerBlockPos = new class_2338((int) playerPos.field_1352, ((int) playerPos.field_1351) - ((int) above), (int) playerPos.field_1350);
        if (!this.mc.field_1687.method_8320(new class_2338(playerBlockPos)).method_26215()) {
            return;
        }
        List<class_1511> crystals = nearbyCrystals();
        ArrayList<class_243> pos = new ArrayList<>();
        crystals.forEach(e2 -> {
            pos.add(e2.method_73189());
        });
        if (this.predictCrystals.getValue()) {
            Stream<class_2338> s = BlockUtils.getAllInBoxStream(this.mc.field_1724.method_24515().method_10069(-6, -8, -6), this.mc.field_1724.method_24515().method_10069(6, 2, 6)).filter(e3 -> {
                return this.mc.field_1687.method_8320(e3).method_26204() == class_2246.field_10540 || this.mc.field_1687.method_8320(e3).method_26204() == class_2246.field_9987;
            }).filter(CrystalUtils::canPlaceCrystalClient);
            if (this.checkAim.getValue()) {
                if (this.checkItems.getValue()) {
                    s = s.filter(this::arePeopleAimingAtBlockAndHoldingCrystals);
                } else {
                    s = s.filter(this::arePeopleAimingAtBlock);
                }
            }
            s.forEachOrdered(e4 -> {
                pos.add(class_243.method_24955(e4).method_1031(0.0d, 1.0d, 0.0d));
            });
        }
        for (class_243 crys : pos) {
            double damage = DamageUtils.crystalDamage(this.mc.field_1724, crys);
            if (damage >= this.mc.field_1724.method_6032() + this.mc.field_1724.method_6067()) {
                InventoryUtils.selectItemFromHotbar(class_1802.field_8288);
                return;
            }
        }
    }

    private List<class_1511> nearbyCrystals() {
        class_243 pos = this.mc.field_1724.method_73189();
        return this.mc.field_1687.method_8390(class_1511.class, new class_238(pos.method_1031(-6.0d, -6.0d, -6.0d), pos.method_1031(6.0d, 6.0d, 6.0d)), e -> {
            return true;
        });
    }

    private boolean arePeopleAimingAtBlock(class_2338 block) {
        class_243[] eyesPos = new class_243[1];
        class_3965[] hitResult = new class_3965[1];
        return this.mc.field_1687.method_18456().parallelStream().filter(e -> {
            return e != this.mc.field_1724;
        }).anyMatch(e2 -> {
            eyesPos[0] = RotationUtils.getEyesPos(e2);
            hitResult[0] = this.mc.field_1687.method_17742(new class_3959(eyesPos[0], eyesPos[0].method_1019(RotationUtils.getPlayerLookVec(e2).method_1021(4.5d)), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, e2));
            return hitResult[0] != null && hitResult[0].method_17777().equals(block);
        });
    }

    private boolean arePeopleAimingAtBlockAndHoldingCrystals(class_2338 block) {
        class_243[] eyesPos = new class_243[1];
        class_3965[] hitResult = new class_3965[1];
        return this.mc.field_1687.method_18456().parallelStream().filter(e -> {
            return e != this.mc.field_1724;
        }).filter(e2 -> {
            return e2.method_24518(class_1802.field_8301);
        }).anyMatch(e3 -> {
            eyesPos[0] = RotationUtils.getEyesPos(e3);
            hitResult[0] = this.mc.field_1687.method_17742(new class_3959(eyesPos[0], eyesPos[0].method_1019(RotationUtils.getPlayerLookVec(e3).method_1021(4.5d)), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, e3));
            return hitResult[0] != null && hitResult[0].method_17777().equals(block);
        });
    }
}
