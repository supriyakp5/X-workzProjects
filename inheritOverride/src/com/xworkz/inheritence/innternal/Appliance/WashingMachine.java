package com.xworkz.inheritence.innternal.Appliance;

class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("Running non-arg constructor WashingMachine--child");
    }

    @Override
    public void turnOn() {
        System.out.println("WashingMachine turnOn method--child");
    }

    @Override
    public void turnOff() {
        System.out.println("WashingMachine turnOff method--child");
    }

    @Override
    public void getBrand() {
        System.out.println("WashingMachine getBrand method--child");
    }

    @Override
    public void getType() {
        System.out.println("WashingMachine getType method--child");
    }

    @Override
    public void getWarranty() {
        System.out.println("WashingMachine getWarranty method--child");
    }
    public void addWater()
    {
        System.out.println("new method --child");
    }
}
