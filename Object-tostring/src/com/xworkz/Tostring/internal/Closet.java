package com.xworkz.Tostring.internal;
public class Closet {
    private String material;
    private int shelves;
    private double height;

    public Closet(String material, int shelves, double height) {
        this.material = material;
        this.shelves = shelves;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Closet{" +
                "material='" + material + '\'' +
                ", shelves=" + shelves +
                ", height=" + height + " cm" +
                '}';
    }
}
