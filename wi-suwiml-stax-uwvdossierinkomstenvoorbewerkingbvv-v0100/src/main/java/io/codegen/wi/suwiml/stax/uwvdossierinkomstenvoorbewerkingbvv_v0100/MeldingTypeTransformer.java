package io.codegen.wi.suwiml.stax.uwvdossierinkomstenvoorbewerkingbvv_v0100;

import io.codegen.wi.suwiml.proto.uwvdossierinkomstenvoorbewerkingbvv_v0100.MeldingType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class MeldingTypeTransformer {
  public static MeldingType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    MeldingType.Builder builder = MeldingType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "Code":
            builder.setCode(Util.readElementText(reader));
            break;
          case "Tekst":
            builder.setTekst(Util.readElementText(reader));
            break;
          case "Detail":
            builder.addDetail(Util.readElementText(reader));
            break;
          case "Bron":
            builder.setBron(BronTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, MeldingType value) throws XMLStreamException {
    Util.writeElement(writer, "Code", value.getCode());
    Util.writeElement(writer, "Tekst", value.getTekst());
    for (int i = 0; i < value.getDetailCount(); i++) {
      Util.writeElement(writer, "Detail", value.getDetail(i));
    }
    if (value.hasBron()) {
      Util.writeStartElement(writer, "Bron");
      BronTypeTransformer.write(writer, value.getBron());
      Util.writeEndElement(writer);
    }
  }
}
