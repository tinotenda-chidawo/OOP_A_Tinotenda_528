// Import the Scanner class for taking user input
import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display login type options to the user
        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter choice: ");

        // Read the user's choice
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character after nextInt()

        // Check the chosen login type
        if (choice == 1) {
            // ==========================
            // Admin Login Process
            // ==========================

            // Ask for admin username and password
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Define valid admin credentials
            String validUsername = "Admin010";
            String validPassword = "Password010";

            // Check if entered credentials match the valid ones
            if (username.equals(validUsername) && password.equals(validPassword)) {
                // If credentials match, display success message
                System.out.println("Admin login successful!");
            } else {
                // If credentials are incorrect, display error message
                System.out.println("Login failed! Wrong username or password.");
            }

        } else if (choice == 2) {
            // ==========================
            // Student Login Process
            // ==========================

            // Ask for student name and student ID
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();

            // Define valid student credentials
            String validName = "Ken Aryo Bimantoro";
            String validStudentID = "202310370311006";

            // Check if entered credentials match the valid ones
            if (name.equals(validName) && studentID.equals(validStudentID)) {
                // If credentials match, display success message with details
                System.out.println("Student Login Successful!");
                System.out.println("Name: " + name);
                System.out.println("Student ID: " + studentID);
            } else {
                // If credentials are incorrect, display error message
                System.out.println("Login Failed! Wrong name or student ID.");
            }

        } else {
            // If the user enters a number other than 1 or 2, display invalid choice message
            System.out.println("Invalid choice.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
