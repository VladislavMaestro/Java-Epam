package com.epam.lab.task3.domain;

public class Postcard {
    public String id;
    public PostcardType type;
    public ThemeType theme;
    public boolean send;
    public String country;
    public String year;
    public String author;
    public boolean valuable;

    public Postcard() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ThemeType getTheme() {
        return this.theme;
    }

    public void setTheme(ThemeType theme) {
        this.theme = theme;
    }

    public PostcardType getType() {
        return this.type;
    }

    public void setType(PostcardType type) {
        this.type = type;
    }

    public boolean getSend() {
        return this.send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getValuable() {
        return this.valuable;
    }

    public void setValuable(boolean valuable) {
        this.valuable = valuable;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: ").append(this.id).append('\n');
        builder.append("Тема открытки: ").append(this.theme).append('\n');
        builder.append("Тип открытки: ").append(this.type).append('\n');
        builder.append("Страна производства: ").append(this.country).append('\n');
        builder.append("Год издания").append(this.year).append('\n');
        builder.append("Автор: ").append(this.author).append('\n');
        builder.append("Ценность:").append(this.valuable).append('\n');
        return builder.toString();
    }
}
