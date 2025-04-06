package com.xworkz.inheritence.innternal.Furniture1;

public class OfficeChair extends Furniture1{
    public OfficeChair() {
        super();
        System.out.println("OfficeChair constructor - child");
    }

    @Override
    public void describe() {
        System.out.println("Ergonomic office chair - child");
    }

    @Override
    public void material() {
        System.out.println("Made of mesh and plastic - child");
    }

    @Override
    public void usage() {
        System.out.println("Used in offices for long sitting - child");
    }

}
