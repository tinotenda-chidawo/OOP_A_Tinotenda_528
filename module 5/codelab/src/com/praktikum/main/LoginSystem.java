package com.praktikum.main;

import com.praktikum.users.*;
import com.praktikum.models.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default Users
        userList.add(new Admin("admin", "admin"));
        userList.add(new Student("Tino", "202410370110528"));
        userList.add(new Student("Rivan", "2024364"));

        System.out.println("--- Lost & Found Login System ---");

        while (true) {
            System.out.println("\n1. Login as Admin");
            System.out.println("2. Login as Mahasiswa");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int option;

            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            if (option == 0) break;

            System.out.print("Username/Name: ");
            String username = scanner.nextLine();
            System.out.print("Password/NIM: ");
            String password = scanner.nextLine();

            boolean found = false;
            for (User user : userList) {
                if (user instanceof Admin admin && admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                    System.out.println("Login successful as Admin.");
                    admin.showMenu(scanner);
                    found = true;
                    break;
                } else if (user instanceof Student student && student.getName().equals(username) && student.getNim().equals(password)) {
                    System.out.println("Login successful as Mahasiswa.");
                    student.showMenu(scanner);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Login failed. Please check your credentials.");
            }
        }

        scanner.close();
        System.out.println("Program exited.");
    }
}
