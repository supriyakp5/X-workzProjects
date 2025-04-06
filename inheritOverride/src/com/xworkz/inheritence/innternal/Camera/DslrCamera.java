package com.xworkz.inheritence.innternal.Camera;

public class DslrCamera extends Camera{
    public DslrCamera() {
        super();
        System.out.println("DslrCamera constructor - child");
    }

    @Override
    public void capture() {
        System.out.println("Capturing high-quality photo - child");
    }

    @Override
    public void record() {
        System.out.println("Recording 4K video - child");
    }

    @Override
    public void zoom() {
        System.out.println("Optical zoom engaged - child");
    }

    @Override
    public void switchMode() {
        System.out.println("Switching between manual and auto mode - child");
    }
}
