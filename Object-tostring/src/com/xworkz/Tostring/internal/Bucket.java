package com.xworkz.Tostring.internal;

public class Bucket {
    private String color;
    private int capacity;
    private double height;

    public Bucket(String color, int capacity, double height) {
        this.color = color;
        this.capacity = capacity;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "color='" + color + '\'' +
                ", capacity=" + capacity + " liters" +
                ", height=" + height + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 18;
    }

}

