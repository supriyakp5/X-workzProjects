package com.xworkz.Tostring.internal;

public class Box {
    private String material;
    private int width;
    private double weight;

    public Box(String material, int width, double weight) {
        this.material = material;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "material='" + material + '\'' +
                ", width=" + width + " cm" +
                ", weight=" + weight + " kg" +
                '}';
    }
}
