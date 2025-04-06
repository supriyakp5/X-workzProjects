package com.xworkz.inheritence.innternal.Pet;

public class Dog extends Pet{
    public Dog() {
        super();
        System.out.println("Dog constructor - child");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog - child");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch with dog - child");
    }

    @Override
    public void groom() {
        System.out.println("Grooming dog - child");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping in kennel - child");
    }
}
