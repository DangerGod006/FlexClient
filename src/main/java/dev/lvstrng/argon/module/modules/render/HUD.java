package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.gui.ClickGui;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.TextRenderer;
import dev.lvstrng.argon.utils.Utils;
import java.awt.Color;
import java.util.List;
import java.util.Objects;
import net.minecraft.class_332;
import net.minecraft.class_640;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/HUD.class */
public final class HUD extends Module implements HudListener {
    private static final CharSequence argon = EncryptedString.of("DANGER |");
    private static final CharSequence ownerText = EncryptedString.of("Developed by DANGERxDEV");
    private final BooleanSetting info;
    private final BooleanSetting ownerInfo;
    private final BooleanSetting modules;

    public HUD() {
        super(EncryptedString.of("HUD"), EncryptedString.of("Renders the client version and enabled modules on the HUD"), -1, Category.RENDER);
        this.info = new BooleanSetting(EncryptedString.of("Info"), true);
        this.ownerInfo = new BooleanSetting(EncryptedString.of("Owner Info"), true).setDescription(EncryptedString.of("Shows 'Developed by DANGERxDEV' text in top left"));
        this.modules = new BooleanSetting("Modules", true).setDescription(EncryptedString.of("Renders module array list"));
        addSettings(this.info, this.ownerInfo, this.modules);
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
        String ping;
        class_640 entry;
        if (this.mc.field_1755 != Argon.INSTANCE.clickGui) {
            List<Module> enabledModules = Argon.INSTANCE.getModuleManager().getEnabledModules().stream().sorted((module1, module2) -> {
                CharSequence name1 = module1.getName();
                CharSequence name2 = module2.getName();
                int filteredLength1 = TextRenderer.getWidth(name1);
                int filteredLength2 = TextRenderer.getWidth(name2);
                return Integer.compare(filteredLength2, filteredLength1);
            }).toList();
            class_332 context = event.context;
            boolean customFont = ClickGUI.customFont.getValue();
            if (!(this.mc.field_1755 instanceof ClickGui)) {
                if (this.info.getValue() && this.mc.field_1724 != null) {
                    RenderUtils.unscaledProjection(context);
                    int argonOffset2 = 10 + TextRenderer.getWidth(argon);
                    String fps = "FPS: " + this.mc.method_47599() + " |";
                    String server = this.mc.method_1558() == null ? "None" : this.mc.method_1558().field_3761;
                    if (this.mc != null && this.mc.field_1724 != null && this.mc.method_1562() != null && (entry = this.mc.method_1562().method_2871(this.mc.field_1724.method_5667())) != null) {
                        ping = "Ping: " + entry.method_2959() + " |";
                    } else {
                        ping = "Ping: " + "N/A |";
                    }
                    RenderUtils.renderRoundedQuad(context, new Color(35, 35, 35, 255), 5.0d, 6.0d, argonOffset2 + TextRenderer.getWidth(fps) + TextRenderer.getWidth(ping) + TextRenderer.getWidth(server) + 35, 30.0d, 5.0d, 15.0d);
                    TextRenderer.drawString(argon, context, 10, 12, Utils.getMainColor(255, 4).getRGB());
                    int argonOffset = 10 + TextRenderer.getWidth(argon);
                    TextRenderer.drawString(fps, context, argonOffset + 10, 12, Utils.getMainColor(255, 3).getRGB());
                    TextRenderer.drawString(ping, context, argonOffset + 10 + TextRenderer.getWidth(fps) + 10, 12, Utils.getMainColor(255, 2).getRGB());
                    TextRenderer.drawString(server, context, argonOffset + 10 + TextRenderer.getWidth(fps) + TextRenderer.getWidth(ping) + 20, 12, Utils.getMainColor(255, 1).getRGB());
                    RenderUtils.scaledProjection(context);
                }
                if (this.ownerInfo.getValue() && this.mc.field_1724 != null) {
                    RenderUtils.unscaledProjection(context);
                    int screenW = this.mc.method_22683().method_4480();
                    int textW = TextRenderer.getWidth(ownerText);
                    int tx = (screenW - textW) - 14;
                    RenderUtils.renderRoundedQuad(context, new Color(35, 35, 35, 200), tx - 6, 12 - 6, tx + textW + 6, 12 + 24, 5.0d, 10.0d);
                    TextRenderer.drawString(ownerText, context, tx + 1, 12 + 1, new Color(0, 0, 0, 160).getRGB());
                    TextRenderer.drawString(ownerText, context, tx, 12, Utils.getMainColor(255, 0).getRGB());
                    RenderUtils.scaledProjection(context);
                }
                if (this.modules.getValue()) {
                    int offset = 55;
                    for (Module module : enabledModules) {
                        RenderUtils.unscaledProjection(context);
                        int charOffset = 6 + TextRenderer.getWidth(module.getName());
                        Objects.requireNonNull(this.mc.field_1772);
                        RenderUtils.renderRoundedQuad(context, new Color(0, 0, 0, 175), 0.0d, offset - 4, charOffset + 5, (offset + (9 * 2)) - 1, 0.0d, 0.0d, 0.0d, 5.0d, 10.0d);
                        Objects.requireNonNull(this.mc.field_1772);
                        context.method_25296(0, offset - 4, 2, offset + (9 * 2), Utils.getMainColor(255, enabledModules.indexOf(module)).getRGB(), Utils.getMainColor(255, enabledModules.indexOf(module) + 1).getRGB());
                        int charOffset2 = customFont ? 5 : 8;
                        TextRenderer.drawString(module.getName(), context, charOffset2, offset + (customFont ? 1 : 0), Utils.getMainColor(255, enabledModules.indexOf(module)).getRGB());
                        Objects.requireNonNull(this.mc.field_1772);
                        offset += (9 * 2) + 3;
                        RenderUtils.scaledProjection(context);
                    }
                }
            }
        }
    }
}
