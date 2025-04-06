package com.xworkz.inheritence.innternal.Company1;

public class CompanyRunner {
    public static void main(String[] args) {
        Company1 c1 = new Company1();
        c1.getName();
        c1.getLocation();
        c1.getEmployeeCount();
        c1.getRevenue();
        c1.getIndustry();

        System.out.println("-----");

        Company1 c2 = new Startup();
        c2.getName();
        c2.getLocation();
        c2.getEmployeeCount();
        c2.getRevenue();
        c2.getIndustry();

        System.out.println("-----");

        Startup c3 = new Startup();
        c3.getName();
        c3.getLocation();
        c3.getEmployeeCount();
        c3.getRevenue();
        c3.getIndustry();
    }
}
