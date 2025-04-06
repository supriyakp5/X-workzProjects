package com.xworkz.inheritence.innternal.Transport1;

public class Transport1 {
    public Transport1() {
        System.out.println("Transport constructor - parent");
    }

    public void start() {
        System.out.println("Transport starting - parent");
    }

    public void stop() {
        System.out.println("Transport stopping - parent");
    }

    public void speed() {
        System.out.println("Speed: Medium - parent");
    }

    public void capacity() {
        System.out.println("Capacity: Moderate - parent");
    }
}
