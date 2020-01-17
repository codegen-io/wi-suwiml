package io.codegen.wi.suwiml.stax.brpdossierpersoonleefsituatiebvv_v0100;

import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.KindType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class KindTypeTransformer {
  public static KindType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    KindType.Builder builder = KindType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "Geboortedat":
            builder.setGeboortedat(Util.readElementText(reader));
            break;
          case "Burgerservicenr":
            builder.setBurgerservicenr(Util.readElementText(reader));
            break;
          case "OnderzoekGegKind":
            builder.setOnderzoekGegKind(OnderzoekGegTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, KindType value) throws XMLStreamException {
    Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
    Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
    if (value.hasOnderzoekGegKind()) {
      Util.writeStartElement(writer, "OnderzoekGegKind");
      OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegKind());
      Util.writeEndElement(writer);
    }
  }
}
