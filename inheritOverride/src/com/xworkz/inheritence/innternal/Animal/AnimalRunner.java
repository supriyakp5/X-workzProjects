package com.xworkz.inheritence.innternal.Animal;

public class AnimalRunner {
    public static void main(String[] args)
    {
        Animal animal=new Animal();
        animal.move();
        animal.sound();
        System.out.println(" ________________________");

        Animal animal1=new Cat();
        animal1.sound();
        animal1.move();

        System.out.println("____________________________");

        Cat cat=new Cat();
        cat.move();
        cat.sound();
    }
}
