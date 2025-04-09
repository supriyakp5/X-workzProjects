package com.xworkz.Tostring.internal;

public class Bed {
    private String size;
    private int height;
    private double price;

    public Bed(String size, int height, double price) {
        this.size = size;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "size='" + size + '\'' +
                ", height=" + height + " cm" +
                ", price=" + price +
                '}';
    }
}
