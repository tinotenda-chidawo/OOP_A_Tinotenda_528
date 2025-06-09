package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User {
    private String username;
    private String password;

    public Admin(String username, String password) {
        super("Admin");
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void showMenu(Scanner scanner) {
        AdminActions.menu(this, scanner);
    }
}