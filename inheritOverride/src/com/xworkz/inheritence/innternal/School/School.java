package com.xworkz.inheritence.innternal.School;

public class School {
    public School() {
        System.out.println("School constructor - parent");
    }

    public void open() {
        System.out.println("School is open - parent");
    }

    public void teach() {
        System.out.println("Teaching general subjects - parent");
    }

    public void bellRing() {
        System.out.println("Ringing school bell - parent");
    }

    public void close() {
        System.out.println("School is closed - parent");
    }
}
