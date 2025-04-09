package com.xworkz.Tostring.internal;

public class Frame {
    private String material;
    private int width;
    private double height;

    public Frame(String material, int width, double height) {
        this.material = material;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
