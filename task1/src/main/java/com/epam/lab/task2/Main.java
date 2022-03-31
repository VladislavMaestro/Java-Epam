package com.epam.lab.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text ="Hehlhlhoh nanmnen isi Peptpeprp, mym Emeaeiele: peterjackson@gmail.com " +
                "anada mym phpopnpep nunmnbnenrn: +375(33)853-80-61";
        StringTransformation stringTransformation = new StringTransformation();
        StringBuffer changedText = stringTransformation.wordsChanger(text);
        System.out.println(changedText);

        List<Word> emails = stringTransformation.findEmail(text);
        System.out.println("Email: "+ emails);
        List<Word> numbers =stringTransformation.findPhoneNumber(text);
        System.out.println("Phone number: " + numbers);
    }
}
