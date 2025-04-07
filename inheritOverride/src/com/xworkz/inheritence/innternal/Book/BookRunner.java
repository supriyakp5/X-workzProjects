package com.xworkz.inheritence.innternal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book obj1 = new Book();
        obj1.read();
        obj1.getSubject();
        obj1.getPublisher();
        obj1.getPages();
        obj1.getLanguage();

        System.out.println("---------------");

        Book obj2 = new ScienceBook();
        obj2.read();
        obj2.getSubject();
        obj2.getPublisher();
        obj2.getPages();
        obj2.getLanguage();

        System.out.println("---------------");

        ScienceBook obj3 = new ScienceBook();
        obj3.read();
        obj3.getSubject();
        obj3.getPublisher();
        obj3.getPages();
        obj3.getLanguage();

        System.out.println("____________casting______________");
        Novels novels=new Novels();
        novels.gk(obj1);
        novels.gk(obj1);
        novels.gk(obj3);
    }
}

