package com.xworkz.inheritence.innternal.Organization;

public class NGO extends Organization{
    public NGO() {
        super();
        System.out.println("NGO constructor - child");
    }

    @Override
    public void register() {
        System.out.println("Registering NGO - child");
    }

    @Override
    public void operate() {
        System.out.println("NGO operating social programs - child");
    }

    @Override
    public void fund() {
        System.out.println("NGO seeking donations - child");
    }

    @Override
    public void report() {
        System.out.println("NGO preparing activity report - child");
    }
}
