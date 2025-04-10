package com.xworkz.Tostring.internal;

public class Can {
    private String content;
    private int volume;      // in milliliters
    private double diameter; // in centimeters

    public Can(String content, int volume, double diameter) {
        this.content = content;
        this.volume = volume;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Can{" +
                "content='" + content + '\'' +
                ", volume=" + volume + " ml" +
                ", diameter=" + diameter + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 22;
    }

}
