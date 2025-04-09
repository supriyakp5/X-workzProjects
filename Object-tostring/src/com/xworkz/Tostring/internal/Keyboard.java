package com.xworkz.Tostring.internal;

public class Keyboard {
    private String brand;
    private int layoutCode;
    private double price;

    public Keyboard(String brand, int layoutCode, double price) {
        this.brand = brand;
        this.layoutCode = layoutCode;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", layoutCode=" + layoutCode +
                ", price=" + price +
                '}';
    }
}
