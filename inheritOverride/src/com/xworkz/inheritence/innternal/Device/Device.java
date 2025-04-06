package com.xworkz.inheritence.innternal.Device;

public class Device {
    public Device() {
        System.out.println("Running non-arg constructor Device--parent");
    }

    public void powerOn() {
        System.out.println("Device powerOn method--parent");
    }

    public void getBrand() {
        System.out.println("Device getBrand method--parent");
    }

    public void getModel() {
        System.out.println("Device getModel method--parent");
    }

    public void getBatteryLevel() {
        System.out.println("Device getBatteryLevel method--parent");
    }

    public void getOperatingSystem() {
        System.out.println("Device getOperatingSystem method--parent");
    }
}
