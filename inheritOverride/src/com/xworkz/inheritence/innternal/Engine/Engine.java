package com.xworkz.inheritence.innternal.Engine;

public class Engine {
    public Engine() {
        System.out.println("Engine constructor - parent");
    }

    public void start() {
        System.out.println("Starting engine - parent");
    }

    public void stop() {
        System.out.println("Stopping engine - parent");
    }

    public void fuelType() {
        System.out.println("Fuel type: Petrol/Diesel - parent");
    }
}
