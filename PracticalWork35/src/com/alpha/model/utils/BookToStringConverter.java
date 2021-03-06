package com.alpha.model.utils;

import com.alpha.model.entity.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookToStringConverter {

    public static List<String> convert (List<Book> bookList){
        return bookList.stream()
                .map(x -> String.format("|%5d |%11s |%20s |%5s |%5d |%5d |%8.2f |"
                ,x.getId(),x.getAuthor(),x.getTitle(), x.getPublisher(), x.getYear(), x.getPage(), x.getCost()))
                .collect(Collectors.toList());
    }
}
