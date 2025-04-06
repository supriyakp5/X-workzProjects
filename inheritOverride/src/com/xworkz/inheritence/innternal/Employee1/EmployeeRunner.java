package com.xworkz.inheritence.innternal.Employee1;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.work();
        e1.getName();
        e1.getPosition();
        e1.getSalary();
        e1.getDepartment();

        System.out.println("-----");

        Employee1 e2 = new Developer();
        e2.work();
        e2.getName();
        e2.getPosition();
        e2.getSalary();
        e2.getDepartment();

        System.out.println("-----");

        Developer e3 = new Developer();
        e3.work();
        e3.getName();
        e3.getPosition();
        e3.getSalary();
        e3.getDepartment();
    }
}
