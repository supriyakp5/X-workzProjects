package com.xworkz.inheritence.innternal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera c1 = new Camera();
        c1.capture();
        c1.record();
        c1.zoom();
        c1.switchMode();

        System.out.println("-----");

        Camera c2 = new DslrCamera();
        c2.capture();
        c2.record();
        c2.zoom();
        c2.switchMode();

        System.out.println("-----");

        DslrCamera c3 = new DslrCamera();
        c3.capture();
        c3.record();
        c3.zoom();
        c3.switchMode();


        System.out.println("______________casting__________");
        TslrCamera tslrCamera=new TslrCamera();
        tslrCamera.phoneCamera(c1);
        tslrCamera.phoneCamera(c2);
        tslrCamera.phoneCamera(c3);
    }

}
