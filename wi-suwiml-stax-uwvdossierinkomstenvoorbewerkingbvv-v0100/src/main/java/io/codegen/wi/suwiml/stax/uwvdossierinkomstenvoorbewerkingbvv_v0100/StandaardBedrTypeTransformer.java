package io.codegen.wi.suwiml.stax.uwvdossierinkomstenvoorbewerkingbvv_v0100;

import io.codegen.wi.suwiml.proto.uwvdossierinkomstenvoorbewerkingbvv_v0100.StandaardBedrType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class StandaardBedrTypeTransformer {
  public static StandaardBedrType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    StandaardBedrType.Builder builder = StandaardBedrType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "CdMunteenheid":
            builder.setCdMunteenheid(Util.readElementText(reader));
            break;
          case "CdPositiefNegatief":
            builder.setCdPositiefNegatief(Util.readElementText(reader));
            break;
          case "WaardeBedr":
            builder.setWaardeBedr(Util.readElementText(reader));
            break;
          case "CdPeriodeEenheidGeldigheidBedr":
            builder.setCdPeriodeEenheidGeldigheidBedr(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, StandaardBedrType value) throws
      XMLStreamException {
    Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
    Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
    Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
    Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
  }
}
