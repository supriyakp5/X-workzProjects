package com.xworkz.inheritence.innternal.Transport;

public class Transport {
    public Transport() {
        System.out.println("Transport constructor - parent");
    }

    public void start() {
        System.out.println("Transport starts - parent");
    }

    public void stop() {
        System.out.println("Transport stops - parent");
    }

    public void fuelType() {
        System.out.println("Fuel type: General - parent");
    }

    public void capacity() {
        System.out.println("Capacity: Unknown - parent");
    }

    public void mode() {
        System.out.println("Mode: Ground or air - parent");
    }
}
