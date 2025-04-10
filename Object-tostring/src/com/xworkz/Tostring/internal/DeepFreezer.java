package com.xworkz.Tostring.internal;

public class DeepFreezer {
    private String brand;
    private int capacityLiters;
    private double powerConsumption;

    public DeepFreezer(String brand, int capacityLiters, double powerConsumption) {
        this.brand = brand;
        this.capacityLiters = capacityLiters;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "DeepFreezer{" +
                "brand='" + brand + '\'' +
                ", capacityLiters=" + capacityLiters +
                ", powerConsumption=" + powerConsumption + " kWh" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 33;
    }

}
