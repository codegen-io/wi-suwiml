package io.codegen.wi.suwiml.stax.brpdossierpersoongsd_v0101;

import io.codegen.wi.suwiml.proto.brpdossierpersoongsd_v0101.OnjuistGegType;
import io.codegen.wi.suwiml.stax.util.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

final class OnjuistGegTypeTransformer {
  public static OnjuistGegType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    OnjuistGegType.Builder builder = OnjuistGegType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "CdOnjuistStrijdigMetOpenbareOrde":
            builder.setCdOnjuistStrijdigMetOpenbareOrde(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, OnjuistGegType value) throws XMLStreamException {
    Util.writeElement(writer, "CdOnjuistStrijdigMetOpenbareOrde", value.getCdOnjuistStrijdigMetOpenbareOrde());
  }
}
