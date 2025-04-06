package com.xworkz.inheritence.innternal.Website;

public class WebsiteRunner {
    public static void main(String[] args) {
        Website w1 = new Website();
        w1.load();
        w1.showContent();
        w1.logout();
        w1.getURL();
        w1.getVisitors();

        System.out.println("-----");

        Website w2 = new ECommerceWebsite();
        w2.load();
        w2.showContent();
        w2.logout();
        w2.getURL();
        w2.getVisitors();

        System.out.println("-----");

        ECommerceWebsite w3 = new ECommerceWebsite();
        w3.load();
        w3.showContent();
        w3.logout();
        w3.getURL();
        w3.getVisitors();
    }
}
