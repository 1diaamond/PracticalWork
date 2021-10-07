package com.alpha.controller;

/*
с основным методом управления приложением execute(),
 который предоставляет пользователю меню
 , возможность выбора действия
 , его обработки и получению результата до тех пор
 , пока не будет выбрана команда завершить работу.
 Предусмотрите выделение обработки каждой команды в отдельные методы;

                 "1. посмотреть весь список книг (view)\n" +
                "2. добавить книгу (add)\n" +
                "3. изменить стоимость книг (edit)\n" +
                "4. найти книги по автору (author)\n" +
                "5. найти по издательству (publisher)\n" +
                "6. найти выпущенные после введенного года (year)\n" +
                "0. завершить работу (exit)\n"

 */

import com.alpha.model.ServiceBooks;
import com.alpha.view.BooksView;
import com.alpha.view.InputDataView;
import com.alpha.view.ViewConstants;

public class BooksController {

    private InputDataView inputDataView;
    private BooksView booksView;
    private ServiceBooks serviceBooks;

    public BooksController() {
        this.inputDataView = new InputDataView();
        this.booksView = new BooksView();
        this.serviceBooks = new ServiceBooks();
    }

    public  void  execute(){
        while (true){
            booksView.printMenu();
            booksView.printMessage(ViewConstants.ENTER_COMMAND);
            String command = inputDataView.getParams();
            switch (command) {
                case "view" :
                    serviceBooks.printBooks(serviceBooks.getAllBooks());
                    booksView.printMessage(ViewConstants.DEVIDER);
                    break;
                case "add" :
                    booksView.printMessage(ViewConstants.ENTER_BOOK_PARAMS);
                    serviceBooks.addBook(inputDataView.getParams());
                    booksView.printMessage(ViewConstants.BOOKADDED);
                    serviceBooks.printBooks(serviceBooks.getAllBooks());
                    booksView.printMessage(ViewConstants.DEVIDER);
                    break;
                case "edit" :
                    booksView.printMessage(ViewConstants.ENTER_CHANGE_COST_PARAMS);
                    serviceBooks.changeBookCost(inputDataView.getParams());
                    booksView.printMessage(ViewConstants.COSTCHANGED);
                    serviceBooks.printBooks(serviceBooks.getAllBooks());
                    booksView.printMessage(ViewConstants.DEVIDER);
                    break;

            }
        }
    }
}
