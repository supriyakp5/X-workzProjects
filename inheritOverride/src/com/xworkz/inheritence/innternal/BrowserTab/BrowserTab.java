package com.xworkz.inheritence.innternal.BrowserTab;

public class BrowserTab {
    public BrowserTab() {
        System.out.println("BrowserTab constructor - parent");
    }

    public void open() {
        System.out.println("Opening normal tab - parent");
    }

    public void browse() {
        System.out.println("Browsing in normal mode - parent");
    }

    public void close() {
        System.out.println("Closing tab - parent");
    }

    public void history() {
        System.out.println("Saving history - parent");
    }
}
