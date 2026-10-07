package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.SVGDocument;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/StaxSVGLoader.class */
public final class StaxSVGLoader {
    private static final Logger LOGGER = Logger.getLogger(StaxSVGLoader.class.getName());
    private static final String SVG_NAMESPACE_URI = "http://www.w3.org/2000/svg";
    private static final String XLINK_NAMESPACE_URI = "http://www.w3.org/1999/xlink";

    @NotNull
    private final NodeSupplier nodeSupplier;

    @NotNull
    private final XMLInputFactory xmlInputFactory;

    public StaxSVGLoader(@NotNull NodeSupplier nodeSupplier) {
        this(nodeSupplier, createDefaultFactory());
    }

    @NotNull
    private static XMLInputFactory createDefaultFactory() {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        factory.setProperty("javax.xml.stream.supportDTD", false);
        factory.setProperty("javax.xml.stream.isReplacingEntityReferences", false);
        factory.setProperty("javax.xml.stream.isSupportingExternalEntities", false);
        return factory;
    }

    public StaxSVGLoader(@NotNull NodeSupplier nodeSupplier, @NotNull XMLInputFactory factory) {
        this.nodeSupplier = nodeSupplier;
        this.xmlInputFactory = factory;
    }

    @Nullable
    private XMLEventReader createReader(@Nullable InputStream inputStream) {
        try {
            return this.xmlInputFactory.createXMLEventReader(inputStream);
        } catch (XMLStreamException e) {
            LOGGER.log(Level.SEVERE, "Error while creating XMLEventReader.", e);
            return null;
        }
    }

    @Nullable
    public SVGDocument load(@Nullable InputStream inputStream, @NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader) throws XMLStreamException, IOException {
        XMLEventReader reader;
        if (inputStream == null || (reader = createReader(inputStream)) == null) {
            return null;
        }
        try {
            try {
                SVGDocumentBuilder builder = new SVGDocumentBuilder(parserProvider, resourceLoader, this.nodeSupplier);
                while (reader.hasNext()) {
                    XMLEvent event = reader.nextEvent();
                    switch (event.getEventType()) {
                        case 1:
                            StartElement element = event.asStartElement();
                            String uri = element.getName().getNamespaceURI();
                            if (uri != null && !uri.isEmpty() && !SVG_NAMESPACE_URI.equals(uri)) {
                                skipElement(reader);
                            } else {
                                Map<String, String> attributes = new HashMap<>();
                                element.getAttributes().forEachRemaining(attr -> {
                                    attributes.put(qualifiedName(attr.getName()), attr.getValue().trim());
                                });
                                if (!builder.startElement(qualifiedName(element.getName()), attributes)) {
                                    skipElement(reader);
                                }
                            }
                            break;
                        case 2:
                            builder.endElement(qualifiedName(event.asEndElement().getName()));
                            break;
                        case 4:
                        case 12:
                            char[] data = event.asCharacters().getData().toCharArray();
                            builder.addTextContent(data, 0, data.length);
                            break;
                        case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
                            builder.startDocument();
                            break;
                        case 8:
                            builder.endDocument();
                            break;
                    }
                }
                SVGDocument sVGDocumentBuild = builder.build();
                reader.close();
                inputStream.close();
                return sVGDocumentBuild;
            } catch (XMLStreamException e) {
                LOGGER.log(Level.SEVERE, "Error while parsing SVG.", e);
                reader.close();
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            reader.close();
            inputStream.close();
            throw th;
        }
    }

    private static void skipElement(@NotNull XMLEventReader reader) throws XMLStreamException {
        int elementCount = 1;
        while (reader.hasNext()) {
            XMLEvent event = reader.nextEvent();
            if (event.isStartElement()) {
                elementCount++;
            } else if (event.isEndElement()) {
                elementCount--;
            }
            if (elementCount == 0) {
                return;
            }
        }
    }

    private static String qualifiedName(@NotNull QName name) {
        String prefix = name.getPrefix();
        String localName = name.getLocalPart();
        if (prefix != null && !prefix.isEmpty() && !SVG_NAMESPACE_URI.equals(name.getNamespaceURI())) {
            return XLINK_NAMESPACE_URI.equals(name.getNamespaceURI()) ? "xlink:" + localName : prefix + ":" + localName;
        }
        return localName;
    }
}
