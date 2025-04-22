package com.xworkz.InterfaceClass.intrnal;

public class Employee implements Company{

    public Employee(){
        System.out.println("no-argumented constructer");
    }
    @Override
    public void product1(){
        System.out.println("employee implements the company");
    }

}
