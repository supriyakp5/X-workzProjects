package com.xworkz.inheritence.innternal.Course;

public class CourseRunner {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.getCourseName();
        c1.getInstructor();
        c1.getDuration();
        c1.getPrice();
        c1.getMode();

        System.out.println("---------------");

        Course c2 = new OnlineCourse();
        c2.getCourseName();
        c2.getInstructor();
        c2.getDuration();
        c2.getPrice();
        c2.getMode();

        System.out.println("---------------");

        OnlineCourse c3 = new OnlineCourse();
        c3.getCourseName();
        c3.getInstructor();
        c3.getDuration();
        c3.getPrice();
        c3.getMode();
    }
}
