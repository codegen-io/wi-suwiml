package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.SzWetType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class SzWetTypeTransformer {
  public static SzWetType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    SzWetType.Builder builder = SzWetType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "CdSzWet":
            builder.setCdSzWet(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, SzWetType value) throws XMLStreamException {
    Util.writeElement(writer, "CdSzWet", value.getCdSzWet());
  }
}
