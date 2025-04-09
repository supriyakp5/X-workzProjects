package com.xworkz.Tostring.internal;

public class Clock {
    private String brand;
    private int hoursFormat;
    private double diameter;

    public Clock(String brand, int hoursFormat, double diameter) {
        this.brand = brand;
        this.hoursFormat = hoursFormat;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "brand='" + brand + '\'' +
                ", hoursFormat=" + hoursFormat + "-hour" +
                ", diameter=" + diameter + " cm" +
                '}';
    }
}
