package com.xworkz.inheritence.innternal.Appliance;

public class HomeAppliance {
    public void dishwash(Appliance a1){
        a1.getBrand();
        a1.getType();
        a1.getWarranty();
        a1.turnOff();
        a1.turnOn();



        if(a1 instanceof WashingMachine){
            System.out.println("a1 instancesof washing machine");
            WashingMachine washingMachine=(WashingMachine) a1;
            ((WashingMachine) a1).addWater();
        }
    }
}
