package com.java2;

public class Book {
    private int date;
    private String author;
    private String name;

    public int getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "date=" + date +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
