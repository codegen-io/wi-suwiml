package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.PartnerBvvOpgaveBp;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class PartnerBvvOpgaveBpTransformer {
  public static PartnerBvvOpgaveBp read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    PartnerBvvOpgaveBp.Builder builder = PartnerBvvOpgaveBp.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "Burgerservicenr":
            builder.setBurgerservicenr(Util.readElementText(reader));
            break;
          case "IndBevragenInkomstengegevensUwv":
            builder.setIndBevragenInkomstengegevensUwv(Util.readElementText(reader));
            break;
          case "InkomstenPartnerOpgaveBp":
            builder.setInkomstenPartnerOpgaveBp(InkomstenPartnerOpgaveBpTransformer.read(reader));
            break;
          case "MeeInBerekeningInkomstenPartnerOpgaveBp":
            builder.setMeeInBerekeningInkomstenPartnerOpgaveBp(MeeInBerekeningInkomstenPartnerOpgaveBpTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, PartnerBvvOpgaveBp value) throws
      XMLStreamException {
    Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
    Util.writeElement(writer, "IndBevragenInkomstengegevensUwv", value.getIndBevragenInkomstengegevensUwv());
    if (value.hasInkomstenPartnerOpgaveBp()) {
      Util.writeStartElement(writer, "InkomstenPartnerOpgaveBp");
      InkomstenPartnerOpgaveBpTransformer.write(writer, value.getInkomstenPartnerOpgaveBp());
      Util.writeEndElement(writer);
    }
    if (value.hasMeeInBerekeningInkomstenPartnerOpgaveBp()) {
      Util.writeStartElement(writer, "MeeInBerekeningInkomstenPartnerOpgaveBp");
      MeeInBerekeningInkomstenPartnerOpgaveBpTransformer.write(writer, value.getMeeInBerekeningInkomstenPartnerOpgaveBp());
      Util.writeEndElement(writer);
    }
  }

  static final class InkomstenPartnerOpgaveBpTransformer {
    public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.newBuilder();
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
        PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp value) throws XMLStreamException {
      for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
        Util.writeStartElement(writer, "Inkomstenverhouding");
        InkomstenverhoudingTransformer.write(writer, value.getInkomstenverhouding(i));
        Util.writeEndElement(writer);
      }
    }

    static final class InkomstenverhoudingTransformer {
      public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "AdministratieveEenheid":
                builder.setAdministratieveEenheid(AdministratieveEenheidTransformer.read(reader));
                break;
              case "Inkomstenperiode":
                builder.addInkomstenperiode(InkomstenperiodeTransformer.read(reader));
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
          PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding value) throws
          XMLStreamException {
        if (value.hasAdministratieveEenheid()) {
          Util.writeStartElement(writer, "AdministratieveEenheid");
          AdministratieveEenheidTransformer.write(writer, value.getAdministratieveEenheid());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getInkomstenperiodeCount(); i++) {
          Util.writeStartElement(writer, "Inkomstenperiode");
          InkomstenperiodeTransformer.write(writer, value.getInkomstenperiode(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getInkomstenopgaveCount(); i++) {
          Util.writeStartElement(writer, "Inkomstenopgave");
          InkomstenopgaveTransformer.write(writer, value.getInkomstenopgave(i));
          Util.writeEndElement(writer);
        }
      }

      static final class AdministratieveEenheidTransformer {
        public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.AdministratieveEenheid read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.newBuilder();
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
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.AdministratieveEenheid value)
            throws XMLStreamException {
          Util.writeElement(writer, "NaamAdministratieveEenheid", value.getNaamAdministratieveEenheid());
          Util.writeElement(writer, "Loonheffingennr", value.getLoonheffingennr());
        }
      }

      static final class InkomstenperiodeTransformer {
        public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenperiode read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenperiode.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenperiode.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DatBIkp":
                  builder.setDatBIkp(Util.readElementText(reader));
                  break;
                case "DatEIkp":
                  builder.setDatEIkp(Util.readElementText(reader));
                  break;
                case "CdSrtIkv":
                  builder.setCdSrtIkv(Util.readElementText(reader));
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
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenperiode value)
            throws XMLStreamException {
          Util.writeElement(writer, "DatBIkp", value.getDatBIkp());
          Util.writeElement(writer, "DatEIkp", value.getDatEIkp());
          Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
        }
      }

      static final class InkomstenopgaveTransformer {
        public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.newBuilder();
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
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave value)
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
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrIngehoudenLbPremieVolksverzTransformer {
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrVakantietoeslagTransformer {
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrOpgbRechtVakantietoeslagTransformer {
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrExtraPrdSalarisTransformer {
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrOpgbRechtExtraPrdSalarisTransformer {
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris value)
              throws XMLStreamException {
            Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
            Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
            Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
            Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
          }
        }

        static final class BedrIngehoudenBijdrageZvwTransformer {
          public static PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw.Builder builder = PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw.newBuilder();
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
              PartnerBvvOpgaveBp.InkomstenPartnerOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw value)
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

  static final class MeeInBerekeningInkomstenPartnerOpgaveBpTransformer {
    public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp read(
        XMLStreamReader reader) throws XMLStreamException {
      QName parent = reader.getName();
      PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.newBuilder();
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
        PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp value) throws
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
      public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrBelastbaarJaarinkomen read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrBelastbaarJaarinkomen.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrBelastbaarJaarinkomen.newBuilder();
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
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrBelastbaarJaarinkomen value)
          throws XMLStreamException {
        Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
        Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
        Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
        Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
      }
    }

    static final class BedrNettoMaandinkomenTransformer {
      public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrNettoMaandinkomen read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrNettoMaandinkomen.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrNettoMaandinkomen.newBuilder();
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
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.BedrNettoMaandinkomen value)
          throws XMLStreamException {
        Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
        Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
        Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
        Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
      }
    }

    static final class InkomstenopgaveTransformer {
      public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.newBuilder();
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
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave value) throws
          XMLStreamException {
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
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrLoonLbPremieVolksverz value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrIngehoudenLbPremieVolksverzTransformer {
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrVakantietoeslagTransformer {
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrVakantietoeslag read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrVakantietoeslag.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrVakantietoeslag.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrVakantietoeslag value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrOpgbRechtVakantietoeslagTransformer {
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtVakantietoeslag value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrExtraPrdSalarisTransformer {
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrExtraPrdSalaris value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrOpgbRechtExtraPrdSalarisTransformer {
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrIngehoudenBijdrageZvwTransformer {
        public static PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw.Builder builder = PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw.newBuilder();
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
            PartnerBvvOpgaveBp.MeeInBerekeningInkomstenPartnerOpgaveBp.Inkomstenopgave.BedrIngehoudenBijdrageZvw value)
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
