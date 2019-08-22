package io.codegen.wi.suwiml.stax.brpdossierpersoongsd_v0101;

import io.codegen.wi.suwiml.proto.brpdossierpersoongsd_v0101.OuderType_1;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class OuderType_1Transformer {
  public static OuderType_1 read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    OuderType_1.Builder builder = OuderType_1.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "Voornamen":
            builder.setVoornamen(Util.readElementText(reader));
            break;
          case "Voorvoegsel":
            builder.setVoorvoegsel(Util.readElementText(reader));
            break;
          case "SignificantDeelVanDeAchternaam":
            builder.setSignificantDeelVanDeAchternaam(Util.readElementText(reader));
            break;
          case "Geboortedat":
            builder.setGeboortedat(Util.readElementText(reader));
            break;
          case "Burgerservicenr":
            builder.setBurgerservicenr(Util.readElementText(reader));
            break;
          case "ANr":
            builder.setANr(Util.readElementText(reader));
            break;
          case "Titulatuur":
            builder.setTitulatuur(TitulatuurTypeTransformer.read(reader));
            break;
          case "DatBFamilierechtelijkeBetrekking":
            builder.setDatBFamilierechtelijkeBetrekking(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, OuderType_1 value) throws XMLStreamException {
    Util.writeElement(writer, "Voornamen", value.getVoornamen());
    Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
    Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
    Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
    Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
    Util.writeElement(writer, "ANr", value.getANr());
    if (value.hasTitulatuur()) {
      Util.writeStartElement(writer, "Titulatuur");
      TitulatuurTypeTransformer.write(writer, value.getTitulatuur());
      Util.writeEndElement(writer);
    }
    Util.writeElement(writer, "DatBFamilierechtelijkeBetrekking", value.getDatBFamilierechtelijkeBetrekking());
    if (value.hasOnderzoekGegOuder1()) {
      Util.writeStartElement(writer, "OnderzoekGegOuder1");
      OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegOuder1());
      Util.writeEndElement(writer);
    }
  }
}
