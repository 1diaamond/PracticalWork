package com.alpha.model;

import com.alpha.model.entity.Book;
import com.alpha.model.utils.ParamsParser;
import com.alpha.model.utils.BookToStringConverter;
import com.alpha.view.BooksView;
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
    protected List<Book> bookList ;
    private BooksView booksView;
    private static final String WRONG_COST_OPERATION = "Wrong COST operation ,please choose one of legal operations : \n \" + \" или \" - \" ";
    private static final String WRONG_ID = "Wrong ID! please , enter correct value";

    public ServiceBooks() {
        this.bookList = SourceBooks.getBooksList();
    }

    public List <String> getAllBooks(){
        return BookToStringConverter.convert(bookList);
    }

    public void printBooks(List<String> booksString){
        booksString.forEach(System.out::println);
    }

    public void addBook(String bookParamsString){
        List<String> bookParams = ParamsParser.parseParams(bookParamsString);
        Book book = new Book( Validator.validateAuthor(bookParams.get(0))
                ,  Validator.validateTitle(bookParams.get(1))
                ,  Validator.validatePublisher(bookParams.get(2))
                ,  Validator.validateYear(bookParams.get(3))
                ,  Validator.validatePage(bookParams.get(4))
                , Validator.validateCost(bookParams.get(5)) );
        bookList.add(book);
    }
    public void changeBookCost(String costParamsString) {
        List <String> changeBookCostParams = ParamsParser.parseParams(costParamsString);
        int bookId = Validator.validateId(changeBookCostParams.get(0));
        if (bookId < bookList.size()){
        String action = Validator.validateAction(changeBookCostParams.get(1));
        int pricePercent = Validator.validatePercent(changeBookCostParams.get(2));
        double newPrice;
        double oldPrice = bookList.get(bookId).getCost();
        if (action.equals("+")){ newPrice = oldPrice + (oldPrice/100*pricePercent);
        }else if (action.equals("-")){ newPrice = oldPrice - (oldPrice/100*pricePercent);
        }else {
            newPrice = oldPrice;
            System.out.println(WRONG_COST_OPERATION);
        }
        bookList.get(bookId).setCost(newPrice);}
        else throw new IllegalArgumentException(WRONG_ID);
    }

}


