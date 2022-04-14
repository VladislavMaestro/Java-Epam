package com.epam.lab.task3;

import com.epam.lab.task3.Comparators.PostcardComparator;
import com.epam.lab.task3.domain.Postcard;
import com.epam.lab.task3.xml.CardXmlReader;
import com.epam.lab.task3.xml.CardXmlValidator;
import com.epam.lab.task3.xml.CardXmlWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.xml.stream.XMLStreamException;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) throws IOException, XMLStreamException {
        CardXmlValidator validator = new CardXmlValidator("postcards.xml");
        if (validator.validate()) {
            CardXmlReader reader = new CardXmlReader();
            List<Postcard> postcards = reader.read("postcards.xml");
            for (Postcard postcard : postcards) {
                System.out.println(postcard);
            }
            Collections.sort(postcards, new PostcardComparator());
            CardXmlWriter writer = new CardXmlWriter();
            writer.write(postcards, "postcards-new.xml");
            System.out.println("OK");
        } else {
            System.out.println(validator.getError());
        }

    }
}
