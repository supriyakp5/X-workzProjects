package com.xworkz.inheritence.innternal.Museum;

public class Museum {
    public Museum() {
        System.out.println("Museum constructor - parent");
    }

    public void open() {
        System.out.println("Museum opens to public - parent");
    }

    public void displayItems() {
        System.out.println("Displaying historical items - parent");
    }

    public void close() {
        System.out.println("Museum closes at evening - parent");
    }
}
