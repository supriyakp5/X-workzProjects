package com.xworkz.inheritence.innternal.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        p1.grow();
        p1.getType();
        p1.getColor();
        p1.getHeight();
        p1.getClimate();

        System.out.println("-----");

        Plant p2 = new Tree();
        p2.grow();
        p2.getType();
        p2.getColor();
        p2.getHeight();
        p2.getClimate();

        System.out.println("-----");

        Tree p3 = new Tree();
        p3.grow();
        p3.getType();
        p3.getColor();
        p3.getHeight();
        p3.getClimate();
    }
}
