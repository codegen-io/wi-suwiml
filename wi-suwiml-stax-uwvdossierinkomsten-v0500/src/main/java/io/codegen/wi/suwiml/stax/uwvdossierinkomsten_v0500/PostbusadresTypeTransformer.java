package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.PostbusadresType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class PostbusadresTypeTransformer {
  public static PostbusadresType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    PostbusadresType.Builder builder = PostbusadresType.newBuilder();
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

  public static void write(XMLStreamWriter writer, PostbusadresType value) throws
      XMLStreamException {
    Util.writeElement(writer, "Locatieoms", value.getLocatieoms());
    Util.writeElement(writer, "Postcd", value.getPostcd());
    Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
    Util.writeElement(writer, "Gemeentenaam", value.getGemeentenaam());
    Util.writeElement(writer, "Postbusnr", value.getPostbusnr());
  }
}
