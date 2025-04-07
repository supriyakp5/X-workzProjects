package com.xworkz.inheritence.innternal.Animal;

public class Birds {
    public void pigeons(Animal animal){
        animal.move();
        animal.sound();

        if(animal instanceof Cat)
        {
            System.out.println("animal instancesof cat");
            Cat cat=(Cat) animal;
            cat.pet();

        }

    }
}
