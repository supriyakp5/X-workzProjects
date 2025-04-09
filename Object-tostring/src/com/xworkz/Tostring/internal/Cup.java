package com.xworkz.Tostring.internal;

public class Cup {
    private String material;
    private int volumeMl;
    private double diameter;

    public Cup(String material, int volumeMl, double diameter) {
        this.material = material;
        this.volumeMl = volumeMl;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "material='" + material + '\'' +
                ", volumeMl=" + volumeMl +
                ", diameter=" + diameter + " cm" +
                '}';
    }

}
