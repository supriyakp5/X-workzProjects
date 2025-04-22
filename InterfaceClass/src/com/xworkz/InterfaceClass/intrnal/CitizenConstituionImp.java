package com.xworkz.InterfaceClass.intrnal;

public class CitizenConstituionImp implements Consitution {
    public CitizenConstituionImp(){
        System.out.println("no arguments constructer");
    }
    @Override
    public void followLaws(){
        System.out.println("implements the constitution");
    }
}
