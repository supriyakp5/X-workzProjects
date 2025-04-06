package com.xworkz.inheritence.innternal.Book;

public class Book {
    public Book() {
        System.out.println("Running non-arg constructor Book--parent");
    }

    public void read() {
        System.out.println("Book read method--parent");
    }

    public void getSubject() {
        System.out.println("Book getSubject method--parent");
    }

    public void getPublisher() {
        System.out.println("Book getPublisher method--parent");
    }

    public void getPages() {
        System.out.println("Book getPages method--parent");
    }

    public void getLanguage() {
        System.out.println("Book getLanguage method--parent");
    }
}
