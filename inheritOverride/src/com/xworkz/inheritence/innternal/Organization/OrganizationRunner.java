package com.xworkz.inheritence.innternal.Organization;

public class OrganizationRunner {
    public static void main(String[] args) {
        Organization o1 = new Organization();
        o1.register();
        o1.operate();
        o1.fund();
        o1.report();

        System.out.println("-----");

        Organization o2 = new NGO();
        o2.register();
        o2.operate();
        o2.fund();
        o2.report();

        System.out.println("-----");

        NGO o3 = new NGO();
        o3.register();
        o3.operate();
        o3.fund();
        o3.report();
    }
}
