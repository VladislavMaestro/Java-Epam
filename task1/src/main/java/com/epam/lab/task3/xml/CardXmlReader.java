package com.epam.lab.task3.xml;

import com.epam.lab.task3.domain.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class CardXmlReader {
    public List<Postcard> read(String fileName) throws FileNotFoundException {
        XMLStreamReader reader = null;
        try {
            List<Postcard> postcards = new ArrayList<>();
            Postcard postcard = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                int type = reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("postcard".equals(tagName)) {
                            postcard = new Postcard();
                            postcard.setId(reader.getAttributeValue(null, "id"));
                        } else if ("theme".equals(tagName)) {
                            if (postcard != null) {
                                postcard.setTheme(ThemeType.valueOf(reader.getElementText()));
                            }
                        } else if ("type".equals(tagName)) {
                            if (postcard != null) {
                                postcard.setType(PostcardType.valueOf(reader.getElementText()));
                            }
                        } else if ("send".equals(tagName)) {
                            if (postcard != null) {
                                postcard.setSend(Boolean.parseBoolean(reader.getElementText()));
                            }
                        } else if ("country".equals(tagName)) {
                            if (postcard != null) {
                                postcard.setCountry(reader.getElementText());
                            }
                        } else if ("year".equals(tagName)) {
                            if (postcard != null) {
                                postcard.setYear(reader.getElementText());
                            }
                        } else if ("author".equals(tagName)) {
                            if (postcard != null) {
                                postcard.setAuthor(reader.getElementText());
                            }
                        } else if ("valuable".equals(tagName) && postcard != null) {
                            postcard.setValuable(Boolean.parseBoolean(reader.getElementText()));
                        }

                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("postcard".equals(tagName)) {
                            postcards.add(postcard);
                        }
                        break;
                    }
                }
            }
            return postcards;
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
            }
        }
    }
}