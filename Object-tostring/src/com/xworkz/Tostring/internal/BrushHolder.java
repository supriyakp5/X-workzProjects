package com.xworkz.Tostring.internal;

public class BrushHolder {
    private String material;
    private int slotCount;
    private double height;

    public BrushHolder(String material, int slotCount, double height) {
        this.material = material;
        this.slotCount = slotCount;
        this.height = height;
    }

    @Override
    public String toString() {
        return "BrushHolder{" +
                "material='" + material + '\'' +
                ", slotCount=" + slotCount +
                ", height=" + height + " cm" +
                '}';
    }
}
