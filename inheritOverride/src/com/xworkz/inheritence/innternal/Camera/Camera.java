package com.xworkz.inheritence.innternal.Camera;

public class Camera {
    public Camera() {
        System.out.println("Camera constructor - parent");
    }

    public void capture() {
        System.out.println("Capturing photo - parent");
    }

    public void record() {
        System.out.println("Recording video - parent");
    }

    public void zoom() {
        System.out.println("Zooming in - parent");
    }

    public void switchMode() {
        System.out.println("Switching mode - parent");
    }
}
