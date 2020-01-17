package io.codegen.wi.suwiml.stax.brpdossierpersoonleefsituatiebvv_v0100;

import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.AanvraagPersoon;
import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.AanvraagPersoonResponse;
import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.MeldingType;
import io.codegen.wi.suwiml.stax.util.Util;
import java.lang.String;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public final class BRPDossierPersoonLeefsituatieBVV_v0100Transformer {
  public static AanvraagPersoon readAanvraagPersoon(XMLStreamReader reader) throws
      XMLStreamException {
    Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonLeefsituatieBVV/v0100}AanvraagPersoon"));
    return AanvraagPersoonTransformer.read(reader);
  }

  public static void writeAanvraagPersoon(XMLStreamWriter writer, AanvraagPersoon value,
      String messageId, String from, String to) throws XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonLeefsituatieBVV-v0100/AanvraagPersoon", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonLeefsituatieBVV/v0100", "AanvraagPersoon", "smls");
    AanvraagPersoonTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  public static AanvraagPersoonResponse readAanvraagPersoonResponse(XMLStreamReader reader) throws
      XMLStreamException {
    Util.consumeUntilBody(reader);
    if (Util.isSOAPFault(reader)) {
      Util.consumeUntilFaultDetail(reader);
      Util.validateStartElement(reader, new QName("http://bkwi.nl/SuwiML/FWI/v0205", "Fout"));
      MeldingType fault = MeldingTypeTransformer.read(reader);
      return AanvraagPersoonResponse.newBuilder()
        .setFWI(AanvraagPersoonResponse.FWI.newBuilder()
          .addFout(fault)
          .build())
        .build();
    } else {
      Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonLeefsituatieBVV/v0100}AanvraagPersoonResponse"));
      return AanvraagPersoonResponseTransformer.read(reader);
    }
  }

  public static void writeAanvraagPersoonResponse(XMLStreamWriter writer,
      AanvraagPersoonResponse value, String messageId, String from, String to) throws
      XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonLeefsituatieBVV-v0100/AanvraagPersoonResponse", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonLeefsituatieBVV/v0100", "AanvraagPersoonResponse", "smls");
    AanvraagPersoonResponseTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  static final class AanvraagPersoonTransformer {
    public static AanvraagPersoon read(XMLStreamReader reader) throws XMLStreamException {
      QName parent = reader.getName();
      AanvraagPersoon.Builder builder = AanvraagPersoon.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "Burgerservicenr":
              builder.setBurgerservicenr(Util.readElementText(reader));
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

    public static void write(XMLStreamWriter writer, AanvraagPersoon value) throws
        XMLStreamException {
      Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
    }
  }

  static final class AanvraagPersoonResponseTransformer {
    public static AanvraagPersoonResponse read(XMLStreamReader reader) throws XMLStreamException {
      QName parent = reader.getName();
      AanvraagPersoonResponse.Builder builder = AanvraagPersoonResponse.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "Schuldenaar":
              builder.setSchuldenaar(SchuldenaarTransformer.read(reader));
              break;
            case "{http://bkwi.nl/SuwiML/FWI/v0205}FWI":
              builder.setFWI(FWITransformer.read(reader));
              break;
            case "{http://bkwi.nl/SuwiML/FWI/v0205}NietsGevonden":
              Util.readElementText(reader);
              builder.setNietsGevonden(true);
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

    public static void write(XMLStreamWriter writer, AanvraagPersoonResponse value) throws
        XMLStreamException {
      if (value.hasSchuldenaar()) {
        Util.writeStartElement(writer, "Schuldenaar");
        SchuldenaarTransformer.write(writer, value.getSchuldenaar());
        Util.writeEndElement(writer);
      }
      if (value.hasFWI()) {
        Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/FWI/v0205", "FWI", "fwi");
        FWITransformer.write(writer, value.getFWI());
        Util.writeEndElement(writer);
      }
      if (value.getNietsGevonden()) {
        Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/FWI/v0205", "NietsGevonden", "fwi");
        Util.writeEndElement(writer);
      }
    }

    static final class SchuldenaarTransformer {
      public static AanvraagPersoonResponse.Schuldenaar read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        AanvraagPersoonResponse.Schuldenaar.Builder builder = AanvraagPersoonResponse.Schuldenaar.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
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
              case "CdBrpGegevensGeheim":
                builder.setCdBrpGegevensGeheim(Util.readElementText(reader));
                break;
              case "OnderzoekGegPersoon":
                builder.setOnderzoekGegPersoon(OnderzoekGegTypeTransformer.read(reader));
                break;
              case "DomicilieAdres":
                builder.setDomicilieAdres(StraatadresBrpTypeTransformer.read(reader));
                break;
              case "Correspondentieadres":
                builder.setCorrespondentieadres(StraatadresBrpTypeTransformer.read(reader));
                break;
              case "FeitelijkAdresBuitenland":
                builder.setFeitelijkAdresBuitenland(FeitelijkAdresBuitenlandTransformer.read(reader));
                break;
              case "OnderzoekGegVerblijfplaats":
                builder.setOnderzoekGegVerblijfplaats(OnderzoekGegTypeTransformer.read(reader));
                break;
              case "Overlijden":
                builder.setOverlijden(OverlijdenTypeTransformer.read(reader));
                break;
              case "Ouder1":
                builder.setOuder1(Ouder1TypeTransformer.read(reader));
                break;
              case "Ouder2":
                builder.setOuder2(Ouder2TypeTransformer.read(reader));
                break;
              case "Huwelijk":
                builder.addHuwelijk(HuwelijkTypeTransformer.read(reader));
                break;
              case "Kind":
                builder.addKind(KindTypeTransformer.read(reader));
                break;
              case "OverigeInwonende":
                builder.addOverigeInwonende(OverigeInwonendeTransformer.read(reader));
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

      public static void write(XMLStreamWriter writer, AanvraagPersoonResponse.Schuldenaar value)
          throws XMLStreamException {
        Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
        Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
        Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
        Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
        Util.writeElement(writer, "CdBrpGegevensGeheim", value.getCdBrpGegevensGeheim());
        if (value.hasOnderzoekGegPersoon()) {
          Util.writeStartElement(writer, "OnderzoekGegPersoon");
          OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegPersoon());
          Util.writeEndElement(writer);
        }
        if (value.hasDomicilieAdres()) {
          Util.writeStartElement(writer, "DomicilieAdres");
          StraatadresBrpTypeTransformer.write(writer, value.getDomicilieAdres());
          Util.writeEndElement(writer);
        }
        if (value.hasCorrespondentieadres()) {
          Util.writeStartElement(writer, "Correspondentieadres");
          StraatadresBrpTypeTransformer.write(writer, value.getCorrespondentieadres());
          Util.writeEndElement(writer);
        }
        if (value.hasFeitelijkAdresBuitenland()) {
          Util.writeStartElement(writer, "FeitelijkAdresBuitenland");
          FeitelijkAdresBuitenlandTransformer.write(writer, value.getFeitelijkAdresBuitenland());
          Util.writeEndElement(writer);
        }
        if (value.hasOnderzoekGegVerblijfplaats()) {
          Util.writeStartElement(writer, "OnderzoekGegVerblijfplaats");
          OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegVerblijfplaats());
          Util.writeEndElement(writer);
        }
        if (value.hasOverlijden()) {
          Util.writeStartElement(writer, "Overlijden");
          OverlijdenTypeTransformer.write(writer, value.getOverlijden());
          Util.writeEndElement(writer);
        }
        if (value.hasOuder1()) {
          Util.writeStartElement(writer, "Ouder1");
          Ouder1TypeTransformer.write(writer, value.getOuder1());
          Util.writeEndElement(writer);
        }
        if (value.hasOuder2()) {
          Util.writeStartElement(writer, "Ouder2");
          Ouder2TypeTransformer.write(writer, value.getOuder2());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getHuwelijkCount(); i++) {
          Util.writeStartElement(writer, "Huwelijk");
          HuwelijkTypeTransformer.write(writer, value.getHuwelijk(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getKindCount(); i++) {
          Util.writeStartElement(writer, "Kind");
          KindTypeTransformer.write(writer, value.getKind(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getOverigeInwonendeCount(); i++) {
          Util.writeStartElement(writer, "OverigeInwonende");
          OverigeInwonendeTransformer.write(writer, value.getOverigeInwonende(i));
          Util.writeEndElement(writer);
        }
      }

      static final class FeitelijkAdresBuitenlandTransformer {
        public static AanvraagPersoonResponse.Schuldenaar.FeitelijkAdresBuitenland read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.Schuldenaar.FeitelijkAdresBuitenland.Builder builder = AanvraagPersoonResponse.Schuldenaar.FeitelijkAdresBuitenland.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DatBAdresBuitenland":
                  builder.setDatBAdresBuitenland(Util.readElementText(reader));
                  break;
                case "LandAdresBuitenland":
                  builder.setLandAdresBuitenland(Util.readElementText(reader));
                  break;
                case "Adresregel1Buitenland":
                  builder.setAdresregel1Buitenland(Util.readElementText(reader));
                  break;
                case "Adresregel2Buitenland":
                  builder.setAdresregel2Buitenland(Util.readElementText(reader));
                  break;
                case "Adresregel3Buitenland":
                  builder.setAdresregel3Buitenland(Util.readElementText(reader));
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

        public static void write(XMLStreamWriter writer,
            AanvraagPersoonResponse.Schuldenaar.FeitelijkAdresBuitenland value) throws
            XMLStreamException {
          Util.writeElement(writer, "DatBAdresBuitenland", value.getDatBAdresBuitenland());
          Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
          Util.writeElement(writer, "Adresregel1Buitenland", value.getAdresregel1Buitenland());
          Util.writeElement(writer, "Adresregel2Buitenland", value.getAdresregel2Buitenland());
          Util.writeElement(writer, "Adresregel3Buitenland", value.getAdresregel3Buitenland());
        }
      }

      static final class OverigeInwonendeTransformer {
        public static AanvraagPersoonResponse.Schuldenaar.OverigeInwonende read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.Schuldenaar.OverigeInwonende.Builder builder = AanvraagPersoonResponse.Schuldenaar.OverigeInwonende.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
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
                case "CdBrpGegevensGeheim":
                  builder.setCdBrpGegevensGeheim(Util.readElementText(reader));
                  break;
                case "OnderzoekGegPersoon":
                  builder.setOnderzoekGegPersoon(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "Ouder1":
                  builder.setOuder1(Ouder1TypeTransformer.read(reader));
                  break;
                case "Ouder2":
                  builder.setOuder2(Ouder2TypeTransformer.read(reader));
                  break;
                case "Huwelijk":
                  builder.addHuwelijk(HuwelijkTypeTransformer.read(reader));
                  break;
                case "Kind":
                  builder.addKind(KindTypeTransformer.read(reader));
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

        public static void write(XMLStreamWriter writer,
            AanvraagPersoonResponse.Schuldenaar.OverigeInwonende value) throws XMLStreamException {
          Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
          Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
          Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
          Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
          Util.writeElement(writer, "CdBrpGegevensGeheim", value.getCdBrpGegevensGeheim());
          if (value.hasOnderzoekGegPersoon()) {
            Util.writeStartElement(writer, "OnderzoekGegPersoon");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegPersoon());
            Util.writeEndElement(writer);
          }
          if (value.hasOuder1()) {
            Util.writeStartElement(writer, "Ouder1");
            Ouder1TypeTransformer.write(writer, value.getOuder1());
            Util.writeEndElement(writer);
          }
          if (value.hasOuder2()) {
            Util.writeStartElement(writer, "Ouder2");
            Ouder2TypeTransformer.write(writer, value.getOuder2());
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getHuwelijkCount(); i++) {
            Util.writeStartElement(writer, "Huwelijk");
            HuwelijkTypeTransformer.write(writer, value.getHuwelijk(i));
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getKindCount(); i++) {
            Util.writeStartElement(writer, "Kind");
            KindTypeTransformer.write(writer, value.getKind(i));
            Util.writeEndElement(writer);
          }
        }
      }
    }

    static final class FWITransformer {
      public static AanvraagPersoonResponse.FWI read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        AanvraagPersoonResponse.FWI.Builder builder = AanvraagPersoonResponse.FWI.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "Fout":
                builder.addFout(MeldingTypeTransformer.read(reader));
                break;
              case "Waarschuwing":
                builder.addWaarschuwing(MeldingTypeTransformer.read(reader));
                break;
              case "Informatie":
                builder.addInformatie(MeldingTypeTransformer.read(reader));
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

      public static void write(XMLStreamWriter writer, AanvraagPersoonResponse.FWI value) throws
          XMLStreamException {
        for (int i = 0; i < value.getFoutCount(); i++) {
          Util.writeStartElement(writer, "Fout");
          MeldingTypeTransformer.write(writer, value.getFout(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getWaarschuwingCount(); i++) {
          Util.writeStartElement(writer, "Waarschuwing");
          MeldingTypeTransformer.write(writer, value.getWaarschuwing(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getInformatieCount(); i++) {
          Util.writeStartElement(writer, "Informatie");
          MeldingTypeTransformer.write(writer, value.getInformatie(i));
          Util.writeEndElement(writer);
        }
      }
    }
  }
}
