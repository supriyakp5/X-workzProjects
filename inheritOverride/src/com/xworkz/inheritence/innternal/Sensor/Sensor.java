package com.xworkz.inheritence.innternal.Sensor;

public class Sensor {
    public Sensor() {
        System.out.println("Sensor constructor - parent");
    }

    public void activate() {
        System.out.println("Activating sensor - parent");
    }

    public void readData() {
        System.out.println("Reading sensor data - parent");
    }

    public void calibrate() {
        System.out.println("Calibrating sensor - parent");
    }

    public void deactivate() {
        System.out.println("Deactivating sensor - parent");
    }
}
