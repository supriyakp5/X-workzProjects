package com.xworkz.inheritence.innternal.AnimalShelter;

public class AnimalShelterRunner {
    public static void main(String[] args) {
        AnimalShelter a1 = new AnimalShelter();
        a1.acceptAnimal();
        a1.feedAnimals();
        a1.adoptAnimal();

        System.out.println("-----");

        AnimalShelter a2 = new DogShelter();
        a2.acceptAnimal();
        a2.feedAnimals();
        a2.adoptAnimal();

        System.out.println("-----");

        DogShelter a3 = new DogShelter();
        a3.acceptAnimal();
        a3.feedAnimals();
        a3.adoptAnimal();
    }
}
