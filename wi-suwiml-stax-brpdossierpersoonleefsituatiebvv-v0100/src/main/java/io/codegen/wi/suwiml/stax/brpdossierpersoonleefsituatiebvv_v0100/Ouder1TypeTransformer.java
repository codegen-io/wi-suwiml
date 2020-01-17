package io.codegen.wi.suwiml.stax.brpdossierpersoonleefsituatiebvv_v0100;

import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.Ouder1Type;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class Ouder1TypeTransformer {
  public static Ouder1Type read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    Ouder1Type.Builder builder = Ouder1Type.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "Burgerservicenr":
            builder.setBurgerservicenr(Util.readElementText(reader));
            break;
          case "OnderzoekGegOuder1":
            builder.setOnderzoekGegOuder1(OnderzoekGegTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, Ouder1Type value) throws XMLStreamException {
    Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
    if (value.hasOnderzoekGegOuder1()) {
      Util.writeStartElement(writer, "OnderzoekGegOuder1");
      OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegOuder1());
      Util.writeEndElement(writer);
    }
  }
}
