package com.xworkz.inheritence.innternal.Shop;

public class Shop {
    public Shop() {
        System.out.println("Shop constructor - parent");
    }

    public void open() {
        System.out.println("Shop is now open - parent");
    }

    public void sell() {
        System.out.println("Selling general items - parent");
    }

    public void close() {
        System.out.println("Shop is closed - parent");
    }

    public void displayItems() {
        System.out.println("Displaying shop items - parent");
    }
}
