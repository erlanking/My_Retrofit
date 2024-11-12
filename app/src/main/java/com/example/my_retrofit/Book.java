package com.example.my_retrofit;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private String cover;

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getCover() {
        return cover;
    }

    public String getAuthor() {
        return author;
    }
// Геттеры и сеттеры
}
