package com.xworkz.inheritence.innternal.Tool;

public class Hammer extends Tool{

    public Hammer() {
        super();
        System.out.println("Hammer constructor - child");
    }

    @Override
    public void use() {
        System.out.println("Using hammer - child");
    }

    @Override
    public void getName() {
        System.out.println("Hammer name - child");
    }

    @Override
    public void getWeight() {
        System.out.println("Hammer weight - child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Hammer material - child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Hammer purpose - child");
    }
}
