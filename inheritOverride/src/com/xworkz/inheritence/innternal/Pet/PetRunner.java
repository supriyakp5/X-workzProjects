package com.xworkz.inheritence.innternal.Pet;

public class PetRunner {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        p1.feed();
        p1.play();
        p1.groom();
        p1.sleep();

        System.out.println("-----");

        Pet p2 = new Dog();
        p2.feed();
        p2.play();
        p2.groom();
        p2.sleep();

        System.out.println("-----");

        Dog p3 = new Dog();
        p3.feed();
        p3.play();
        p3.groom();
        p3.sleep();
    }
}
