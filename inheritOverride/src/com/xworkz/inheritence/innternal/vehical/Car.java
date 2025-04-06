package com.xworkz.inheritence.innternal.vehical;

public class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("Running non-arg constructor Car");
    }

    @Override
    public void move() {
        System.out.println("Car moves on four wheels--child");
    }

    @Override
    public void fuelType() {
        System.out.println("Car uses petrol or diesel--child");
    }

    @Override
    public void capacity() {
        System.out.println("Car can carry 4 to 5 passengers--child");
    }

    @Override
    public void usage() {
        System.out.println("Car is used for personal transport--child");
    }

}
