package com.praktikum.actions;

import com.praktikum.main.LoginSystem;
import com.praktikum.models.Item;
import com.praktikum.users.Student;
import com.praktikum.users.User;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class AdminActions {
    public static void menu(User admin, Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View All Item Reports");
            System.out.println("2. Mark Item as Claimed");
            System.out.println("3. Add Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> viewAllItems();
                    case 2 -> markItemAsClaimed(scanner);
                    case 3 -> addMahasiswa(scanner);
                    case 4 -> deleteMahasiswa(scanner);
                    case 0 -> System.out.println("Logging out...");
                    default -> System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number!");
                scanner.nextLine();
                choice = -1;
            }
        } while (choice != 0);
    }

    private static void viewAllItems() {
        if (LoginSystem.reportedItems.isEmpty()) {
            System.out.println("No items reported.");
        } else {
            for (Item item : LoginSystem.reportedItems) {
                System.out.println("\n" + item);
            }
        }
    }

    private static void markItemAsClaimed(Scanner scanner) {
        int index = 0;
        boolean hasReported = false;
        for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
            if (LoginSystem.reportedItems.get(i).getStatus().equals("Reported")) {
                System.out.println(i + ". " + LoginSystem.reportedItems.get(i).getItemName());
                hasReported = true;
            }
        }

        if (!hasReported) {
            System.out.println("No reported items to mark.");
            return;
        }

        System.out.print("Enter index of item to mark as claimed: ");
        try {
            index = scanner.nextInt();
            scanner.nextLine();
            Item item = LoginSystem.reportedItems.get(index);
            if (item.getStatus().equals("Reported")) {
                item.setStatus("Claimed");
                System.out.println("Item marked as claimed.");
            } else {
                System.out.println("Item is already claimed.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be a number!");
            scanner.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index. No such item.");
        }
    }

    private static void addMahasiswa(Scanner scanner) {
        System.out.print("Enter Mahasiswa Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Mahasiswa NIM: ");
        String nim = scanner.nextLine();

        LoginSystem.userList.add(new Student(name, nim));
        System.out.println("Mahasiswa added successfully.");
    }

    private static void deleteMahasiswa(Scanner scanner) {
        System.out.print("Enter NIM of Mahasiswa to delete: ");
        String nim = scanner.nextLine();

        Iterator<User> iterator = LoginSystem.userList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user instanceof Student student && student.getNim().equals(nim)) {
                iterator.remove();
                found = true;
                System.out.println("Mahasiswa removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Mahasiswa with NIM " + nim + " not found.");
        }
    }
}