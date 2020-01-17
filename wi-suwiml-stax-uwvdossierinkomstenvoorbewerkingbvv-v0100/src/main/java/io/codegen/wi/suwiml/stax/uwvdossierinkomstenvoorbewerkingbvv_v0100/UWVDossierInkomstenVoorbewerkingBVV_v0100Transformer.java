package io.codegen.wi.suwiml.stax.uwvdossierinkomstenvoorbewerkingbvv_v0100;

import io.codegen.wi.suwiml.proto.uwvdossierinkomstenvoorbewerkingbvv_v0100.MeldingType;
import io.codegen.wi.suwiml.proto.uwvdossierinkomstenvoorbewerkingbvv_v0100.UWVPersoonsIkvInfo;
import io.codegen.wi.suwiml.proto.uwvdossierinkomstenvoorbewerkingbvv_v0100.UWVPersoonsIkvInfoResponse;
import io.codegen.wi.suwiml.stax.util.Util;
import java.lang.String;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public final class UWVDossierInkomstenVoorbewerkingBVV_v0100Transformer {
  public static UWVPersoonsIkvInfo readUWVPersoonsIkvInfo(XMLStreamReader reader) throws
      XMLStreamException {
    Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenVoorbewerkingBVV/v0100}UWVPersoonsIkvInfo"));
    return UWVPersoonsIkvInfoTransformer.read(reader);
  }

  public static void writeUWVPersoonsIkvInfo(XMLStreamWriter writer, UWVPersoonsIkvInfo value,
      String messageId, String from, String to) throws XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenVoorbewerkingBVV-v0100/UWVPersoonsIkvInfo", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenVoorbewerkingBVV/v0100", "UWVPersoonsIkvInfo", "smls");
    UWVPersoonsIkvInfoTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  public static UWVPersoonsIkvInfoResponse readUWVPersoonsIkvInfoResponse(XMLStreamReader reader)
      throws XMLStreamException {
    Util.consumeUntilBody(reader);
    if (Util.isSOAPFault(reader)) {
      Util.consumeUntilFaultDetail(reader);
      Util.validateStartElement(reader, new QName("http://bkwi.nl/SuwiML/FWI/v0205", "Fout"));
      MeldingType fault = MeldingTypeTransformer.read(reader);
      return UWVPersoonsIkvInfoResponse.newBuilder()
        .setFWI(UWVPersoonsIkvInfoResponse.FWI.newBuilder()
          .addFout(fault)
          .build())
        .build();
    } else {
      Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenVoorbewerkingBVV/v0100}UWVPersoonsIkvInfoResponse"));
      return UWVPersoonsIkvInfoResponseTransformer.read(reader);
    }
  }

  public static void writeUWVPersoonsIkvInfoResponse(XMLStreamWriter writer,
      UWVPersoonsIkvInfoResponse value, String messageId, String from, String to) throws
      XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenVoorbewerkingBVV-v0100/UWVPersoonsIkvInfoResponse", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenVoorbewerkingBVV/v0100", "UWVPersoonsIkvInfoResponse", "smls");
    UWVPersoonsIkvInfoResponseTransformer.write(writer, value);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
    Util.writeEndElement(writer);
  }

  static final class UWVPersoonsIkvInfoTransformer {
    public static UWVPersoonsIkvInfo read(XMLStreamReader reader) throws XMLStreamException {
      QName parent = reader.getName();
      UWVPersoonsIkvInfo.Builder builder = UWVPersoonsIkvInfo.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "Burgerservicenr":
              builder.setBurgerservicenr(Util.readElementText(reader));
              break;
            case "PeriodeGegevensvraagIko":
              builder.setPeriodeGegevensvraagIko(PeriodeGegevensvraagIkoTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, UWVPersoonsIkvInfo value) throws
        XMLStreamException {
      Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
      if (value.hasPeriodeGegevensvraagIko()) {
        Util.writeStartElement(writer, "PeriodeGegevensvraagIko");
        PeriodeGegevensvraagIkoTransformer.write(writer, value.getPeriodeGegevensvraagIko());
        Util.writeEndElement(writer);
      }
    }

    static final class PeriodeGegevensvraagIkoTransformer {
      public static UWVPersoonsIkvInfo.PeriodeGegevensvraagIko read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        UWVPersoonsIkvInfo.PeriodeGegevensvraagIko.Builder builder = UWVPersoonsIkvInfo.PeriodeGegevensvraagIko.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "DatBPeriode":
                builder.setDatBPeriode(Util.readElementText(reader));
                break;
              case "DatEPeriode":
                builder.setDatEPeriode(Util.readElementText(reader));
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
          UWVPersoonsIkvInfo.PeriodeGegevensvraagIko value) throws XMLStreamException {
        Util.writeElement(writer, "DatBPeriode", value.getDatBPeriode());
        Util.writeElement(writer, "DatEPeriode", value.getDatEPeriode());
      }
    }
  }

  static final class UWVPersoonsIkvInfoResponseTransformer {
    public static UWVPersoonsIkvInfoResponse read(XMLStreamReader reader) throws
        XMLStreamException {
      QName parent = reader.getName();
      UWVPersoonsIkvInfoResponse.Builder builder = UWVPersoonsIkvInfoResponse.newBuilder();
      while (reader.hasNext()) {
        int event = reader.next();
        if (reader.isStartElement()) {
          QName child = reader.getName();
          switch(child.toString()) {
            case "Schuldenaar":
              builder.setSchuldenaar(SchuldenaarTransformer.read(reader));
              break;
            case "PeriodeGegevensleveringIko":
              builder.setPeriodeGegevensleveringIko(PeriodeGegevensleveringIkoTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, UWVPersoonsIkvInfoResponse value) throws
        XMLStreamException {
      if (value.hasSchuldenaar()) {
        Util.writeStartElement(writer, "Schuldenaar");
        SchuldenaarTransformer.write(writer, value.getSchuldenaar());
        Util.writeEndElement(writer);
      }
      if (value.hasPeriodeGegevensleveringIko()) {
        Util.writeStartElement(writer, "PeriodeGegevensleveringIko");
        PeriodeGegevensleveringIkoTransformer.write(writer, value.getPeriodeGegevensleveringIko());
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
      public static UWVPersoonsIkvInfoResponse.Schuldenaar read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        UWVPersoonsIkvInfoResponse.Schuldenaar.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "Burgerservicenr":
                builder.setBurgerservicenr(Util.readElementText(reader));
                break;
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

      public static void write(XMLStreamWriter writer, UWVPersoonsIkvInfoResponse.Schuldenaar value)
          throws XMLStreamException {
        Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
        for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
          Util.writeStartElement(writer, "Inkomstenverhouding");
          InkomstenverhoudingTransformer.write(writer, value.getInkomstenverhouding(i));
          Util.writeEndElement(writer);
        }
      }

      static final class InkomstenverhoudingTransformer {
        public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "VolgnrIkv":
                  builder.setVolgnrIkv(Util.readElementText(reader));
                  break;
                case "DatBIkv":
                  builder.setDatBIkv(Util.readElementText(reader));
                  break;
                case "DatEIkv":
                  builder.setDatEIkv(Util.readElementText(reader));
                  break;
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
            UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding value) throws
            XMLStreamException {
          Util.writeElement(writer, "VolgnrIkv", value.getVolgnrIkv());
          Util.writeElement(writer, "DatBIkv", value.getDatBIkv());
          Util.writeElement(writer, "DatEIkv", value.getDatEIkv());
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
          public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.newBuilder();
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
              UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid value)
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
            public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "DatBAdres":
                      builder.setDatBAdres(Util.readElementText(reader));
                      break;
                    case "DatEAdres":
                      builder.setDatEAdres(Util.readElementText(reader));
                      break;
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
                UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh value)
                throws XMLStreamException {
              Util.writeElement(writer, "DatBAdres", value.getDatBAdres());
              Util.writeElement(writer, "DatEAdres", value.getDatEAdres());
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
              public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres.newBuilder();
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
                  UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Straatadres value)
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
              public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres.newBuilder();
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
                  UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.Postbusadres value)
                  throws XMLStreamException {
                Util.writeElement(writer, "Locatieoms", value.getLocatieoms());
                Util.writeElement(writer, "Postcd", value.getPostcd());
                Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
                Util.writeElement(writer, "Gemeentenaam", value.getGemeentenaam());
                Util.writeElement(writer, "Postbusnr", value.getPostbusnr());
              }
            }

            static final class StraatadresBuitenlandTransformer {
              public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland.newBuilder();
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
                  UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.StraatadresBuitenland value)
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
              public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland read(
                  XMLStreamReader reader) throws XMLStreamException {
                QName parent = reader.getName();
                UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland.newBuilder();
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
                  UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh.PostbusadresBuitenland value)
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
          public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenperiode read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenperiode.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenperiode.newBuilder();
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
              UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenperiode value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatBIkp", value.getDatBIkp());
            Util.writeElement(writer, "DatEIkp", value.getDatEIkp());
            Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
          }
        }

        static final class InkomstenopgaveTransformer {
          public static UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenopgave read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenopgave.Builder builder = UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenopgave.newBuilder();
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

          public static void write(XMLStreamWriter writer,
              UWVPersoonsIkvInfoResponse.Schuldenaar.Inkomstenverhouding.Inkomstenopgave value)
              throws XMLStreamException {
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
      }
    }

    static final class PeriodeGegevensleveringIkoTransformer {
      public static UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko read(
          XMLStreamReader reader) throws XMLStreamException {
        QName parent = reader.getName();
        UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko.Builder builder = UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko.newBuilder();
        while (reader.hasNext()) {
          int event = reader.next();
          if (reader.isStartElement()) {
            QName child = reader.getName();
            switch(child.toString()) {
              case "DatBPeriode":
                builder.setDatBPeriode(Util.readElementText(reader));
                break;
              case "DatEPeriode":
                builder.setDatEPeriode(Util.readElementText(reader));
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
          UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko value) throws XMLStreamException {
        Util.writeElement(writer, "DatBPeriode", value.getDatBPeriode());
        Util.writeElement(writer, "DatEPeriode", value.getDatEPeriode());
      }
    }

    static final class FWITransformer {
      public static UWVPersoonsIkvInfoResponse.FWI read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        UWVPersoonsIkvInfoResponse.FWI.Builder builder = UWVPersoonsIkvInfoResponse.FWI.newBuilder();
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

      public static void write(XMLStreamWriter writer, UWVPersoonsIkvInfoResponse.FWI value) throws
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
