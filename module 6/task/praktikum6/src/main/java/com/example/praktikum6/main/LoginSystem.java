package com.example.praktikum6.main;

import com.example.praktikum6.data.DataStore;
import com.example.praktikum6.users.User;

public class LoginSystem {
    public static User authenticate(String nim, String password, String role) {
        return DataStore.authenticate(nim, password, role);
    }
}