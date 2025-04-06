package com.xworkz.inheritence.innternal.Musician;

public class Musician {
    public Musician() {
        System.out.println("Musician constructor - parent");
    }

    public void playInstrument() {
        System.out.println("Playing an instrument - parent");
    }

    public void practice() {
        System.out.println("Practicing music - parent");
    }

    public void perform() {
        System.out.println("Performing on stage - parent");
    }

    public void compose() {
        System.out.println("Composing music - parent");
    }
}
