package com.xworkz.inheritence.innternal.Camera1;

public class Camera1 {
    public Camera1() {
        System.out.println("Camera constructor - parent");
    }

    public void capture() {
        System.out.println("Capturing photo - parent");
    }

    public void zoom() {
        System.out.println("Zooming in/out - parent");
    }

    public void powerOn() {
        System.out.println("Powering on camera - parent");
    }

    public void powerOff() {
        System.out.println("Powering off camera - parent");
    }
}
