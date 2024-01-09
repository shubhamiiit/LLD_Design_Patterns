package IteratorPattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
            new Book(100, "Premchand"),
            new Book(200, "Infinity"),
            new Book(300, "LLD"),
            new Book(400, "System Design"),
            new Book(500, "Our Body")
        );

        Aggregate lib = new ConcreteAggregate(bookList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
            System.out.println(book.getPrice());
        }
    }
}
