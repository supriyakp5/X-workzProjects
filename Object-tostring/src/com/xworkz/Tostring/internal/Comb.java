package com.xworkz.Tostring.internal;
public class Comb {
    private String material;
    private int teethCount;
    private double length;

    public Comb(String material, int teethCount, double length) {
        this.material = material;
        this.teethCount = teethCount;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Comb{" +
                "material='" + material + '\'' +
                ", teethCount=" + teethCount +
                ", length=" + length + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 30;
    }


}
