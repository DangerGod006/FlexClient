package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.SVGDocument;
import com.github.weisj.jsvg.attributes.AttributeParser;
import com.github.weisj.jsvg.nodes.SVG;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.Style;
import com.github.weisj.jsvg.nodes.Use;
import com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode;
import com.github.weisj.jsvg.parser.css.CssParser;
import com.github.weisj.jsvg.parser.css.StyleSheet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/SVGDocumentBuilder.class */
public final class SVGDocumentBuilder {
    private static final int MAX_USE_NESTING_DEPTH = 15;
    private final Map<String, Object> namedElements = new HashMap();
    private final List<Use> useElements = new ArrayList();
    private final List<Style> styleElements = new ArrayList();
    private final List<StyleSheet> styleSheets = new ArrayList();
    private final Deque<ParsedElement> currentNodeStack = new ArrayDeque();

    @NotNull
    private final ParserProvider parserProvider;

    @NotNull
    private final LoadHelper loadHelper;

    @NotNull
    private final NodeSupplier nodeSupplier;
    private ParsedElement rootNode;

    public SVGDocumentBuilder(@NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader, @NotNull NodeSupplier nodeSupplier) {
        this.parserProvider = parserProvider;
        this.loadHelper = new LoadHelper(new AttributeParser(parserProvider.createPaintParser()), resourceLoader);
        this.nodeSupplier = nodeSupplier;
    }

    public void startDocument() {
        if (this.rootNode != null) {
            throw new IllegalStateException("Document already started");
        }
    }

    public void endDocument() {
        if (this.rootNode == null) {
            throw new IllegalStateException("Document is empty");
        }
    }

    public boolean startElement(@NotNull String tagName, @NotNull Map<String, String> attributes) {
        ParsedElement parsedElementPeek;
        AttributeNode attributeNode;
        if (!this.currentNodeStack.isEmpty()) {
            parsedElementPeek = this.currentNodeStack.peek();
        } else {
            parsedElementPeek = null;
        }
        ParsedElement parentElement = parsedElementPeek;
        if (parentElement != null) {
            attributeNode = parentElement.attributeNode();
        } else {
            attributeNode = null;
        }
        AttributeNode parentAttributeNode = attributeNode;
        if (parentElement != null) {
            flushText(parentElement, true);
        }
        SVGNode newNode = this.nodeSupplier.create(tagName);
        if (newNode == null) {
            return false;
        }
        AttributeNode attributeNode2 = new AttributeNode(tagName, attributes, parentAttributeNode, this.namedElements, this.styleSheets, this.loadHelper);
        String id = attributes.get("id");
        ParsedElement parsedElement = new ParsedElement(id, attributeNode2, newNode);
        if (id != null && !this.namedElements.containsKey(id)) {
            this.namedElements.put(id, parsedElement);
        }
        if (parentElement != null) {
            parentElement.addChild(parsedElement);
        }
        if (this.rootNode == null) {
            this.rootNode = parsedElement;
        }
        if (parsedElement.node() instanceof Style) {
            this.styleElements.add((Style) parsedElement.node());
        }
        if (parsedElement.node() instanceof Use) {
            this.useElements.add((Use) parsedElement.node());
        }
        this.currentNodeStack.push(parsedElement);
        return true;
    }

    public void addTextContent(char[] characterData, int startOffset, int endOffset) {
        if (this.currentNodeStack.isEmpty()) {
            throw new IllegalStateException("Adding text content without a current node");
        }
        ParsedElement currentElement = this.currentNodeStack.peek();
        if (currentElement.characterDataParser == null) {
            return;
        }
        currentElement.characterDataParser.append(characterData, startOffset, endOffset);
    }

    public void endElement(@NotNull String tagName) {
        if (this.currentNodeStack.isEmpty()) {
            throw new IllegalStateException("No current node to end");
        }
        ParsedElement currentElement = this.currentNodeStack.pop();
        String currentNodeTagName = currentElement.attributeNode().tagName();
        if (!currentNodeTagName.equals(tagName)) {
            throw new IllegalStateException(String.format("Closing tag %s doesn't match current node %s)", tagName, currentNodeTagName));
        }
        flushText(currentElement, false);
    }

    private void flushText(@NotNull ParsedElement element, boolean segmentBreak) {
        if (element.characterDataParser != null && element.characterDataParser.canFlush(segmentBreak)) {
            element.node().addContent(element.characterDataParser.flush(segmentBreak));
        }
    }

    @NotNull
    public SVGDocument build() {
        if (this.rootNode == null) {
            throw new IllegalStateException("No root node");
        }
        processStyleSheets();
        DomProcessor preProcessor = this.parserProvider.createPreProcessor();
        if (preProcessor != null) {
            preProcessor.process(this.rootNode);
        }
        this.rootNode.build();
        DomProcessor postProcessor = this.parserProvider.createPostProcessor();
        if (postProcessor != null) {
            postProcessor.process(this.rootNode);
        }
        validateUseElements();
        return new SVGDocument((SVG) this.rootNode.node());
    }

    private void processStyleSheets() {
        if (this.styleElements.isEmpty()) {
            return;
        }
        CssParser cssParser = this.parserProvider.createCssParser();
        for (Style styleElement : this.styleElements) {
            styleElement.parseStyleSheet(cssParser);
            this.styleSheets.add(styleElement.styleSheet());
        }
    }

    private void validateUseElements() {
        if (this.useElements.isEmpty()) {
            return;
        }
        for (Use useElement : this.useElements) {
            checkNestingDepth(useElement, MAX_USE_NESTING_DEPTH);
        }
    }

    private void checkNestingDepth(@NotNull SVGNode node, int allowed_depth) {
        if (allowed_depth <= 0) {
            throw new IllegalStateException("Maximum nesting depth exceeded");
        }
        if (node instanceof Use) {
            SVGNode referenced = ((Use) node).referencedNode();
            if (referenced != null) {
                checkNestingDepth(referenced, allowed_depth - 1);
                return;
            }
            return;
        }
        if (node instanceof CommonRenderableContainerNode) {
            for (SVGNode child : ((CommonRenderableContainerNode) node).children()) {
                checkNestingDepth(child, allowed_depth);
            }
        }
    }
}
