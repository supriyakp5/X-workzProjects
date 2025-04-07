package com.xworkz.inheritence.innternal.Animal;

public class Cat extends Animal {

    public Cat()
    {
        super();
        System.out.println("Running on non-arg constructor car");
    }
    @Override
    public void sound(){
        System.out.println("Animal make sounds --child");
    }
    public void move()
    {
        System.out.println("Animal move --child");
    }
    public void pet(){
        System.out.println("new method pet --child");
    }
}
