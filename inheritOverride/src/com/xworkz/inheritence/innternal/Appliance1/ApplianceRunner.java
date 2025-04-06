package com.xworkz.inheritence.innternal.Appliance1;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance1 a1 = new Appliance1();
        a1.turnOn();
        a1.getBrand();
        a1.getPowerUsage();
        a1.getType();
        a1.getWarranty();

        System.out.println("-----");

        Appliance1 a2 = new Refrigerator();
        a2.turnOn();
        a2.getBrand();
        a2.getPowerUsage();
        a2.getType();
        a2.getWarranty();

        System.out.println("-----");

        Refrigerator a3 = new Refrigerator();
        a3.turnOn();
        a3.getBrand();
        a3.getPowerUsage();
        a3.getType();
        a3.getWarranty();
    }
}
