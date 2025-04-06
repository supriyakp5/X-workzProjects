package com.xworkz.inheritence.innternal.Employee;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.work();
        e1.getDepartment();
        e1.getSalary();
        e1.getRole();
        e1.getLocation();

        System.out.println("---------------");

        Employee e2 = new Manager();
        e2.work();
        e2.getDepartment();
        e2.getSalary();
        e2.getRole();
        e2.getLocation();

        System.out.println("---------------");

        Manager e3 = new Manager();
        e3.work();
        e3.getDepartment();
        e3.getSalary();
        e3.getRole();
        e3.getLocation();
    }
}
