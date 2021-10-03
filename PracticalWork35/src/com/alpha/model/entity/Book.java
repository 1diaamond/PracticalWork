package com.alpha.model.entity;

/*
класс Book (поля: Название, Автор, Издательство, Год издания, Количество страниц, Стоимость; конструктор, геттеры и сеттеры);
 */

public class Book {
    private static int nextId = 0;
    private int id;
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int page;
    private double cost;

    public Book(String author, String title, String publisher, int year, int page, double cost) {
        this.id = nextId++;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.page = page;
        this.cost = cost;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Book.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", page=" + page +
                ", cost=" + cost +
                '}';
    }
}
