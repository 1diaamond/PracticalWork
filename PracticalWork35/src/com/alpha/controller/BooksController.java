package com.alpha.controller;

/*
123
@TODO
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
