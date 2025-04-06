package com.xworkz.inheritence.innternal.Furniture;

public class Chair extends Furniture{
    public Chair() {
        super();
        System.out.println("Chair constructor - child");
    }

    @Override
    public void material() {
        System.out.println("Made of metal - child");
    }

    @Override
    public void weight() {
        System.out.println("Weighs 10kg - child");
    }

    @Override
    public void purpose() {
        System.out.println("Used for sitting - child");
    }

    @Override
    public void design() {
        System.out.println("Ergonomic design - child");
    }
}
