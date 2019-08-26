package io.codegen.wi.suwiml.stax.brpdossierpersoongsd_v0101;

import io.codegen.wi.suwiml.proto.brpdossierpersoongsd_v0101.AanvraagPersoon;
import io.codegen.wi.suwiml.proto.brpdossierpersoongsd_v0101.AanvraagPersoonResponse;
import io.codegen.wi.suwiml.proto.brpdossierpersoongsd_v0101.MeldingType;
import io.codegen.wi.suwiml.stax.util.Util;
import java.lang.String;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public final class BRPDossierPersoonGSD_v0101Transformer {
  public static AanvraagPersoon readAanvraagPersoon(XMLStreamReader reader) throws
      XMLStreamException {
    Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoon/GSD/v0101}AanvraagPersoon"));
    return AanvraagPersoonTransformer.read(reader);
  }

  public static void writeAanvraagPersoon(XMLStreamWriter writer, AanvraagPersoon value,
      String messageId, String from, String to) throws XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoon/GSD-v0101/AanvraagPersoon", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoon/GSD/v0101", "AanvraagPersoon", "smls");
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
      Util.validateStartElement(reader, new QName("http://bkwi.nl/SuwiML/FWI/v0203", "Fout"));
      MeldingType fault = MeldingTypeTransformer.read(reader);
      return AanvraagPersoonResponse.newBuilder()
        .setFWI(AanvraagPersoonResponse.FWI.newBuilder()
          .addFout(fault)
          .build())
        .build();
    } else {
      Util.validateStartElement(reader, QName.valueOf("{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoon/GSD/v0101}AanvraagPersoonResponse"));
      return AanvraagPersoonResponseTransformer.read(reader);
    }
  }

  public static void writeAanvraagPersoonResponse(XMLStreamWriter writer,
      AanvraagPersoonResponse value, String messageId, String from, String to) throws
      XMLStreamException {
    Util.writeSOAPEnvelope(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoon/GSD-v0101/AanvraagPersoonResponse", messageId, from, to);
    Util.writeStartElement(writer, "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoon/GSD/v0101", "AanvraagPersoonResponse", "smls");
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
            case "ClientSuwi":
              builder.addClientSuwi(ClientSuwiTransformer.read(reader));
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

    public static void write(XMLStreamWriter writer, AanvraagPersoonResponse value) throws
        XMLStreamException {
      for (int i = 0; i < value.getClientSuwiCount(); i++) {
        Util.writeStartElement(writer, "ClientSuwi");
        ClientSuwiTransformer.write(writer, value.getClientSuwi(i));
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
      public static AanvraagPersoonResponse.ClientSuwi read(XMLStreamReader reader) throws
          XMLStreamException {
        QName parent = reader.getName();
        AanvraagPersoonResponse.ClientSuwi.Builder builder = AanvraagPersoonResponse.ClientSuwi.newBuilder();
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
              case "CdBrpGegevensGeheim":
                builder.setCdBrpGegevensGeheim(Util.readElementText(reader));
                break;
              case "ANr":
                builder.setANr(Util.readElementText(reader));
                break;
              case "AanduidingNaamgebruik":
                builder.setAanduidingNaamgebruik(Util.readElementText(reader));
                break;
              case "Geslacht":
                builder.setGeslacht(Util.readElementText(reader));
                break;
              case "CdGeboortegemeente":
                builder.setCdGeboortegemeente(Util.readElementText(reader));
                break;
              case "Geboorteplaats":
                builder.setGeboorteplaats(Util.readElementText(reader));
                break;
              case "Geboorteland":
                builder.setGeboorteland(Util.readElementText(reader));
                break;
              case "Titulatuur":
                builder.setTitulatuur(TitulatuurTypeTransformer.read(reader));
                break;
              case "OnderzoekGegPersoon":
                builder.setOnderzoekGegPersoon(OnderzoekGegTypeTransformer.read(reader));
                break;
              case "GeldigheidGegevensPersoon":
                builder.setGeldigheidGegevensPersoon(GeldigheidTypeTransformer.read(reader));
                break;
              case "ClientSuwiHistorisch":
                builder.addClientSuwiHistorisch(ClientSuwiHistorischTransformer.read(reader));
                break;
              case "Nationaliteit":
                builder.addNationaliteit(NationaliteitTransformer.read(reader));
                break;
              case "NationaliteitHistorisch":
                builder.addNationaliteitHistorisch(NationaliteitHistorischTransformer.read(reader));
                break;
              case "Verblijfstitel":
                builder.setVerblijfstitel(VerblijfstitelTransformer.read(reader));
                break;
              case "VerblijfstitelHistorisch":
                builder.addVerblijfstitelHistorisch(VerblijfstitelHistorischTransformer.read(reader));
                break;
              case "DomicilieAdres":
                builder.setDomicilieAdres(StraatadresTypeTransformer.read(reader));
                break;
              case "Correspondentieadres":
                builder.setCorrespondentieadres(StraatadresTypeTransformer.read(reader));
                break;
              case "FeitelijkAdresBuitenland":
                builder.setFeitelijkAdresBuitenland(FeitelijkAdresBuitenlandTransformer.read(reader));
                break;
              case "Immigratie":
                builder.setImmigratie(ImmigratieTypeTransformer.read(reader));
                break;
              case "AangifteAdreshoudingBrp":
                builder.setAangifteAdreshoudingBrp(AangifteAdreshoudingBrpTypeTransformer.read(reader));
                break;
              case "OnderzoekGegVerblijfplaats":
                builder.setOnderzoekGegVerblijfplaats(OnderzoekGegTypeTransformer.read(reader));
                break;
              case "VerblijfplaatsHistorisch":
                builder.addVerblijfplaatsHistorisch(VerblijfplaatsHistorischTransformer.read(reader));
                break;
              case "Overlijden":
                builder.setOverlijden(OverlijdenTransformer.read(reader));
                break;
              case "Ouder1":
                builder.setOuder1(OuderType_1Transformer.read(reader));
                break;
              case "Ouder2":
                builder.setOuder2(OuderTypeTransformer.read(reader));
                break;
              case "Huwelijk":
                builder.addHuwelijk(HuwelijkTransformer.read(reader));
                break;
              case "HuwelijkHistorisch":
                builder.addHuwelijkHistorisch(HuwelijkHistorischTransformer.read(reader));
                break;
              case "Kind":
                builder.addKind(KindTransformer.read(reader));
                break;
              case "Gezagsverhouding":
                builder.setGezagsverhouding(GezagsverhoudingTransformer.read(reader));
                break;
              case "InschrijvingsgegevensBrp":
                builder.setInschrijvingsgegevensBrp(InschrijvingsgegevensBrpTransformer.read(reader));
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

      public static void write(XMLStreamWriter writer, AanvraagPersoonResponse.ClientSuwi value)
          throws XMLStreamException {
        Util.writeElement(writer, "Voornamen", value.getVoornamen());
        Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
        Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
        Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
        Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
        Util.writeElement(writer, "CdBrpGegevensGeheim", value.getCdBrpGegevensGeheim());
        Util.writeElement(writer, "ANr", value.getANr());
        Util.writeElement(writer, "AanduidingNaamgebruik", value.getAanduidingNaamgebruik());
        Util.writeElement(writer, "Geslacht", value.getGeslacht());
        Util.writeElement(writer, "CdGeboortegemeente", value.getCdGeboortegemeente());
        Util.writeElement(writer, "Geboorteplaats", value.getGeboorteplaats());
        Util.writeElement(writer, "Geboorteland", value.getGeboorteland());
        if (value.hasTitulatuur()) {
          Util.writeStartElement(writer, "Titulatuur");
          TitulatuurTypeTransformer.write(writer, value.getTitulatuur());
          Util.writeEndElement(writer);
        }
        if (value.hasOnderzoekGegPersoon()) {
          Util.writeStartElement(writer, "OnderzoekGegPersoon");
          OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegPersoon());
          Util.writeEndElement(writer);
        }
        if (value.hasGeldigheidGegevensPersoon()) {
          Util.writeStartElement(writer, "GeldigheidGegevensPersoon");
          GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensPersoon());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getClientSuwiHistorischCount(); i++) {
          Util.writeStartElement(writer, "ClientSuwiHistorisch");
          ClientSuwiHistorischTransformer.write(writer, value.getClientSuwiHistorisch(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getNationaliteitCount(); i++) {
          Util.writeStartElement(writer, "Nationaliteit");
          NationaliteitTransformer.write(writer, value.getNationaliteit(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getNationaliteitHistorischCount(); i++) {
          Util.writeStartElement(writer, "NationaliteitHistorisch");
          NationaliteitHistorischTransformer.write(writer, value.getNationaliteitHistorisch(i));
          Util.writeEndElement(writer);
        }
        if (value.hasVerblijfstitel()) {
          Util.writeStartElement(writer, "Verblijfstitel");
          VerblijfstitelTransformer.write(writer, value.getVerblijfstitel());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getVerblijfstitelHistorischCount(); i++) {
          Util.writeStartElement(writer, "VerblijfstitelHistorisch");
          VerblijfstitelHistorischTransformer.write(writer, value.getVerblijfstitelHistorisch(i));
          Util.writeEndElement(writer);
        }
        if (value.hasDomicilieAdres()) {
          Util.writeStartElement(writer, "DomicilieAdres");
          StraatadresTypeTransformer.write(writer, value.getDomicilieAdres());
          Util.writeEndElement(writer);
        }
        if (value.hasCorrespondentieadres()) {
          Util.writeStartElement(writer, "Correspondentieadres");
          StraatadresTypeTransformer.write(writer, value.getCorrespondentieadres());
          Util.writeEndElement(writer);
        }
        if (value.hasFeitelijkAdresBuitenland()) {
          Util.writeStartElement(writer, "FeitelijkAdresBuitenland");
          FeitelijkAdresBuitenlandTransformer.write(writer, value.getFeitelijkAdresBuitenland());
          Util.writeEndElement(writer);
        }
        if (value.hasImmigratie()) {
          Util.writeStartElement(writer, "Immigratie");
          ImmigratieTypeTransformer.write(writer, value.getImmigratie());
          Util.writeEndElement(writer);
        }
        if (value.hasAangifteAdreshoudingBrp()) {
          Util.writeStartElement(writer, "AangifteAdreshoudingBrp");
          AangifteAdreshoudingBrpTypeTransformer.write(writer, value.getAangifteAdreshoudingBrp());
          Util.writeEndElement(writer);
        }
        if (value.hasOnderzoekGegVerblijfplaats()) {
          Util.writeStartElement(writer, "OnderzoekGegVerblijfplaats");
          OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegVerblijfplaats());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getVerblijfplaatsHistorischCount(); i++) {
          Util.writeStartElement(writer, "VerblijfplaatsHistorisch");
          VerblijfplaatsHistorischTransformer.write(writer, value.getVerblijfplaatsHistorisch(i));
          Util.writeEndElement(writer);
        }
        if (value.hasOverlijden()) {
          Util.writeStartElement(writer, "Overlijden");
          OverlijdenTransformer.write(writer, value.getOverlijden());
          Util.writeEndElement(writer);
        }
        if (value.hasOuder1()) {
          Util.writeStartElement(writer, "Ouder1");
          OuderType_1Transformer.write(writer, value.getOuder1());
          Util.writeEndElement(writer);
        }
        if (value.hasOuder2()) {
          Util.writeStartElement(writer, "Ouder2");
          OuderTypeTransformer.write(writer, value.getOuder2());
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getHuwelijkCount(); i++) {
          Util.writeStartElement(writer, "Huwelijk");
          HuwelijkTransformer.write(writer, value.getHuwelijk(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getHuwelijkHistorischCount(); i++) {
          Util.writeStartElement(writer, "HuwelijkHistorisch");
          HuwelijkHistorischTransformer.write(writer, value.getHuwelijkHistorisch(i));
          Util.writeEndElement(writer);
        }
        for (int i = 0; i < value.getKindCount(); i++) {
          Util.writeStartElement(writer, "Kind");
          KindTransformer.write(writer, value.getKind(i));
          Util.writeEndElement(writer);
        }
        if (value.hasGezagsverhouding()) {
          Util.writeStartElement(writer, "Gezagsverhouding");
          GezagsverhoudingTransformer.write(writer, value.getGezagsverhouding());
          Util.writeEndElement(writer);
        }
        if (value.hasInschrijvingsgegevensBrp()) {
          Util.writeStartElement(writer, "InschrijvingsgegevensBrp");
          InschrijvingsgegevensBrpTransformer.write(writer, value.getInschrijvingsgegevensBrp());
          Util.writeEndElement(writer);
        }
      }

      static final class ClientSuwiHistorischTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.ClientSuwiHistorisch read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.ClientSuwiHistorisch.Builder builder = AanvraagPersoonResponse.ClientSuwi.ClientSuwiHistorisch.newBuilder();
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
                case "OnderzoekGegPersoon":
                  builder.setOnderzoekGegPersoon(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "OnjuistGegPersoon":
                  builder.setOnjuistGegPersoon(OnjuistGegTypeTransformer.read(reader));
                  break;
                case "GeldigheidGegevensPersoon":
                  builder.setGeldigheidGegevensPersoon(GeldigheidTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.ClientSuwiHistorisch value) throws
            XMLStreamException {
          Util.writeElement(writer, "Voornamen", value.getVoornamen());
          Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
          Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
          Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
          Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
          Util.writeElement(writer, "ANr", value.getANr());
          if (value.hasOnderzoekGegPersoon()) {
            Util.writeStartElement(writer, "OnderzoekGegPersoon");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegPersoon());
            Util.writeEndElement(writer);
          }
          if (value.hasOnjuistGegPersoon()) {
            Util.writeStartElement(writer, "OnjuistGegPersoon");
            OnjuistGegTypeTransformer.write(writer, value.getOnjuistGegPersoon());
            Util.writeEndElement(writer);
          }
          if (value.hasGeldigheidGegevensPersoon()) {
            Util.writeStartElement(writer, "GeldigheidGegevensPersoon");
            GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensPersoon());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class NationaliteitTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.Nationaliteit read(XMLStreamReader reader)
            throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.Nationaliteit.Builder builder = AanvraagPersoonResponse.ClientSuwi.Nationaliteit.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "CdNationaliteit":
                  builder.setCdNationaliteit(Util.readElementText(reader));
                  break;
                case "OnderzoekGegNationaliteit":
                  builder.setOnderzoekGegNationaliteit(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "CdBijzonderNederlanderschap":
                  builder.setCdBijzonderNederlanderschap(Util.readElementText(reader));
                  break;
                case "GeldigheidGegevensNationaliteit":
                  builder.setGeldigheidGegevensNationaliteit(GeldigheidTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.Nationaliteit value) throws XMLStreamException {
          Util.writeElement(writer, "CdNationaliteit", value.getCdNationaliteit());
          if (value.hasOnderzoekGegNationaliteit()) {
            Util.writeStartElement(writer, "OnderzoekGegNationaliteit");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegNationaliteit());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "CdBijzonderNederlanderschap", value.getCdBijzonderNederlanderschap());
          if (value.hasGeldigheidGegevensNationaliteit()) {
            Util.writeStartElement(writer, "GeldigheidGegevensNationaliteit");
            GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensNationaliteit());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class NationaliteitHistorischTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.NationaliteitHistorisch read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.NationaliteitHistorisch.Builder builder = AanvraagPersoonResponse.ClientSuwi.NationaliteitHistorisch.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "CdNationaliteit":
                  builder.setCdNationaliteit(Util.readElementText(reader));
                  break;
                case "OnderzoekGegNationaliteit":
                  builder.setOnderzoekGegNationaliteit(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "OnjuistGegNationaliteit":
                  builder.setOnjuistGegNationaliteit(OnjuistGegTypeTransformer.read(reader));
                  break;
                case "CdBijzonderNederlanderschap":
                  builder.setCdBijzonderNederlanderschap(Util.readElementText(reader));
                  break;
                case "GeldigheidGegevensNationaliteit":
                  builder.setGeldigheidGegevensNationaliteit(GeldigheidTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.NationaliteitHistorisch value) throws
            XMLStreamException {
          Util.writeElement(writer, "CdNationaliteit", value.getCdNationaliteit());
          if (value.hasOnderzoekGegNationaliteit()) {
            Util.writeStartElement(writer, "OnderzoekGegNationaliteit");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegNationaliteit());
            Util.writeEndElement(writer);
          }
          if (value.hasOnjuistGegNationaliteit()) {
            Util.writeStartElement(writer, "OnjuistGegNationaliteit");
            OnjuistGegTypeTransformer.write(writer, value.getOnjuistGegNationaliteit());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "CdBijzonderNederlanderschap", value.getCdBijzonderNederlanderschap());
          if (value.hasGeldigheidGegevensNationaliteit()) {
            Util.writeStartElement(writer, "GeldigheidGegevensNationaliteit");
            GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensNationaliteit());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class VerblijfstitelTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.Verblijfstitel read(XMLStreamReader reader)
            throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.Verblijfstitel.Builder builder = AanvraagPersoonResponse.ClientSuwi.Verblijfstitel.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "CdVerblijfstitel":
                  builder.setCdVerblijfstitel(Util.readElementText(reader));
                  break;
                case "DatBVerblijfstitel":
                  builder.setDatBVerblijfstitel(Util.readElementText(reader));
                  break;
                case "DatEVerblijfstitel":
                  builder.setDatEVerblijfstitel(Util.readElementText(reader));
                  break;
                case "OnderzoekGegVerblijfstitel":
                  builder.setOnderzoekGegVerblijfstitel(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "GeldigheidGegevensVerblijfstitel":
                  builder.setGeldigheidGegevensVerblijfstitel(GeldigheidTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.Verblijfstitel value) throws XMLStreamException {
          Util.writeElement(writer, "CdVerblijfstitel", value.getCdVerblijfstitel());
          Util.writeElement(writer, "DatBVerblijfstitel", value.getDatBVerblijfstitel());
          Util.writeElement(writer, "DatEVerblijfstitel", value.getDatEVerblijfstitel());
          if (value.hasOnderzoekGegVerblijfstitel()) {
            Util.writeStartElement(writer, "OnderzoekGegVerblijfstitel");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegVerblijfstitel());
            Util.writeEndElement(writer);
          }
          if (value.hasGeldigheidGegevensVerblijfstitel()) {
            Util.writeStartElement(writer, "GeldigheidGegevensVerblijfstitel");
            GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensVerblijfstitel());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class VerblijfstitelHistorischTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.VerblijfstitelHistorisch read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.VerblijfstitelHistorisch.Builder builder = AanvraagPersoonResponse.ClientSuwi.VerblijfstitelHistorisch.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "CdVerblijfstitel":
                  builder.setCdVerblijfstitel(Util.readElementText(reader));
                  break;
                case "DatBVerblijfstitel":
                  builder.setDatBVerblijfstitel(Util.readElementText(reader));
                  break;
                case "DatEVerblijfstitel":
                  builder.setDatEVerblijfstitel(Util.readElementText(reader));
                  break;
                case "OnderzoekGegVerblijfstitel":
                  builder.setOnderzoekGegVerblijfstitel(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "OnjuistGegVerblijfstitel":
                  builder.setOnjuistGegVerblijfstitel(OnjuistGegTypeTransformer.read(reader));
                  break;
                case "GeldigheidGegevensVerblijfstitel":
                  builder.setGeldigheidGegevensVerblijfstitel(GeldigheidTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.VerblijfstitelHistorisch value) throws
            XMLStreamException {
          Util.writeElement(writer, "CdVerblijfstitel", value.getCdVerblijfstitel());
          Util.writeElement(writer, "DatBVerblijfstitel", value.getDatBVerblijfstitel());
          Util.writeElement(writer, "DatEVerblijfstitel", value.getDatEVerblijfstitel());
          if (value.hasOnderzoekGegVerblijfstitel()) {
            Util.writeStartElement(writer, "OnderzoekGegVerblijfstitel");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegVerblijfstitel());
            Util.writeEndElement(writer);
          }
          if (value.hasOnjuistGegVerblijfstitel()) {
            Util.writeStartElement(writer, "OnjuistGegVerblijfstitel");
            OnjuistGegTypeTransformer.write(writer, value.getOnjuistGegVerblijfstitel());
            Util.writeEndElement(writer);
          }
          if (value.hasGeldigheidGegevensVerblijfstitel()) {
            Util.writeStartElement(writer, "GeldigheidGegevensVerblijfstitel");
            GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensVerblijfstitel());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class FeitelijkAdresBuitenlandTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.FeitelijkAdresBuitenland read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.FeitelijkAdresBuitenland.Builder builder = AanvraagPersoonResponse.ClientSuwi.FeitelijkAdresBuitenland.newBuilder();
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
            AanvraagPersoonResponse.ClientSuwi.FeitelijkAdresBuitenland value) throws
            XMLStreamException {
          Util.writeElement(writer, "DatBAdresBuitenland", value.getDatBAdresBuitenland());
          Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
          Util.writeElement(writer, "Adresregel1Buitenland", value.getAdresregel1Buitenland());
          Util.writeElement(writer, "Adresregel2Buitenland", value.getAdresregel2Buitenland());
          Util.writeElement(writer, "Adresregel3Buitenland", value.getAdresregel3Buitenland());
        }
      }

      static final class VerblijfplaatsHistorischTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch.Builder builder = AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DomicilieAdres":
                  builder.setDomicilieAdres(StraatadresTypeTransformer.read(reader));
                  break;
                case "Correspondentieadres":
                  builder.setCorrespondentieadres(StraatadresTypeTransformer.read(reader));
                  break;
                case "FeitelijkAdresBuitenland":
                  builder.addFeitelijkAdresBuitenland(FeitelijkAdresBuitenlandTransformer.read(reader));
                  break;
                case "Immigratie":
                  builder.setImmigratie(ImmigratieTypeTransformer.read(reader));
                  break;
                case "AangifteAdreshoudingBrp":
                  builder.setAangifteAdreshoudingBrp(AangifteAdreshoudingBrpTypeTransformer.read(reader));
                  break;
                case "OnderzoekGegVerblijfplaats":
                  builder.setOnderzoekGegVerblijfplaats(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "OnjuistGegVerblijfplaats":
                  builder.setOnjuistGegVerblijfplaats(OnjuistGegTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch value) throws
            XMLStreamException {
          if (value.hasDomicilieAdres()) {
            Util.writeStartElement(writer, "DomicilieAdres");
            StraatadresTypeTransformer.write(writer, value.getDomicilieAdres());
            Util.writeEndElement(writer);
          }
          if (value.hasCorrespondentieadres()) {
            Util.writeStartElement(writer, "Correspondentieadres");
            StraatadresTypeTransformer.write(writer, value.getCorrespondentieadres());
            Util.writeEndElement(writer);
          }
          for (int i = 0; i < value.getFeitelijkAdresBuitenlandCount(); i++) {
            Util.writeStartElement(writer, "FeitelijkAdresBuitenland");
            FeitelijkAdresBuitenlandTransformer.write(writer, value.getFeitelijkAdresBuitenland(i));
            Util.writeEndElement(writer);
          }
          if (value.hasImmigratie()) {
            Util.writeStartElement(writer, "Immigratie");
            ImmigratieTypeTransformer.write(writer, value.getImmigratie());
            Util.writeEndElement(writer);
          }
          if (value.hasAangifteAdreshoudingBrp()) {
            Util.writeStartElement(writer, "AangifteAdreshoudingBrp");
            AangifteAdreshoudingBrpTypeTransformer.write(writer, value.getAangifteAdreshoudingBrp());
            Util.writeEndElement(writer);
          }
          if (value.hasOnderzoekGegVerblijfplaats()) {
            Util.writeStartElement(writer, "OnderzoekGegVerblijfplaats");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegVerblijfplaats());
            Util.writeEndElement(writer);
          }
          if (value.hasOnjuistGegVerblijfplaats()) {
            Util.writeStartElement(writer, "OnjuistGegVerblijfplaats");
            OnjuistGegTypeTransformer.write(writer, value.getOnjuistGegVerblijfplaats());
            Util.writeEndElement(writer);
          }
        }

        static final class FeitelijkAdresBuitenlandTransformer {
          public static AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch.FeitelijkAdresBuitenland read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch.FeitelijkAdresBuitenland.Builder builder = AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch.FeitelijkAdresBuitenland.newBuilder();
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
              AanvraagPersoonResponse.ClientSuwi.VerblijfplaatsHistorisch.FeitelijkAdresBuitenland value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatBAdresBuitenland", value.getDatBAdresBuitenland());
            Util.writeElement(writer, "LandAdresBuitenland", value.getLandAdresBuitenland());
          }
        }
      }

      static final class OverlijdenTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.Overlijden read(XMLStreamReader reader)
            throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.Overlijden.Builder builder = AanvraagPersoonResponse.ClientSuwi.Overlijden.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DatOverlijden":
                  builder.setDatOverlijden(Util.readElementText(reader));
                  break;
                case "OnderzoekGegOverlijden":
                  builder.setOnderzoekGegOverlijden(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "CdGemeenteOverlijden":
                  builder.setCdGemeenteOverlijden(Util.readElementText(reader));
                  break;
                case "PlaatsOverlijden":
                  builder.setPlaatsOverlijden(Util.readElementText(reader));
                  break;
                case "LandOverlijden":
                  builder.setLandOverlijden(Util.readElementText(reader));
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
            AanvraagPersoonResponse.ClientSuwi.Overlijden value) throws XMLStreamException {
          Util.writeElement(writer, "DatOverlijden", value.getDatOverlijden());
          if (value.hasOnderzoekGegOverlijden()) {
            Util.writeStartElement(writer, "OnderzoekGegOverlijden");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegOverlijden());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "CdGemeenteOverlijden", value.getCdGemeenteOverlijden());
          Util.writeElement(writer, "PlaatsOverlijden", value.getPlaatsOverlijden());
          Util.writeElement(writer, "LandOverlijden", value.getLandOverlijden());
        }
      }

      static final class HuwelijkTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.Huwelijk read(XMLStreamReader reader)
            throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.Huwelijk.Builder builder = AanvraagPersoonResponse.ClientSuwi.Huwelijk.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DatHuwelijkssluiting":
                  builder.setDatHuwelijkssluiting(Util.readElementText(reader));
                  break;
                case "OnderzoekGegHuwelijk":
                  builder.setOnderzoekGegHuwelijk(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "Partner":
                  builder.setPartner(PartnerTransformer.read(reader));
                  break;
                case "CdGemeenteHuwelijkssluiting":
                  builder.setCdGemeenteHuwelijkssluiting(Util.readElementText(reader));
                  break;
                case "PlaatsHuwelijkssluiting":
                  builder.setPlaatsHuwelijkssluiting(Util.readElementText(reader));
                  break;
                case "LandHuwelijkssluiting":
                  builder.setLandHuwelijkssluiting(Util.readElementText(reader));
                  break;
                case "DatOntbindingHuwelijk":
                  builder.setDatOntbindingHuwelijk(Util.readElementText(reader));
                  break;
                case "CdGemeenteOntbindingHuwelijk":
                  builder.setCdGemeenteOntbindingHuwelijk(Util.readElementText(reader));
                  break;
                case "PlaatsOntbindingHuwelijk":
                  builder.setPlaatsOntbindingHuwelijk(Util.readElementText(reader));
                  break;
                case "LandOntbindingHuwelijk":
                  builder.setLandOntbindingHuwelijk(Util.readElementText(reader));
                  break;
                case "CdRedenOntbindingHuwelijk":
                  builder.setCdRedenOntbindingHuwelijk(Util.readElementText(reader));
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
            AanvraagPersoonResponse.ClientSuwi.Huwelijk value) throws XMLStreamException {
          Util.writeElement(writer, "DatHuwelijkssluiting", value.getDatHuwelijkssluiting());
          if (value.hasOnderzoekGegHuwelijk()) {
            Util.writeStartElement(writer, "OnderzoekGegHuwelijk");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegHuwelijk());
            Util.writeEndElement(writer);
          }
          if (value.hasPartner()) {
            Util.writeStartElement(writer, "Partner");
            PartnerTransformer.write(writer, value.getPartner());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "CdGemeenteHuwelijkssluiting", value.getCdGemeenteHuwelijkssluiting());
          Util.writeElement(writer, "PlaatsHuwelijkssluiting", value.getPlaatsHuwelijkssluiting());
          Util.writeElement(writer, "LandHuwelijkssluiting", value.getLandHuwelijkssluiting());
          Util.writeElement(writer, "DatOntbindingHuwelijk", value.getDatOntbindingHuwelijk());
          Util.writeElement(writer, "CdGemeenteOntbindingHuwelijk", value.getCdGemeenteOntbindingHuwelijk());
          Util.writeElement(writer, "PlaatsOntbindingHuwelijk", value.getPlaatsOntbindingHuwelijk());
          Util.writeElement(writer, "LandOntbindingHuwelijk", value.getLandOntbindingHuwelijk());
          Util.writeElement(writer, "CdRedenOntbindingHuwelijk", value.getCdRedenOntbindingHuwelijk());
        }

        static final class PartnerTransformer {
          public static AanvraagPersoonResponse.ClientSuwi.Huwelijk.Partner read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            AanvraagPersoonResponse.ClientSuwi.Huwelijk.Partner.Builder builder = AanvraagPersoonResponse.ClientSuwi.Huwelijk.Partner.newBuilder();
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
                  case "CdGeboortegemeente":
                    builder.setCdGeboortegemeente(Util.readElementText(reader));
                    break;
                  case "Geboorteplaats":
                    builder.setGeboorteplaats(Util.readElementText(reader));
                    break;
                  case "Geboorteland":
                    builder.setGeboorteland(Util.readElementText(reader));
                    break;
                  case "Titulatuur":
                    builder.setTitulatuur(TitulatuurTypeTransformer.read(reader));
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
              AanvraagPersoonResponse.ClientSuwi.Huwelijk.Partner value) throws XMLStreamException {
            Util.writeElement(writer, "Voornamen", value.getVoornamen());
            Util.writeElement(writer, "Voorvoegsel", value.getVoorvoegsel());
            Util.writeElement(writer, "SignificantDeelVanDeAchternaam", value.getSignificantDeelVanDeAchternaam());
            Util.writeElement(writer, "Geboortedat", value.getGeboortedat());
            Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
            Util.writeElement(writer, "ANr", value.getANr());
            Util.writeElement(writer, "CdGeboortegemeente", value.getCdGeboortegemeente());
            Util.writeElement(writer, "Geboorteplaats", value.getGeboorteplaats());
            Util.writeElement(writer, "Geboorteland", value.getGeboorteland());
            if (value.hasTitulatuur()) {
              Util.writeStartElement(writer, "Titulatuur");
              TitulatuurTypeTransformer.write(writer, value.getTitulatuur());
              Util.writeEndElement(writer);
            }
          }
        }
      }

      static final class HuwelijkHistorischTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch.Builder builder = AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DatHuwelijkssluiting":
                  builder.setDatHuwelijkssluiting(Util.readElementText(reader));
                  break;
                case "OnderzoekGegHuwelijk":
                  builder.setOnderzoekGegHuwelijk(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "OnjuistGegHuwelijk":
                  builder.setOnjuistGegHuwelijk(OnjuistGegTypeTransformer.read(reader));
                  break;
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
            AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch value) throws XMLStreamException {
          Util.writeElement(writer, "DatHuwelijkssluiting", value.getDatHuwelijkssluiting());
          if (value.hasOnderzoekGegHuwelijk()) {
            Util.writeStartElement(writer, "OnderzoekGegHuwelijk");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegHuwelijk());
            Util.writeEndElement(writer);
          }
          if (value.hasOnjuistGegHuwelijk()) {
            Util.writeStartElement(writer, "OnjuistGegHuwelijk");
            OnjuistGegTypeTransformer.write(writer, value.getOnjuistGegHuwelijk());
            Util.writeEndElement(writer);
          }
          if (value.hasPartner()) {
            Util.writeStartElement(writer, "Partner");
            PartnerTransformer.write(writer, value.getPartner());
            Util.writeEndElement(writer);
          }
        }

        static final class PartnerTransformer {
          public static AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch.Partner read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch.Partner.Builder builder = AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch.Partner.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "Burgerservicenr":
                    builder.setBurgerservicenr(Util.readElementText(reader));
                    break;
                  case "ANr":
                    builder.setANr(Util.readElementText(reader));
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
              AanvraagPersoonResponse.ClientSuwi.HuwelijkHistorisch.Partner value) throws
              XMLStreamException {
            Util.writeElement(writer, "Burgerservicenr", value.getBurgerservicenr());
            Util.writeElement(writer, "ANr", value.getANr());
          }
        }
      }

      static final class KindTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.Kind read(XMLStreamReader reader) throws
            XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.Kind.Builder builder = AanvraagPersoonResponse.ClientSuwi.Kind.newBuilder();
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
                case "OnderzoekGegKind":
                  builder.setOnderzoekGegKind(OnderzoekGegTypeTransformer.read(reader));
                  break;
                case "GeldigheidGegevensKind":
                  builder.setGeldigheidGegevensKind(GeldigheidTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.Kind value) throws XMLStreamException {
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
          if (value.hasOnderzoekGegKind()) {
            Util.writeStartElement(writer, "OnderzoekGegKind");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegKind());
            Util.writeEndElement(writer);
          }
          if (value.hasGeldigheidGegevensKind()) {
            Util.writeStartElement(writer, "GeldigheidGegevensKind");
            GeldigheidTypeTransformer.write(writer, value.getGeldigheidGegevensKind());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class GezagsverhoudingTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.Gezagsverhouding read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.Gezagsverhouding.Builder builder = AanvraagPersoonResponse.ClientSuwi.Gezagsverhouding.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "CdGezagMinderjarige":
                  builder.setCdGezagMinderjarige(Util.readElementText(reader));
                  break;
                case "IndCuratelestelling":
                  builder.setIndCuratelestelling(Util.readElementText(reader));
                  break;
                case "OnderzoekGegGezag":
                  builder.setOnderzoekGegGezag(OnderzoekGegTypeTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.Gezagsverhouding value) throws XMLStreamException {
          Util.writeElement(writer, "CdGezagMinderjarige", value.getCdGezagMinderjarige());
          Util.writeElement(writer, "IndCuratelestelling", value.getIndCuratelestelling());
          if (value.hasOnderzoekGegGezag()) {
            Util.writeStartElement(writer, "OnderzoekGegGezag");
            OnderzoekGegTypeTransformer.write(writer, value.getOnderzoekGegGezag());
            Util.writeEndElement(writer);
          }
        }
      }

      static final class InschrijvingsgegevensBrpTransformer {
        public static AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp read(
            XMLStreamReader reader) throws XMLStreamException {
          QName parent = reader.getName();
          AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.Builder builder = AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.newBuilder();
          while (reader.hasNext()) {
            int event = reader.next();
            if (reader.isStartElement()) {
              QName child = reader.getName();
              switch(child.toString()) {
                case "DatOpschortingBijhoudingPl":
                  builder.setDatOpschortingBijhoudingPl(Util.readElementText(reader));
                  break;
                case "CdRedenOpschortingBijhoudingPl":
                  builder.setCdRedenOpschortingBijhoudingPl(Util.readElementText(reader));
                  break;
                case "CdGemeenteWaarPkZichBevindt":
                  builder.setCdGemeenteWaarPkZichBevindt(Util.readElementText(reader));
                  break;
                case "VerificatieRni":
                  builder.setVerificatieRni(VerificatieRniTransformer.read(reader));
                  break;
                case "CdPkVolledigGeconverteerd":
                  builder.setCdPkVolledigGeconverteerd(Util.readElementText(reader));
                  break;
                case "RniDeelnemer":
                  builder.setRniDeelnemer(RniDeelnemerTransformer.read(reader));
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
            AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp value) throws
            XMLStreamException {
          Util.writeElement(writer, "DatOpschortingBijhoudingPl", value.getDatOpschortingBijhoudingPl());
          Util.writeElement(writer, "CdRedenOpschortingBijhoudingPl", value.getCdRedenOpschortingBijhoudingPl());
          Util.writeElement(writer, "CdGemeenteWaarPkZichBevindt", value.getCdGemeenteWaarPkZichBevindt());
          if (value.hasVerificatieRni()) {
            Util.writeStartElement(writer, "VerificatieRni");
            VerificatieRniTransformer.write(writer, value.getVerificatieRni());
            Util.writeEndElement(writer);
          }
          Util.writeElement(writer, "CdPkVolledigGeconverteerd", value.getCdPkVolledigGeconverteerd());
          if (value.hasRniDeelnemer()) {
            Util.writeStartElement(writer, "RniDeelnemer");
            RniDeelnemerTransformer.write(writer, value.getRniDeelnemer());
            Util.writeEndElement(writer);
          }
        }

        static final class VerificatieRniTransformer {
          public static AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.VerificatieRni read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.VerificatieRni.Builder builder = AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.VerificatieRni.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "DatVerificatieRni":
                    builder.setDatVerificatieRni(Util.readElementText(reader));
                    break;
                  case "OmsVerificatieRni":
                    builder.setOmsVerificatieRni(Util.readElementText(reader));
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
              AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.VerificatieRni value)
              throws XMLStreamException {
            Util.writeElement(writer, "DatVerificatieRni", value.getDatVerificatieRni());
            Util.writeElement(writer, "OmsVerificatieRni", value.getOmsVerificatieRni());
          }
        }

        static final class RniDeelnemerTransformer {
          public static AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.RniDeelnemer read(
              XMLStreamReader reader) throws XMLStreamException {
            QName parent = reader.getName();
            AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.RniDeelnemer.Builder builder = AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.RniDeelnemer.newBuilder();
            while (reader.hasNext()) {
              int event = reader.next();
              if (reader.isStartElement()) {
                QName child = reader.getName();
                switch(child.toString()) {
                  case "CdRniDeelnemer":
                    builder.setCdRniDeelnemer(Util.readElementText(reader));
                    break;
                  case "OmsVerdragRniDeelnemer":
                    builder.setOmsVerdragRniDeelnemer(Util.readElementText(reader));
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
              AanvraagPersoonResponse.ClientSuwi.InschrijvingsgegevensBrp.RniDeelnemer value) throws
              XMLStreamException {
            Util.writeElement(writer, "CdRniDeelnemer", value.getCdRniDeelnemer());
            Util.writeElement(writer, "OmsVerdragRniDeelnemer", value.getOmsVerdragRniDeelnemer());
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
