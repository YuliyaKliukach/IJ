package com.class20;


public class Book {

    String bookName;
    String ISBN;

    Book(){
        System.out.println("What is your book?");
    }

    public Book(String bookName, String ISBN) {
        this();
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        Book book1=new Book("Harry Potter", "123456");

    }
}
