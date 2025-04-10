package com.xworkz.Tostring.internal;

public class Door {
    private String material;
    private int height;
    private double width;

    public Door(String material, int height, double width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                ", height=" + height + " cm" +
                ", width=" + width + " cm" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 34;
    }

}
