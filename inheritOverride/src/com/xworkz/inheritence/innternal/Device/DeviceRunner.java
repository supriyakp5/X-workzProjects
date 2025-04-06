package com.xworkz.inheritence.innternal.Device;

public class DeviceRunner {
    public static void main(String[] args) {
        Device d1 = new Device();
        d1.powerOn();
        d1.getBrand();
        d1.getModel();
        d1.getBatteryLevel();
        d1.getOperatingSystem();

        System.out.println("---------------");

        Device d2 = new Phone();
        d2.powerOn();
        d2.getBrand();
        d2.getModel();
        d2.getBatteryLevel();
        d2.getOperatingSystem();

        System.out.println("---------------");

        Phone d3 = new Phone();
        d3.powerOn();
        d3.getBrand();
        d3.getModel();
        d3.getBatteryLevel();
        d3.getOperatingSystem();
    }
}
