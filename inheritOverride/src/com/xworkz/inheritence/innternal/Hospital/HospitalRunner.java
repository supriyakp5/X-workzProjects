package com.xworkz.inheritence.innternal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
        h1.admitPatient();
        h1.provideTreatment();
        h1.discharge();

        System.out.println("-----");

        Hospital h2 = new ChildrenHospital();
        h2.admitPatient();
        h2.provideTreatment();
        h2.discharge();

        System.out.println("-----");

        ChildrenHospital h3 = new ChildrenHospital();
        h3.admitPatient();
        h3.provideTreatment();
        h3.discharge();
    }
}
