package com.xworkz.Tostring.internal;

public class Drawer {
    private String material;
    private int numberOfCompartments;
    private double depth;

    public Drawer(String material, int numberOfCompartments, double depth) {
        this.material = material;
        this.numberOfCompartments = numberOfCompartments;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Drawer{" +
                "material='" + material + '\'' +
                ", numberOfCompartments=" + numberOfCompartments +
                ", depth=" + depth + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 36;
    }

}
