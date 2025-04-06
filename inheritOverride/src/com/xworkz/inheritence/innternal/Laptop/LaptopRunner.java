package com.xworkz.inheritence.innternal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.powerOn();
        l1.getBrand();
        l1.getModel();
        l1.getOS();
        l1.getPrice();

        System.out.println("---------------");

        Laptop l2 = new MacBook();
        l2.powerOn();
        l2.getBrand();
        l2.getModel();
        l2.getOS();
        l2.getPrice();

        System.out.println("---------------");

        MacBook l3 = new MacBook();
        l3.powerOn();
        l3.getBrand();
        l3.getModel();
        l3.getOS();
        l3.getPrice();
    }
}
