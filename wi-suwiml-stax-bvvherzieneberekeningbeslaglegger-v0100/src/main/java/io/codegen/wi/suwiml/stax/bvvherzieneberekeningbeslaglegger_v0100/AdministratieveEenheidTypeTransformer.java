package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.AdministratieveEenheidType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class AdministratieveEenheidTypeTransformer {
  public static AdministratieveEenheidType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    AdministratieveEenheidType.Builder builder = AdministratieveEenheidType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "NaamAdministratieveEenheid":
            builder.setNaamAdministratieveEenheid(Util.readElementText(reader));
            break;
          case "Loonheffingennr":
            builder.setLoonheffingennr(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, AdministratieveEenheidType value) throws
      XMLStreamException {
    Util.writeElement(writer, "NaamAdministratieveEenheid", value.getNaamAdministratieveEenheid());
    Util.writeElement(writer, "Loonheffingennr", value.getLoonheffingennr());
  }
}
