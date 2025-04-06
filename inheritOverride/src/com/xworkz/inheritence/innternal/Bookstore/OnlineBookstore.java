package com.xworkz.inheritence.innternal.Bookstore;

public class OnlineBookstore extends Bookstore{
    public OnlineBookstore() {
        super();
        System.out.println("OnlineBookstore constructor - child");
    }

    @Override
    public void getStoreName() {
        System.out.println("Store: eReads.com - child");
    }

    @Override
    public void getLocation() {
        System.out.println("Location: Online only - child");
    }

    @Override
    public void getOpeningHours() {
        System.out.println("Open 24/7 - child");
    }

    @Override
    public void getBookCount() {
        System.out.println("Over 500,000 books - child");
    }

    @Override
    public void getOwner() {
        System.out.println("Owner: Digital Inc. - child");
    }

}
