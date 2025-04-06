package com.xworkz.inheritence.innternal.Sensor;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor s1 = new Sensor();
        s1.activate();
        s1.readData();
        s1.calibrate();
        s1.deactivate();

        System.out.println("-----");

        Sensor s2 = new TemperatureSensor();
        s2.activate();
        s2.readData();
        s2.calibrate();
        s2.deactivate();

        System.out.println("-----");

        TemperatureSensor s3 = new TemperatureSensor();
        s3.activate();
        s3.readData();
        s3.calibrate();
        s3.deactivate();
    }
}
