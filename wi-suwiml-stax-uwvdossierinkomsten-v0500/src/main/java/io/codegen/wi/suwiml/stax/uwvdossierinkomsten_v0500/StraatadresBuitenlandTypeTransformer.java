package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.stax.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.StraatadresBuitenlandType;

final class StraatadresBuitenlandTypeTransformer {
  public static StraatadresBuitenlandType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    StraatadresBuitenlandType.Builder builder = StraatadresBuitenlandType.newBuilder();
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

  public static void write(XMLStreamWriter writer, StraatadresBuitenlandType value) throws
      XMLStreamException {
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
