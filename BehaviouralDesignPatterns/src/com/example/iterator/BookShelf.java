package com.example.iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    
    public BookShelf() {
        books = new ArrayList<Book>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public Book getBookAt(int index) {
        return books.get(index);
    }
    
    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }
}
