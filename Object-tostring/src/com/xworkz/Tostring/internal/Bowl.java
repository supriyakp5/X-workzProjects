package com.xworkz.Tostring.internal;

public class Bowl {
    private String color;
    private int diameter;
    private double depth;

    public Bowl(String color, int diameter, double depth) {
        this.color = color;
        this.diameter = diameter;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "color='" + color + '\'' +
                ", diameter=" + diameter + " cm" +
                ", depth=" + depth + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 15;
    }

}
