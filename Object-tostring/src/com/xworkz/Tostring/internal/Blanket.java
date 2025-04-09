package com.xworkz.Tostring.internal;

public class Blanket {
    private String fabric;
    private int thickness;
    private double length;

    public Blanket(String fabric, int thickness, double length) {
        this.fabric = fabric;
        this.thickness = thickness;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Blanket{" +
                "fabric='" + fabric + '\'' +
                ", thickness=" + thickness + " mm" +
                ", length=" + length + " meters" +
                '}';
    }
}