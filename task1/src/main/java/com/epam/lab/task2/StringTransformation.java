package com.epam.lab.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTransformation {
    public StringTransformation() {
    }
    private List<Word> finderByRegEx(String text,String regExp) {
        List<Word> words = new ArrayList<>();
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(new Word(matcher.group()));
        }
        return words;
    }
    public StringBuffer wordsChanger(String text) {
        String[] word = text.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String s : word) {
            s = s.toLowerCase(Locale.ROOT);
            char firstSymbol = s.charAt(0);
            sb.append(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i)!=firstSymbol){
                    sb.append(s.charAt(i));
                }
            }
            sb.append(" ");
        }
        return sb;
    }
    public List<Word> findEmail(String text){
        String regExp ="([a-zA-Z0-9_\\.-]+)@([a-z0-9_\\*]+)\\.([a-z\\{3,}]{2,6})";
        return finderByRegEx(text,regExp);
    }
    public List<Word> findPhoneNumber(String text){
        String regExp ="\\+\\d{3}\\(\\d{2}\\)\\d{3}\\-\\d{2}\\-\\d{2}";
        return finderByRegEx(text,regExp);
    }
}
