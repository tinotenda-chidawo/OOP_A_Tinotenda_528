package com.example.praktikum6.actions;

import com.example.praktikum6.data.Item;
import java.util.List;

public class AdminActions {
    public void updateItemStatus(Item item, String newStatus) {
        item.statusProperty().set(newStatus);
    }

    public List<Item> getAllItems() {
        return com.example.praktikum6.data.DataStore.getItems();
    }
}