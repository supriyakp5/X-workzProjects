package com.xworkz.inheritence.innternal.Instrument;

public class GuitarRunner {
    public static void main(String[] args) {
        Instrument i1 = new Instrument();
        i1.play();
        i1.getType();
        i1.getBrand();
        i1.getSoundRange();
        i1.getMaterial();

        System.out.println("-----");

        Instrument i2 = new Guitar();
        i2.play();
        i2.getType();
        i2.getBrand();
        i2.getSoundRange();
        i2.getMaterial();

        System.out.println("-----");

        Guitar i3 = new Guitar();
        i3.play();
        i3.getType();
        i3.getBrand();
        i3.getSoundRange();
        i3.getMaterial();
    }
}
