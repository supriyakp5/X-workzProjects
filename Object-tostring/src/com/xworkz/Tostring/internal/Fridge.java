package com.xworkz.Tostring.internal;

public class Fridge {
    private String brand;
    private int capacity;
    private double temperature;

    public Fridge(String brand, int capacity, double temperature) {
        this.brand = brand;
        this.capacity = capacity;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", temperature=" + temperature +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 39;
    }


}
