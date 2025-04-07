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

        WashingMachine washingMachine= new WashingMachine();
        washingMachine .turnOn();
        washingMachine.turnOff();
        washingMachine .getBrand();
        washingMachine.getType();
        washingMachine .getWarranty();




        System.out.println("______________casting___________");

        HomeAppliance homeAppliance=new HomeAppliance();
        homeAppliance.dishwash(a1);
        homeAppliance.dishwash(a2);
        homeAppliance.dishwash(washingMachine);
    }
    }

