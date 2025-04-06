package com.xworkz.inheritence.innternal.Artist;

public class ArtistRunner {
    public static void main(String[] args) {
        Artist a1 = new Artist();
        a1.create();
        a1.display();
        a1.earn();
        a1.study();

        System.out.println("-----");

        Artist a2 = new Painter();
        a2.create();
        a2.display();
        a2.earn();
        a2.study();

        System.out.println("-----");

        Painter a3 = new Painter();
        a3.create();
        a3.display();
        a3.earn();
        a3.study();
    }
}
