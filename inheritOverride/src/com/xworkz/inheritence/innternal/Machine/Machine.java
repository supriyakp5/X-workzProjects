package com.xworkz.inheritence.innternal.Machine;

public class Machine {
    public Machine() {
        System.out.println("Machine constructor - parent");
    }

    public void start() {
        System.out.println("Starting machine - parent");
    }

    public void stop() {
        System.out.println("Stopping machine - parent");
    }

    public void process() {
        System.out.println("Processing task - parent");
    }

    public void reset() {
        System.out.println("Resetting machine - parent");
    }
}
