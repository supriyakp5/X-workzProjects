package com.xworkz.inheritence.innternal.Shape1;

public class Square extends Shape1{
    public Square() {
        super();
        System.out.println("Square constructor - child");
    }

    @Override
    public void draw() {
        System.out.println("Drawing square - child");
    }

    @Override
    public void getArea() {
        System.out.println("Square area - child");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Square perimeter - child");
    }

    @Override
    public void getColor() {
        System.out.println("Square color - child");
    }

    @Override
    public void getType() {
        System.out.println("Square type - child");
    }
}
