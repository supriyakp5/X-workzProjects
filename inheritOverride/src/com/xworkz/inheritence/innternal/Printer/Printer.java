package com.xworkz.inheritence.innternal.Printer;

public class Printer {
    public Printer() {
        System.out.println("Printer constructor - parent");
    }

    public void print() {
        System.out.println("Printing document - parent");
    }

    public void scan() {
        System.out.println("Scanning document - parent");
    }

    public void connect() {
        System.out.println("Connecting to computer - parent");
    }

    public void power() {
        System.out.println("Power ON - parent");
    }
}
