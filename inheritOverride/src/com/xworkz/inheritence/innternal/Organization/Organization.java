package com.xworkz.inheritence.innternal.Organization;

public class Organization {
    public Organization() {
        System.out.println("Organization constructor - parent");
    }

    public void register() {
        System.out.println("Registering organization - parent");
    }

    public void operate() {
        System.out.println("Operating organization - parent");
    }

    public void fund() {
        System.out.println("Funding organization - parent");
    }

    public void report() {
        System.out.println("Generating report - parent");
    }
}
