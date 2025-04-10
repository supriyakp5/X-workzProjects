package com.xworkz.Tostring.internal;

public class Carpet {
    private String material;
    private int length;      // in centimeters
    private double price;    // in USD

    public Carpet(String material, int length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "material='" + material + '\'' +
                ", length=" + length + " cm" +
                ", price=$" + price +
                '}';
    }
    @Override
    public int hashCode() {
        return 24;
    }

}
