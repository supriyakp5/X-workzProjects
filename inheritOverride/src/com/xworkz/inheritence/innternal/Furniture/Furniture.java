package com.xworkz.inheritence.innternal.Furniture;

public class Furniture {
    public Furniture() {
        System.out.println("Furniture constructor - parent");
    }

    public void material() {
        System.out.println("Made of wood - parent");
    }

    public void weight() {
        System.out.println("Weighs 20kg - parent");
    }

    public void purpose() {
        System.out.println("Used for home - parent");
    }

    public void design() {
        System.out.println("Simple design - parent");
    }
}
