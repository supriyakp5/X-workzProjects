package com.xworkz.inheritence.innternal.Building;

public class BuildingRunner {
    public static void main(String[] args) {
        Building b1 = new Building();
        b1.build();
        b1.getType();
        b1.getLocation();
        b1.getFloors();
        b1.getMaterial();

        System.out.println("-----");

        Building b2 = new House();
        b2.build();
        b2.getType();
        b2.getLocation();
        b2.getFloors();
        b2.getMaterial();

        System.out.println("-----");

        House b3 = new House();
        b3.build();
        b3.getType();
        b3.getLocation();
        b3.getFloors();
        b3.getMaterial();
    }
}
