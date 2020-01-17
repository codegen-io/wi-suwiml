package io.codegen.wi.suwiml.stax.bvvherzieneberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvherzieneberekeningbeslaglegger_v0100.CorrectieInkomstengegevensUwvOpgaveBp;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class CorrectieInkomstengegevensUwvOpgaveBpTransformer {
  public static CorrectieInkomstengegevensUwvOpgaveBp read(XMLStreamReader reader) throws
      XMLStreamException {
    QName parent = reader.getName();
    CorrectieInkomstengegevensUwvOpgaveBp.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.newBuilder();
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

  public static void write(XMLStreamWriter writer, CorrectieInkomstengegevensUwvOpgaveBp value)
      throws XMLStreamException {
    for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
      Util.writeStartElement(writer, "Inkomstenverhouding");
      InkomstenverhoudingTransformer.write(writer, value.getInkomstenverhouding(i));
      Util.writeEndElement(writer);
    }
  }

  static final class InkomstenverhoudingTransformer {
    public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding read(
        XMLStreamReader reader) throws XMLStreamException {
      QName parent = reader.getName();
      CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.newBuilder();
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
        CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding value) throws XMLStreamException {
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
      public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.newBuilder();
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
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid value)
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
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh value)
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
          public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres.newBuilder();
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
              CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres value)
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
          public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres.newBuilder();
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
              CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres value)
              throws XMLStreamException {
            Util.writeElement(writer, "Locatieoms", value.getLocatieoms());
            Util.writeElement(writer, "Postcd", value.getPostcd());
            Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
            Util.writeElement(writer, "Gemeentenaam", value.getGemeentenaam());
            Util.writeElement(writer, "Postbusnr", value.getPostbusnr());
          }
        }

        static final class StraatadresBuitenlandTransformer {
          public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland.newBuilder();
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
              CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland value)
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
          public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland.newBuilder();
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
              CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland value)
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

    static final class InkomstenperiodeTransformer {
      public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode.newBuilder();
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
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenperiode value) throws
          XMLStreamException {
        Util.writeElement(writer, "DatBIkp", value.getDatBIkp());
        Util.writeElement(writer, "DatEIkp", value.getDatEIkp());
        Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
      }
    }

    static final class InkomstenopgaveTransformer {
      public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.newBuilder();
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
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave value) throws
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
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrLoonLbPremieVolksverz value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrIngehoudenLbPremieVolksverzTransformer {
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenLbPremieVolksverz value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrVakantietoeslagTransformer {
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrVakantietoeslag value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrOpgbRechtVakantietoeslagTransformer {
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtVakantietoeslag value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrExtraPrdSalarisTransformer {
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrExtraPrdSalaris value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrOpgbRechtExtraPrdSalarisTransformer {
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrOpgbRechtExtraPrdSalaris value)
            throws XMLStreamException {
          Util.writeElement(writer, "CdMunteenheid", value.getCdMunteenheid());
          Util.writeElement(writer, "CdPositiefNegatief", value.getCdPositiefNegatief());
          Util.writeElement(writer, "WaardeBedr", value.getWaardeBedr());
          Util.writeElement(writer, "CdPeriodeEenheidGeldigheidBedr", value.getCdPeriodeEenheidGeldigheidBedr());
        }
      }

      static final class BedrIngehoudenBijdrageZvwTransformer {
        public static CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw.Builder builder = CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw.newBuilder();
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
            CorrectieInkomstengegevensUwvOpgaveBp.Inkomstenverhouding.Inkomstenopgave.BedrIngehoudenBijdrageZvw value)
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
