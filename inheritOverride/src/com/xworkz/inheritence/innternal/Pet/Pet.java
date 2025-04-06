package com.xworkz.inheritence.innternal.Pet;

public class Pet {
    public Pet() {
        System.out.println("Pet constructor - parent");
    }

    public void feed() {
        System.out.println("Feeding pet - parent");
    }

    public void play() {
        System.out.println("Playing with pet - parent");
    }

    public void groom() {
        System.out.println("Grooming pet - parent");
    }

    public void sleep() {
        System.out.println("Pet sleeping - parent");
    }
}
