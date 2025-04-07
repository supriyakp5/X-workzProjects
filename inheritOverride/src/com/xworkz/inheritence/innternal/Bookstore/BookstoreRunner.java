package com.xworkz.inheritence.innternal.Bookstore;

public class BookstoreRunner {
    public static void main(String[] args) {
        Bookstore b1 = new Bookstore();
        b1.getStoreName();
        b1.getLocation();
        b1.getOpeningHours();
        b1.getBookCount();
        b1.getOwner();

        System.out.println("-----");

        Bookstore b2 = new OnlineBookstore();
        b2.getStoreName();
        b2.getLocation();
        b2.getOpeningHours();
        b2.getBookCount();
        b2.getOwner();

        System.out.println("-----");

        OnlineBookstore b3 = new OnlineBookstore();
        b3.getStoreName();
        b3.getLocation();
        b3.getOpeningHours();
        b3.getBookCount();
        b3.getOwner();



        System.out.println("________________casting_________");
        GenralBook genralBook=new GenralBook();
        genralBook.siriBook(b1);
        genralBook.siriBook(b2);
        genralBook.siriBook(b3);


    }
}
