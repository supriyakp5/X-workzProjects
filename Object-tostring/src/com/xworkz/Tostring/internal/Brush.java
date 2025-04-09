package com.xworkz.Tostring.internal;

public class Brush {
    private String type;
    private int bristleCount;
    private double length;

    public Brush(String type, int bristleCount, double length) {
        this.type = type;
        this.bristleCount = bristleCount;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Brush{" +
                "type='" + type + '\'' +
                ", bristleCount=" + bristleCount +
                ", length=" + length + " cm" +
                '}';
    }
}
