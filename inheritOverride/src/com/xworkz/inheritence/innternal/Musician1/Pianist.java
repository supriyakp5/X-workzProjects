package com.xworkz.inheritence.innternal.Musician1;

public class Pianist extends Musician1{
    public Pianist() {
        super();
        System.out.println("Pianist constructor - child");
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing piano - child");
    }

    @Override
    public void compose() {
        System.out.println("Composing piano melody - child");
    }

    @Override
    public void practice() {
        System.out.println("Practicing piano - child");
    }

    @Override
    public void perform() {
        System.out.println("Performing piano concert - child");
    }
}
