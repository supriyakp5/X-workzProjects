package com.xworkz.Tostring.internal;

public class Clip {
    private String material;
    private int quantity;
    private double length;

    public Clip(String material, int quantity, double length) {
        this.material = material;
        this.quantity = quantity;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Clip{" +
                "material='" + material + '\'' +
                ", quantity=" + quantity +
                ", length=" + length + " cm" +
                '}';
    }
}
