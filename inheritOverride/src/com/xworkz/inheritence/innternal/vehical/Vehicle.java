package com.xworkz.inheritence.innternal.vehical;

public class Vehicle {

    public Vehicle() {
        System.out.println("Running non-arg constructor Vehicle--parent");
    }

    public void move() {
        System.out.println("Vehicle moves from one place to another--parent");
    }

    public void fuelType() {
        System.out.println("Vehicle can use petrol, diesel or electricity--parent");
    }

    public void capacity() {
        System.out.println("Vehicle capacity varies by type--parent");
    }

    public void usage() {
        System.out.println("Vehicle is used for transportation--parent");
    }
}
