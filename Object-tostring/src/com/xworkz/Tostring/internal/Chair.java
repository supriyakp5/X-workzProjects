package com.xworkz.Tostring.internal;

public class Chair {
    private String type;
    private int legs;
    private double height;

    public Chair(String type, int legs, double height) {
        this.type = type;
        this.legs = legs;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", legs=" + legs +
                ", height=" + height + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 24;
    }


}
