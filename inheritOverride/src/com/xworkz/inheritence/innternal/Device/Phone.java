package com.xworkz.inheritence.innternal.Device;

class Phone extends Device {
    public Phone() {
        super();
        System.out.println("Running non-arg constructor Phone--child");
    }

    @Override
    public void powerOn() {
        System.out.println("Phone powerOn method--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Phone getBrand method--child");
    }

    @Override
    public void getModel() {
        System.out.println("Phone getModel method--child");
    }

    @Override
    public void getBatteryLevel() {
        System.out.println("Phone getBatteryLevel method--child");
    }

    @Override
    public void getOperatingSystem() {
        System.out.println("Phone getOperatingSystem method--child");
    }
}
