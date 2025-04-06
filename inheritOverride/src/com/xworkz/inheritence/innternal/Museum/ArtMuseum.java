package com.xworkz.inheritence.innternal.Museum;

public class ArtMuseum extends Museum {
    public ArtMuseum() {
        super();
        System.out.println("ArtMuseum constructor - child");
    }

    @Override
    public void open() {
        System.out.println("ArtMuseum opens with modern art section - child");
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying paintings and sculptures - child");
    }

    @Override
    public void close() {
        System.out.println("ArtMuseum closes after last tour - child");
    }
}
