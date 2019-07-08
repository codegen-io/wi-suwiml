package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.AdresType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class AdresTypeTransformer {
  public static AdresType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    AdresType.Builder builder = AdresType.newBuilder();
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
          case "Postbusadres":
            builder.setPostbusadres(PostbusadresTypeTransformer.read(reader));
            break;
          case "StraatadresBuitenland":
            builder.setStraatadresBuitenland(StraatadresBuitenlandTypeTransformer.read(reader));
            break;
          case "PostbusadresBuitenland":
            builder.setPostbusadresBuitenland(PostbusadresBuitenlandTypeTransformer.read(reader));
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

  public static void write(XMLStreamWriter writer, AdresType value) throws XMLStreamException {
    Util.writeElement(writer, "DatBAdres", value.getDatBAdres());
    Util.writeElement(writer, "DatEAdres", value.getDatEAdres());
    if (value.hasStraatadres()) {
      Util.writeStartElement(writer, "Straatadres");
      StraatadresTypeTransformer.write(writer, value.getStraatadres());
      Util.writeEndElement(writer);
    }
    if (value.hasPostbusadres()) {
      Util.writeStartElement(writer, "Postbusadres");
      PostbusadresTypeTransformer.write(writer, value.getPostbusadres());
      Util.writeEndElement(writer);
    }
    if (value.hasStraatadresBuitenland()) {
      Util.writeStartElement(writer, "StraatadresBuitenland");
      StraatadresBuitenlandTypeTransformer.write(writer, value.getStraatadresBuitenland());
      Util.writeEndElement(writer);
    }
    if (value.hasPostbusadresBuitenland()) {
      Util.writeStartElement(writer, "PostbusadresBuitenland");
      PostbusadresBuitenlandTypeTransformer.write(writer, value.getPostbusadresBuitenland());
      Util.writeEndElement(writer);
    }
  }
}
