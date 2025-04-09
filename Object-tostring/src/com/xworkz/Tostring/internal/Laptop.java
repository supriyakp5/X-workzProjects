package com.xworkz.Tostring.internal;

public class Laptop {
    private String brand;
    private int ramSize;
    private double price;

    public Laptop(String brand, int ramSize, double price) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ramSize=" + ramSize +
                ", price=" + price +
                '}';
    }
}
