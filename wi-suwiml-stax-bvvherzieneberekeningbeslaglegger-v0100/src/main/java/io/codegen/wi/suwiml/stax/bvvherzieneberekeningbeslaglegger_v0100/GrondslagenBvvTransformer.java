package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.GrondslagenBvv;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class GrondslagenBvvTransformer {
  public static GrondslagenBvv read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    GrondslagenBvv.Builder builder = GrondslagenBvv.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "GrondslagLeefsituatieBvv":
            builder.setGrondslagLeefsituatieBvv(GrondslagLeefsituatieBvvTransformer.read(reader));
            break;
          case "GrondslagInkomstenBvv":
            builder.setGrondslagInkomstenBvv(GrondslagInkomstenBvvTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, GrondslagenBvv value) throws XMLStreamException {
    if (value.hasGrondslagLeefsituatieBvv()) {
      Util.writeStartElement(writer, "GrondslagLeefsituatieBvv");
      GrondslagLeefsituatieBvvTransformer.write(writer, value.getGrondslagLeefsituatieBvv());
      Util.writeEndElement(writer);
    }
    if (value.hasGrondslagInkomstenBvv()) {
      Util.writeStartElement(writer, "GrondslagInkomstenBvv");
      GrondslagInkomstenBvvTransformer.write(writer, value.getGrondslagInkomstenBvv());
      Util.writeEndElement(writer);
    }
  }

  static final class GrondslagLeefsituatieBvvTransformer {
    public static GrondslagenBvv.GrondslagLeefsituatieBvv read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      GrondslagenBvv.GrondslagLeefsituatieBvv.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "AfgeleidLeefsituatieBvv":
              builder.setAfgeleidLeefsituatieBvv(AfgeleidLeefsituatieBvvTransformer.read(reader));
              break;
            case "AanvullendKenmerkBvv":
              builder.setAanvullendKenmerkBvv(AanvullendKenmerkBvvTransformer.read(reader));
              break;
            case "CorrectieGegevensBrpOpgaveBp":
              builder.setCorrectieGegevensBrpOpgaveBp(CorrectieGegevensBrpOpgaveBpTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, GrondslagenBvv.GrondslagLeefsituatieBvv value)
        throws XMLStreamException {
      if (value.hasAfgeleidLeefsituatieBvv()) {
        Util.writeStartElement(writer, "AfgeleidLeefsituatieBvv");
        AfgeleidLeefsituatieBvvTransformer.write(writer, value.getAfgeleidLeefsituatieBvv());
        Util.writeEndElement(writer);
      }
      if (value.hasAanvullendKenmerkBvv()) {
        Util.writeStartElement(writer, "AanvullendKenmerkBvv");
        AanvullendKenmerkBvvTransformer.write(writer, value.getAanvullendKenmerkBvv());
        Util.writeEndElement(writer);
      }
      if (value.hasCorrectieGegevensBrpOpgaveBp()) {
        Util.writeStartElement(writer, "CorrectieGegevensBrpOpgaveBp");
        CorrectieGegevensBrpOpgaveBpTransformer.write(writer, value.getCorrectieGegevensBrpOpgaveBp());
        Util.writeEndElement(writer);
      }
    }

    static final class AfgeleidLeefsituatieBvvTransformer {
      public static GrondslagenBvv.GrondslagLeefsituatieBvv.AfgeleidLeefsituatieBvv read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        GrondslagenBvv.GrondslagLeefsituatieBvv.AfgeleidLeefsituatieBvv.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.AfgeleidLeefsituatieBvv.newBuilder();
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
          GrondslagenBvv.GrondslagLeefsituatieBvv.AfgeleidLeefsituatieBvv value) throws
          XMLStreamException {
        Util.writeElement(writer, "CdLeefvormBvv", value.getCdLeefvormBvv());
        Util.writeElement(writer, "IndTenLasteKomendKind", value.getIndTenLasteKomendKind());
        Util.writeElement(writer, "IndGeldigNedWoonadres", value.getIndGeldigNedWoonadres());
        Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
      }
    }

    static final class AanvullendKenmerkBvvTransformer {
      public static GrondslagenBvv.GrondslagLeefsituatieBvv.AanvullendKenmerkBvv read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        GrondslagenBvv.GrondslagLeefsituatieBvv.AanvullendKenmerkBvv.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.AanvullendKenmerkBvv.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "IndVerblijfInInrichting":
                builder.setIndVerblijfInInrichting(Util.readElementText(reader));
                break;
              case "BedrKostenVerzorgingVerpleging":
                builder.setBedrKostenVerzorgingVerpleging(StandaardBedrTypeTransformer.read(reader));
                break;
              case "CdSrtWoningBvv":
                builder.setCdSrtWoningBvv(Util.readElementText(reader));
                break;
              case "BedrWoonlasten":
                builder.setBedrWoonlasten(StandaardBedrTypeTransformer.read(reader));
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
          GrondslagenBvv.GrondslagLeefsituatieBvv.AanvullendKenmerkBvv value) throws
          XMLStreamException {
        Util.writeElement(writer, "IndVerblijfInInrichting", value.getIndVerblijfInInrichting());
        if (value.hasBedrKostenVerzorgingVerpleging()) {
          Util.writeStartElement(writer, "BedrKostenVerzorgingVerpleging");
          StandaardBedrTypeTransformer.write(writer, value.getBedrKostenVerzorgingVerpleging());
          Util.writeEndElement(writer);
        }
        Util.writeElement(writer, "CdSrtWoningBvv", value.getCdSrtWoningBvv());
        if (value.hasBedrWoonlasten()) {
          Util.writeStartElement(writer, "BedrWoonlasten");
          StandaardBedrTypeTransformer.write(writer, value.getBedrWoonlasten());
          Util.writeEndElement(writer);
        }
      }
    }

    static final class CorrectieGegevensBrpOpgaveBpTransformer {
      public static GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.newBuilder();
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
          GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp value) throws
          XMLStreamException {
        if (value.hasSchuldenaar()) {
          Util.writeStartElement(writer, "Schuldenaar");
          SchuldenaarTransformer.write(writer, value.getSchuldenaar());
          Util.writeEndElement(writer);
        }
      }

      static final class SchuldenaarTransformer {
        public static GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.newBuilder();
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
                  builder.setDomicilieAdres(StraatadresBrpTypeTransformer.read(reader));
                  break;
                case "Correspondentieadres":
                  builder.setCorrespondentieadres(StraatadresBrpTypeTransformer.read(reader));
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
            GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar value)
            throws XMLStreamException {
          Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
          Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
          Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
          Util.writeElement(writer, "CdBrpGegevensGeheim", value.getCdBrpGegevensGeheim());
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
          for (int i = 0; i < value.getHuwelijkCount(); i++) {
            Util.writeStartElement(writer, "Huwelijk");
            HuwelijkTransformer.write(writer, value.getHuwelijk(i));
            Util.writeEndElement(writer);
          }
        }

        static final class FeitelijkAdresBuitenlandTransformer {
          public static GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland.newBuilder();
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
              GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.FeitelijkAdresBuitenland value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatBAdresBuitenland", value.getDatBAdresBuitenland());
            Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
            Util.writeElement(writer, "Adresregel1Buitenland", value.getAdresregel1Buitenland());
            Util.writeElement(writer, "Adresregel2Buitenland", value.getAdresregel2Buitenland());
            Util.writeElement(writer, "Adresregel3Buitenland", value.getAdresregel3Buitenland());
          }
        }

        static final class HuwelijkTransformer {
          public static GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.newBuilder();
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
              GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk value)
              throws XMLStreamException {
            if (value.hasPartner()) {
              Util.writeStartElement(writer, "Partner");
              PartnerTransformer.write(writer, value.getPartner());
              Util.writeEndElement(writer);
            }
          }

          static final class PartnerTransformer {
            public static GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner.Builder builder = GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner.newBuilder();
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
                GrondslagenBvv.GrondslagLeefsituatieBvv.CorrectieGegevensBrpOpgaveBp.Schuldenaar.Huwelijk.Partner value)
                throws XMLStreamException {
              Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
            }
          }
        }
      }
    }
  }

  static final class GrondslagInkomstenBvvTransformer {
    public static GrondslagenBvv.GrondslagInkomstenBvv read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      GrondslagenBvv.GrondslagInkomstenBvv.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "CorrectieInkomstengegevensUwvOpgaveBp":
              builder.setCorrectieInkomstengegevensUwvOpgaveBp(CorrectieInkomstengegevensUwvOpgaveBpTransformer.read(reader));
              break;
            case "CorrectieInkomstengegevensPartnerUwvOpgaveBp":
              builder.setCorrectieInkomstengegevensPartnerUwvOpgaveBp(InkomstenTypeTransformer.read(reader));
              break;
            case "Beslagobject":
              builder.addBeslagobject(BeslagobjectTransformer.read(reader));
              break;
            case "MeeInBerekeningInkomsten":
              builder.setMeeInBerekeningInkomsten(MeeInBerekeningInkomstenTypeTransformer.read(reader));
              break;
            case "MeeInBerekeningInkomstenPartnerBvv":
              builder.setMeeInBerekeningInkomstenPartnerBvv(MeeInBerekeningInkomstenTypeTransformer.read(reader));
              break;
            case "PartnerBvv":
              builder.setPartnerBvv(PartnerBvvTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, GrondslagenBvv.GrondslagInkomstenBvv value)
        throws XMLStreamException {
      if (value.hasCorrectieInkomstengegevensUwvOpgaveBp()) {
        Util.writeStartElement(writer, "CorrectieInkomstengegevensUwvOpgaveBp");
        CorrectieInkomstengegevensUwvOpgaveBpTransformer.write(writer, value.getCorrectieInkomstengegevensUwvOpgaveBp());
        Util.writeEndElement(writer);
      }
      if (value.hasCorrectieInkomstengegevensPartnerUwvOpgaveBp()) {
        Util.writeStartElement(writer, "CorrectieInkomstengegevensPartnerUwvOpgaveBp");
        InkomstenTypeTransformer.write(writer, value.getCorrectieInkomstengegevensPartnerUwvOpgaveBp());
        Util.writeEndElement(writer);
      }
      for (int i = 0; i < value.getBeslagobjectCount(); i++) {
        Util.writeStartElement(writer, "Beslagobject");
        BeslagobjectTransformer.write(writer, value.getBeslagobject(i));
        Util.writeEndElement(writer);
      }
      if (value.hasMeeInBerekeningInkomsten()) {
        Util.writeStartElement(writer, "MeeInBerekeningInkomsten");
        MeeInBerekeningInkomstenTypeTransformer.write(writer, value.getMeeInBerekeningInkomsten());
        Util.writeEndElement(writer);
      }
      if (value.hasMeeInBerekeningInkomstenPartnerBvv()) {
        Util.writeStartElement(writer, "MeeInBerekeningInkomstenPartnerBvv");
        MeeInBerekeningInkomstenTypeTransformer.write(writer, value.getMeeInBerekeningInkomstenPartnerBvv());
        Util.writeEndElement(writer);
      }
      if (value.hasPartnerBvv()) {
        Util.writeStartElement(writer, "PartnerBvv");
        PartnerBvvTransformer.write(writer, value.getPartnerBvv());
        Util.writeEndElement(writer);
      }
    }

    static final class CorrectieInkomstengegevensUwvOpgaveBpTransformer {
      public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "Inkomstenverhouding":
                builder.addInkomstenverhouding(InkomstenverhoudingTransformer.read(reader));
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
          GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp value) throws
          XMLStreamException {
        for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
          Util.writeStartElement(writer, "Inkomstenverhouding");
          InkomstenverhoudingTransformer.write(writer, value.getInkomstenverhouding(i));
          Util.writeEndElement(writer);
        }
      }

      static final class InkomstenverhoudingTransformer {
        public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "AdministratieveEenheid":
                  builder.setAdministratieveEenheid(AdministratieveEenheidTransformer.read(reader));
                  break;
                case "Inkomstenperiode":
                  builder.addInkomstenperiode(InkomstenperiodeTypeTransformer.read(reader));
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

        public static void write(XMLStreamWriter writer,
            GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding value)
            throws XMLStreamException {
          if (value.hasAdministratieveEenheid()) {
            Util.writeStartElement(writer, "AdministratieveEenheid");
            AdministratieveEenheidTransformer.write(writer, value.getAdministratieveEenheid());
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getInkomstenperiodeCount(); i++) {
            Util.writeStartElement(writer, "Inkomstenperiode");
            InkomstenperiodeTypeTransformer.write(writer, value.getInkomstenperiode(i));
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getInkomstenopgaveCount(); i++) {
            Util.writeStartElement(writer, "Inkomstenopgave");
            InkomstenopgaveTypeTransformer.write(writer, value.getInkomstenopgave(i));
            Util.writeEndElement(writer);
          }
        }

        static final class AdministratieveEenheidTransformer {
          public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "NaamAdministratieveEenheid":
                    builder.setNaamAdministratieveEenheid(Util.readElementText(reader));
                    break;
                  case "Loonheffingennr":
                    builder.setLoonheffingennr(Util.readElementText(reader));
                    break;
                  case "FeitelijkAdresAeh":
                    builder.addFeitelijkAdresAeh(FeitelijkAdresAehTransformer.read(reader));
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
              GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid value)
              throws XMLStreamException {
            Util.writeElement(writer, "NaamAdministratieveEenheid", value.getNaamAdministratieveEenheid());
            Util.writeElement(writer, "Loonheffingennr", value.getLoonheffingennr());
            for (int i = 0; i < value.getFeitelijkAdresAehCount(); i++) {
              Util.writeStartElement(writer, "FeitelijkAdresAeh");
              FeitelijkAdresAehTransformer.write(writer, value.getFeitelijkAdresAeh(i));
              Util.writeEndElement(writer);
            }
          }

          static final class FeitelijkAdresAehTransformer {
            public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "Straatadres":
                      builder.setStraatadres(StraatadresTransformer.read(reader));
                      break;
                    case "Postbusadres":
                      builder.setPostbusadres(PostbusadresTransformer.read(reader));
                      break;
                    case "StraatadresBuitenland":
                      builder.setStraatadresBuitenland(StraatadresBuitenlandTransformer.read(reader));
                      break;
                    case "PostbusadresBuitenland":
                      builder.setPostbusadresBuitenland(PostbusadresBuitenlandTransformer.read(reader));
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
                GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh value)
                throws XMLStreamException {
              if (value.hasStraatadres()) {
                Util.writeStartElement(writer, "Straatadres");
                StraatadresTransformer.write(writer, value.getStraatadres());
                Util.writeEndElement(writer);
              }
              if (value.hasPostbusadres()) {
                Util.writeStartElement(writer, "Postbusadres");
                PostbusadresTransformer.write(writer, value.getPostbusadres());
                Util.writeEndElement(writer);
              }
              if (value.hasStraatadresBuitenland()) {
                Util.writeStartElement(writer, "StraatadresBuitenland");
                StraatadresBuitenlandTransformer.write(writer, value.getStraatadresBuitenland());
                Util.writeEndElement(writer);
              }
              if (value.hasPostbusadresBuitenland()) {
                Util.writeStartElement(writer, "PostbusadresBuitenland");
                PostbusadresBuitenlandTransformer.write(writer, value.getPostbusadresBuitenland());
                Util.writeEndElement(writer);
              }
            }

            static final class StraatadresTransformer {
              public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres.newBuilder();
                while (reader.hasNext()) {
                  int event = reader.next();
                  if (reader.isStartElement()) {
                    QName child = reader.getName();
                    switch(child.toString()) {
                      case "Locatieoms":
                        builder.setLocatieoms(Util.readElementText(reader));
                        break;
                      case "Postcd":
                        builder.setPostcd(Util.readElementText(reader));
                        break;
                      case "Woonplaatsnaam":
                        builder.setWoonplaatsnaam(Util.readElementText(reader));
                        break;
                      case "Gemeentenaam":
                        builder.setGemeentenaam(Util.readElementText(reader));
                        break;
                      case "Straatnaam":
                        builder.setStraatnaam(Util.readElementText(reader));
                        break;
                      case "Huisnr":
                        builder.setHuisnr(Util.readElementText(reader));
                        break;
                      case "Huisnrtoevoeging":
                        builder.setHuisnrtoevoeging(Util.readElementText(reader));
                        break;
                      case "Woonbootverwijzing":
                        builder.setWoonbootverwijzing(Util.readElementText(reader));
                        break;
                      case "Woonwagenverwijzing":
                        builder.setWoonwagenverwijzing(Util.readElementText(reader));
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
                  GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres value)
                  throws XMLStreamException {
                Util.writeElement(writer, "Locatieoms", value.getLocatieoms());
                Util.writeElement(writer, "Postcd", value.getPostcd());
                Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
                Util.writeElement(writer, "Gemeentenaam", value.getGemeentenaam());
                Util.writeElement(writer, "Straatnaam", value.getStraatnaam());
                Util.writeElement(writer, "Huisnr", value.getHuisnr());
                Util.writeElement(writer, "Huisnrtoevoeging", value.getHuisnrtoevoeging());
                Util.writeElement(writer, "Woonbootverwijzing", value.getWoonbootverwijzing());
                Util.writeElement(writer, "Woonwagenverwijzing", value.getWoonwagenverwijzing());
              }
            }

            static final class PostbusadresTransformer {
              public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres.newBuilder();
                while (reader.hasNext()) {
                  int event = reader.next();
                  if (reader.isStartElement()) {
                    QName child = reader.getName();
                    switch(child.toString()) {
                      case "Locatieoms":
                        builder.setLocatieoms(Util.readElementText(reader));
                        break;
                      case "Postcd":
                        builder.setPostcd(Util.readElementText(reader));
                        break;
                      case "Woonplaatsnaam":
                        builder.setWoonplaatsnaam(Util.readElementText(reader));
                        break;
                      case "Gemeentenaam":
                        builder.setGemeentenaam(Util.readElementText(reader));
                        break;
                      case "Postbusnr":
                        builder.setPostbusnr(Util.readElementText(reader));
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
                  GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres value)
                  throws XMLStreamException {
                Util.writeElement(writer, "Locatieoms", value.getLocatieoms());
                Util.writeElement(writer, "Postcd", value.getPostcd());
                Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
                Util.writeElement(writer, "Gemeentenaam", value.getGemeentenaam());
                Util.writeElement(writer, "Postbusnr", value.getPostbusnr());
              }
            }

            static final class StraatadresBuitenlandTransformer {
              public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland.newBuilder();
                while (reader.hasNext()) {
                  int event = reader.next();
                  if (reader.isStartElement()) {
                    QName child = reader.getName();
                    switch(child.toString()) {
                      case "LocatieomsBuitenland":
                        builder.setLocatieomsBuitenland(Util.readElementText(reader));
                        break;
                      case "PostcdBuitenland":
                        builder.setPostcdBuitenland(Util.readElementText(reader));
                        break;
                      case "WoonplaatsnaamBuitenland":
                        builder.setWoonplaatsnaamBuitenland(Util.readElementText(reader));
                        break;
                      case "RegionaamBuitenland":
                        builder.setRegionaamBuitenland(Util.readElementText(reader));
                        break;
                      case "LandencdIso":
                        builder.setLandencdIso(Util.readElementText(reader));
                        break;
                      case "Landsnaam":
                        builder.setLandsnaam(Util.readElementText(reader));
                        break;
                      case "StraatnaamBuitenland":
                        builder.setStraatnaamBuitenland(Util.readElementText(reader));
                        break;
                      case "HuisnrBuitenland":
                        builder.setHuisnrBuitenland(Util.readElementText(reader));
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
                  GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland value)
                  throws XMLStreamException {
                Util.writeElement(writer, "LocatieomsBuitenland", value.getLocatieomsBuitenland());
                Util.writeElement(writer, "PostcdBuitenland", value.getPostcdBuitenland());
                Util.writeElement(writer, "WoonplaatsnaamBuitenland", value.getWoonplaatsnaamBuitenland());
                Util.writeElement(writer, "RegionaamBuitenland", value.getRegionaamBuitenland());
                Util.writeElement(writer, "LandencdIso", value.getLandencdIso());
                Util.writeElement(writer, "Landsnaam", value.getLandsnaam());
                Util.writeElement(writer, "StraatnaamBuitenland", value.getStraatnaamBuitenland());
                Util.writeElement(writer, "HuisnrBuitenland", value.getHuisnrBuitenland());
              }
            }

            static final class PostbusadresBuitenlandTransformer {
              public static GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland.newBuilder();
                while (reader.hasNext()) {
                  int event = reader.next();
                  if (reader.isStartElement()) {
                    QName child = reader.getName();
                    switch(child.toString()) {
                      case "LocatieomsBuitenland":
                        builder.setLocatieomsBuitenland(Util.readElementText(reader));
                        break;
                      case "PostcdBuitenland":
                        builder.setPostcdBuitenland(Util.readElementText(reader));
                        break;
                      case "WoonplaatsnaamBuitenland":
                        builder.setWoonplaatsnaamBuitenland(Util.readElementText(reader));
                        break;
                      case "RegionaamBuitenland":
                        builder.setRegionaamBuitenland(Util.readElementText(reader));
                        break;
                      case "LandencdIso":
                        builder.setLandencdIso(Util.readElementText(reader));
                        break;
                      case "Landsnaam":
                        builder.setLandsnaam(Util.readElementText(reader));
                        break;
                      case "PostbusnrBuitenland":
                        builder.setPostbusnrBuitenland(Util.readElementText(reader));
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
                  GrondslagenBvv.GrondslagInkomstenBvv.CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland value)
                  throws XMLStreamException {
                Util.writeElement(writer, "LocatieomsBuitenland", value.getLocatieomsBuitenland());
                Util.writeElement(writer, "PostcdBuitenland", value.getPostcdBuitenland());
                Util.writeElement(writer, "WoonplaatsnaamBuitenland", value.getWoonplaatsnaamBuitenland());
                Util.writeElement(writer, "RegionaamBuitenland", value.getRegionaamBuitenland());
                Util.writeElement(writer, "LandencdIso", value.getLandencdIso());
                Util.writeElement(writer, "Landsnaam", value.getLandsnaam());
                Util.writeElement(writer, "PostbusnrBuitenland", value.getPostbusnrBuitenland());
              }
            }
          }
        }
      }
    }

    static final class BeslagobjectTransformer {
      public static GrondslagenBvv.GrondslagInkomstenBvv.Beslagobject read(XMLStreamReader reader)
          throws XMLStreamException {
        QName parent = reader.getName();
        GrondslagenBvv.GrondslagInkomstenBvv.Beslagobject.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.Beslagobject.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "CdSrtIkv":
                builder.setCdSrtIkv(Util.readElementText(reader));
                break;
              case "VolgordeBeslag":
                builder.setVolgordeBeslag(Util.readElementText(reader));
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
          GrondslagenBvv.GrondslagInkomstenBvv.Beslagobject value) throws XMLStreamException {
        Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
        Util.writeElement(writer, "VolgordeBeslag", value.getVolgordeBeslag());
      }
    }

    static final class PartnerBvvTransformer {
      public static GrondslagenBvv.GrondslagInkomstenBvv.PartnerBvv read(XMLStreamReader reader)
          throws XMLStreamException {
        QName parent = reader.getName();
        GrondslagenBvv.GrondslagInkomstenBvv.PartnerBvv.Builder builder = GrondslagenBvv.GrondslagInkomstenBvv.PartnerBvv.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "Burgerservicenr":
                builder.setBurgerservicenr(Util.readElementText(reader));
                break;
              case "InkomstenPartnerOpgaveBp":
                builder.setInkomstenPartnerOpgaveBp(InkomstenTypeTransformer.read(reader));
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
          GrondslagenBvv.GrondslagInkomstenBvv.PartnerBvv value) throws XMLStreamException {
        Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
        if (value.hasInkomstenPartnerOpgaveBp()) {
          Util.writeStartElement(writer, "InkomstenPartnerOpgaveBp");
          InkomstenTypeTransformer.write(writer, value.getInkomstenPartnerOpgaveBp());
          Util.writeEndElement(writer);
        }
      }
    }
  }
}
