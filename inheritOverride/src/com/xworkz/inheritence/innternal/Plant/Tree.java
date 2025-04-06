package com.xworkz.inheritence.innternal.Plant;

public class Tree extends Plant{
    public Tree() {
        super();
        System.out.println("Tree constructor - child");
    }

    @Override
    public void grow() {
        System.out.println("Tree growing - child");
    }

    @Override
    public void getType() {
        System.out.println("Tree type - child");
    }

    @Override
    public void getColor() {
        System.out.println("Tree color - child");
    }

    @Override
    public void getHeight() {
        System.out.println("Tree height - child");
    }

    @Override
    public void getClimate() {
        System.out.println("Tree climate - child");
    }
}
