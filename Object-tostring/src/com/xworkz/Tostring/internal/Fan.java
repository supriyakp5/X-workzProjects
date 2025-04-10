package com.xworkz.Tostring.internal;

public class Fan {
    private String brand;
    private int speedLevels;
    private double powerConsumption;

    public Fan(String brand, int speedLevels, double powerConsumption) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "brand='" + brand + '\'' +
                ", speedLevels=" + speedLevels +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 33;
    }

}
