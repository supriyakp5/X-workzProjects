package com.xworkz.inheritence.innternal.Recipe;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe r1 = new Recipe();
        r1.prepareIngredients();
        r1.cook();
        r1.serve();

        System.out.println("-----");

        Recipe r2 = new DessertRecipe();
        r2.prepareIngredients();
        r2.cook();
        r2.serve();

        System.out.println("-----");

        DessertRecipe r3 = new DessertRecipe();
        r3.prepareIngredients();
        r3.cook();
        r3.serve();
    }
}
