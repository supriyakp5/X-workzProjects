package com.xworkz.inheritence.innternal.Browser;

public class BrowserRunner {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.open();
        b1.search();
        b1.refresh();
        b1.close();

        System.out.println("-----");

        Browser b2 = new ChromeBrowser();
        b2.open();
        b2.search();
        b2.refresh();
        b2.close();

        System.out.println("-----");

        ChromeBrowser b3 = new ChromeBrowser();
        b3.open();
        b3.search();
        b3.refresh();
        b3.close();

        System.out.println("_______casting_________");
        Chrome chrome=new Chrome();
        chrome.website(b1);
        chrome.website(b2);
        chrome.website(b3);

    }
}
