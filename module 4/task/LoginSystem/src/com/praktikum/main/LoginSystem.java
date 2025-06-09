package com.praktikum.main;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instantiating Admin and Student objects (Encapsulation in action)
        Admin admin = new Admin("Admin Name", "A001", "admin", "1234");
        Student student = new Student("John Doe", "S123");

        System.out.println("=== LOGIN SYSTEM ===");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.print("Choose option (1/2): ");

        int option = input.nextInt();
        input.nextLine(); // Consume newline

        // Polymorphism: reference of superclass `User` can hold `Admin` or `Student`
        User currentUser = null;

        if (option == 1) {
            System.out.print("Enter Username: ");
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();

            // Method overriding: admin.login() is Admin class's implementation of login
            if (admin.login(username, password)) {
                currentUser = admin;
                System.out.println("Login successful.");
                AdminActions.viewDashboard(admin);
            } else {
                System.out.println("Invalid admin credentials.");
            }

        } else if (option == 2) {
            System.out.print("Enter Student ID (as both username & password): ");
            String studentId = input.nextLine();

            // Method overriding: student.login() is Student class's implementation
            if (student.login(studentId, studentId)) {
                currentUser = student;
                System.out.println("Login successful.");
                MahasiswaActions.viewProfile(student);
            } else {
                System.out.println("Invalid student credentials.");
            }

        } else {
            System.out.println("Invalid option.");
        }

        input.close(); // Resource cleanup
    }
}
