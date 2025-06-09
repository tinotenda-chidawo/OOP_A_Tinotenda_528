package com.praktikum.main;

public class AdminActions {

    public static void viewDashboard(Admin admin) {
        System.out.println("=== Admin Dashboard ===");
        System.out.println("Admin ID: " + admin.getAdminId());
        System.out.println("Welcome, " + admin.getName() + "!");
    }
}
