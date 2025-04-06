package com.xworkz.inheritence.innternal.Musician;

public class Pianist extends Musician {
    public Pianist() {
        super();
        System.out.println("Pianist constructor - child");
    }

    @Override
    public void playInstrument() {
        System.out.println("Playing piano - child");
    }

    @Override
    public void practice() {
        System.out.println("Practicing piano scales - child");
    }

    @Override
    public void perform() {
        System.out.println("Performing piano concerto - child");
    }

    @Override
    public void compose() {
        System.out.println("Composing piano melody - child");
    }

}
