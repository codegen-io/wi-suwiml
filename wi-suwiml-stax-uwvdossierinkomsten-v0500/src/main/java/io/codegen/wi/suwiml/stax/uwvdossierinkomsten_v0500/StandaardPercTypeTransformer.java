package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.StandaardPercType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class StandaardPercTypeTransformer {
  public static StandaardPercType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    StandaardPercType.Builder builder = StandaardPercType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "CdPositiefNegatief":
            builder.setCdPositiefNegatief(Util.readElementText(reader));
            break;
          case "Percentage":
            builder.setPercentage(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, StandaardPercType value) throws
      XMLStreamException {
    Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
    Util.writeElement(writer, "Percentage", value.getPercentage());
  }
}
