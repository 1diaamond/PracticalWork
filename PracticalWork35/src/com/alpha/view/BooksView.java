package com.alpha.view;
/*
класс BooksView c методами отображения информации в разном формате (текст, таблица и т.п.);
 */


import com.alpha.model.entity.Book;

public class BooksView {
    private Book book;

    public void printMessage(String text) {
        System.out.println(text);
    }

    public void printMenu() {
        System.out.println(
                "1. посмотреть весь список книг (view)\n" +
                "2. добавить книгу (add)\n" +
                "3. изменить стоимость книг (edit)\n" +
                "4. найти книги по автору (author)\n" +
                "5. найти по издательству (publisher)\n" +
                "6. найти выпущенные после введенного года (year)\n" +
                "0. завершить работу (exit)\n"
        );
    }
}
