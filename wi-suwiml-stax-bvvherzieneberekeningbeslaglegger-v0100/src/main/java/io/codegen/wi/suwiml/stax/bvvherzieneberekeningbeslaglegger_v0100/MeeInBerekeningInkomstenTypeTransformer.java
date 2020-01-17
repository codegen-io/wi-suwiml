package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.MeeInBerekeningInkomstenType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class MeeInBerekeningInkomstenTypeTransformer {
  public static MeeInBerekeningInkomstenType read(XMLStreamReader reader) throws
      XMLStreamException {
    QName parent = reader.getName();
    MeeInBerekeningInkomstenType.Builder builder = MeeInBerekeningInkomstenType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "DatBIndicatieperiode":
            builder.setDatBIndicatieperiode(Util.readElementText(reader));
            break;
          case "DatEIndicatieperiode":
            builder.setDatEIndicatieperiode(Util.readElementText(reader));
            break;
          case "BedrBelastbaarJaarinkomen":
            builder.setBedrBelastbaarJaarinkomen(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrNettoMaandinkomen":
            builder.setBedrNettoMaandinkomen(StandaardBedrTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, MeeInBerekeningInkomstenType value) throws
      XMLStreamException {
    Util.writeElement(writer, "DatBIndicatieperiode", value.getDatBIndicatieperiode());
    Util.writeElement(writer, "DatEIndicatieperiode", value.getDatEIndicatieperiode());
    if (value.hasBedrBelastbaarJaarinkomen()) {
      Util.writeStartElement(writer, "BedrBelastbaarJaarinkomen");
      StandaardBedrTypeTransformer.write(writer, value.getBedrBelastbaarJaarinkomen());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrNettoMaandinkomen()) {
      Util.writeStartElement(writer, "BedrNettoMaandinkomen");
      StandaardBedrTypeTransformer.write(writer, value.getBedrNettoMaandinkomen());
      Util.writeEndElement(writer);
    }
    for (int i = 0; i < value.getInkomstenopgaveCount(); i++) {
      Util.writeStartElement(writer, "Inkomstenopgave");
      InkomstenopgaveTypeTransformer.write(writer, value.getInkomstenopgave(i));
      Util.writeEndElement(writer);
    }
  }
}
