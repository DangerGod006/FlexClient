package dev.lvstrng.argon.module.modules.client;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.ButtonListener;
import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.managers.FriendManager;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.TextRenderer;
import dev.lvstrng.argon.utils.WorldUtils;
import java.awt.Color;
import net.minecraft.class_1657;
import net.minecraft.class_332;
import net.minecraft.class_3966;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/client/Friends.class */
public final class Friends extends Module implements ButtonListener, AttackListener, HudListener {
    private final KeybindSetting addFriendKey;
    public final BooleanSetting antiAttack;
    public final BooleanSetting disableAimAssist;
    public final BooleanSetting friendStatus;
    private FriendManager manager;

    public Friends() {
        super(EncryptedString.of("Friends"), EncryptedString.of("This module makes it so you can't do certain stuff if you have a player friended!"), -1, Category.CLIENT);
        this.addFriendKey = new KeybindSetting(EncryptedString.of("Friend Key"), 2, false).setDescription(EncryptedString.of("Key to add/remove friends"));
        this.antiAttack = new BooleanSetting(EncryptedString.of("Anti-Attack"), false).setDescription(EncryptedString.of("Doesn't let you hit friends"));
        this.disableAimAssist = new BooleanSetting(EncryptedString.of("Anti-Aim"), false).setDescription(EncryptedString.of("Disables aim assist for friends"));
        this.friendStatus = new BooleanSetting(EncryptedString.of("Friend Status"), false).setDescription(EncryptedString.of("Tells you if you're aiming at a friend or not"));
        addSettings(this.addFriendKey, this.antiAttack, this.disableAimAssist, this.friendStatus);
        setKey(-1);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.manager = Argon.INSTANCE.getFriendManager();
        this.eventManager.add(ButtonListener.class, this);
        this.eventManager.add(AttackListener.class, this);
        this.eventManager.add(HudListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(ButtonListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        this.eventManager.remove(HudListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.ButtonListener
    public void onButtonPress(ButtonListener.ButtonEvent event) {
        if (this.mc.field_1724 == null || this.mc.field_1755 != null) {
            return;
        }
        class_3966 class_3966Var = this.mc.field_1765;
        if (class_3966Var instanceof class_3966) {
            class_3966 hitResult = class_3966Var;
            class_1657 class_1657VarMethod_17782 = hitResult.method_17782();
            if (class_1657VarMethod_17782 instanceof class_1657) {
                class_1657 player = class_1657VarMethod_17782;
                if (event.button == this.addFriendKey.getKey() && event.action == 1) {
                    if (!this.manager.isFriend(player)) {
                        this.manager.addFriend(player);
                    } else {
                        this.manager.removeFriend(player);
                    }
                }
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (this.antiAttack.getValue() && this.manager.isAimingOverFriend()) {
            event.cancel();
        }
    }

    @Override // dev.lvstrng.argon.event.events.HudListener
    public void onRenderHud(HudListener.HudEvent event) {
        if (!this.friendStatus.getValue()) {
            return;
        }
        class_332 context = event.context;
        RenderUtils.unscaledProjection(context);
        class_3966 hitResult = WorldUtils.getHitResult(100.0d);
        if (hitResult instanceof class_3966) {
            class_3966 hitResult2 = hitResult;
            class_1657 class_1657VarMethod_17782 = hitResult2.method_17782();
            if (class_1657VarMethod_17782 instanceof class_1657) {
                class_1657 player = class_1657VarMethod_17782;
                if (this.manager.isFriend(player)) {
                    TextRenderer.drawCenteredString(EncryptedString.of("Player is friend"), context, this.mc.method_22683().method_4480() / 2, (this.mc.method_22683().method_4507() / 2) + 25, Color.GREEN.getRGB());
                }
            }
        }
        RenderUtils.scaledProjection(context);
    }
}
