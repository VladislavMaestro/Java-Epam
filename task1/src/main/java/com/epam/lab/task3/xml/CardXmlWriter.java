package com.epam.lab.task3.xml;

import com.epam.lab.task3.domain.Postcard;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class CardXmlWriter {

    public void write(List<Postcard> postcards, String fileName)
            throws FileNotFoundException, XMLStreamException {
        XMLStreamWriter writer = null;
        try {
            XMLOutputFactory factory = XMLOutputFactory.newFactory();
            writer = factory.createXMLStreamWriter(new FileOutputStream(fileName), "UTF-8");
            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeStartElement("postcards");
            writer.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            writer.writeAttribute("xmlns", "http://www.example.org/postcards");
            writer.writeAttribute("xsi:schemaLocation",
                    "http://www.example.org/postcards postcards.xsd");
            for (Postcard postcard : postcards) {
                writer.writeStartElement("postcard");
                writer.writeAttribute("id", postcard.getId());
                writer.writeStartElement("theme");
                writer.writeCData(String.valueOf(postcard.getTheme()));
                writer.writeEndElement();
                writer.writeStartElement("type");
                writer.writeCharacters(String.valueOf(postcard.getType()));
                writer.writeEndElement();
                writer.writeStartElement("send");
                writer.writeCharacters(String.valueOf(postcard.getSend()));
                writer.writeEndElement();
                writer.writeStartElement("country");
                writer.writeCharacters(postcard.getCountry());
                writer.writeEndElement();
                writer.writeStartElement("year");
                writer.writeCharacters(postcard.getYear());
                writer.writeEndElement();
                writer.writeStartElement("author");
                writer.writeCharacters(postcard.getAuthor());
                writer.writeEndElement();
                writer.writeStartElement("valuable");
                writer.writeCharacters(String.valueOf(postcard.getValuable()));
                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}