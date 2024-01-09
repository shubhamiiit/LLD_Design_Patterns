package IteratorPattern;

import java.util.List;

public class ConcreteAggregate implements Aggregate{
    private List<Book> booksList;

    public ConcreteAggregate(List<Book> booksList){
        this.booksList = booksList;
    }

    @Override
    public Iterator createIterator(){
        return new ConcreteIterator(booksList);
    }
}
