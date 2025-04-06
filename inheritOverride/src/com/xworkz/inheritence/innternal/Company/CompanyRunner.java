package com.xworkz.inheritence.innternal.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.getName();
        c1.getLocation();
        c1.getEmployees();
        c1.getRevenue();
        c1.getType();

        System.out.println("---------------");

        Company c2 = new ITCompany();
        c2.getName();
        c2.getLocation();
        c2.getEmployees();
        c2.getRevenue();
        c2.getType();

        System.out.println("---------------");

        ITCompany c3 = new ITCompany();
        c3.getName();
        c3.getLocation();
        c3.getEmployees();
        c3.getRevenue();
        c3.getType();
    }
}


