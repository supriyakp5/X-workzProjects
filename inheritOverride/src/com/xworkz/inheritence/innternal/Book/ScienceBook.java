package com.xworkz.inheritence.innternal.Book;


public class ScienceBook extends Book {
    public ScienceBook() {
        super();
        System.out.println("Running non-arg constructor ScienceBook");
    }

    @Override
    public void read() {
        System.out.println("ScienceBook read method--child");
    }

    @Override
    public void getSubject() {
        System.out.println("ScienceBook getSubject method--child");
    }

    @Override
    public void getPublisher() {
        System.out.println("ScienceBook getPublisher method--child");
    }

    @Override
    public void getPages() {
        System.out.println("ScienceBook getPages method--child");
    }

    @Override
    public void getLanguage() {
        System.out.println("ScienceBook getLanguage method--child");
    }
    public void price(){
        System.out.println("new method --child");
    }
}
