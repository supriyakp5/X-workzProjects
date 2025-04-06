package com.xworkz.inheritence.innternal.Shape1;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape1 s1 = new Shape1();
        s1.draw();
        s1.getArea();
        s1.getPerimeter();
        s1.getColor();
        s1.getType();

        System.out.println("-----");

        Shape1 s2 = new Square();
        s2.draw();
        s2.getArea();
        s2.getPerimeter();
        s2.getColor();
        s2.getType();

        System.out.println("-----");

        Square s3 = new Square();
        s3.draw();
        s3.getArea();
        s3.getPerimeter();
        s3.getColor();
        s3.getType();
    }
}
