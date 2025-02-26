import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            // Admin Login
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            String validUsername = "Admin010";
            String validPassword = "Password010";

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Admin login successful!");
            } else {
                System.out.println("Login failed! Wrong username or password.");
            }

        } else if (choice == 2) {
            // Student Login
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();

            String validName = "Ken Aryo Bimantoro";
            String validStudentID = "202310370311006";

            if (name.equals(validName) && studentID.equals(validStudentID)) {
                System.out.println("Student Login Successful!");
                System.out.println("Name: " + name);
                System.out.println("Student ID: " + studentID);
            } else {
                System.out.println("Login Failed! Wrong name or student ID.");
            }

        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

