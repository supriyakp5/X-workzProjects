package com.xworkz.Tostring.internal;
public class Glove {
    private String material;
    private int size;
    private double price;

    public Glove(String material, int size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Glove{" +
                "material='" + material + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
