package com.xworkz.inheritence.innternal.Animal1;

class Dog extends Animal1 {
    public Dog() {
        super();
        System.out.println("Running non-arg constructor Dog--child");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makeSound method--child");
    }

    @Override
    public void getSpecies() {
        System.out.println("Dog getSpecies method--child");
    }

    @Override
    public void getHabitat() {
        System.out.println("Dog getHabitat method--child");
    }

    @Override
    public void getDiet() {
        System.out.println("Dog getDiet method--child");
    }

    @Override
    public void getLifespan() {
        System.out.println("Dog getLifespan method--child");
    }
}
