package com.xworkz.inheritence.innternal.BrowserTab;

public class BrowserTabRunner {
    public static void main(String[] args) {
        BrowserTab b1 = new BrowserTab();
        b1.open();
        b1.browse();
        b1.close();
        b1.history();

        System.out.println("-----");

        BrowserTab b2 = new IncognitoTab();
        b2.open();
        b2.browse();
        b2.close();
        b2.history();

        System.out.println("-----");

        IncognitoTab b3 = new IncognitoTab();
        b3.open();
        b3.browse();
        b3.close();
        b3.history();
    }
}
