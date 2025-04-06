package com.xworkz.inheritence.innternal.Person;

class Student extends Person {
    public Student() {
        super();
        System.out.println("Running non-arg constructor Student--child");
    }

    @Override
    public void speak() {
        System.out.println("Student speak method--child");
    }

    @Override
    public void getName() {
        System.out.println("Student getName method--child");
    }

    @Override
    public void getAge() {
        System.out.println("Student getAge method--child");
    }

    @Override
    public void getGender() {
        System.out.println("Student getGender method--child");
    }

    @Override
    public void getAddress() {
        System.out.println("Student getAddress method--child");
    }
}
