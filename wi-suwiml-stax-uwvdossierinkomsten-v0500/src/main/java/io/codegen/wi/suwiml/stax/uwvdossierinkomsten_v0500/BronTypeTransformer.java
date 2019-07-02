package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import io.codegen.wi.suwiml.stax.Util;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.BronType;

final class BronTypeTransformer {
  public static BronType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    BronType.Builder builder = BronType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "DN":
            builder.setDN(Util.readElementText(reader));
            break;
          default:
            throw new XMLStreamException("Unexpected element " + child, reader.getLocation());
        }
      } else if (reader.isWhiteSpace() || reader.getEventType() == XMLStreamConstants.COMMENT) {
        // Ignore whitespace and comment
      } else if (reader.isEndElement()) {
        break;
      } else {
        throw new XMLStreamException("Unexpected event " + event, reader.getLocation());
      }
    }
    Util.validateEndElement(reader, parent);
    return builder.build();
  }

  public static void write(XMLStreamWriter writer, BronType value) throws XMLStreamException {
    Util.writeElement(writer, "DN", value.getDN());
  }
}
