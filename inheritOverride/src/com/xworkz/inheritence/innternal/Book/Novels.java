package com.xworkz.inheritence.innternal.Book;

public class Novels {
    public void gk(Book obj1)
    {
        obj1.getLanguage();
        obj1.getPages();
        obj1.getPublisher();
        obj1.read();

        if(obj1 instanceof ScienceBook )

        {
            System.out.println("obj1 instanceof sciencebook");
            ScienceBook scienceBook=new ScienceBook();
            scienceBook.price();
        }
    }
}
