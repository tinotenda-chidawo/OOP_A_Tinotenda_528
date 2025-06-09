package com.praktikum.actions;

import com.praktikum.main.LoginSystem;
import com.praktikum.models.Item;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentActions {
    public static void menu(com.praktikum.users.Student student, Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Mahasiswa Menu ---");
            System.out.println("1. Report Lost Item");
            System.out.println("2. View Reported Items");
            System.out.println("0. Logout");
            System.out.print("Choose: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> reportItem(scanner);
                    case 2 -> viewReportedItems();
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

    private static void reportItem(Scanner scanner) {
        System.out.print("Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Location Found: ");
        String location = scanner.nextLine();

        Item item = new Item(name, description, location, "Reported");
        LoginSystem.reportedItems.add(item);
        System.out.println("Item reported successfully.");
    }

    private static void viewReportedItems() {
        boolean hasReport = false;
        for (Item item : LoginSystem.reportedItems) {
            if (item.getStatus().equals("Reported")) {
                System.out.println("\n" + item);
                hasReport = true;
            }
        }
        if (!hasReport) {
            System.out.println("No item reports yet.");
        }
    }
}