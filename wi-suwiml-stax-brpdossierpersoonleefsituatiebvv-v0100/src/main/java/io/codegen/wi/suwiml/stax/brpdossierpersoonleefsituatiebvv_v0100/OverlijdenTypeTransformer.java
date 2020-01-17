package io.codegen.wi.suwiml.stax.brpdossierpersoonleefsituatiebvv_v0100;

import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.OverlijdenType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class OverlijdenTypeTransformer {
  public static OverlijdenType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    OverlijdenType.Builder builder = OverlijdenType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "DatOverlijden":
            builder.setDatOverlijden(Util.readElementText(reader));
            break;
          case "OnderzoekGegOverlijden":
            builder.setOnderzoekGegOverlijden(OnderzoekGegTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, OverlijdenType value) throws XMLStreamException {
    Util.writeElement(writer, "DatOverlijden", value.getDatOverlijden());
    if (value.hasOnderzoekGegOverlijden()) {
      Util.writeStartElement(writer, "OnderzoekGegOverlijden");
      OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegOverlijden());
      Util.writeEndElement(writer);
    }
  }
}
