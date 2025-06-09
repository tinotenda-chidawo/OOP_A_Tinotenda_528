package com.example.praktikum6.data;

import java.util.ArrayList;
import java.util.List;
import com.example.praktikum6.users.User;

public class DataStore {
    private static final List<User> users = new ArrayList<>();
    private static final List<Item> items = new ArrayList<>();

    static {
        users.add(new com.example.praktikum6.users.Mahasiswa("202410370110528", "Tino Chidawo", "password123"));
        users.add(new com.example.praktikum6.users.Mahasiswa("202315710901", "Ken Ayu", "password123"));
        users.add(new com.example.praktikum6.users.Mahasiswa("202315710910", "Wina Tucha", "password123"));
        users.add(new com.example.praktikum6.users.Mahasiswa("202315710331", "Nisrina", "password123"));
        users.add(new com.example.praktikum6.users.Mahasiswa("202315710123", "Herdiana", "password123"));
        users.add(new com.example.praktikum6.users.Admin("admin001", "Admin", "adminpass"));
    }

    public static User authenticate(String nim, String password, String role) {
        return users.stream()
                .filter(user -> user.getNim().equals(nim) &&
                        user.getRole().equals(role) &&
                        (user instanceof com.example.praktikum6.users.Mahasiswa ? ((com.example.praktikum6.users.Mahasiswa) user).getPassword().equals(password) :
                                user instanceof com.example.praktikum6.users.Admin ? ((com.example.praktikum6.users.Admin) user).getPassword().equals(password) : false))
                .findFirst()
                .orElse(null);
    }

    public static List<Item> getItems() {
        return items;
    }

    public static void addItem(Item item) {
        items.add(item);
    }
}