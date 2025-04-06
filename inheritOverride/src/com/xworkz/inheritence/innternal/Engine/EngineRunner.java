package com.xworkz.inheritence.innternal.Engine;

public class EngineRunner {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        e1.start();
        e1.stop();
        e1.fuelType();


        System.out.println("-----");

        Engine e2 = new ElectricEngine();
        e2.start();
        e2.stop();
        e2.fuelType();


        System.out.println("-----");

        ElectricEngine e3 = new ElectricEngine();
        e3.start();
        e3.stop();
        e3.fuelType();
    }
}
