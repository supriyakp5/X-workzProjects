package com.xworkz.inheritence.innternal.AnimalShelter;

public class DogShelter extends AnimalShelter {
    public DogShelter() {
        super();
        System.out.println("DogShelter constructor - child");
    }

    @Override
    public void acceptAnimal() {
        System.out.println("Accepting dogs only - child");
    }

    @Override
    public void feedAnimals() {
        System.out.println("Feeding dogs with special diet - child");
    }

    @Override
    public void adoptAnimal() {
        System.out.println("Dog adopted from shelter - child");
    }
}
