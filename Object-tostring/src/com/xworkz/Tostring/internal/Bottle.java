package com.xworkz.Tostring.internal;

public class Bottle {
    private String material;
    private int volume;
    private double height;

    public Bottle(String material, int volume, double height) {
        this.material = material;
        this.volume = volume;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "material='" + material + '\'' +
                ", volume=" + volume + " ml" +
                ", height=" + height + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 1;
    }

}
