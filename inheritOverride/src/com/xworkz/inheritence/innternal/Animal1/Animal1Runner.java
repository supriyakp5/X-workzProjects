package com.xworkz.inheritence.innternal.Animal1;

public class Animal1Runner {

    public static void main(String[] args) {
        Animal1 a1 = new Animal1();
        a1.makeSound();
        a1.getSpecies();
        a1.getHabitat();
        a1.getDiet();
        a1.getLifespan();

        System.out.println("---------------");

        Animal1 a2 = new Dog();
        a2.makeSound();
        a2.getSpecies();
        a2.getHabitat();
        a2.getDiet();
        a2.getLifespan();

        System.out.println("---------------");

        Dog a3 = new Dog();
        a3.makeSound();
        a3.getSpecies();
        a3.getHabitat();
        a3.getDiet();
        a3.getLifespan();
    }
}
