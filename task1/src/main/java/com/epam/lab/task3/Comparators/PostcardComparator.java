package com.epam.lab.task3.Comparators;

import com.epam.lab.task3.domain.Postcard;
import java.util.Comparator;

public class PostcardComparator implements Comparator<Postcard> {
    public PostcardComparator() {
    }

    public int compare(Postcard obj1, Postcard obj2) {
        String str1 = obj1.getCountry();
        String str2 = obj2.getCountry();
        return str1.compareTo(str2);
    }
}