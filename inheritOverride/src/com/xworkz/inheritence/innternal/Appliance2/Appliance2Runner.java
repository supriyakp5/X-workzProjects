package com.xworkz.inheritence.innternal.Appliance2;

public class Appliance2Runner {
    public static void main(String[] args) {
        Appliance2 a1 = new Appliance2();
        a1.power();
        a1.function();
        a1.voltage();
        a1.brand();
        a1.warranty();

        System.out.println("-----");

        Appliance2 a2 = new Microwave();
        a2.power();
        a2.function();
        a2.voltage();
        a2.brand();
        a2.warranty();

        System.out.println("-----");

        Microwave a3 = new Microwave();
        a3.power();
        a3.function();
        a3.voltage();
        a3.brand();
        a3.warranty();
    }
}
