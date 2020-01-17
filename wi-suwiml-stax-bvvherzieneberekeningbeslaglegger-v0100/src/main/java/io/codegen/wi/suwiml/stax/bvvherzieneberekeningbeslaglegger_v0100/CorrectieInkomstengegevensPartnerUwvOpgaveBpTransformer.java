package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.CorrectieInkomstengegevensPartnerUwvOpgaveBp;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class CorrectieInkomstengegevensPartnerUwvOpgaveBpTransformer {
  public static CorrectieInkomstengegevensPartnerUwvOpgaveBp read(XMLStreamReader reader) throws
      XMLStreamException {
    QName parent = reader.getName();
    CorrectieInkomstengegevensPartnerUwvOpgaveBp.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.newBuilder();
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
      CorrectieInkomstengegevensPartnerUwvOpgaveBp value) throws XMLStreamException {
    for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
      Util.writeStartElement(writer, "Inkomstenverhouding");
      InkomstenverhoudingTransformer.write(writer, value.getInkomstenverhouding(i));
      Util.writeEndElement(writer);
    }
  }

  static final class InkomstenverhoudingTransformer {
    public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding read(
        XMLStreamReader reader) throws XMLStreamException {
      QName parent = reader.getName();
      CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.newBuilder();
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
        CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding value) throws
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
      public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.newBuilder();
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
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid value)
          throws XMLStreamException {
        Util.writeElement(writer, "NaamAdministratieveEenheid", value.getNaamAdministratieveEenheid());
        Util.writeElement(writer, "Loonheffingennr", value.getLoonheffingennr());
      }
    }

    static final class InkomstenperiodeTransformer {
      public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode.newBuilder();
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
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode value)
          throws XMLStreamException {
        Util.writeElement(writer, "DatBIkp", value.getDatBIkp());
        Util.writeElement(writer, "DatEIkp", value.getDatEIkp());
        Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
      }
    }

    static final class InkomstenopgaveTransformer {
      public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.newBuilder();
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
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave value)
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
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrIngehoudenLbPremieVolksverzTransformer {
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrVakantietoeslagTransformer {
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrOpgbRechtVakantietoeslagTransformer {
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrExtraPrdSalarisTransformer {
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrOpgbRechtExtraPrdSalarisTransformer {
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrIngehoudenBijdrageZvwTransformer {
        public static CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw.Builder builder = CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw.newBuilder();
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
            CorrectieInkomstengegevensPartnerUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw value)
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
