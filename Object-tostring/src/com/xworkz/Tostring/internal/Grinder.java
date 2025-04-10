package com.xworkz.Tostring.internal;

public class Grinder {
    private String brand;
    private int power;
    private double cost;

    public Grinder(String brand, int power, double cost) {
        this.brand = brand;
        this.power = power;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Grinder{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", cost=" + cost +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 40;
    }


}
