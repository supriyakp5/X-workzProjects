package com.xworkz.Tostring.internal;

public class CoffeeMaker {
    private String brand;
    private int cupCapacity;
    private double powerUsage;

    public CoffeeMaker(String brand, int cupCapacity, double powerUsage) {
        this.brand = brand;
        this.cupCapacity = cupCapacity;
        this.powerUsage = powerUsage;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "brand='" + brand + '\'' +
                ", cupCapacity=" + cupCapacity +
                ", powerUsage=" + powerUsage + " watts" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 29;
    }

}

