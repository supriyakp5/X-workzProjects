package com.xworkz.Tostring.internal;

public class Drill {
    private String brand;
    private int powerWatts;
    private double weightKg;

    public Drill(String brand, int powerWatts, double weightKg) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return "Drill{" +
                "brand='" + brand + '\'' +
                ", powerWatts=" + powerWatts +
                ", weightKg=" + weightKg +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 38;
    }


}
