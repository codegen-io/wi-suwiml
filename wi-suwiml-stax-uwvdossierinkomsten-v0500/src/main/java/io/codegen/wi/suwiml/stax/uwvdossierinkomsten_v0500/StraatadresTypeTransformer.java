package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.stax.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.StraatadresType;

final class StraatadresTypeTransformer {
  public static StraatadresType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    StraatadresType.Builder builder = StraatadresType.newBuilder();
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

  public static void write(XMLStreamWriter writer, StraatadresType value) throws
      XMLStreamException {
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
