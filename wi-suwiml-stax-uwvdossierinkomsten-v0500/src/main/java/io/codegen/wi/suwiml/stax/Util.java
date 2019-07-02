package io.codegen.wi.suwiml.stax;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public class Util {
    private static final String SOAP_1_1_NAMESPACE = "http://schemas.xmlsoap.org/soap/envelope/";
    private static final String SOAP_1_1_PREFIX = "soap";

    private static final String WSA_NAMESPACE = "http://www.w3.org/2005/08/addressing";
    private static final String WSA_PREFIX = "wsa";
    private static final String WSA_ANONYMOUS = "http://www.w3.org/2005/08/addressing/anonymous";

    private static final QName SOAP_1_1_ENVELOPE = new QName(SOAP_1_1_NAMESPACE, "Envelope", SOAP_1_1_PREFIX);
    private static final QName SOAP_1_1_HEADER = new QName(SOAP_1_1_NAMESPACE, "Header", SOAP_1_1_PREFIX);
    private static final QName SOAP_1_1_BODY = new QName(SOAP_1_1_NAMESPACE, "Body", SOAP_1_1_PREFIX);
    private static final QName SOAP_1_1_FAULT = new QName(SOAP_1_1_NAMESPACE, "Fault", SOAP_1_1_PREFIX);
    private static final QName SOAP_1_1_FAULT_DETAIL = new QName("detail");
    private static final QName WSA_ACTION = new QName(WSA_NAMESPACE, "Action", WSA_PREFIX);
    private static final QName WSA_FROM = new QName(WSA_NAMESPACE, "From", WSA_PREFIX);
    private static final QName WSA_TO = new QName(WSA_NAMESPACE, "To", WSA_PREFIX);
    private static final QName WSA_MESSAGE_ID = new QName(WSA_NAMESPACE, "MessageID", WSA_PREFIX);
    private static final QName WSA_REPLY_TO = new QName(WSA_NAMESPACE, "ReplyTo", WSA_PREFIX);
    private static final QName WSA_ADDRESS = new QName(WSA_NAMESPACE, "Address", WSA_PREFIX);

    private static volatile int namespacePrefixCounter = 0;

    public static final void writeStartElement(XMLStreamWriter writer, String namespaceURI, String localName)
            throws XMLStreamException {
        String prefix = writer.getPrefix(namespaceURI);
        if (prefix != null) {
            writer.writeStartElement(namespaceURI, localName);
        } else {
            if (XMLConstants.NULL_NS_URI.equals(namespaceURI)) {
                prefix = XMLConstants.DEFAULT_NS_PREFIX;
            } else {
                if (namespacePrefixCounter > 1000) {
                    namespacePrefixCounter = 0;
                }
                prefix = "s" + (namespacePrefixCounter++);
            }
            writer.writeStartElement(prefix, localName, namespaceURI);
            writer.writeNamespace(prefix, namespaceURI);
            writer.setPrefix(prefix, namespaceURI);
        }
    }

    public static final void writeElement(XMLStreamWriter writer, String namespaceURI, String localName, String prefix,
            String value) throws XMLStreamException {
        if (!value.isEmpty()) {
            writeStartElement(writer, namespaceURI, localName, prefix);
            writer.writeCharacters(value);
            writer.writeEndElement();
        }
    }

    public static final void writeElement(XMLStreamWriter writer, String namespaceURI, String localName, String value)
            throws XMLStreamException {
        if (!value.isEmpty()) {
            writeStartElement(writer, namespaceURI, localName);
            writer.writeCharacters(value);
            writer.writeEndElement();
        }
    }

    public static final void writeElement(XMLStreamWriter writer, String localName, String value) throws XMLStreamException {
        if (!value.isEmpty()) {
            writeStartElement(writer, XMLConstants.NULL_NS_URI, localName);
            writer.writeCharacters(value);
            writer.writeEndElement();
        }
    }

    public static final void writeStartElement(XMLStreamWriter writer, String localName) throws XMLStreamException {
        writeStartElement(writer, XMLConstants.NULL_NS_URI, localName);
    }

    public static final void writeStartElement(XMLStreamWriter writer, String namespaceURI, String localName, String prefix)
            throws XMLStreamException {
        String knownPrefix = writer.getPrefix(namespaceURI);
        if (knownPrefix != null) {
            writer.writeStartElement(namespaceURI, localName);
        } else {
            writer.writeStartElement(prefix, localName, namespaceURI);
            writer.writeNamespace(prefix, namespaceURI);
            writer.setPrefix(prefix, namespaceURI);
        }
    }

    public static final void writeEndElement(XMLStreamWriter writer) throws XMLStreamException {
        writer.writeEndElement();
    }

    public static final String readElementText(XMLStreamReader reader) throws XMLStreamException {
        QName name = reader.getName();
        String text = null;
        while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isWhiteSpace()) {
                // Skip whitespace
            } else if (reader.isCharacters()) {
                if (text == null) {
                    text = reader.getText();
                } else {
                    text = text + reader.getText();
                }
            } else if (reader.isEndElement()) {
                break;
            } else {
                throw new XMLStreamException("Unexpected event " + event, reader.getLocation());
            }
        }

        Util.validateEndElement(reader, name);

        return text == null ? "" : text;
    }

    public static final void validateStartElement(XMLStreamReader reader, QName expected) throws XMLStreamException {
        if (!reader.isStartElement()) {
            throw new XMLStreamException("Unexpected event " + reader.getEventType(), reader.getLocation());
        }

        if (!expected.equals(reader.getName())) {
            throw new XMLStreamException("Unexpected start element " + reader.getName() + ", expected " + expected,
                    reader.getLocation());
        }
    }

    public static final void validateEndElement(XMLStreamReader reader, QName expected) throws XMLStreamException {
        if (!reader.isEndElement()) {
            throw new XMLStreamException("Unexpected event " + reader.getEventType(), reader.getLocation());
        }

        if (!expected.equals(reader.getName())) {
            throw new XMLStreamException("Unexpected end element " + reader.getName() + ", expected " + expected,
                    reader.getLocation());
        }
    }

    public static final void consumeElement(XMLStreamReader reader) throws XMLStreamException {
        QName name = reader.getName();
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    consumeElement(reader);
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (!reader.getName().equals(name)) {
                        throw new XMLStreamException("Unexpected end element " + reader.getName() + ", expected " + name,
                                reader.getLocation());
                    }
                    return;
                case XMLStreamConstants.END_DOCUMENT:
                    throw new XMLStreamException("Unexpected end of document, expected " + name, reader.getLocation());
                default:
                    // Ignore all other events
            }
        }
    }

    public static final void consumeUntilBody(XMLStreamReader reader) throws XMLStreamException {
        if (!reader.isStartElement()) {
            // Proceed to the next element
            reader.nextTag();
        }

        if (!SOAP_1_1_ENVELOPE.equals(reader.getName())) {
            throw new XMLStreamException("Unexpected element " + reader.getName() + ", expected " + SOAP_1_1_ENVELOPE,
                    reader.getLocation());
        }

        // Proceed to the first child of the envelope
        reader.nextTag();

        if (SOAP_1_1_HEADER.equals(reader.getName())) {
            // Consume the whole header, we don't use it
            Util.consumeElement(reader);

            // Proceed to the second child of the envelope
            reader.nextTag();
        }

        if (!SOAP_1_1_BODY.equals(reader.getName())) {
            throw new XMLStreamException("Unexpected element " + reader.getName() + ", expected " + SOAP_1_1_BODY,
                    reader.getLocation());
        }

        // Proceed to the first child of the body
        reader.nextTag();
    }

    public static final boolean isSOAPFault(XMLStreamReader reader) throws XMLStreamException {
        return SOAP_1_1_FAULT.equals(reader.getName());
    }

    public static final void consumeUntilFaultDetail(XMLStreamReader reader) throws XMLStreamException {
        if (!SOAP_1_1_FAULT.equals(reader.getName())) {
            throw new XMLStreamException("Unexpected element " + reader.getName() + ", expected " + SOAP_1_1_FAULT,
                    reader.getLocation());
        }

        while (reader.hasNext()) {
            // Proceed to the first child of the fault
            reader.nextTag();

            if (reader.isEndElement()) {
                if (!SOAP_1_1_FAULT.equals(reader.getName())) {
                    throw new XMLStreamException("Unexpected end element " + reader.getName() + ", expected " + SOAP_1_1_FAULT,
                            reader.getLocation());
                }
                throw new XMLStreamException("No fault detail found in " + reader.getName(), reader.getLocation());
            }

            if (SOAP_1_1_FAULT_DETAIL.equals(reader.getName())) {
                // Proceed to the first child of the fault detail
                reader.nextTag();
                return;
            } else {
                Util.consumeElement(reader);
            }
        }

    }

    public static void writeSOAPEnvelope(XMLStreamWriter writer, String action, String messageId, String from, String to) throws XMLStreamException {
        writeStartElement(writer, SOAP_1_1_ENVELOPE.getNamespaceURI(), SOAP_1_1_ENVELOPE.getLocalPart(), SOAP_1_1_ENVELOPE.getPrefix());

        writeStartElement(writer, SOAP_1_1_HEADER.getNamespaceURI(), SOAP_1_1_HEADER.getLocalPart(), SOAP_1_1_HEADER.getPrefix());
        writer.writeNamespace(WSA_PREFIX, WSA_NAMESPACE);
        writeElement(writer, WSA_ACTION.getNamespaceURI(), WSA_ACTION.getLocalPart(), WSA_ACTION.getPrefix(), action);
        writeElement(writer, WSA_MESSAGE_ID.getNamespaceURI(), WSA_MESSAGE_ID.getLocalPart(), WSA_MESSAGE_ID.getPrefix(), messageId);
        writeElement(writer, WSA_TO.getNamespaceURI(), WSA_TO.getLocalPart(), WSA_TO.getPrefix(), to);

        writeStartElement(writer, WSA_FROM.getNamespaceURI(), WSA_FROM.getLocalPart(), WSA_FROM.getPrefix());
        writeElement(writer, WSA_ADDRESS.getNamespaceURI(), WSA_ADDRESS.getLocalPart(), WSA_ADDRESS.getPrefix(), from);
        writeEndElement(writer);

        writeStartElement(writer, WSA_REPLY_TO.getNamespaceURI(), WSA_REPLY_TO.getLocalPart(), WSA_REPLY_TO.getPrefix());
        writeElement(writer, WSA_ADDRESS.getNamespaceURI(), WSA_ADDRESS.getLocalPart(), WSA_ADDRESS.getPrefix(), WSA_ANONYMOUS);
        writeEndElement(writer);

        writeEndElement(writer);

        writeStartElement(writer, SOAP_1_1_BODY.getNamespaceURI(), SOAP_1_1_BODY.getLocalPart(), SOAP_1_1_BODY.getPrefix());
    }

}
