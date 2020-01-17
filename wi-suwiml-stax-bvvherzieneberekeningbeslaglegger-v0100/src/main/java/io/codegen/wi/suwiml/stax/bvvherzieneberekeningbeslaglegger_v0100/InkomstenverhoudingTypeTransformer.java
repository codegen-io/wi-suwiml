package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.InkomstenverhoudingType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class InkomstenverhoudingTypeTransformer {
  public static InkomstenverhoudingType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    InkomstenverhoudingType.Builder builder = InkomstenverhoudingType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "AdministratieveEenheid":
            builder.setAdministratieveEenheid(AdministratieveEenheidTypeTransformer.read(reader));
            break;
          case "Inkomstenperiode":
            builder.addInkomstenperiode(InkomstenperiodeTypeTransformer.read(reader));
            break;
          case "Inkomstenopgave":
            builder.addInkomstenopgave(InkomstenopgaveTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, InkomstenverhoudingType value) throws
      XMLStreamException {
    if (value.hasAdministratieveEenheid()) {
      Util.writeStartElement(writer, "AdministratieveEenheid");
      AdministratieveEenheidTypeTransformer.write(writer, value.getAdministratieveEenheid());
      Util.writeEndElement(writer);
    }
    for (int i = 0; i < value.getInkomstenperiodeCount(); i++) {
      Util.writeStartElement(writer, "Inkomstenperiode");
      InkomstenperiodeTypeTransformer.write(writer, value.getInkomstenperiode(i));
      Util.writeEndElement(writer);
    }
    for (int i = 0; i < value.getInkomstenopgaveCount(); i++) {
      Util.writeStartElement(writer, "Inkomstenopgave");
      InkomstenopgaveTypeTransformer.write(writer, value.getInkomstenopgave(i));
      Util.writeEndElement(writer);
    }
  }
}
