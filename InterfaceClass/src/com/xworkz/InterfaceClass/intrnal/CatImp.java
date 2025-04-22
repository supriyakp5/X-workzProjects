package com.xworkz.InterfaceClass.intrnal;

public class CatImp implements Animals{
    public CatImp(){
        System.out.println("no arguments constructer cat ");
    }
    @Override
    public void pet(){
        System.out.println("running pet in catimp");
    }
}
