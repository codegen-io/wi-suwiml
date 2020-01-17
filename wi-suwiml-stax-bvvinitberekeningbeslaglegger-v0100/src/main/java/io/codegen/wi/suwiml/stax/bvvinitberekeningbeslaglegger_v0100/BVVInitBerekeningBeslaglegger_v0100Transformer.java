package io.codegen.wi.suwiml.stax.bvvinitberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvinitberekeningbeslaglegger_v0100.BVVInitBerekeningBeslagleggerInfo;
import io.codegen.wi.suwiml.proto.bvvinitberekeningbeslaglegger_v0100.BVVInitBerekeningBeslagleggerInfoResponse;
import io.codegen.wi.suwiml.proto.bvvinitberekeningbeslaglegger_v0100.MeldingType;
import io.codegen.wi.suwiml.stax.util.Util;
import java.lang.String;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public final class BVVInitBerekeningBeslaglegger_v0100Transformer {
  public static BVVInitBerekeningBeslagleggerInfo readBVVInitBerekeningBeslagleggerInfo(
      XMLStreamReader reader) throws XMLStreamException {
    Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BVVInitBerekeningBeslaglegger/v0100}BVVInitBerekeningBeslagleggerInfo"));
    return BVVInitBerekeningBeslagleggerInfoTransformer.read(reader);
  }

  public static void writeBVVInitBerekeningBeslagleggerInfo(XMLStreamWriter writer,
      BVVInitBerekeningBeslagleggerInfo value, String messageId, String from, String to) throws
      XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BVVInitBerekeningBeslaglegger-v0100/BVVInitBerekeningBeslagleggerInfo", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BVVInitBerekeningBeslaglegger/v0100", "BVVInitBerekeningBeslagleggerInfo", "smls");
    BVVInitBerekeningBeslagleggerInfoTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  public static BVVInitBerekeningBeslagleggerInfoResponse readBVVInitBerekeningBeslagleggerInfoResponse(
      XMLStreamReader reader) throws XMLStreamException {
    Util.consumeUntilBody(reader);
    if (Util.isSOAPFault(reader)) {
      Util.consumeUntilFaultDetail(reader);
      Util.validateStartElement(reader, new QName("http://bkwi.nl/SuwiML/FWI/v0205", "Fout"));
      MeldingType fault = MeldingTypeTransformer.read(reader);
      return BVVInitBerekeningBeslagleggerInfoResponse.newBuilder()
        .setFWI(BVVInitBerekeningBeslagleggerInfoResponse.FWI.newBuilder()
          .addFout(fault)
          .build())
        .build();
    } else {
      Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BVVInitBerekeningBeslaglegger/v0100}BVVInitBerekeningBeslagleggerInfoResponse"));
      return BVVInitBerekeningBeslagleggerInfoResponseTransformer.read(reader);
    }
  }

  public static void writeBVVInitBerekeningBeslagleggerInfoResponse(XMLStreamWriter writer,
      BVVInitBerekeningBeslagleggerInfoResponse value, String messageId, String from, String to)
      throws XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BVVInitBerekeningBeslaglegger-v0100/BVVInitBerekeningBeslagleggerInfoResponse", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BVVInitBerekeningBeslaglegger/v0100", "BVVInitBerekeningBeslagleggerInfoResponse", "smls");
    BVVInitBerekeningBeslagleggerInfoResponseTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  static final class BVVInitBerekeningBeslagleggerInfoTransformer {
    public static BVVInitBerekeningBeslagleggerInfo read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      BVVInitBerekeningBeslagleggerInfo.Builder builder = BVVInitBerekeningBeslagleggerInfo.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "Burgerservicenr":
              builder.setBurgerservicenr(Util.readElementText(reader));
              break;
            case "DatAanvraagBvv":
              builder.setDatAanvraagBvv(Util.readElementText(reader));
              break;
            case "AanvullendeGegevensBvv":
              builder.setAanvullendeGegevensBvv(AanvullendeGegevensBvvTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, BVVInitBerekeningBeslagleggerInfo value) throws
        XMLStreamException {
      Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
      Util.writeElement(writer, "DatAanvraagBvv", value.getDatAanvraagBvv());
      if (value.hasAanvullendeGegevensBvv()) {
        Util.writeStartElement(writer, "AanvullendeGegevensBvv");
        AanvullendeGegevensBvvTransformer.write(writer, value.getAanvullendeGegevensBvv());
        Util.writeEndElement(writer);
      }
    }

    static final class AanvullendeGegevensBvvTransformer {
      public static BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.Builder builder = BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "AanvullendKenmerkBvv":
                builder.setAanvullendKenmerkBvv(AanvullendKenmerkBvvTransformer.read(reader));
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
          BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv value) throws
          XMLStreamException {
        if (value.hasAanvullendKenmerkBvv()) {
          Util.writeStartElement(writer, "AanvullendKenmerkBvv");
          AanvullendKenmerkBvvTransformer.write(writer, value.getAanvullendKenmerkBvv());
          Util.writeEndElement(writer);
        }
      }

      static final class AanvullendKenmerkBvvTransformer {
        public static BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.Builder builder = BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "IndVerblijfInInrichting":
                  builder.setIndVerblijfInInrichting(Util.readElementText(reader));
                  break;
                case "BedrKostenVerzorgingVerpleging":
                  builder.setBedrKostenVerzorgingVerpleging(BedrKostenVerzorgingVerplegingTransformer.read(reader));
                  break;
                case "CdSrtWoningBvv":
                  builder.setCdSrtWoningBvv(Util.readElementText(reader));
                  break;
                case "BedrWoonlasten":
                  builder.setBedrWoonlasten(BedrWoonlastenTransformer.read(reader));
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
            BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv value)
            throws XMLStreamException {
          Util.writeElement(writer, "IndVerblijfInInrichting", value.getIndVerblijfInInrichting());
          if (value.hasBedrKostenVerzorgingVerpleging()) {
            Util.writeStartElement(writer, "BedrKostenVerzorgingVerpleging");
            BedrKostenVerzorgingVerplegingTransformer.write(writer, value.getBedrKostenVerzorgingVerpleging());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "CdSrtWoningBvv", value.getCdSrtWoningBvv());
          if (value.hasBedrWoonlasten()) {
            Util.writeStartElement(writer, "BedrWoonlasten");
            BedrWoonlastenTransformer.write(writer, value.getBedrWoonlasten());
            Util.writeEndElement(writer);
          }
        }

        static final class BedrKostenVerzorgingVerplegingTransformer {
          public static BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging.Builder builder = BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging.newBuilder();
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

          public static void write(XMLStreamWriter writer,
              BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrWoonlastenTransformer {
          public static BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten.Builder builder = BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten.newBuilder();
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

          public static void write(XMLStreamWriter writer,
              BVVInitBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }
      }
    }
  }

  static final class BVVInitBerekeningBeslagleggerInfoResponseTransformer {
    public static BVVInitBerekeningBeslagleggerInfoResponse read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      BVVInitBerekeningBeslagleggerInfoResponse.Builder builder = BVVInitBerekeningBeslagleggerInfoResponse.newBuilder();
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

    public static void write(XMLStreamWriter writer,
        BVVInitBerekeningBeslagleggerInfoResponse value) throws XMLStreamException {
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
      public static BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar.Builder builder = BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "Burgerservicenr":
                builder.setBurgerservicenr(Util.readElementText(reader));
                break;
              case "DatBerekeningBvv":
                builder.setDatBerekeningBvv(Util.readElementText(reader));
                break;
              case "BerekeningBvv":
                builder.setBerekeningBvv(BerekeningBvvTransformer.read(reader));
                break;
              case "GrondslagenBvv":
                builder.setGrondslagenBvv(GrondslagenBvvTransformer.read(reader));
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
          BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar value) throws XMLStreamException {
        Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
        Util.writeElement(writer, "DatBerekeningBvv", value.getDatBerekeningBvv());
        if (value.hasBerekeningBvv()) {
          Util.writeStartElement(writer, "BerekeningBvv");
          BerekeningBvvTransformer.write(writer, value.getBerekeningBvv());
          Util.writeEndElement(writer);
        }
        if (value.hasGrondslagenBvv()) {
          Util.writeStartElement(writer, "GrondslagenBvv");
          GrondslagenBvvTransformer.write(writer, value.getGrondslagenBvv());
          Util.writeEndElement(writer);
        }
      }

      static final class BerekeningBvvTransformer {
        public static BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv.Builder builder = BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "BedrTotaalBelastbaarJaarinkomen":
                  builder.setBedrTotaalBelastbaarJaarinkomen(StandaardBedrTypeTransformer.read(reader));
                  break;
                case "BedrBasisBvvZonderCorrecties":
                  builder.setBedrBasisBvvZonderCorrecties(StandaardBedrTypeTransformer.read(reader));
                  break;
                case "BedrBasisBvvNaCorrectieWoonsituatie":
                  builder.setBedrBasisBvvNaCorrectieWoonsituatie(StandaardBedrTypeTransformer.read(reader));
                  break;
                case "BedrOphogingWoonlasten":
                  builder.setBedrOphogingWoonlasten(StandaardBedrTypeTransformer.read(reader));
                  break;
                case "ToegepasteWoonlandfactor":
                  builder.setToegepasteWoonlandfactor(Util.readElementText(reader));
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
            BVVInitBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv value) throws
            XMLStreamException {
          if (value.hasBedrTotaalBelastbaarJaarinkomen()) {
            Util.writeStartElement(writer, "BedrTotaalBelastbaarJaarinkomen");
            StandaardBedrTypeTransformer.write(writer, value.getBedrTotaalBelastbaarJaarinkomen());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrBasisBvvZonderCorrecties()) {
            Util.writeStartElement(writer, "BedrBasisBvvZonderCorrecties");
            StandaardBedrTypeTransformer.write(writer, value.getBedrBasisBvvZonderCorrecties());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrBasisBvvNaCorrectieWoonsituatie()) {
            Util.writeStartElement(writer, "BedrBasisBvvNaCorrectieWoonsituatie");
            StandaardBedrTypeTransformer.write(writer, value.getBedrBasisBvvNaCorrectieWoonsituatie());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrOphogingWoonlasten()) {
            Util.writeStartElement(writer, "BedrOphogingWoonlasten");
            StandaardBedrTypeTransformer.write(writer, value.getBedrOphogingWoonlasten());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "ToegepasteWoonlandfactor", value.getToegepasteWoonlandfactor());
        }
      }
    }

    static final class FWITransformer {
      public static BVVInitBerekeningBeslagleggerInfoResponse.FWI read(XMLStreamReader reader)
          throws XMLStreamException {
        QName parent = reader.getName();
        BVVInitBerekeningBeslagleggerInfoResponse.FWI.Builder builder = BVVInitBerekeningBeslagleggerInfoResponse.FWI.newBuilder();
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

      public static void write(XMLStreamWriter writer,
          BVVInitBerekeningBeslagleggerInfoResponse.FWI value) throws XMLStreamException {
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
