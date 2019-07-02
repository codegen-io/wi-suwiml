package io.codegen.wi.suwiml.stax.uwvdossierinkomsten_v0500;

import io.codegen.wi.suwiml.stax.Util;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import io.codegen.wi.suwiml.proto.uwvdossierinkomsten_v0500.SectorRisicogroepType;

final class SectorRisicogroepTypeTransformer {
  public static SectorRisicogroepType read(XMLStreamReader reader) throws XMLStreamException {
    QName parent = reader.getName();
    SectorRisicogroepType.Builder builder = SectorRisicogroepType.newBuilder();
    while (reader.hasNext()) {
      int event = reader.next();
      if (reader.isStartElement()) {
        QName child = reader.getName();
        switch(child.toString()) {
          case "CdSectorRisicogroep":
            builder.setCdSectorRisicogroep(Util.readElementText(reader));
            break;
          case "DatBSectorRisicogroep":
            builder.setDatBSectorRisicogroep(Util.readElementText(reader));
            break;
          case "DatESectorRisicogroep":
            builder.setDatESectorRisicogroep(Util.readElementText(reader));
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

  public static void write(XMLStreamWriter writer, SectorRisicogroepType value) throws
      XMLStreamException {
    Util.writeElement(writer, "CdSectorRisicogroep", value.getCdSectorRisicogroep());
    Util.writeElement(writer, "DatBSectorRisicogroep", value.getDatBSectorRisicogroep());
    Util.writeElement(writer, "DatESectorRisicogroep", value.getDatESectorRisicogroep());
    if (value.hasSectorBeroepsEnBedrijfsleven()) {
      Util.writeStartElement(writer, "SectorBeroepsEnBedrijfsleven");
      SectorBeroepsEnBedrijfslevenTypeTransformer.write(writer, value.getSectorBeroepsEnBedrijfsleven());
      Util.writeEndElement(writer);
    }
  }
}
