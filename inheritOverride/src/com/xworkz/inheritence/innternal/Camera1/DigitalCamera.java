package com.xworkz.inheritence.innternal.Camera1;

public class DigitalCamera extends Camera1{
    public DigitalCamera() {
        super();
        System.out.println("DigitalCamera constructor - child");
    }

    @Override
    public void capture() {
        System.out.println("Capturing digital photo - child");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming digitally - child");
    }

    @Override
    public void powerOn() {
        System.out.println("Turning on digital camera - child");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning off digital camera - child");
    }
}
