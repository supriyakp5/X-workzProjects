package com.xworkz.inheritence.innternal.Engine;

public class ElectricEngine extends Engine {
    public ElectricEngine() {
        super();
        System.out.println("ElectricEngine constructor - child");
    }

    @Override
    public void start() {
        System.out.println("Starting electric engine - child");
    }

    @Override
    public void stop() {
        System.out.println("Stopping electric engine - child");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type: Electric - child");
    }


}
