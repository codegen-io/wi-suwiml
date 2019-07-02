package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.stax.Util;
import java.lang.String;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.MeldingType;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.UWVPersoonsIkvInfo;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.UWVPersoonsIkvInfoResponse;

public final class UWVDossierInkomsten_v0500Transformer {
  public static UWVPersoonsIkvInfo readUWVPersoonsIkvInfo(XMLStreamReader reader) throws
      XMLStreamException {
    Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomsten/v0500}UWVPersoonsIkvInfo"));
    return UWVPersoonsIkvInfoTransformer.read(reader);
  }

  public static void writeUWVPersoonsIkvInfo(XMLStreamWriter writer, UWVPersoonsIkvInfo value,
      String messageId, String from, String to) throws XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomsten-v0500/UWVPersoonsIkvInfo", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomsten/v0500", "UWVPersoonsIkvInfo", "smls");
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
      Util.validateStartElement(reader, new QName("http://bkwi.nl/SuwiML/FWI/v0203", "Fout"));
      MeldingType fault = MeldingTypeTransformer.read(reader);
      return UWVPersoonsIkvInfoResponse.newBuilder()
        .setFWI(UWVPersoonsIkvInfoResponse.FWI.newBuilder()
          .addFout(fault)
          .build())
        .build();
    } else {
      Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomsten/v0500}UWVPersoonsIkvInfoResponse"));
      return UWVPersoonsIkvInfoResponseTransformer.read(reader);
    }
  }

  public static void writeUWVPersoonsIkvInfoResponse(XMLStreamWriter writer,
      UWVPersoonsIkvInfoResponse value, String messageId, String from, String to) throws
      XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomsten-v0500/UWVPersoonsIkvInfoResponse", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomsten/v0500", "UWVPersoonsIkvInfoResponse", "smls");
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
            case "ClientSuwi":
              builder.setClientSuwi(ClientSuwiTransformer.read(reader));
              break;
            case "PeriodeGegevensleveringIko":
              builder.setPeriodeGegevensleveringIko(PeriodeGegevensleveringIkoTransformer.read(reader));
              break;
            case "{http://bkwi.nl/SuwiML/FWI/v0203}FWI":
              builder.setFWI(FWITransformer.read(reader));
              break;
            case "{http://bkwi.nl/SuwiML/FWI/v0203}NietsGevonden":
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
      if (value.hasClientSuwi()) {
        Util.writeStartElement(writer, "ClientSuwi");
        ClientSuwiTransformer.write(writer, value.getClientSuwi());
        Util.writeEndElement(writer);
      }
      if (value.hasPeriodeGegevensleveringIko()) {
        Util.writeStartElement(writer, "PeriodeGegevensleveringIko");
        PeriodeGegevensleveringIkoTransformer.write(writer, value.getPeriodeGegevensleveringIko());
        Util.writeEndElement(writer);
      }
      if (value.hasFWI()) {
        Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/FWI/v0203", "FWI", "fwi");
        FWITransformer.write(writer, value.getFWI());
        Util.writeEndElement(writer);
      }
      if (value.getNietsGevonden()) {
        Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/FWI/v0203", "NietsGevonden", "fwi");
        Util.writeEndElement(writer);
      }
    }

    static final class ClientSuwiTransformer {
      public static UWVPersoonsIkvInfoResponse.ClientSuwi read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        UWVPersoonsIkvInfoResponse.ClientSuwi.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.newBuilder();
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

      public static void write(XMLStreamWriter writer, UWVPersoonsIkvInfoResponse.ClientSuwi value)
          throws XMLStreamException {
        Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
        for (int i = 0; i < value.getInkomstenverhoudingCount(); i++) {
          Util.writeStartElement(writer, "Inkomstenverhouding");
          InkomstenverhoudingTransformer.write(writer, value.getInkomstenverhouding(i));
          Util.writeEndElement(writer);
        }
      }

      static final class InkomstenverhoudingTransformer {
        public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "VolgnrIkv":
                  builder.setVolgnrIkv(Util.readElementText(reader));
                  break;
                case "AanduidingIkvWerkgever":
                  builder.setAanduidingIkvWerkgever(Util.readElementText(reader));
                  break;
                case "DatBIkv":
                  builder.setDatBIkv(Util.readElementText(reader));
                  break;
                case "DatEIkv":
                  builder.setDatEIkv(Util.readElementText(reader));
                  break;
                case "Personeelsnr":
                  builder.setPersoneelsnr(Util.readElementText(reader));
                  break;
                case "CdRedenEIkvFlexwerker":
                  builder.setCdRedenEIkvFlexwerker(Util.readElementText(reader));
                  break;
                case "PersoonLoonaangifte":
                  builder.setPersoonLoonaangifte(PersoonLoonaangifteTransformer.read(reader));
                  break;
                case "AdministratieveEenheid":
                  builder.setAdministratieveEenheid(AdministratieveEenheidTransformer.read(reader));
                  break;
                case "Inkomstenperiode":
                  builder.addInkomstenperiode(InkomstenperiodeTransformer.read(reader));
                  break;
                case "SectorRisicogroepIkv":
                  builder.addSectorRisicogroepIkv(SectorRisicogroepTypeTransformer.read(reader));
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
            UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding value) throws
            XMLStreamException {
          Util.writeElement(writer, "VolgnrIkv", value.getVolgnrIkv());
          Util.writeElement(writer, "AanduidingIkvWerkgever", value.getAanduidingIkvWerkgever());
          Util.writeElement(writer, "DatBIkv", value.getDatBIkv());
          Util.writeElement(writer, "DatEIkv", value.getDatEIkv());
          Util.writeElement(writer, "Personeelsnr", value.getPersoneelsnr());
          Util.writeElement(writer, "CdRedenEIkvFlexwerker", value.getCdRedenEIkvFlexwerker());
          if (value.hasPersoonLoonaangifte()) {
            Util.writeStartElement(writer, "PersoonLoonaangifte");
            PersoonLoonaangifteTransformer.write(writer, value.getPersoonLoonaangifte());
            Util.writeEndElement(writer);
          }
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
          for (int i = 0; i < value.getSectorRisicogroepIkvCount(); i++) {
            Util.writeStartElement(writer, "SectorRisicogroepIkv");
            SectorRisicogroepTypeTransformer.write(writer, value.getSectorRisicogroepIkv(i));
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getInkomstenopgaveCount(); i++) {
            Util.writeStartElement(writer, "Inkomstenopgave");
            InkomstenopgaveTransformer.write(writer, value.getInkomstenopgave(i));
            Util.writeEndElement(writer);
          }
        }

        static final class PersoonLoonaangifteTransformer {
          public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "Voorletters":
                    builder.setVoorletters(Util.readElementText(reader));
                    break;
                  case "Voorvoegsel":
                    builder.setVoorvoegsel(Util.readElementText(reader));
                    break;
                  case "SignificantDeelVanDeAchternaam":
                    builder.setSignificantDeelVanDeAchternaam(Util.readElementText(reader));
                    break;
                  case "Geslacht":
                    builder.setGeslacht(Util.readElementText(reader));
                    break;
                  case "Geboortedat":
                    builder.setGeboortedat(Util.readElementText(reader));
                    break;
                  case "FeitelijkAdresLoonaangifte":
                    builder.addFeitelijkAdresLoonaangifte(FeitelijkAdresLoonaangifteTransformer.read(reader));
                    break;
                  case "Nationaliteit":
                    builder.addNationaliteit(NationaliteitTransformer.read(reader));
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
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte value)
              throws XMLStreamException {
            Util.writeElement(writer, "Voorletters", value.getVoorletters());
            Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
            Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
            Util.writeElement(writer, "Geslacht", value.getGeslacht());
            Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
            for (int i = 0; i < value.getFeitelijkAdresLoonaangifteCount(); i++) {
              Util.writeStartElement(writer, "FeitelijkAdresLoonaangifte");
              FeitelijkAdresLoonaangifteTransformer.write(writer, value.getFeitelijkAdresLoonaangifte(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getNationaliteitCount(); i++) {
              Util.writeStartElement(writer, "Nationaliteit");
              NationaliteitTransformer.write(writer, value.getNationaliteit(i));
              Util.writeEndElement(writer);
            }
          }

          static final class FeitelijkAdresLoonaangifteTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.FeitelijkAdresLoonaangifte read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.FeitelijkAdresLoonaangifte.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.FeitelijkAdresLoonaangifte.newBuilder();
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
                      builder.setStraatadres(StraatadresTypeTransformer.read(reader));
                      break;
                    case "StraatadresBuitenland":
                      builder.setStraatadresBuitenland(StraatadresBuitenlandTypeTransformer.read(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.FeitelijkAdresLoonaangifte value)
                throws XMLStreamException {
              Util.writeElement(writer, "DatBAdres", value.getDatBAdres());
              Util.writeElement(writer, "DatEAdres", value.getDatEAdres());
              if (value.hasStraatadres()) {
                Util.writeStartElement(writer, "Straatadres");
                StraatadresTypeTransformer.write(writer, value.getStraatadres());
                Util.writeEndElement(writer);
              }
              if (value.hasStraatadresBuitenland()) {
                Util.writeStartElement(writer, "StraatadresBuitenland");
                StraatadresBuitenlandTypeTransformer.write(writer, value.getStraatadresBuitenland());
                Util.writeEndElement(writer);
              }
            }
          }

          static final class NationaliteitTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.Nationaliteit read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.Nationaliteit.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.Nationaliteit.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "CdNationaliteit":
                      builder.setCdNationaliteit(Util.readElementText(reader));
                      break;
                    case "DatBNationaliteit":
                      builder.setDatBNationaliteit(Util.readElementText(reader));
                      break;
                    case "DatENationaliteit":
                      builder.setDatENationaliteit(Util.readElementText(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.PersoonLoonaangifte.Nationaliteit value)
                throws XMLStreamException {
              Util.writeElement(writer, "CdNationaliteit", value.getCdNationaliteit());
              Util.writeElement(writer, "DatBNationaliteit", value.getDatBNationaliteit());
              Util.writeElement(writer, "DatENationaliteit", value.getDatENationaliteit());
            }
          }
        }

        static final class AdministratieveEenheidTransformer {
          public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.newBuilder();
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
                  case "DatBAdministratieveEenheid":
                    builder.setDatBAdministratieveEenheid(Util.readElementText(reader));
                    break;
                  case "DatEAdministratieveEenheid":
                    builder.setDatEAdministratieveEenheid(Util.readElementText(reader));
                    break;
                  case "PersoonAdministratieveEenheid":
                    builder.setPersoonAdministratieveEenheid(PersoonAdministratieveEenheidTransformer.read(reader));
                    break;
                  case "RechtspersoonAdministratieveEenh":
                    builder.setRechtspersoonAdministratieveEenh(RechtspersoonAdministratieveEenhTransformer.read(reader));
                    break;
                  case "FeitelijkAdresAeh":
                    builder.addFeitelijkAdresAeh(AdresTypeTransformer.read(reader));
                    break;
                  case "CorrespondentieadresAeh":
                    builder.addCorrespondentieadresAeh(AdresTypeTransformer.read(reader));
                    break;
                  case "FaillissementSurseance":
                    builder.addFaillissementSurseance(FaillissementSurseanceTransformer.read(reader));
                    break;
                  case "Gemoedsbezwaardheid":
                    builder.addGemoedsbezwaardheid(GemoedsbezwaardheidTransformer.read(reader));
                    break;
                  case "Afdrachtplicht":
                    builder.addAfdrachtplicht(AfdrachtplichtTransformer.read(reader));
                    break;
                  case "Eigenrisicodrager":
                    builder.addEigenrisicodrager(EigenrisicodragerTransformer.read(reader));
                    break;
                  case "SectorRisicogroepAeh":
                    builder.addSectorRisicogroepAeh(SectorRisicogroepTypeTransformer.read(reader));
                    break;
                  case "VoortzettingsrelatieOpvolger":
                    builder.addVoortzettingsrelatieOpvolger(VoortzettingsrelatieTypeTransformer.read(reader));
                    break;
                  case "VoortzettingsrelatieVoorganger":
                    builder.addVoortzettingsrelatieVoorganger(VoortzettingsrelatieTypeTransformer.read(reader));
                    break;
                  case "PremiepercentageIndividueel":
                    builder.addPremiepercentageIndividueel(PremiepercentageIndividueelTransformer.read(reader));
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
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid value)
              throws XMLStreamException {
            Util.writeElement(writer, "NaamAdministratieveEenheid", value.getNaamAdministratieveEenheid());
            Util.writeElement(writer, "Loonheffingennr", value.getLoonheffingennr());
            Util.writeElement(writer, "DatBAdministratieveEenheid", value.getDatBAdministratieveEenheid());
            Util.writeElement(writer, "DatEAdministratieveEenheid", value.getDatEAdministratieveEenheid());
            if (value.hasPersoonAdministratieveEenheid()) {
              Util.writeStartElement(writer, "PersoonAdministratieveEenheid");
              PersoonAdministratieveEenheidTransformer.write(writer, value.getPersoonAdministratieveEenheid());
              Util.writeEndElement(writer);
            }
            if (value.hasRechtspersoonAdministratieveEenh()) {
              Util.writeStartElement(writer, "RechtspersoonAdministratieveEenh");
              RechtspersoonAdministratieveEenhTransformer.write(writer, value.getRechtspersoonAdministratieveEenh());
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getFeitelijkAdresAehCount(); i++) {
              Util.writeStartElement(writer, "FeitelijkAdresAeh");
              AdresTypeTransformer.write(writer, value.getFeitelijkAdresAeh(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getCorrespondentieadresAehCount(); i++) {
              Util.writeStartElement(writer, "CorrespondentieadresAeh");
              AdresTypeTransformer.write(writer, value.getCorrespondentieadresAeh(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getFaillissementSurseanceCount(); i++) {
              Util.writeStartElement(writer, "FaillissementSurseance");
              FaillissementSurseanceTransformer.write(writer, value.getFaillissementSurseance(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getGemoedsbezwaardheidCount(); i++) {
              Util.writeStartElement(writer, "Gemoedsbezwaardheid");
              GemoedsbezwaardheidTransformer.write(writer, value.getGemoedsbezwaardheid(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getAfdrachtplichtCount(); i++) {
              Util.writeStartElement(writer, "Afdrachtplicht");
              AfdrachtplichtTransformer.write(writer, value.getAfdrachtplicht(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getEigenrisicodragerCount(); i++) {
              Util.writeStartElement(writer, "Eigenrisicodrager");
              EigenrisicodragerTransformer.write(writer, value.getEigenrisicodrager(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getSectorRisicogroepAehCount(); i++) {
              Util.writeStartElement(writer, "SectorRisicogroepAeh");
              SectorRisicogroepTypeTransformer.write(writer, value.getSectorRisicogroepAeh(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getVoortzettingsrelatieOpvolgerCount(); i++) {
              Util.writeStartElement(writer, "VoortzettingsrelatieOpvolger");
              VoortzettingsrelatieTypeTransformer.write(writer, value.getVoortzettingsrelatieOpvolger(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getVoortzettingsrelatieVoorgangerCount(); i++) {
              Util.writeStartElement(writer, "VoortzettingsrelatieVoorganger");
              VoortzettingsrelatieTypeTransformer.write(writer, value.getVoortzettingsrelatieVoorganger(i));
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getPremiepercentageIndividueelCount(); i++) {
              Util.writeStartElement(writer, "PremiepercentageIndividueel");
              PremiepercentageIndividueelTransformer.write(writer, value.getPremiepercentageIndividueel(i));
              Util.writeEndElement(writer);
            }
          }

          static final class PersoonAdministratieveEenheidTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "Burgerservicenr":
                      builder.setBurgerservicenr(Util.readElementText(reader));
                      break;
                    case "Voornamen":
                      builder.setVoornamen(Util.readElementText(reader));
                      break;
                    case "Voorvoegsel":
                      builder.setVoorvoegsel(Util.readElementText(reader));
                      break;
                    case "SignificantDeelVanDeAchternaam":
                      builder.setSignificantDeelVanDeAchternaam(Util.readElementText(reader));
                      break;
                    case "FeitelijkAdresPersoonAeh":
                      builder.addFeitelijkAdresPersoonAeh(AdresTypeTransformer.read(reader));
                      break;
                    case "CorrespondentieadresPersoonAeh":
                      builder.addCorrespondentieadresPersoonAeh(AdresTypeTransformer.read(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid value)
                throws XMLStreamException {
              Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
              Util.writeElement(writer, "Voornamen", value.getVoornamen());
              Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
              Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
              for (int i = 0; i < value.getFeitelijkAdresPersoonAehCount(); i++) {
                Util.writeStartElement(writer, "FeitelijkAdresPersoonAeh");
                AdresTypeTransformer.write(writer, value.getFeitelijkAdresPersoonAeh(i));
                Util.writeEndElement(writer);
              }
              for (int i = 0; i < value.getCorrespondentieadresPersoonAehCount(); i++) {
                Util.writeStartElement(writer, "CorrespondentieadresPersoonAeh");
                AdresTypeTransformer.write(writer, value.getCorrespondentieadresPersoonAeh(i));
                Util.writeEndElement(writer);
              }
            }
          }

          static final class RechtspersoonAdministratieveEenhTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "FiNr":
                      builder.setFiNr(Util.readElementText(reader));
                      break;
                    case "NaamRechtspersoon":
                      builder.setNaamRechtspersoon(Util.readElementText(reader));
                      break;
                    case "CdRechtsvorm":
                      builder.setCdRechtsvorm(Util.readElementText(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh value)
                throws XMLStreamException {
              Util.writeElement(writer, "FiNr", value.getFiNr());
              Util.writeElement(writer, "NaamRechtspersoon", value.getNaamRechtspersoon());
              Util.writeElement(writer, "CdRechtsvorm", value.getCdRechtsvorm());
            }
          }

          static final class FaillissementSurseanceTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FaillissementSurseance read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FaillissementSurseance.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FaillissementSurseance.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "CdFaillissementSurseance":
                      builder.setCdFaillissementSurseance(Util.readElementText(reader));
                      break;
                    case "CdRedenEFaillissementSurseance":
                      builder.setCdRedenEFaillissementSurseance(Util.readElementText(reader));
                      break;
                    case "DatBFaillissementSurseance":
                      builder.setDatBFaillissementSurseance(Util.readElementText(reader));
                      break;
                    case "DatEFaillissementSurseance":
                      builder.setDatEFaillissementSurseance(Util.readElementText(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FaillissementSurseance value)
                throws XMLStreamException {
              Util.writeElement(writer, "CdFaillissementSurseance", value.getCdFaillissementSurseance());
              Util.writeElement(writer, "CdRedenEFaillissementSurseance", value.getCdRedenEFaillissementSurseance());
              Util.writeElement(writer, "DatBFaillissementSurseance", value.getDatBFaillissementSurseance());
              Util.writeElement(writer, "DatEFaillissementSurseance", value.getDatEFaillissementSurseance());
            }
          }

          static final class GemoedsbezwaardheidTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Gemoedsbezwaardheid read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Gemoedsbezwaardheid.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Gemoedsbezwaardheid.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "DatBGemoedsbezwaardheid":
                      builder.setDatBGemoedsbezwaardheid(Util.readElementText(reader));
                      break;
                    case "DatEGemoedsbezwaardheid":
                      builder.setDatEGemoedsbezwaardheid(Util.readElementText(reader));
                      break;
                    case "SzWet":
                      builder.setSzWet(SzWetTypeTransformer.read(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Gemoedsbezwaardheid value)
                throws XMLStreamException {
              Util.writeElement(writer, "DatBGemoedsbezwaardheid", value.getDatBGemoedsbezwaardheid());
              Util.writeElement(writer, "DatEGemoedsbezwaardheid", value.getDatEGemoedsbezwaardheid());
              if (value.hasSzWet()) {
                Util.writeStartElement(writer, "SzWet");
                SzWetTypeTransformer.write(writer, value.getSzWet());
                Util.writeEndElement(writer);
              }
            }
          }

          static final class AfdrachtplichtTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Afdrachtplicht read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Afdrachtplicht.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Afdrachtplicht.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "DatBAfdrachtplicht":
                      builder.setDatBAfdrachtplicht(Util.readElementText(reader));
                      break;
                    case "DatEAfdrachtplicht":
                      builder.setDatEAfdrachtplicht(Util.readElementText(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Afdrachtplicht value)
                throws XMLStreamException {
              Util.writeElement(writer, "DatBAfdrachtplicht", value.getDatBAfdrachtplicht());
              Util.writeElement(writer, "DatEAfdrachtplicht", value.getDatEAfdrachtplicht());
            }
          }

          static final class EigenrisicodragerTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Eigenrisicodrager read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Eigenrisicodrager.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Eigenrisicodrager.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "DatBEigenrisicodrager":
                      builder.setDatBEigenrisicodrager(Util.readElementText(reader));
                      break;
                    case "DatEEigenrisicodrager":
                      builder.setDatEEigenrisicodrager(Util.readElementText(reader));
                      break;
                    case "SzWet":
                      builder.setSzWet(SzWetTypeTransformer.read(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.Eigenrisicodrager value)
                throws XMLStreamException {
              Util.writeElement(writer, "DatBEigenrisicodrager", value.getDatBEigenrisicodrager());
              Util.writeElement(writer, "DatEEigenrisicodrager", value.getDatEEigenrisicodrager());
              if (value.hasSzWet()) {
                Util.writeStartElement(writer, "SzWet");
                SzWetTypeTransformer.write(writer, value.getSzWet());
                Util.writeEndElement(writer);
              }
            }
          }

          static final class PremiepercentageIndividueelTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PremiepercentageIndividueel read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PremiepercentageIndividueel.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PremiepercentageIndividueel.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "PremiepercentageIndividueel":
                      builder.setPremiepercentageIndividueel(StandaardPercTypeTransformer.read(reader));
                      break;
                    case "DatBPremiepercentageIndividueel":
                      builder.setDatBPremiepercentageIndividueel(Util.readElementText(reader));
                      break;
                    case "DatEPremiepercentageIndividueel":
                      builder.setDatEPremiepercentageIndividueel(Util.readElementText(reader));
                      break;
                    case "SzWet":
                      builder.setSzWet(SzWetTypeTransformer.read(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PremiepercentageIndividueel value)
                throws XMLStreamException {
              if (value.hasPremiepercentageIndividueel()) {
                Util.writeStartElement(writer, "PremiepercentageIndividueel");
                StandaardPercTypeTransformer.write(writer, value.getPremiepercentageIndividueel());
                Util.writeEndElement(writer);
              }
              Util.writeElement(writer, "DatBPremiepercentageIndividueel", value.getDatBPremiepercentageIndividueel());
              Util.writeElement(writer, "DatEPremiepercentageIndividueel", value.getDatEPremiepercentageIndividueel());
              if (value.hasSzWet()) {
                Util.writeStartElement(writer, "SzWet");
                SzWetTypeTransformer.write(writer, value.getSzWet());
                Util.writeEndElement(writer);
              }
            }
          }
        }

        static final class InkomstenperiodeTransformer {
          public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode.newBuilder();
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
                  case "CdTypeArbeidscontract":
                    builder.setCdTypeArbeidscontract(Util.readElementText(reader));
                    break;
                  case "CdInvloedVerzekeringsplicht":
                    builder.setCdInvloedVerzekeringsplicht(Util.readElementText(reader));
                    break;
                  case "IndLoonheffingskortingToegepast":
                    builder.setIndLoonheffingskortingToegepast(Util.readElementText(reader));
                    break;
                  case "IndRegelmatigArbeidspatroon":
                    builder.setIndRegelmatigArbeidspatroon(Util.readElementText(reader));
                    break;
                  case "IndVerzekerdWaoWia":
                    builder.setIndVerzekerdWaoWia(Util.readElementText(reader));
                    break;
                  case "IndVerzekerdWw":
                    builder.setIndVerzekerdWw(Util.readElementText(reader));
                    break;
                  case "IndVerzekerdZw":
                    builder.setIndVerzekerdZw(Util.readElementText(reader));
                    break;
                  case "CdVerzekeringssituatieZvw":
                    builder.setCdVerzekeringssituatieZvw(Util.readElementText(reader));
                    break;
                  case "IndVervoerVanwegeDeIhp":
                    builder.setIndVervoerVanwegeDeIhp(Util.readElementText(reader));
                    break;
                  case "IndPersoneelsleningNietInLoon":
                    builder.setIndPersoneelsleningNietInLoon(Util.readElementText(reader));
                    break;
                  case "IndLoonIsMedeAowAioAlleenstaande":
                    builder.setIndLoonIsMedeAowAioAlleenstaande(Util.readElementText(reader));
                    break;
                  case "IndLoonInclusiefWajongUitkering":
                    builder.setIndLoonInclusiefWajongUitkering(Util.readElementText(reader));
                    break;
                  case "IndVakantiebonnenToegepast":
                    builder.setIndVakantiebonnenToegepast(Util.readElementText(reader));
                    break;
                  case "IndAanvullingOpUitkering":
                    builder.setIndAanvullingOpUitkering(Util.readElementText(reader));
                    break;
                  case "CdAardIkv":
                    builder.setCdAardIkv(Util.readElementText(reader));
                    break;
                  case "CdPremiekorting":
                    builder.setCdPremiekorting(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingAghWn":
                    builder.setIndPremiekortingAghWn(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingInDienstNemenAghWn":
                    builder.setIndPremiekortingInDienstNemenAghWn(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingDlgrpBanenafsprkSchlblm":
                    builder.setIndPremiekortingDlgrpBanenafsprkSchlblm(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingHerplaatsenAghWn":
                    builder.setIndPremiekortingHerplaatsenAghWn(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingOudereWerknemer":
                    builder.setIndPremiekortingOudereWerknemer(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingOudereWn":
                    builder.setIndPremiekortingOudereWn(Util.readElementText(reader));
                    break;
                  case "IndPremiekortingJongereWn":
                    builder.setIndPremiekortingJongereWn(Util.readElementText(reader));
                    break;
                  case "IndAanvraagLkvOudereWn":
                    builder.setIndAanvraagLkvOudereWn(Util.readElementText(reader));
                    break;
                  case "IndAanvrgLkvDlgrpBanenafsprkSchlblm":
                    builder.setIndAanvrgLkvDlgrpBanenafsprkSchlblm(Util.readElementText(reader));
                    break;
                  case "IndAanvraagLkvHerplaatsenAghWn":
                    builder.setIndAanvraagLkvHerplaatsenAghWn(Util.readElementText(reader));
                    break;
                  case "IndAanvraagLkvAghWn":
                    builder.setIndAanvraagLkvAghWn(Util.readElementText(reader));
                    break;
                  case "IndWachtgeldOudeRegeling":
                    builder.setIndWachtgeldOudeRegeling(Util.readElementText(reader));
                    break;
                  case "IndPremievrijstellingMargArbeid":
                    builder.setIndPremievrijstellingMargArbeid(Util.readElementText(reader));
                    break;
                  case "CdCao":
                    builder.setCdCao(Util.readElementText(reader));
                    break;
                  case "CdFaseIndelingWfz":
                    builder.setCdFaseIndelingWfz(Util.readElementText(reader));
                    break;
                  case "CdRedenGeenBijtellingAuto":
                    builder.setCdRedenGeenBijtellingAuto(Util.readElementText(reader));
                    break;
                  case "CdIncidInkomstenvermindering":
                    builder.setCdIncidInkomstenvermindering(Util.readElementText(reader));
                    break;
                  case "IndTijdelijkeHeffingskorting":
                    builder.setIndTijdelijkeHeffingskorting(Util.readElementText(reader));
                    break;
                  case "CdLoonbelastingtabelBd":
                    builder.setCdLoonbelastingtabelBd(Util.readElementText(reader));
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
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatBIkp", value.getDatBIkp());
            Util.writeElement(writer, "DatEIkp", value.getDatEIkp());
            Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
            Util.writeElement(writer, "CdTypeArbeidscontract", value.getCdTypeArbeidscontract());
            Util.writeElement(writer, "CdInvloedVerzekeringsplicht", value.getCdInvloedVerzekeringsplicht());
            Util.writeElement(writer, "IndLoonheffingskortingToegepast", value.getIndLoonheffingskortingToegepast());
            Util.writeElement(writer, "IndRegelmatigArbeidspatroon", value.getIndRegelmatigArbeidspatroon());
            Util.writeElement(writer, "IndVerzekerdWaoWia", value.getIndVerzekerdWaoWia());
            Util.writeElement(writer, "IndVerzekerdWw", value.getIndVerzekerdWw());
            Util.writeElement(writer, "IndVerzekerdZw", value.getIndVerzekerdZw());
            Util.writeElement(writer, "CdVerzekeringssituatieZvw", value.getCdVerzekeringssituatieZvw());
            Util.writeElement(writer, "IndVervoerVanwegeDeIhp", value.getIndVervoerVanwegeDeIhp());
            Util.writeElement(writer, "IndPersoneelsleningNietInLoon", value.getIndPersoneelsleningNietInLoon());
            Util.writeElement(writer, "IndLoonIsMedeAowAioAlleenstaande", value.getIndLoonIsMedeAowAioAlleenstaande());
            Util.writeElement(writer, "IndLoonInclusiefWajongUitkering", value.getIndLoonInclusiefWajongUitkering());
            Util.writeElement(writer, "IndVakantiebonnenToegepast", value.getIndVakantiebonnenToegepast());
            Util.writeElement(writer, "IndAanvullingOpUitkering", value.getIndAanvullingOpUitkering());
            Util.writeElement(writer, "CdAardIkv", value.getCdAardIkv());
            Util.writeElement(writer, "CdPremiekorting", value.getCdPremiekorting());
            Util.writeElement(writer, "IndPremiekortingAghWn", value.getIndPremiekortingAghWn());
            Util.writeElement(writer, "IndPremiekortingInDienstNemenAghWn", value.getIndPremiekortingInDienstNemenAghWn());
            Util.writeElement(writer, "IndPremiekortingDlgrpBanenafsprkSchlblm", value.getIndPremiekortingDlgrpBanenafsprkSchlblm());
            Util.writeElement(writer, "IndPremiekortingHerplaatsenAghWn", value.getIndPremiekortingHerplaatsenAghWn());
            Util.writeElement(writer, "IndPremiekortingOudereWerknemer", value.getIndPremiekortingOudereWerknemer());
            Util.writeElement(writer, "IndPremiekortingOudereWn", value.getIndPremiekortingOudereWn());
            Util.writeElement(writer, "IndPremiekortingJongereWn", value.getIndPremiekortingJongereWn());
            Util.writeElement(writer, "IndAanvraagLkvOudereWn", value.getIndAanvraagLkvOudereWn());
            Util.writeElement(writer, "IndAanvrgLkvDlgrpBanenafsprkSchlblm", value.getIndAanvrgLkvDlgrpBanenafsprkSchlblm());
            Util.writeElement(writer, "IndAanvraagLkvHerplaatsenAghWn", value.getIndAanvraagLkvHerplaatsenAghWn());
            Util.writeElement(writer, "IndAanvraagLkvAghWn", value.getIndAanvraagLkvAghWn());
            Util.writeElement(writer, "IndWachtgeldOudeRegeling", value.getIndWachtgeldOudeRegeling());
            Util.writeElement(writer, "IndPremievrijstellingMargArbeid", value.getIndPremievrijstellingMargArbeid());
            Util.writeElement(writer, "CdCao", value.getCdCao());
            Util.writeElement(writer, "CdFaseIndelingWfz", value.getCdFaseIndelingWfz());
            Util.writeElement(writer, "CdRedenGeenBijtellingAuto", value.getCdRedenGeenBijtellingAuto());
            Util.writeElement(writer, "CdIncidInkomstenvermindering", value.getCdIncidInkomstenvermindering());
            Util.writeElement(writer, "IndTijdelijkeHeffingskorting", value.getIndTijdelijkeHeffingskorting());
            Util.writeElement(writer, "CdLoonbelastingtabelBd", value.getCdLoonbelastingtabelBd());
          }
        }

        static final class InkomstenopgaveTransformer {
          public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave.newBuilder();
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
                  case "AantSvDagenIko":
                    builder.setAantSvDagenIko(Util.readElementText(reader));
                    break;
                  case "AantVerloondeUrenIko":
                    builder.setAantVerloondeUrenIko(Util.readElementText(reader));
                    break;
                  case "AantContracturenPerWeek":
                    builder.setAantContracturenPerWeek(Util.readElementText(reader));
                    break;
                  case "BedrBrutoloonSv":
                    builder.setBedrBrutoloonSv(StandaardBedrTypeTransformer.read(reader));
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
                  case "BedrVerstrekteAanvOpUitkWnverz":
                    builder.setBedrVerstrekteAanvOpUitkWnverz(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrVerrekendeArbeidskorting":
                    builder.setBedrVerrekendeArbeidskorting(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrGespaardLevensloopregeling":
                    builder.setBedrGespaardLevensloopregeling(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrLevensloopverlkortToegepast":
                    builder.setBedrLevensloopverlkortToegepast(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrWgbijdrageKinderopvang":
                    builder.setBedrWgbijdrageKinderopvang(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrVergoedingReiskostenOnbelast":
                    builder.setBedrVergoedingReiskostenOnbelast(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPrivegebruikAuto":
                    builder.setBedrPrivegebruikAuto(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrWnbijdragePrivegebruikAuto":
                    builder.setBedrWnbijdragePrivegebruikAuto(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrGenotenZeedagenaftrek":
                    builder.setBedrGenotenZeedagenaftrek(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrInUitkBegrBetAlimentatie":
                    builder.setBedrInUitkBegrBetAlimentatie(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrRechtstreeksBetAlimentatie":
                    builder.setBedrRechtstreeksBetAlimentatie(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrLoonInGeld":
                    builder.setBedrLoonInGeld(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrLoonUitOverwerk":
                    builder.setBedrLoonUitOverwerk(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrLoonBelastTabBijzBeloningen":
                    builder.setBedrLoonBelastTabBijzBeloningen(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieWwAwf":
                    builder.setBedrPremieWwAwf(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieloonWwAwf":
                    builder.setBedrPremieloonWwAwf(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieSectorfonds":
                    builder.setBedrPremieSectorfonds(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieUfo":
                    builder.setBedrPremieUfo(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieloonUfo":
                    builder.setBedrPremieloonUfo(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrIngehoudenBijdrageZvw":
                    builder.setBedrIngehoudenBijdrageZvw(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrVergoedingZvw":
                    builder.setBedrVergoedingZvw(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPemieWaoIvaWga":
                    builder.setBedrPemieWaoIvaWga(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieloonWaoIvaWga":
                    builder.setBedrPremieloonWaoIvaWga(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieWaoWga":
                    builder.setBedrPremieWaoWga(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrPremieloonWaoWga":
                    builder.setBedrPremieloonWaoWga(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrWerkgeversheffingZvw":
                    builder.setBedrWerkgeversheffingZvw(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrNietInGeldUitgekeerdLoon":
                    builder.setBedrNietInGeldUitgekeerdLoon(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrGedifferentieerdePremieWhk":
                    builder.setBedrGedifferentieerdePremieWhk(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrRenteKostenvoordeelPersoneelslening":
                    builder.setBedrRenteKostenvoordeelPersoneelslening(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "BedrContractloon":
                    builder.setBedrContractloon(StandaardBedrTypeTransformer.read(reader));
                    break;
                  case "SectorRisicogroepIko":
                    builder.addSectorRisicogroepIko(SectorRisicogroepIkoTransformer.read(reader));
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
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatBIko", value.getDatBIko());
            Util.writeElement(writer, "DatEIko", value.getDatEIko());
            Util.writeElement(writer, "AantSvDagenIko", value.getAantSvDagenIko());
            Util.writeElement(writer, "AantVerloondeUrenIko", value.getAantVerloondeUrenIko());
            Util.writeElement(writer, "AantContracturenPerWeek", value.getAantContracturenPerWeek());
            if (value.hasBedrBrutoloonSv()) {
              Util.writeStartElement(writer, "BedrBrutoloonSv");
              StandaardBedrTypeTransformer.write(writer, value.getBedrBrutoloonSv());
              Util.writeEndElement(writer);
            }
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
            if (value.hasBedrVerstrekteAanvOpUitkWnverz()) {
              Util.writeStartElement(writer, "BedrVerstrekteAanvOpUitkWnverz");
              StandaardBedrTypeTransformer.write(writer, value.getBedrVerstrekteAanvOpUitkWnverz());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrVerrekendeArbeidskorting()) {
              Util.writeStartElement(writer, "BedrVerrekendeArbeidskorting");
              StandaardBedrTypeTransformer.write(writer, value.getBedrVerrekendeArbeidskorting());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrGespaardLevensloopregeling()) {
              Util.writeStartElement(writer, "BedrGespaardLevensloopregeling");
              StandaardBedrTypeTransformer.write(writer, value.getBedrGespaardLevensloopregeling());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrLevensloopverlkortToegepast()) {
              Util.writeStartElement(writer, "BedrLevensloopverlkortToegepast");
              StandaardBedrTypeTransformer.write(writer, value.getBedrLevensloopverlkortToegepast());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrWgbijdrageKinderopvang()) {
              Util.writeStartElement(writer, "BedrWgbijdrageKinderopvang");
              StandaardBedrTypeTransformer.write(writer, value.getBedrWgbijdrageKinderopvang());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrVergoedingReiskostenOnbelast()) {
              Util.writeStartElement(writer, "BedrVergoedingReiskostenOnbelast");
              StandaardBedrTypeTransformer.write(writer, value.getBedrVergoedingReiskostenOnbelast());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPrivegebruikAuto()) {
              Util.writeStartElement(writer, "BedrPrivegebruikAuto");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPrivegebruikAuto());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrWnbijdragePrivegebruikAuto()) {
              Util.writeStartElement(writer, "BedrWnbijdragePrivegebruikAuto");
              StandaardBedrTypeTransformer.write(writer, value.getBedrWnbijdragePrivegebruikAuto());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrGenotenZeedagenaftrek()) {
              Util.writeStartElement(writer, "BedrGenotenZeedagenaftrek");
              StandaardBedrTypeTransformer.write(writer, value.getBedrGenotenZeedagenaftrek());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrInUitkBegrBetAlimentatie()) {
              Util.writeStartElement(writer, "BedrInUitkBegrBetAlimentatie");
              StandaardBedrTypeTransformer.write(writer, value.getBedrInUitkBegrBetAlimentatie());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrRechtstreeksBetAlimentatie()) {
              Util.writeStartElement(writer, "BedrRechtstreeksBetAlimentatie");
              StandaardBedrTypeTransformer.write(writer, value.getBedrRechtstreeksBetAlimentatie());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrLoonInGeld()) {
              Util.writeStartElement(writer, "BedrLoonInGeld");
              StandaardBedrTypeTransformer.write(writer, value.getBedrLoonInGeld());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrLoonUitOverwerk()) {
              Util.writeStartElement(writer, "BedrLoonUitOverwerk");
              StandaardBedrTypeTransformer.write(writer, value.getBedrLoonUitOverwerk());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrLoonBelastTabBijzBeloningen()) {
              Util.writeStartElement(writer, "BedrLoonBelastTabBijzBeloningen");
              StandaardBedrTypeTransformer.write(writer, value.getBedrLoonBelastTabBijzBeloningen());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieWwAwf()) {
              Util.writeStartElement(writer, "BedrPremieWwAwf");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieWwAwf());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieloonWwAwf()) {
              Util.writeStartElement(writer, "BedrPremieloonWwAwf");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieloonWwAwf());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieSectorfonds()) {
              Util.writeStartElement(writer, "BedrPremieSectorfonds");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieSectorfonds());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieUfo()) {
              Util.writeStartElement(writer, "BedrPremieUfo");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieUfo());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieloonUfo()) {
              Util.writeStartElement(writer, "BedrPremieloonUfo");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieloonUfo());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrIngehoudenBijdrageZvw()) {
              Util.writeStartElement(writer, "BedrIngehoudenBijdrageZvw");
              StandaardBedrTypeTransformer.write(writer, value.getBedrIngehoudenBijdrageZvw());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrVergoedingZvw()) {
              Util.writeStartElement(writer, "BedrVergoedingZvw");
              StandaardBedrTypeTransformer.write(writer, value.getBedrVergoedingZvw());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPemieWaoIvaWga()) {
              Util.writeStartElement(writer, "BedrPemieWaoIvaWga");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPemieWaoIvaWga());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieloonWaoIvaWga()) {
              Util.writeStartElement(writer, "BedrPremieloonWaoIvaWga");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieloonWaoIvaWga());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieWaoWga()) {
              Util.writeStartElement(writer, "BedrPremieWaoWga");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieWaoWga());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrPremieloonWaoWga()) {
              Util.writeStartElement(writer, "BedrPremieloonWaoWga");
              StandaardBedrTypeTransformer.write(writer, value.getBedrPremieloonWaoWga());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrWerkgeversheffingZvw()) {
              Util.writeStartElement(writer, "BedrWerkgeversheffingZvw");
              StandaardBedrTypeTransformer.write(writer, value.getBedrWerkgeversheffingZvw());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrNietInGeldUitgekeerdLoon()) {
              Util.writeStartElement(writer, "BedrNietInGeldUitgekeerdLoon");
              StandaardBedrTypeTransformer.write(writer, value.getBedrNietInGeldUitgekeerdLoon());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrGedifferentieerdePremieWhk()) {
              Util.writeStartElement(writer, "BedrGedifferentieerdePremieWhk");
              StandaardBedrTypeTransformer.write(writer, value.getBedrGedifferentieerdePremieWhk());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrRenteKostenvoordeelPersoneelslening()) {
              Util.writeStartElement(writer, "BedrRenteKostenvoordeelPersoneelslening");
              StandaardBedrTypeTransformer.write(writer, value.getBedrRenteKostenvoordeelPersoneelslening());
              Util.writeEndElement(writer);
            }
            if (value.hasBedrContractloon()) {
              Util.writeStartElement(writer, "BedrContractloon");
              StandaardBedrTypeTransformer.write(writer, value.getBedrContractloon());
              Util.writeEndElement(writer);
            }
            for (int i = 0; i < value.getSectorRisicogroepIkoCount(); i++) {
              Util.writeStartElement(writer, "SectorRisicogroepIko");
              SectorRisicogroepIkoTransformer.write(writer, value.getSectorRisicogroepIko(i));
              Util.writeEndElement(writer);
            }
          }

          static final class SectorRisicogroepIkoTransformer {
            public static UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave.SectorRisicogroepIko read(
                XMLStreamReader reader) throws XMLStreamException {
              QName parent = reader.getName();
              UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave.SectorRisicogroepIko.Builder builder = UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave.SectorRisicogroepIko.newBuilder();
              while (reader.hasNext()) {
                int event = reader.next();
                if (reader.isStartElement()) {
                  QName child = reader.getName();
                  switch(child.toString()) {
                    case "CdSectorRisicogroep":
                      builder.setCdSectorRisicogroep(Util.readElementText(reader));
                      break;
                    case "BedrPremieSectorfonds":
                      builder.setBedrPremieSectorfonds(StandaardBedrTypeTransformer.read(reader));
                      break;
                    case "BedrPremieloonSectorfonds":
                      builder.setBedrPremieloonSectorfonds(StandaardBedrTypeTransformer.read(reader));
                      break;
                    case "SectorBeroepsEnBedrijfsleven":
                      builder.setSectorBeroepsEnBedrijfsleven(SectorBeroepsEnBedrijfslevenTypeTransformer.read(reader));
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
                UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave.SectorRisicogroepIko value)
                throws XMLStreamException {
              Util.writeElement(writer, "CdSectorRisicogroep", value.getCdSectorRisicogroep());
              if (value.hasBedrPremieSectorfonds()) {
                Util.writeStartElement(writer, "BedrPremieSectorfonds");
                StandaardBedrTypeTransformer.write(writer, value.getBedrPremieSectorfonds());
                Util.writeEndElement(writer);
              }
              if (value.hasBedrPremieloonSectorfonds()) {
                Util.writeStartElement(writer, "BedrPremieloonSectorfonds");
                StandaardBedrTypeTransformer.write(writer, value.getBedrPremieloonSectorfonds());
                Util.writeEndElement(writer);
              }
              if (value.hasSectorBeroepsEnBedrijfsleven()) {
                Util.writeStartElement(writer, "SectorBeroepsEnBedrijfsleven");
                SectorBeroepsEnBedrijfslevenTypeTransformer.write(writer, value.getSectorBeroepsEnBedrijfsleven());
                Util.writeEndElement(writer);
              }
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
