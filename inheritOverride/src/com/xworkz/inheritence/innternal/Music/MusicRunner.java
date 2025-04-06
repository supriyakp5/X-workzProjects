package com.xworkz.inheritence.innternal.Music;

public class MusicRunner {
    public static void main(String[] args) {
        Music m1 = new Music();
        m1.play();
        m1.getGenre();
        m1.getDuration();
        m1.getArtist();
        m1.getLanguage();

        System.out.println("-----");

        Music m2 = new ClassicalMusic();
        m2.play();
        m2.getGenre();
        m2.getDuration();
        m2.getArtist();
        m2.getLanguage();

        System.out.println("-----");

        ClassicalMusic m3 = new ClassicalMusic();
        m3.play();
        m3.getGenre();
        m3.getDuration();
        m3.getArtist();
        m3.getLanguage();
    }
}
