package com.xworkz.inheritence.innternal.Clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing c1 = new Clothing();
        c1.getType();
        c1.getMaterial();
        c1.getSize();
        c1.getColor();
        c1.getSeason();

        System.out.println("-----");

        Clothing c2 = new Jacket();
        c2.getType();
        c2.getMaterial();
        c2.getSize();
        c2.getColor();
        c2.getSeason();

        System.out.println("-----");

        Jacket c3 = new Jacket();
        c3.getType();
        c3.getMaterial();
        c3.getSize();
        c3.getColor();
        c3.getSeason();
    }
}
