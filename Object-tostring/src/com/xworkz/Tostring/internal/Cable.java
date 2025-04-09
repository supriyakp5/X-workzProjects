package com.xworkz.Tostring.internal;

public class Cable {
    private String type;
    private int length;
    private double thickness;

    public Cable(String type, int length, double thickness) {
        this.type = type;
        this.length = length;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Cable{" +
                "type='" + type + '\'' +
                ", length=" + length + " meters" +
                ", thickness=" + thickness + " mm" +
                '}';
    }

}
