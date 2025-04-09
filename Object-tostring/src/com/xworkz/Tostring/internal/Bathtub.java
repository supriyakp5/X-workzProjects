package com.xworkz.Tostring.internal;

public class Bathtub {
    private String material;
    private int length;
    private double depth;

    public Bathtub(String material, int length, double depth) {
        this.material = material;
        this.length = length;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Bathtub{" +
                "material='" + material + '\'' +
                ", length=" + length + " cm" +
                ", depth=" + depth + " inches" +
                '}';
    }


    }