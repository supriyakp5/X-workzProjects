package com.xworkz.inheritence.innternal.Food;

public class FoodRunner {
    public static void main(String[] args) {

        System.out.println("=== Food / Fruit ===");
        Food f1 = new Food();
        f1.eat();
        f1.getName();
        f1.getCalories();
        f1.getOrigin();
        f1.getType();

        System.out.println("-----");

        Food f2 = new Fruit();
        f2.eat();
        f2.getName();
        f2.getCalories();
        f2.getOrigin();
        f2.getType();

        System.out.println("-----");

        Fruit f3 = new Fruit();
        f3.eat();
        f3.getName();
        f3.getCalories();
        f3.getOrigin();
        f3.getType();

    }
}
