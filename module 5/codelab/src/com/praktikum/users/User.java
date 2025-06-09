package com.praktikum.users;

import java.util.Scanner;

public abstract class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public abstract void showMenu(Scanner scanner);
}
