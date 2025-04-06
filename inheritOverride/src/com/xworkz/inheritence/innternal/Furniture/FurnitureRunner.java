package com.xworkz.inheritence.innternal.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture f1 = new Furniture();
        f1.material();
        f1.weight();
        f1.purpose();
        f1.design();

        System.out.println("-----");

        Furniture f2 = new Chair();
        f2.material();
        f2.weight();
        f2.purpose();
        f2.design();

        System.out.println("-----");

        Chair f3 = new Chair();
        f3.material();
        f3.weight();
        f3.purpose();
        f3.design();
    }
}
