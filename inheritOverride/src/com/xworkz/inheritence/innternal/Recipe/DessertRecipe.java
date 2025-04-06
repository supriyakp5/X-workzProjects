package com.xworkz.inheritence.innternal.Recipe;

public class DessertRecipe extends Recipe{
    public DessertRecipe() {
        super();
        System.out.println("DessertRecipe constructor - child");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Gathering sugar, flour, and fruits - child");
    }

    @Override
    public void cook() {
        System.out.println("Baking the dessert - child");
    }

    @Override
    public void serve() {
        System.out.println("Serving dessert with garnish - child");
    }

}
