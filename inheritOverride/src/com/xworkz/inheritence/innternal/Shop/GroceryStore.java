package com.xworkz.inheritence.innternal.Shop;

public class GroceryStore extends Shop{
    public GroceryStore() {
        super();
        System.out.println("GroceryStore constructor - child");
    }

    @Override
    public void sell() {
        System.out.println("Selling vegetables and food - child");
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying grocery items - child");
    }

    @Override
    public void open() {
        System.out.println("Opening grocery store - child");
    }

    @Override
    public void close() {
        System.out.println("Closing grocery store - child");
    }
}
