package com.praktikum.main;

public class Student extends User {
    private String studentId;

    public Student(String name, String studentId) {
        super(name, studentId, studentId); // for simplicity: username & password = studentId
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}
