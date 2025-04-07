package com.xworkz.inheritence.innternal.Building;

public class House extends Building{
    public House() {
        super();
        System.out.println("House constructor - child");
    }

    @Override
    public void build() {
        System.out.println("Building house - child");
    }

    @Override
    public void getType() {
        System.out.println("House type - child");
    }

    @Override
    public void getLocation() {
        System.out.println("House location - child");
    }

    @Override
    public void getFloors() {
        System.out.println("House floors - child");
    }

    @Override
    public void getMaterial() {
        System.out.println("House material - child");
    }
    public void home()
    {
        System.out.println("new method --child");
    }
}
