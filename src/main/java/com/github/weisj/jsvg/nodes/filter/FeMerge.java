package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.GraphicsUtil;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeMerge.class */
@PermittedContent(anyOf = {FeMergeNode.class})
@ElementCategories({Category.FilterPrimitive})
public final class FeMerge extends ContainerNode implements FilterPrimitive {
    public static final String TAG = "feMerge";
    private FilterPrimitiveBase filterPrimitiveBase;
    private FilterChannelKey[] inputChannels;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.filterPrimitiveBase = new FilterPrimitiveBase(attributeNode);
        List<T> listChildrenOfType = childrenOfType(FeMergeNode.class);
        this.inputChannels = new FilterChannelKey[listChildrenOfType.size()];
        for (int i = 0; i < this.inputChannels.length; i++) {
            this.inputChannels[i] = ((FeMergeNode) listChildrenOfType.get(i)).inputChannel();
        }
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public boolean isValid() {
        return this.inputChannels.length > 0;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length x() {
        return this.filterPrimitiveBase.x;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length y() {
        return this.filterPrimitiveBase.y;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length width() {
        return this.filterPrimitiveBase.width;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    @NotNull
    public Length height() {
        return this.filterPrimitiveBase.height;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
        if (this.inputChannels.length == 0) {
            this.filterPrimitiveBase.saveLayoutResult(filterLayoutContext.resultChannels().get(DefaultFilterChannel.SourceGraphic), filterLayoutContext);
            return;
        }
        LayoutBounds result = filterLayoutContext.resultChannels().get(this.inputChannels[0]);
        for (int i = 1; i < this.inputChannels.length; i++) {
            LayoutBounds channelBounds = filterLayoutContext.resultChannels().get(this.inputChannels[i]);
            result = result.union(channelBounds);
        }
        this.filterPrimitiveBase.saveLayoutResult(result, filterLayoutContext);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
        if (this.inputChannels.length == 0) {
            this.filterPrimitiveBase.saveResult(this.filterPrimitiveBase.channel(DefaultFilterChannel.SourceGraphic, filterContext), filterContext);
            return;
        }
        Channel in = this.filterPrimitiveBase.channel(this.inputChannels[0], filterContext);
        Channel result = in;
        if (this.inputChannels.length > 1) {
            BufferedImage dst = in.toBufferedImageNonAliased(context);
            Graphics2D imgGraphics = GraphicsUtil.createGraphics(dst);
            for (int i = 1; i < this.inputChannels.length; i++) {
                Channel channel = this.filterPrimitiveBase.channel(this.inputChannels[i], filterContext);
                imgGraphics.drawImage(context.platformSupport().createImage(channel.producer()), (AffineTransform) null, context.platformSupport().imageObserver());
            }
            result = new ImageProducerChannel(dst.getSource());
        }
        this.filterPrimitiveBase.saveResult(result, filterContext);
    }
}
