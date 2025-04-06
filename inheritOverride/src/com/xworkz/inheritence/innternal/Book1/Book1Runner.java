package com.xworkz.inheritence.innternal.Book1;

public class Book1Runner {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.read();
        b1.getTitle();
        b1.getAuthor();
        b1.getPages();
        b1.getGenre();

        System.out.println("-----");

        Book1 b2 = new Novel();
        b2.read();
        b2.getTitle();
        b2.getAuthor();
        b2.getPages();
        b2.getGenre();

        System.out.println("-----");

        Novel b3 = new Novel();
        b3.read();
        b3.getTitle();
        b3.getAuthor();
        b3.getPages();
        b3.getGenre();
    }
}
