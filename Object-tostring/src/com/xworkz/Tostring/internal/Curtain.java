package com.xworkz.Tostring.internal;

public class Curtain {
    private String fabricType;
    private int length;
    private double price;

    public Curtain(String fabricType, int length, double price) {
        this.fabricType = fabricType;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Curtain{" +
                "fabricType='" + fabricType + '\'' +
                ", length=" + length + " cm" +
                ", price=" + price +
                '}';
    }

}
