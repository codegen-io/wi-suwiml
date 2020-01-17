package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.BVVHerzieneBerekeningBeslagleggerInfo;
import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.BVVHerzieneBerekeningBeslagleggerInfoResponse;
import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.MeldingType;
import io.codegen.wi.suwiml.stax.util.Util;
import java.lang.String;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public final class BVVHerzieneBerekeningBeslaglegger_v0100Transformer {
  public static BVVHerzieneBerekeningBeslagleggerInfo readBVVHerzieneBerekeningBeslagleggerInfo(
      XMLStreamReader reader) throws XMLStreamException {
    Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BVVHerzieneBerekeningBeslaglegger/v0100}BVVHerzieneBerekeningBeslagleggerInfo"));
    return BVVHerzieneBerekeningBeslagleggerInfoTransformer.read(reader);
  }

  public static void writeBVVHerzieneBerekeningBeslagleggerInfo(XMLStreamWriter writer,
      BVVHerzieneBerekeningBeslagleggerInfo value, String messageId, String from, String to) throws
      XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BVVHerzieneBerekeningBeslaglegger-v0100/BVVHerzieneBerekeningBeslagleggerInfo", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BVVHerzieneBerekeningBeslaglegger/v0100", "BVVHerzieneBerekeningBeslagleggerInfo", "smls");
    BVVHerzieneBerekeningBeslagleggerInfoTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  public static BVVHerzieneBerekeningBeslagleggerInfoResponse readBVVHerzieneBerekeningBeslagleggerInfoResponse(
      XMLStreamReader reader) throws XMLStreamException {
    Util.consumeUntilBody(reader);
    if (Util.isSOAPFault(reader)) {
      Util.consumeUntilFaultDetail(reader);
      Util.validateStartElement(reader, new QName("http://bkwi.nl/SuwiML/FWI/v0205", "Fout"));
      MeldingType fault = MeldingTypeTransformer.read(reader);
      return BVVHerzieneBerekeningBeslagleggerInfoResponse.newBuilder()
        .setFWI(BVVHerzieneBerekeningBeslagleggerInfoResponse.FWI.newBuilder()
          .addFout(fault)
          .build())
        .build();
    } else {
      Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BVVHerzieneBerekeningBeslaglegger/v0100}BVVHerzieneBerekeningBeslagleggerInfoResponse"));
      return BVVHerzieneBerekeningBeslagleggerInfoResponseTransformer.read(reader);
    }
  }

  public static void writeBVVHerzieneBerekeningBeslagleggerInfoResponse(XMLStreamWriter writer,
      BVVHerzieneBerekeningBeslagleggerInfoResponse value, String messageId, String from, String to)
      throws XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BVVHerzieneBerekeningBeslaglegger-v0100/BVVHerzieneBerekeningBeslagleggerInfoResponse", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BVVHerzieneBerekeningBeslaglegger/v0100", "BVVHerzieneBerekeningBeslagleggerInfoResponse", "smls");
    BVVHerzieneBerekeningBeslagleggerInfoResponseTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  static final class BVVHerzieneBerekeningBeslagleggerInfoTransformer {
    public static BVVHerzieneBerekeningBeslagleggerInfo read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      BVVHerzieneBerekeningBeslagleggerInfo.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.newBuilder();
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
            case "CorrectieGegevensBrpOpgaveBp":
              builder.setCorrectieGegevensBrpOpgaveBp(CorrectieGegevensBrpOpgaveBpTransformer.read(reader));
              break;
            case "CorrectieInkomstengegevensUwvOpgaveBp":
              builder.setCorrectieInkomstengegevensUwvOpgaveBp(CorrectieInkomstengegevensUwvOpgaveBpTransformer.read(reader));
              break;
            case "CorrectieInkomstengegevensPartnerUwvOpgaveBp":
              builder.setCorrectieInkomstengegevensPartnerUwvOpgaveBp(CorrectieInkomstengegevensPartnerUwvOpgaveBpTransformer.read(reader));
              break;
            case "MeeInBerekeningInkomstenOpgaveBp":
              builder.setMeeInBerekeningInkomstenOpgaveBp(MeeInBerekeningInkomstenOpgaveBpTransformer.read(reader));
              break;
            case "PartnerBvvOpgaveBp":
              builder.setPartnerBvvOpgaveBp(PartnerBvvOpgaveBpTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, BVVHerzieneBerekeningBeslagleggerInfo value)
        throws XMLStreamException {
      Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
      Util.writeElement(writer, "DatAanvraagBvv", value.getDatAanvraagBvv());
      if (value.hasAanvullendeGegevensBvv()) {
        Util.writeStartElement(writer, "AanvullendeGegevensBvv");
        AanvullendeGegevensBvvTransformer.write(writer, value.getAanvullendeGegevensBvv());
        Util.writeEndElement(writer);
      }
      if (value.hasCorrectieGegevensBrpOpgaveBp()) {
        Util.writeStartElement(writer, "CorrectieGegevensBrpOpgaveBp");
        CorrectieGegevensBrpOpgaveBpTransformer.write(writer, value.getCorrectieGegevensBrpOpgaveBp());
        Util.writeEndElement(writer);
      }
      if (value.hasCorrectieInkomstengegevensUwvOpgaveBp()) {
        Util.writeStartElement(writer, "CorrectieInkomstengegevensUwvOpgaveBp");
        CorrectieInkomstengegevensUwvOpgaveBpTransformer.write(writer, value.getCorrectieInkomstengegevensUwvOpgaveBp());
        Util.writeEndElement(writer);
      }
      if (value.hasCorrectieInkomstengegevensPartnerUwvOpgaveBp()) {
        Util.writeStartElement(writer, "CorrectieInkomstengegevensPartnerUwvOpgaveBp");
        CorrectieInkomstengegevensPartnerUwvOpgaveBpTransformer.write(writer, value.getCorrectieInkomstengegevensPartnerUwvOpgaveBp());
        Util.writeEndElement(writer);
      }
      if (value.hasMeeInBerekeningInkomstenOpgaveBp()) {
        Util.writeStartElement(writer, "MeeInBerekeningInkomstenOpgaveBp");
        MeeInBerekeningInkomstenOpgaveBpTransformer.write(writer, value.getMeeInBerekeningInkomstenOpgaveBp());
        Util.writeEndElement(writer);
      }
      if (value.hasPartnerBvvOpgaveBp()) {
        Util.writeStartElement(writer, "PartnerBvvOpgaveBp");
        PartnerBvvOpgaveBpTransformer.write(writer, value.getPartnerBvvOpgaveBp());
        Util.writeEndElement(writer);
      }
    }

    static final class AanvullendeGegevensBvvTransformer {
      public static BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "AanvullendKenmerkBvv":
                builder.setAanvullendKenmerkBvv(AanvullendKenmerkBvvTransformer.read(reader));
                break;
              case "LeefsituatieBvvOpgaveBp":
                builder.setLeefsituatieBvvOpgaveBp(LeefsituatieBvvOpgaveBpTransformer.read(reader));
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
          BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv value) throws
          XMLStreamException {
        if (value.hasAanvullendKenmerkBvv()) {
          Util.writeStartElement(writer, "AanvullendKenmerkBvv");
          AanvullendKenmerkBvvTransformer.write(writer, value.getAanvullendKenmerkBvv());
          Util.writeEndElement(writer);
        }
        if (value.hasLeefsituatieBvvOpgaveBp()) {
          Util.writeStartElement(writer, "LeefsituatieBvvOpgaveBp");
          LeefsituatieBvvOpgaveBpTransformer.write(writer, value.getLeefsituatieBvvOpgaveBp());
          Util.writeEndElement(writer);
        }
      }

      static final class AanvullendKenmerkBvvTransformer {
        public static BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.newBuilder();
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
            BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv value)
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
          public static BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrKostenVerzorgingVerpleging value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrWoonlastenTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.AanvullendKenmerkBvv.BedrWoonlasten value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }
      }

      static final class LeefsituatieBvvOpgaveBpTransformer {
        public static BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.LeefsituatieBvvOpgaveBp read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.LeefsituatieBvvOpgaveBp.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.LeefsituatieBvvOpgaveBp.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "CdLeefvormBvv":
                  builder.setCdLeefvormBvv(Util.readElementText(reader));
                  break;
                case "IndTenLasteKomendKind":
                  builder.setIndTenLasteKomendKind(Util.readElementText(reader));
                  break;
                case "IndGeldigNedWoonadres":
                  builder.setIndGeldigNedWoonadres(Util.readElementText(reader));
                  break;
                case "LandAdresBuitenland":
                  builder.setLandAdresBuitenland(Util.readElementText(reader));
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
            BVVHerzieneBerekeningBeslagleggerInfo.AanvullendeGegevensBvv.LeefsituatieBvvOpgaveBp value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdLeefvormBvv", value.getCdLeefvormBvv());
          Util.writeElement(writer, "IndTenLasteKomendKind", value.getIndTenLasteKomendKind());
          Util.writeElement(writer, "IndGeldigNedWoonadres", value.getIndGeldigNedWoonadres());
          Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
        }
      }
    }

    static final class CorrectieGegevensBrpOpgaveBpTransformer {
      public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "Schuldenaar":
                builder.setSchuldenaar(SchuldenaarTransformer.read(reader));
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
          BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp value) throws
          XMLStreamException {
        if (value.hasSchuldenaar()) {
          Util.writeStartElement(writer, "Schuldenaar");
          SchuldenaarTransformer.write(writer, value.getSchuldenaar());
          Util.writeEndElement(writer);
        }
      }

      static final class SchuldenaarTransformer {
        public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.newBuilder();
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
                case "Burgerservicenr":
                  builder.setBurgerservicenr(Util.readElementText(reader));
                  break;
                case "CdBrpGegevensGeheim":
                  builder.setCdBrpGegevensGeheim(Util.readElementText(reader));
                  break;
                case "DomicilieAdres":
                  builder.setDomicilieAdres(DomicilieAdresTransformer.read(reader));
                  break;
                case "Correspondentieadres":
                  builder.setCorrespondentieadres(CorrespondentieadresTransformer.read(reader));
                  break;
                case "FeitelijkAdresBuitenland":
                  builder.setFeitelijkAdresBuitenland(FeitelijkAdresBuitenlandTransformer.read(reader));
                  break;
                case "Huwelijk":
                  builder.addHuwelijk(HuwelijkTransformer.read(reader));
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
            BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar value)
            throws XMLStreamException {
          Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
          Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
          Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
          Util.writeElement(writer, "CdBrpGegevensGeheim", value.getCdBrpGegevensGeheim());
          if (value.hasDomicilieAdres()) {
            Util.writeStartElement(writer, "DomicilieAdres");
            DomicilieAdresTransformer.write(writer, value.getDomicilieAdres());
            Util.writeEndElement(writer);
          }
          if (value.hasCorrespondentieadres()) {
            Util.writeStartElement(writer, "Correspondentieadres");
            CorrespondentieadresTransformer.write(writer, value.getCorrespondentieadres());
            Util.writeEndElement(writer);
          }
          if (value.hasFeitelijkAdresBuitenland()) {
            Util.writeStartElement(writer, "FeitelijkAdresBuitenland");
            FeitelijkAdresBuitenlandTransformer.write(writer, value.getFeitelijkAdresBuitenland());
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getHuwelijkCount(); i++) {
            Util.writeStartElement(writer, "Huwelijk");
            HuwelijkTransformer.write(writer, value.getHuwelijk(i));
            Util.writeEndElement(writer);
          }
        }

        static final class DomicilieAdresTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.DomicilieAdres read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.DomicilieAdres.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.DomicilieAdres.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "Postcd":
                    builder.setPostcd(Util.readElementText(reader));
                    break;
                  case "Woonplaatsnaam":
                    builder.setWoonplaatsnaam(Util.readElementText(reader));
                    break;
                  case "Straatnaam":
                    builder.setStraatnaam(Util.readElementText(reader));
                    break;
                  case "Huisnr":
                    builder.setHuisnr(Util.readElementText(reader));
                    break;
                  case "Huisletter":
                    builder.setHuisletter(Util.readElementText(reader));
                    break;
                  case "Huisnrtoevoeging":
                    builder.setHuisnrtoevoeging(Util.readElementText(reader));
                    break;
                  case "AanduidingBijHuisnr":
                    builder.setAanduidingBijHuisnr(Util.readElementText(reader));
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
              BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.DomicilieAdres value)
              throws XMLStreamException {
            Util.writeElement(writer, "Postcd", value.getPostcd());
            Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
            Util.writeElement(writer, "Straatnaam", value.getStraatnaam());
            Util.writeElement(writer, "Huisnr", value.getHuisnr());
            Util.writeElement(writer, "Huisletter", value.getHuisletter());
            Util.writeElement(writer, "Huisnrtoevoeging", value.getHuisnrtoevoeging());
            Util.writeElement(writer, "AanduidingBijHuisnr", value.getAanduidingBijHuisnr());
          }
        }

        static final class CorrespondentieadresTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Correspondentieadres read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Correspondentieadres.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Correspondentieadres.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "Postcd":
                    builder.setPostcd(Util.readElementText(reader));
                    break;
                  case "Woonplaatsnaam":
                    builder.setWoonplaatsnaam(Util.readElementText(reader));
                    break;
                  case "Straatnaam":
                    builder.setStraatnaam(Util.readElementText(reader));
                    break;
                  case "Huisnr":
                    builder.setHuisnr(Util.readElementText(reader));
                    break;
                  case "Huisletter":
                    builder.setHuisletter(Util.readElementText(reader));
                    break;
                  case "Huisnrtoevoeging":
                    builder.setHuisnrtoevoeging(Util.readElementText(reader));
                    break;
                  case "AanduidingBijHuisnr":
                    builder.setAanduidingBijHuisnr(Util.readElementText(reader));
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
              BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Correspondentieadres value)
              throws XMLStreamException {
            Util.writeElement(writer, "Postcd", value.getPostcd());
            Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
            Util.writeElement(writer, "Straatnaam", value.getStraatnaam());
            Util.writeElement(writer, "Huisnr", value.getHuisnr());
            Util.writeElement(writer, "Huisletter", value.getHuisletter());
            Util.writeElement(writer, "Huisnrtoevoeging", value.getHuisnrtoevoeging());
            Util.writeElement(writer, "AanduidingBijHuisnr", value.getAanduidingBijHuisnr());
          }
        }

        static final class FeitelijkAdresBuitenlandTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatBAdresBuitenland", value.getDatBAdresBuitenland());
            Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
            Util.writeElement(writer, "Adresregel1Buitenland", value.getAdresregel1Buitenland());
            Util.writeElement(writer, "Adresregel2Buitenland", value.getAdresregel2Buitenland());
            Util.writeElement(writer, "Adresregel3Buitenland", value.getAdresregel3Buitenland());
          }
        }

        static final class HuwelijkTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "Partner":
                    builder.setPartner(PartnerTransformer.read(reader));
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
              BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk value)
              throws XMLStreamException {
            if (value.hasPartner()) {
              Util.writeStartElement(writer, "Partner");
              PartnerTransformer.write(writer, value.getPartner());
              Util.writeEndElement(writer);
            }
          }

          static final class PartnerTransformer {
            public static BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner.newBuilder();
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

            public static void write(XMLStreamWriter writer,
                BVVHerzieneBerekeningBeslagleggerInfo.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner value)
                throws XMLStreamException {
              Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
            }
          }
        }
      }
    }

    static final class MeeInBerekeningInkomstenOpgaveBpTransformer {
      public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.newBuilder();
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
                builder.setBedrBelastbaarJaarinkomen(BedrBelastbaarJaarinkomenTransformer.read(reader));
                break;
              case "BedrNettoMaandinkomen":
                builder.setBedrNettoMaandinkomen(BedrNettoMaandinkomenTransformer.read(reader));
                break;
              case "Inkomstenopgave":
                builder.addInkomstenopgave(InkomstenopgaveTransformer.read(reader));
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
          BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp value) throws
          XMLStreamException {
        Util.writeElement(writer, "DatBIndicatieperiode", value.getDatBIndicatieperiode());
        Util.writeElement(writer, "DatEIndicatieperiode", value.getDatEIndicatieperiode());
        if (value.hasBedrBelastbaarJaarinkomen()) {
          Util.writeStartElement(writer, "BedrBelastbaarJaarinkomen");
          BedrBelastbaarJaarinkomenTransformer.write(writer, value.getBedrBelastbaarJaarinkomen());
          Util.writeEndElement(writer);
        }
        if (value.hasBedrNettoMaandinkomen()) {
          Util.writeStartElement(writer, "BedrNettoMaandinkomen");
          BedrNettoMaandinkomenTransformer.write(writer, value.getBedrNettoMaandinkomen());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getInkomstenopgaveCount(); i++) {
          Util.writeStartElement(writer, "Inkomstenopgave");
          InkomstenopgaveTransformer.write(writer, value.getInkomstenopgave(i));
          Util.writeEndElement(writer);
        }
      }

      static final class BedrBelastbaarJaarinkomenTransformer {
        public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrBelastbaarJaarinkomen read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrBelastbaarJaarinkomen.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrBelastbaarJaarinkomen.newBuilder();
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
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrBelastbaarJaarinkomen value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrNettoMaandinkomenTransformer {
        public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrNettoMaandinkomen read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrNettoMaandinkomen.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrNettoMaandinkomen.newBuilder();
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
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.BedrNettoMaandinkomen value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class InkomstenopgaveTransformer {
        public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.newBuilder();
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
                  builder.setBedrLoonLbPremieVolksverz(BedrLoonLbPremieVolksverzTransformer.read(reader));
                  break;
                case "BedrIngehoudenLbPremieVolksverz":
                  builder.setBedrIngehoudenLbPremieVolksverz(BedrIngehoudenLbPremieVolksverzTransformer.read(reader));
                  break;
                case "BedrVakantietoeslag":
                  builder.setBedrVakantietoeslag(BedrVakantietoeslagTransformer.read(reader));
                  break;
                case "BedrOpgbRechtVakantietoeslag":
                  builder.setBedrOpgbRechtVakantietoeslag(BedrOpgbRechtVakantietoeslagTransformer.read(reader));
                  break;
                case "BedrExtraPrdSalaris":
                  builder.setBedrExtraPrdSalaris(BedrExtraPrdSalarisTransformer.read(reader));
                  break;
                case "BedrOpgbRechtExtraPrdSalaris":
                  builder.setBedrOpgbRechtExtraPrdSalaris(BedrOpgbRechtExtraPrdSalarisTransformer.read(reader));
                  break;
                case "BedrIngehoudenBijdrageZvw":
                  builder.setBedrIngehoudenBijdrageZvw(BedrIngehoudenBijdrageZvwTransformer.read(reader));
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
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave value)
            throws XMLStreamException {
          Util.writeElement(writer, "DatBIko", value.getDatBIko());
          Util.writeElement(writer, "DatEIko", value.getDatEIko());
          if (value.hasBedrLoonLbPremieVolksverz()) {
            Util.writeStartElement(writer, "BedrLoonLbPremieVolksverz");
            BedrLoonLbPremieVolksverzTransformer.write(writer, value.getBedrLoonLbPremieVolksverz());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrIngehoudenLbPremieVolksverz()) {
            Util.writeStartElement(writer, "BedrIngehoudenLbPremieVolksverz");
            BedrIngehoudenLbPremieVolksverzTransformer.write(writer, value.getBedrIngehoudenLbPremieVolksverz());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrVakantietoeslag()) {
            Util.writeStartElement(writer, "BedrVakantietoeslag");
            BedrVakantietoeslagTransformer.write(writer, value.getBedrVakantietoeslag());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrOpgbRechtVakantietoeslag()) {
            Util.writeStartElement(writer, "BedrOpgbRechtVakantietoeslag");
            BedrOpgbRechtVakantietoeslagTransformer.write(writer, value.getBedrOpgbRechtVakantietoeslag());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrExtraPrdSalaris()) {
            Util.writeStartElement(writer, "BedrExtraPrdSalaris");
            BedrExtraPrdSalarisTransformer.write(writer, value.getBedrExtraPrdSalaris());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrOpgbRechtExtraPrdSalaris()) {
            Util.writeStartElement(writer, "BedrOpgbRechtExtraPrdSalaris");
            BedrOpgbRechtExtraPrdSalarisTransformer.write(writer, value.getBedrOpgbRechtExtraPrdSalaris());
            Util.writeEndElement(writer);
          }
          if (value.hasBedrIngehoudenBijdrageZvw()) {
            Util.writeStartElement(writer, "BedrIngehoudenBijdrageZvw");
            BedrIngehoudenBijdrageZvwTransformer.write(writer, value.getBedrIngehoudenBijdrageZvw());
            Util.writeEndElement(writer);
          }
        }

        static final class BedrLoonLbPremieVolksverzTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrIngehoudenLbPremieVolksverzTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrVakantietoeslagTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrVakantietoeslag read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrVakantietoeslag.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrVakantietoeslag.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrVakantietoeslag value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrOpgbRechtVakantietoeslagTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrExtraPrdSalarisTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrOpgbRechtExtraPrdSalarisTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrIngehoudenBijdrageZvwTransformer {
          public static BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw.Builder builder = BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw.newBuilder();
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
              BVVHerzieneBerekeningBeslagleggerInfo.MeeInBerekeningInkomstenOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw value)
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

  static final class BVVHerzieneBerekeningBeslagleggerInfoResponseTransformer {
    public static BVVHerzieneBerekeningBeslagleggerInfoResponse read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      BVVHerzieneBerekeningBeslagleggerInfoResponse.Builder builder = BVVHerzieneBerekeningBeslagleggerInfoResponse.newBuilder();
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
        BVVHerzieneBerekeningBeslagleggerInfoResponse value) throws XMLStreamException {
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
      public static BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar.Builder builder = BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar.newBuilder();
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
          BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar value) throws
          XMLStreamException {
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
        public static BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv.Builder builder = BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv.newBuilder();
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
            BVVHerzieneBerekeningBeslagleggerInfoResponse.Schuldenaar.BerekeningBvv value) throws
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
      public static BVVHerzieneBerekeningBeslagleggerInfoResponse.FWI read(XMLStreamReader reader)
          throws XMLStreamException {
        QName parent = reader.getName();
        BVVHerzieneBerekeningBeslagleggerInfoResponse.FWI.Builder builder = BVVHerzieneBerekeningBeslagleggerInfoResponse.FWI.newBuilder();
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
          BVVHerzieneBerekeningBeslagleggerInfoResponse.FWI value) throws XMLStreamException {
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
