package com.xworkz.Tostring.internal;

public class Helmet {
    private String type;
    private int size;
    private double price;

    public Helmet(String type, int size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

}
