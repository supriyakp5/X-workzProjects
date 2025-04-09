package com.xworkz.Tostring.internal;
public class Jacket {
    private String brand;
    private int size;
    private double price;

    public Jacket(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
