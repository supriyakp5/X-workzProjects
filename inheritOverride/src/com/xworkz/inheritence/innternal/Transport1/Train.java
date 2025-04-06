package com.xworkz.inheritence.innternal.Transport1;

public class Train extends Transport1{
    public Train() {
        super();
        System.out.println("Train constructor - child");
    }

    @Override
    public void start() {
        System.out.println("Train departing station - child");
    }

    @Override
    public void stop() {
        System.out.println("Train arriving at station - child");
    }

    @Override
    public void speed() {
        System.out.println("Speed: Fast - child");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: High - child");
    }
}
