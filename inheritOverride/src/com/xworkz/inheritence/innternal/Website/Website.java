package com.xworkz.inheritence.innternal.Website;

public class Website {
    public Website() {
        System.out.println("Website constructor - parent");
    }

    public void load() {
        System.out.println("Website loading... - parent");
    }

    public void showContent() {
        System.out.println("Showing general content - parent");
    }

    public void logout() {
        System.out.println("Logging out - parent");
    }

    public void getURL() {
        System.out.println("Website URL: example.com - parent");
    }

    public void getVisitors() {
        System.out.println("Visitors: 1000+ - parent");
    }
}
