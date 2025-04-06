package com.xworkz.inheritence.innternal.Clothing;

public class Clothing {
    public Clothing() {
        System.out.println("Clothing constructor - parent");
    }

    public void getType() {
        System.out.println("Type: Generic clothing - parent");
    }

    public void getMaterial() {
        System.out.println("Material: Unknown - parent");
    }

    public void getSize() {
        System.out.println("Size: Standard - parent");
    }

    public void getColor() {
        System.out.println("Color: Varies - parent");
    }

    public void getSeason() {
        System.out.println("Season: All - parent");
    }
}
