import java.util.Scanner;

@SuppressWarnings("FieldCanBeLocal")
class Admin {
    private final String username = "admin";
    private final String password = "admin123";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

@SuppressWarnings("FieldCanBeLocal")
class Student {
    private final String name = "John Doe";
    private final String studentId = "12345";

    public boolean login(String inputName, String inputId) {
        return inputName.equals(name) && inputId.equals(studentId);
    }

    public void displayInfo() {
        System.out.println("\nStudent Information:\nName: " + name + "\nStudent ID: " + studentId);
    }
}

class LoginSystem {
    public void run() {
        Admin admin = new Admin();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Login System ===\n1. Admin\n2. Student\n3. Exit\nEnter choice (1-3): ");
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    System.out.println(admin.login(username, scanner.nextLine()) ?
                            "Admin login successful!" : "Invalid admin credentials!");
                }
                case "2" -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Student ID: ");
                    if (student.login(name, scanner.nextLine())) {
                        System.out.println("Student login successful!");
                        student.displayInfo();
                    } else {
                        System.out.println("Invalid student credentials!");
                    }
                }
                case "3" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Select 1, 2, or 3.");
            }
        }
    }

    public static void main(String[] args) {
        new LoginSystem().run();
    }
}