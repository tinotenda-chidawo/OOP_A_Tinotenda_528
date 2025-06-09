package com.example.praktikum6.data;

import javafx.beans.property.SimpleStringProperty;

public class Item {
    private final SimpleStringProperty name;
    private final SimpleStringProperty type;
    private final SimpleStringProperty location;
    private final SimpleStringProperty status;
    private final SimpleStringProperty owner;
    private final SimpleStringProperty nim;

    public Item(String name, String type, String location, String status) {
        this(name, type, location, status, "", "");
    }

    public Item(String name, String type, String location, String status, String owner, String nim) {
        this.name = new SimpleStringProperty(name);
        this.type = new SimpleStringProperty(type);
        this.location = new SimpleStringProperty(location);
        this.status = new SimpleStringProperty(status);
        this.owner = new SimpleStringProperty(owner);
        this.nim = new SimpleStringProperty(nim);
    }

    public SimpleStringProperty nameProperty() { return name; }
    public SimpleStringProperty typeProperty() { return type; }
    public SimpleStringProperty locationProperty() { return location; }
    public SimpleStringProperty statusProperty() { return status; }
    public SimpleStringProperty ownerProperty() { return owner; }
    public SimpleStringProperty nimProperty() { return nim; }
}