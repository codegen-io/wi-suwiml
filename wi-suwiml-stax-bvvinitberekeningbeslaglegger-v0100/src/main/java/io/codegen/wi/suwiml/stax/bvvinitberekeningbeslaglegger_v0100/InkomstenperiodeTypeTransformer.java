package io.codegen.wi.suwiml.stax.bvvinitberekeningbeslaglegger_v0100;

import io.codegen.wi.suwiml.proto.bvvinitberekeningbeslaglegger_v0100.InkomstenperiodeType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class InkomstenperiodeTypeTransformer {
  public static InkomstenperiodeType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    InkomstenperiodeType.Builder builder = InkomstenperiodeType.newBuilder();
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

  public static void write(XMLStreamWriter writer, InkomstenperiodeType value) throws
      XMLStreamException {
    Util.writeElement(writer, "DatBIkp", value.getDatBIkp());
    Util.writeElement(writer, "DatEIkp", value.getDatEIkp());
    Util.writeElement(writer, "CdSrtIkv", value.getCdSrtIkv());
  }
}
