package com.xworkz.inheritence.innternal.Hospital;

public class ChildrenHospital extends Hospital{
    public ChildrenHospital() {
        super();
        System.out.println("ChildrenHospital constructor - child");
    }

    @Override
    public void admitPatient() {
        System.out.println("Admitting child patient - child");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Providing pediatric care - child");
    }

    @Override
    public void discharge() {
        System.out.println("Child discharged with toy - child");
    }
}
