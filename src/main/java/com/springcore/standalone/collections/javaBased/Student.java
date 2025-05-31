package com.springcore.standalone.collections.javaBased;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Enrolled in course: " + course.getCourseName());
    }
}
