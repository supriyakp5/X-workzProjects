package com.xworkz.inheritence.innternal.Instrument;

public class Instrument {

    public Instrument() {
        System.out.println("Instrument constructor - parent");
    }

    public void play() {
        System.out.println("Playing instrument - parent");
    }

    public void getType() {
        System.out.println("Instrument type - parent");
    }

    public void getBrand() {
        System.out.println("Instrument brand - parent");
    }

    public void getSoundRange() {
        System.out.println("Instrument sound range - parent");
    }

    public void getMaterial() {
        System.out.println("Instrument material - parent");
    }
}

