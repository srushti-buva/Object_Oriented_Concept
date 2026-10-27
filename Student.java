package com.tka.student;

public class Student {

    String studentName;
    int rollNo;
    String department;
    double percentage;

    public void study() {
        System.out.println("Student is studying");
    }

    public void attendLecture() {
        System.out.println("Student is attending lecture");
    }

    public void display() {
        System.out.println("Student Name --> " + studentName);
        System.out.println("Roll No --> " + rollNo);
        System.out.println("Department --> " + department);
        System.out.println("Percentage --> " + percentage);

        study();
        attendLecture();
    }
}
