package IteratorPattern;

import java.util.List;

public class ConcreteIterator implements Iterator{
    private List<Book> books;
    private int index = 0;

    public ConcreteIterator(List<Book> books){
        this.books = books;
    }

    @Override
    public boolean hasNext(){
        return index < books.size();
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return books.get(index++);
        }

        return null;
    }
}
