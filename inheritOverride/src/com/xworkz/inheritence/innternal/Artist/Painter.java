package com.xworkz.inheritence.innternal.Artist;

public class Painter extends Artist{
    public Painter() {
        super();
        System.out.println("Painter constructor - child");
    }

    @Override
    public void create() {
        System.out.println("Painting on canvas - child");
    }

    @Override
    public void display() {
        System.out.println("Displaying painting in gallery - child");
    }

    @Override
    public void earn() {
        System.out.println("Selling painting - child");
    }

    @Override
    public void study() {
        System.out.println("Studying color theory - child");
    }
}
