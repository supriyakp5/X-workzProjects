package com.xworkz.inheritence.innternal.Software;

public class SoftwareRunner {
    public static void main(String[] args) {
        Software s1 = new Software();
        s1.getName();
        s1.getVersion();
        s1.getLicenseType();
        s1.getPlatform();
        s1.getDeveloper();

        System.out.println("-----");

        Software s2 = new MobileApp();
        s2.getName();
        s2.getVersion();
        s2.getLicenseType();
        s2.getPlatform();
        s2.getDeveloper();

        System.out.println("-----");

        MobileApp s3 = new MobileApp();
        s3.getName();
        s3.getVersion();
        s3.getLicenseType();
        s3.getPlatform();
        s3.getDeveloper();
    }
}
