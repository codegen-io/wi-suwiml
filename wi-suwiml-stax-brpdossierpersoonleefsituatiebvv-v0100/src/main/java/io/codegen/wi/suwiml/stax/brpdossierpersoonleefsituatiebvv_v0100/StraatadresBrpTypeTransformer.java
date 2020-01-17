package io.codegen.wi.suwiml.stax.brpdossierpersoonleefsituatiebvv_v0100;

import io.codegen.wi.suwiml.proto.brpdossierpersoonleefsituatiebvv_v0100.StraatadresBrpType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class StraatadresBrpTypeTransformer {
  public static StraatadresBrpType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    StraatadresBrpType.Builder builder = StraatadresBrpType.newBuilder();
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

  public static void write(XMLStreamWriter writer, StraatadresBrpType value) throws
      XMLStreamException {
    Util.writeElement(writer, "Postcd", value.getPostcd());
    Util.writeElement(writer, "Woonplaatsnaam", value.getWoonplaatsnaam());
    Util.writeElement(writer, "Straatnaam", value.getStraatnaam());
    Util.writeElement(writer, "Huisnr", value.getHuisnr());
    Util.writeElement(writer, "Huisletter", value.getHuisletter());
    Util.writeElement(writer, "Huisnrtoevoeging", value.getHuisnrtoevoeging());
    Util.writeElement(writer, "AanduidingBijHuisnr", value.getAanduidingBijHuisnr());
  }
}
