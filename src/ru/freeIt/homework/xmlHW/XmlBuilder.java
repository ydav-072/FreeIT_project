package ru.freeIt.homework.xmlHW;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XmlBuilder {
    public Device readFromFileToObj(File fileRead) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Device.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Device) unmarshaller.unmarshal(fileRead);
        } catch (JAXBException jaxbException) {
            jaxbException.printStackTrace();
        }
        return null;
    }

    public void writeToXmlFile(Device device, File fileWrite) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Electronics.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(device, fileWrite);
        } catch (JAXBException jaxbException) {
            jaxbException.printStackTrace();
        }
    }

    public void validation(File fileXml, File fileXsd) {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(fileXsd);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(fileXml));
        } catch (SAXException saxException) {
            System.out.println("Validation is not success");
            System.out.println(saxException.getMessage());
        } catch (IOException ioException) {
            System.out.println("Validation is not success");
            System.out.println(ioException.getMessage());
        }
        System.out.println("Validation success");
    }
}
