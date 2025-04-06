package com.xworkz.inheritence.innternal.Musician;

public class MusicianRunner {
    public static void main(String[] args) {
        Musician m1 = new Musician();
        m1.playInstrument();
        m1.practice();
        m1.perform();
        m1.compose();

        System.out.println("-----");

        Musician m2 = new Pianist();
        m2.playInstrument();
        m2.practice();
        m2.perform();
        m2.compose();

        System.out.println("-----");

        Pianist m3 = new Pianist();
        m3.playInstrument();
        m3.practice();
        m3.perform();
        m3.compose();
    }
}
