package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.InkomstenopgaveType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class InkomstenopgaveTypeTransformer {
  public static InkomstenopgaveType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    InkomstenopgaveType.Builder builder = InkomstenopgaveType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "DatBIko":
            builder.setDatBIko(Util.readElementText(reader));
            break;
          case "DatEIko":
            builder.setDatEIko(Util.readElementText(reader));
            break;
          case "BedrLoonLbPremieVolksverz":
            builder.setBedrLoonLbPremieVolksverz(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrIngehoudenLbPremieVolksverz":
            builder.setBedrIngehoudenLbPremieVolksverz(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrVakantietoeslag":
            builder.setBedrVakantietoeslag(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrOpgbRechtVakantietoeslag":
            builder.setBedrOpgbRechtVakantietoeslag(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrExtraPrdSalaris":
            builder.setBedrExtraPrdSalaris(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrOpgbRechtExtraPrdSalaris":
            builder.setBedrOpgbRechtExtraPrdSalaris(StandaardBedrTypeTransformer.read(reader));
            break;
          case "BedrIngehoudenBijdrageZvw":
            builder.setBedrIngehoudenBijdrageZvw(StandaardBedrTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, InkomstenopgaveType value) throws
      XMLStreamException {
    Util.writeElement(writer, "DatBIko", value.getDatBIko());
    Util.writeElement(writer, "DatEIko", value.getDatEIko());
    if (value.hasBedrLoonLbPremieVolksverz()) {
      Util.writeStartElement(writer, "BedrLoonLbPremieVolksverz");
      StandaardBedrTypeTransformer.write(writer, value.getBedrLoonLbPremieVolksverz());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrIngehoudenLbPremieVolksverz()) {
      Util.writeStartElement(writer, "BedrIngehoudenLbPremieVolksverz");
      StandaardBedrTypeTransformer.write(writer, value.getBedrIngehoudenLbPremieVolksverz());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrVakantietoeslag()) {
      Util.writeStartElement(writer, "BedrVakantietoeslag");
      StandaardBedrTypeTransformer.write(writer, value.getBedrVakantietoeslag());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrOpgbRechtVakantietoeslag()) {
      Util.writeStartElement(writer, "BedrOpgbRechtVakantietoeslag");
      StandaardBedrTypeTransformer.write(writer, value.getBedrOpgbRechtVakantietoeslag());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrExtraPrdSalaris()) {
      Util.writeStartElement(writer, "BedrExtraPrdSalaris");
      StandaardBedrTypeTransformer.write(writer, value.getBedrExtraPrdSalaris());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrOpgbRechtExtraPrdSalaris()) {
      Util.writeStartElement(writer, "BedrOpgbRechtExtraPrdSalaris");
      StandaardBedrTypeTransformer.write(writer, value.getBedrOpgbRechtExtraPrdSalaris());
      Util.writeEndElement(writer);
    }
    if (value.hasBedrIngehoudenBijdrageZvw()) {
      Util.writeStartElement(writer, "BedrIngehoudenBijdrageZvw");
      StandaardBedrTypeTransformer.write(writer, value.getBedrIngehoudenBijdrageZvw());
      Util.writeEndElement(writer);
    }
  }
}
