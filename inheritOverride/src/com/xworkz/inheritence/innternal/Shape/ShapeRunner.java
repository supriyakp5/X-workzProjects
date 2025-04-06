package com.xworkz.inheritence.innternal.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.draw();
        s1.getArea();
        s1.getPerimeter();
        s1.getColor();
        s1.getType();

        System.out.println("---------------");

        Shape s2 = new Circle();
        s2.draw();
        s2.getArea();
        s2.getPerimeter();
        s2.getColor();
        s2.getType();

        System.out.println("---------------");

        Circle s3 = new Circle();
        s3.draw();
        s3.getArea();
        s3.getPerimeter();
        s3.getColor();
        s3.getType();
    }
}
