package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.renderer.FontRenderContext;
import com.github.weisj.jsvg.renderer.PaintContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasContext.class */
public interface HasContext extends HasPaintContext, HasFontContext, HasFontRenderContext, HasFillRule {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasContext$ByDelegate.class */
    public interface ByDelegate extends HasContext {
        @NotNull
        HasContext contextDelegate();

        @Override // com.github.weisj.jsvg.nodes.prototype.HasFillRule
        @NotNull
        default FillRule fillRule() {
            return contextDelegate().fillRule();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.HasFontContext
        @NotNull
        default Mutator<MeasurableFontSpec> fontSpec() {
            return contextDelegate().fontSpec();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.HasFontRenderContext
        @NotNull
        default FontRenderContext fontRenderContext() {
            return contextDelegate().fontRenderContext();
        }

        @Override // com.github.weisj.jsvg.nodes.prototype.HasPaintContext
        @NotNull
        default Mutator<PaintContext> paintContext() {
            return contextDelegate().paintContext();
        }
    }
}
