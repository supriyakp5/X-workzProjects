package com.xworkz.inheritence.innternal.Sensor;

public class TemperatureSensor extends Sensor{
    public TemperatureSensor() {
        super();
        System.out.println("TemperatureSensor constructor - child");
    }

    @Override
    public void activate() {
        System.out.println("Activating temperature sensor - child");
    }

    @Override
    public void readData() {
        System.out.println("Reading temperature data - child");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating temperature sensor - child");
    }

    @Override
    public void deactivate() {
        System.out.println("Deactivating temperature sensor - child");
    }
}
