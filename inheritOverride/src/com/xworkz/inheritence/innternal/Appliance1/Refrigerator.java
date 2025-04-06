package com.xworkz.inheritence.innternal.Appliance1;

class Refrigerator extends Appliance1 {
    public Refrigerator() {
        super();
        System.out.println("Refrigerator constructor - child");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on refrigerator - child");
    }

    @Override
    public void getBrand() {
        System.out.println("Refrigerator brand - child");
    }

    @Override
    public void getPowerUsage() {
        System.out.println("Refrigerator power usage - child");
    }

    @Override
    public void getType() {
        System.out.println("Refrigerator type - child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Refrigerator warranty info - child");
    }
}
