package com.xworkz.inheritence.innternal.Shop;

public class ShopeRunner {
    public static void main(String[] args) {
        Shop s1 = new Shop();
        s1.open();
        s1.sell();
        s1.displayItems();
        s1.close();

        System.out.println("-----");

        Shop s2 = new GroceryStore();
        s2.open();
        s2.sell();
        s2.displayItems();
        s2.close();

        System.out.println("-----");

        GroceryStore s3 = new GroceryStore();
        s3.open();
        s3.sell();
        s3.displayItems();
        s3.close();
    }
}
