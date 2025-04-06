package com.xworkz.inheritence.innternal.Person;

public class PersonRunner {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.getName();
        p1.getAge();
        p1.getGender();
        p1.getAddress();

        System.out.println("---------------");

        Person p2 = new Student();
        p2.speak();
        p2.getName();
        p2.getAge();
        p2.getGender();
        p2.getAddress();

        System.out.println("---------------");

        Student p3 = new Student();
        p3.speak();
        p3.getName();
        p3.getAge();
        p3.getGender();
        p3.getAddress();
    }
}
