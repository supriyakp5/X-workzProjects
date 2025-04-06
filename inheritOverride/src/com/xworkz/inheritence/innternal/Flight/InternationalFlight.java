package com.xworkz.inheritence.innternal.Flight;

public class InternationalFlight extends Flight{
    public InternationalFlight() {
        super();
        System.out.println("InternationalFlight constructor - child");
    }

    @Override
    public void getDuration() {
        System.out.println("Flight duration: 10 hours - child");
    }

    @Override
    public void getType() {
        System.out.println("International flight - child");
    }

    @Override
    public void takeOff() {
        System.out.println("International flight taking off - child");
    }

    @Override
    public void land() {
        System.out.println("International flight landing - child");
    }
}
