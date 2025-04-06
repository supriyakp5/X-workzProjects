package com.xworkz.inheritence.innternal.Appliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance a1 = new Appliance();
        a1.turnOn();
        a1.turnOff();
        a1.getBrand();
        a1.getType();
        a1.getWarranty();

        System.out.println("---------------");

        Appliance a2 = new WashingMachine();
        a2.turnOn();
        a2.turnOff();
        a2.getBrand();
        a2.getType();
        a2.getWarranty();

        System.out.println("---------------");

        WashingMachine a3 = new WashingMachine();
        a3.turnOn();
        a3.turnOff();
        a3.getBrand();
        a3.getType();
        a3.getWarranty();
    }
    }

