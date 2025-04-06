package com.xworkz.inheritence.innternal.Teacher;

class MathTeacher extends Teacher {
    public MathTeacher() {
        super();
        System.out.println("MathTeacher constructor - child");
    }

    @Override
    public void teach() {
        System.out.println("Teaching math - child");
    }

    @Override
    public void getName() {
        System.out.println("Math teacher name - child");
    }

    @Override
    public void getSubject() {
        System.out.println("Subject: Math - child");
    }

    @Override
    public void getExperience() {
        System.out.println("Math teacher experience - child");
    }

    @Override
    public void getDepartment() {
        System.out.println("Math department - child");
    }
}

