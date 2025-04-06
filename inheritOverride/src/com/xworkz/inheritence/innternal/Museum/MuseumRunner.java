package com.xworkz.inheritence.innternal.Museum;

public class MuseumRunner {
    public static void main(String[] args) {
        Museum m1 = new Museum();
        m1.open();
        m1.displayItems();
        m1.close();

        System.out.println("-----");

        Museum m2 = new ArtMuseum();
        m2.open();
        m2.displayItems();
        m2.close();

        System.out.println("-----");

        ArtMuseum m3 = new ArtMuseum();
        m3.open();
        m3.displayItems();
        m3.close();
    }
}
