package com.example.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        bookShelf.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship"));
        bookShelf.addBook(new Book("Refactoring: Improving the Design of Existing Code"));
        
        Iterator iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getTitle());
        }
    }
}

