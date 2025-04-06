package com.xworkz.inheritence.innternal.Course;

class OnlineCourse extends Course {
    public OnlineCourse() {
        super();
        System.out.println("Running non-arg constructor OnlineCourse--child");
    }

    @Override
    public void getCourseName() {
        System.out.println("OnlineCourse getCourseName method--child");
    }

    @Override
    public void getInstructor() {
        System.out.println("OnlineCourse getInstructor method--child");
    }

    @Override
    public void getDuration() {
        System.out.println("OnlineCourse getDuration method--child");
    }

    @Override
    public void getPrice() {
        System.out.println("OnlineCourse getPrice method--child");
    }

    @Override
    public void getMode() {
        System.out.println("OnlineCourse getMode method--child");
    }

}
