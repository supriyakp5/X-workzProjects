package com.xworkz.inheritence.innternal.Musician1;

public class MusicianRunner {
    public static void main(String[] args) {
        Musician1 m1 = new Musician1();
        m1.playInstrument();
        m1.compose();
        m1.practice();
        m1.perform();

        System.out.println("-----");

        Musician1 m2 = new Pianist();
        m2.playInstrument();
        m2.compose();
        m2.practice();
        m2.perform();

        System.out.println("-----");

        Pianist m3 = new Pianist();
        m3.playInstrument();
        m3.compose();
        m3.practice();
        m3.perform();
    }
}
