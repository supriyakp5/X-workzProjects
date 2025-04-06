package com.xworkz.inheritence.innternal.Company;

class ITCompany extends Company {
    public ITCompany() {
        super();
        System.out.println("Running non-arg constructor ITCompany--child");
    }

    @Override
    public void getName() {
        System.out.println("ITCompany getName method--child");
    }

    @Override
    public void getLocation() {
        System.out.println("ITCompany getLocation method--child");
    }

    @Override
    public void getEmployees() {
        System.out.println("ITCompany getEmployees method--child");
    }

    @Override
    public void getRevenue() {
        System.out.println("ITCompany getRevenue method--child");
    }

    @Override
    public void getType() {
        System.out.println("ITCompany getType method--child");
    }
}
