package com.xworkz.inheritence.innternal.Employee;



class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Running non-arg constructor Manager--child");
    }

    @Override
    public void work() {
        System.out.println("Manager work method--child");
    }

    @Override
    public void getDepartment() {
        System.out.println("Manager getDepartment method--child");
    }

    @Override
    public void getSalary() {
        System.out.println("Manager getSalary method--child");
    }

    @Override
    public void getRole() {
        System.out.println("Manager getRole method--child");
    }

    @Override
    public void getLocation() {
        System.out.println("Manager getLocation method--child");
    }
}
