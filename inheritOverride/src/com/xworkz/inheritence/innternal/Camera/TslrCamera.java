package com.xworkz.inheritence.innternal.Camera;

public class TslrCamera {
    public void phoneCamera(Camera c1)
    {
        c1.capture();
        c1.record();
        c1.zoom();
        c1.switchMode();


        if(c1 instanceof DslrCamera)
        {
            System.out.println("c1  instancesof dslrcamera");
            DslrCamera dslrCamera=(DslrCamera) c1;
            dslrCamera.cameraMan();
        }
    }
}
