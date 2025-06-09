package com.praktikum.main;

public abstract class MahasiswaActions {

    public static void viewProfile(Student student) {
        System.out.println("=== Student Profile ===");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Welcome, " + student.getName() + "!");
    }
    public abstract void name();
}
