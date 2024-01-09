package IteratorPattern;

public class Book {
    private int price;
    private String bookName;

    Book(int price, String bookName){
        this.price = price;
        this.bookName = bookName;
    }

    public int getPrice(){
        return this.price;
    }

    public String getBookName(){
        return this.bookName;
    }

}
