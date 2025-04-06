package com.xworkz.inheritence.innternal.Transport;

public class Airplane extends Transport{
    public Airplane() {
        super();
        System.out.println("Airplane constructor - child");
    }

    @Override
    public void start() {
        System.out.println("Airplane takes off - child");
    }

    @Override
    public void stop() {
        System.out.println("Airplane lands - child");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type: Aviation fuel - child");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: 180 passengers - child");
    }

    @Override
    public void mode() {
        System.out.println("Mode: Air transport - child");
    }
}
