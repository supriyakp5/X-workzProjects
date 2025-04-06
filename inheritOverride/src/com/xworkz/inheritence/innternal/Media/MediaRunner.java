package com.xworkz.inheritence.innternal.Media;

public class MediaRunner {
    public static void main(String[] args) {
        Media m1 = new Media();
        m1.play();
        m1.getTitle();
        m1.getDuration();
        m1.getGenre();
        m1.getRating();

        System.out.println("-----");

        Media m2 = new Movie();
        m2.play();
        m2.getTitle();
        m2.getDuration();
        m2.getGenre();
        m2.getRating();

        System.out.println("-----");

        Movie m3 = new Movie();
        m3.play();
        m3.getTitle();
        m3.getDuration();
        m3.getGenre();
        m3.getRating();
    }

}
