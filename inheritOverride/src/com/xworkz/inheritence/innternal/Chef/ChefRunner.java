package com.xworkz.inheritence.innternal.Chef;

public class ChefRunner {
    public static void main(String[] args) {
        Chef c1 = new Chef();
        c1.cook();
        c1.prepareIngredients();
        c1.cleanKitchen();

        System.out.println("-----");

        Chef c2 = new PastryChef();
        c2.cook();
        c2.prepareIngredients();
        c2.cleanKitchen();

        System.out.println("-----");

        PastryChef c3 = new PastryChef();
        c3.cook();
        c3.prepareIngredients();
        c3.cleanKitchen();
    }
}
