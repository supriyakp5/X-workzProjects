package com.xworkz.inheritence.innternal.Appliance2;

public class Microwave extends Appliance2{
    public Microwave() {
        super();
        System.out.println("Microwave constructor - child");
    }

    @Override
    public void power() {
        System.out.println("Power: Electric - child");
    }

    @Override
    public void function() {
        System.out.println("Function: Heating food - child");
    }

    @Override
    public void voltage() {
        System.out.println("Voltage: 230V - child");
    }

    @Override
    public void brand() {
        System.out.println("Brand: Samsung - child");
    }

    @Override
    public void warranty() {
        System.out.println("Warranty: 2 years - child");
    }
}
