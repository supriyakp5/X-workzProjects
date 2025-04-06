package com.xworkz.inheritence.innternal.Company1;

public class Startup extends Company1{
    public Startup() {
        super();
        System.out.println("Startup constructor - child");
    }

    @Override
    public void getName() {
        System.out.println("Startup name: TechNova - child");
    }

    @Override
    public void getLocation() {
        System.out.println("Startup located in San Francisco - child");
    }

    @Override
    public void getEmployeeCount() {
        System.out.println("15 employees - child");
    }

    @Override
    public void getRevenue() {
        System.out.println("Startup revenue: $1M - child");
    }

    @Override
    public void getIndustry() {
        System.out.println("Industry: AI - child");
    }
}
