package com.xworkz.inheritence.innternal.Chef;

public class PastryChef extends Chef{
    public PastryChef() {
        super();
        System.out.println("PastryChef constructor - child");
    }

    @Override
    public void cook() {
        System.out.println("Baking cakes and pastries - child");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing flour, sugar, eggs - child");
    }

    @Override
    public void cleanKitchen() {
        System.out.println("Cleaning bakery workspace - child");
    }
}
