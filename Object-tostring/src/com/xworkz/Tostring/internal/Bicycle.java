package com.xworkz.Tostring.internal;

public class Bicycle {
    private String type;
    private int gearCount;
    private double weight;

    public Bicycle(String type, int gearCount, double weight) {
        this.type = type;
        this.gearCount = gearCount;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                ", gearCount=" + gearCount +
                ", weight=" + weight + " kg" +
                '}';
    }
}
