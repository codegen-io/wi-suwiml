package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.InkomstenType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class InkomstenTypeTransformer {
  public static InkomstenType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    InkomstenType.Builder builder = InkomstenType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "Inkomstenverhouding":
            builder.addInkomstenverhouding(InkomstenverhoudingTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, InkomstenType value) throws XMLStreamException {
    for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
      Util.writeStartElement(writer, "Inkomstenverhouding");
      InkomstenverhoudingTypeTransformer.write(writer, value.getInkomstenverhouding(i));
      Util.writeEndElement(writer);
    }
  }
}
