package com.xworkz.inheritence.innternal.Chef;

public class Chef {
    public Chef() {
        System.out.println("Chef constructor - parent");
    }

    public void cook() {
        System.out.println("Cooking food - parent");
    }

    public void cleanKitchen() {
        System.out.println("Cleaning kitchen - parent");
    }

    public void prepareIngredients() {
        System.out.println("Preparing ingredients - parent");
    }
}
