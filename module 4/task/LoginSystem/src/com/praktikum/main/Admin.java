package com.praktikum.main;

public class Admin extends User {
    private String adminId;

    public Admin(String name, String adminId, String username, String password) {
        super(name, username, password);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }
}
