package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.VoortzettingsrelatieType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class VoortzettingsrelatieTypeTransformer {
  public static VoortzettingsrelatieType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    VoortzettingsrelatieType.Builder builder = VoortzettingsrelatieType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "PercLoonsomOvergegaanInOpvolger":
            builder.setPercLoonsomOvergegaanInOpvolger(StandaardPercTypeTransformer.read(reader));
            break;
          case "DatVoortzettingsrelatie":
            builder.setDatVoortzettingsrelatie(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, VoortzettingsrelatieType value) throws
      XMLStreamException {
    if (value.hasPercLoonsomOvergegaanInOpvolger()) {
      Util.writeStartElement(writer, "PercLoonsomOvergegaanInOpvolger");
      StandaardPercTypeTransformer.write(writer, value.getPercLoonsomOvergegaanInOpvolger());
      Util.writeEndElement(writer);
    }
    Util.writeElement(writer, "DatVoortzettingsrelatie", value.getDatVoortzettingsrelatie());
    Util.writeElement(writer, "Loonheffingennr", value.getLoonheffingennr());
  }
}
