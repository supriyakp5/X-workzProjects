package com.xworkz.inheritence.innternal.Appliance;

public class Appliance {
    public Appliance() {
        System.out.println("Running non-arg constructor Appliance--parent");
    }

    public void turnOn() {
        System.out.println("Appliance turnOn method--parent");
    }

    public void turnOff() {
        System.out.println("Appliance turnOff method--parent");
    }

    public void getBrand() {
        System.out.println("Appliance getBrand method--parent");
    }

    public void getType() {
        System.out.println("Appliance getType method--parent");
    }

    public void getWarranty() {
        System.out.println("Appliance getWarranty method--parent");
    }
}
