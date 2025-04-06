package com.xworkz.inheritence.innternal.Clothing;

public class Jacket extends Clothing{
    public Jacket() {
        super();
        System.out.println("Jacket constructor - child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Winter Jacket - child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Material: Leather - child");
    }

    @Override
    public void getSize() {
        System.out.println("Size: L - child");
    }

    @Override
    public void getColor() {
        System.out.println("Color: Black - child");
    }

    @Override
    public void getSeason() {
        System.out.println("Season: Winter - child");
    }
}
