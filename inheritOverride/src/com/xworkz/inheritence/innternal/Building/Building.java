package com.xworkz.inheritence.innternal.Building;

public class Building {
    public Building() {
        System.out.println("Building constructor - parent");
    }

    public void build() {
        System.out.println("Constructing building - parent");
    }

    public void getType() {
        System.out.println("Building type - parent");
    }

    public void getLocation() {
        System.out.println("Building location - parent");
    }

    public void getFloors() {
        System.out.println("Number of floors - parent");
    }

    public void getMaterial() {
        System.out.println("Building material - parent");
    }
}
