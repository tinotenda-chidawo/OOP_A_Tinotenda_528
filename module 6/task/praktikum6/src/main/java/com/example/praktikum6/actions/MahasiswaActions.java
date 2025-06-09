package com.example.praktikum6.actions;

import com.example.praktikum6.data.Item;

public class MahasiswaActions {
    public void reportLostItem(String name, String type, String location) {
        Item item = new Item(name, type, location, "Reported");
        com.example.praktikum6.data.DataStore.addItem(item);
    }
}