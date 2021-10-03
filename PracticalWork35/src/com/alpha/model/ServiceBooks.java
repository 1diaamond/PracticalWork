package com.alpha.model;

import com.alpha.model.entity.Book;
import com.alpha.view.BooksView;
import com.alpha.view.ViewConstants;

import java.util.List;

/*
в пакете com.alpha.model опишите класс ServiceBooks,
который будет содержать набор книг и
методы обрабатывающие этот набор согласно запросу пользователя.
3. Определите следующие действия для пользователя:
 посмотреть весь список книг;
 добавить книгу;
 изменить стоимость книги на введенное количество процентов (увеличить/уменьшить);
 найти книги по введенному автору, или издательству, или выпущенные после введенного года.
 завершить работу.
 */
public class ServiceBooks {
    private List<Book> bookList ;
    private BooksView booksView;

    public ServiceBooks() {
        this.bookList = SourceBooks.getBooksList();
        this.booksView = new BooksView();
    }

    public List <String> getAllBooks(){
        return BookToStringConverter.convert(bookList);
    }

    public void printBooks(List<String> booksString){
        booksString.forEach(System.out::println);
    }

    public void addBook(String author, String title, String publisher, int year, int page, double cost){
        bookList.add( new Book( author,  title,  publisher,  year,  page,  cost));
    }
    public void changeBookCost(int bookId, String action , int pricePercent) {
        double newPrice;
        double oldPrice = bookList.get(bookId).getCost();
        if (action.equals("увеличить")){
            newPrice = oldPrice + (oldPrice/100*pricePercent);
        }else if (action.equals("уменьшить);")){
            newPrice = oldPrice - (oldPrice/100*pricePercent);
        }else {
            newPrice = oldPrice;
            booksView.printMessage(ViewConstants.WRONG_COST_OPERATION);
        }
        bookList.get(bookId).setCost(newPrice);
    }

}
