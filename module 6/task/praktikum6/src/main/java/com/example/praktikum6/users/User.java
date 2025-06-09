package com.example.praktikum6.users;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleStringProperty nim;
    private final SimpleStringProperty name;
    private final SimpleStringProperty password;
    private final SimpleStringProperty role;

    public User(String nim, String name, String password, String role) {
        this.nim = new SimpleStringProperty(nim);
        this.name = new SimpleStringProperty(name);
        this.password = new SimpleStringProperty(password);
        this.role = new SimpleStringProperty(role);
    }

    public String getNim() { return nim.get(); }
    public SimpleStringProperty nimProperty() { return nim; }
    public String getName() { return name.get(); }
    public SimpleStringProperty nameProperty() { return name; }
    public String getPassword() { return password.get(); }
    public SimpleStringProperty passwordProperty() { return password; }
    public String getRole() { return role.get(); }
    public SimpleStringProperty roleProperty() { return role; }
}