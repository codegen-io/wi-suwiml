package io.codegen.wi.suwiml.stax.brpdossierpersoonleefsituatiebvv_v0100;

import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.HuwelijkType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class HuwelijkTypeTransformer {
  public static HuwelijkType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    HuwelijkType.Builder builder = HuwelijkType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "DatHuwelijkssluiting":
            builder.setDatHuwelijkssluiting(Util.readElementText(reader));
            break;
          case "OnderzoekGegHuwelijk":
            builder.setOnderzoekGegHuwelijk(OnderzoekGegTypeTransformer.read(reader));
            break;
          case "Partner":
            builder.setPartner(PartnerTypeTransformer.read(reader));
            break;
          case "DatOntbindingHuwelijk":
            builder.setDatOntbindingHuwelijk(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, HuwelijkType value) throws XMLStreamException {
    Util.writeElement(writer, "DatHuwelijkssluiting", value.getDatHuwelijkssluiting());
    if (value.hasOnderzoekGegHuwelijk()) {
      Util.writeStartElement(writer, "OnderzoekGegHuwelijk");
      OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegHuwelijk());
      Util.writeEndElement(writer);
    }
    if (value.hasPartner()) {
      Util.writeStartElement(writer, "Partner");
      PartnerTypeTransformer.write(writer, value.getPartner());
      Util.writeEndElement(writer);
    }
    Util.writeElement(writer, "DatOntbindingHuwelijk", value.getDatOntbindingHuwelijk());
  }
}
