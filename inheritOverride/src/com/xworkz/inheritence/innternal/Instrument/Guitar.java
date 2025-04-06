package com.xworkz.inheritence.innternal.Instrument;

class Guitar extends Instrument {
    public Guitar() {
        super();
        System.out.println("Guitar constructor - child");
    }

    @Override
    public void play() {
        System.out.println("Playing guitar - child");
    }

    @Override
    public void getType() {
        System.out.println("Guitar type - child");
    }

    @Override
    public void getBrand() {
        System.out.println("Guitar brand - child");
    }

    @Override
    public void getSoundRange() {
        System.out.println("Guitar sound range - child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Guitar material - child");
    }

}
