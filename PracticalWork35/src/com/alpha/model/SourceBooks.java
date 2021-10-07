package com.alpha.model;

import com.alpha.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class SourceBooks {
    protected Book book ;
    protected List<Book> books;

    public static List<Book>  getBooksList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Morozov", "Title1", "BHV", 2000, 345, 200.0));
        books.add(new Book("Shevchenko", "Title2", "Word", 2010, 1000, 760.0));
        books.add(new Book("Nerus", "Title3", "AL", 2017, 505, 444.0));
        books.add(new Book("Morozov", "Title4", "Word", 1987, 120, 120.0));
        books.add(new Book("Grushin", "Title5", "BHV", 1999, 765, 555.0));
    return books;
    }
}

