package com.xworkz.inheritence.innternal.Furniture1;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture1 f1 = new Furniture1();
        f1.describe();
        f1.material();
        f1.usage();

        System.out.println("-----");

        Furniture1 f2 = new OfficeChair();
        f2.describe();
        f2.material();
        f2.usage();

        System.out.println("-----");

        OfficeChair f3 = new OfficeChair();
        f3.describe();
        f3.material();
        f3.usage();
    }
}
