package com.xworkz.Tostring.internal;

public class Bag {
    private String brand;
    private int capacity;
    private double price;

    public Bag(String brand, int capacity, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity + " liters" +
                ", price=" + price +
                '}';
    }
}

