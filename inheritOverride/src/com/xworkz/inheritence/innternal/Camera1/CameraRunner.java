package com.xworkz.inheritence.innternal.Camera1;

public class CameraRunner {
    public static void main(String[] args) {
        Camera1 c1 = new Camera1();
        c1.capture();
        c1.zoom();
        c1.powerOn();
        c1.powerOff();

        System.out.println("-----");

        Camera1 c2 = new DigitalCamera();
        c2.capture();
        c2.zoom();
        c2.powerOn();
        c2.powerOff();

        System.out.println("-----");

        DigitalCamera c3 = new DigitalCamera();
        c3.capture();
        c3.zoom();
        c3.powerOn();
        c3.powerOff();
    }
}
