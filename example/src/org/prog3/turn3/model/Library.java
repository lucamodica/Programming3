package org.prog3.turn3.model;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public int capacity(){
        return books.size();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void printLibrary(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
