package com.xworkz.Tostring.internal;

public class Blender {
    private String brand;
    private int speedLevels;
    private double capacity;

    public Blender(String brand, int speedLevels, double capacity) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Blender{" +
                "brand='" + brand + '\'' +
                ", speedLevels=" + speedLevels +
                ", capacity=" + capacity + " liters" +
                '}';
    }
}
