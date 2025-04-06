package com.xworkz.inheritence.innternal.Flight;

public class Flight {
    public Flight() {
        System.out.println("Flight constructor - parent");
    }

    public void takeOff() {
        System.out.println("Flight is taking off - parent");
    }

    public void land() {
        System.out.println("Flight is landing - parent");
    }

    public void getDuration() {
        System.out.println("Flight duration: 2 hours - parent");
    }

    public void getType() {
        System.out.println("Domestic flight - parent");
    }
}
