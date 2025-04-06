package com.xworkz.inheritence.innternal.Shape;

public class Shape {
    public Shape() {
        System.out.println("Running non-arg constructor Shape--parent");
    }

    public void draw() {
        System.out.println("Shape draw method--parent");
    }

    public void getArea() {
        System.out.println("Shape getArea method--parent");
    }

    public void getPerimeter() {
        System.out.println("Shape getPerimeter method--parent");
    }

    public void getColor() {
        System.out.println("Shape getColor method--parent");
    }

    public void getType() {
        System.out.println("Shape getType method--parent");
    }
}
