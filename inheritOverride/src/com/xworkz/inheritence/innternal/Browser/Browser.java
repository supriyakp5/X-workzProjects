package com.xworkz.inheritence.innternal.Browser;

public class Browser {
    public Browser() {
        System.out.println("Browser constructor - parent");
    }

    public void open() {
        System.out.println("Opening browser - parent");
    }

    public void search() {
        System.out.println("Searching the web - parent");
    }

    public void refresh() {
        System.out.println("Refreshing page - parent");
    }

    public void close() {
        System.out.println("Closing browser - parent");
    }
}
