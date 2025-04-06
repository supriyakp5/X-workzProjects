package com.xworkz.inheritence.innternal.Appliance2;

public class Appliance2 {
    public Appliance2() {
        System.out.println("Appliance constructor - parent");
    }

    public void power() {
        System.out.println("Power: On/Off - parent");
    }

    public void function() {
        System.out.println("Function: Generic use - parent");
    }

    public void voltage() {
        System.out.println("Voltage: 220V - parent");
    }

    public void brand() {
        System.out.println("Brand: Generic - parent");
    }

    public void warranty() {
        System.out.println("Warranty: 1 year - parent");
    }
}
