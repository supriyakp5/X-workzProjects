package com.xworkz.inheritence.innternal.Teacher;

public class TeacherRunner {
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        t1.teach();
        t1.getName();
        t1.getSubject();
        t1.getExperience();
        t1.getDepartment();

        System.out.println("-----");

        Teacher t2 = new MathTeacher();
        t2.teach();
        t2.getName();
        t2.getSubject();
        t2.getExperience();
        t2.getDepartment();

        System.out.println("-----");

        MathTeacher t3 = new MathTeacher();
        t3.teach();
        t3.getName();
        t3.getSubject();
        t3.getExperience();
        t3.getDepartment();
    }
}
