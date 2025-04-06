package com.xworkz.inheritence.innternal.Employee1;

class Developer extends Employee1 {
    public Developer() {
        super();
        System.out.println("Developer constructor - child");
    }

    @Override
    public void work() {
        System.out.println("Writing code - child");
    }

    @Override
    public void getName() {
        System.out.println("Developer name - child");
    }

    @Override
    public void getPosition() {
        System.out.println("Developer position - child");
    }

    @Override
    public void getSalary() {
        System.out.println("Developer salary - child");
    }

    @Override
    public void getDepartment() {
        System.out.println("Development department - child");
    }
}
