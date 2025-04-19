import java.util.Scanner;  // Import Scanner class for user input

// Superclass User
class User {
    // Private (encapsulated) attributes for name and studentID
    private String name;
    private String studentID;

    // Constructor to initialize name and studentID
    public User(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Setter for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter for studentID attribute
    public String getStudentID() {
        return studentID;
    }

    // Setter for studentID attribute
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Method to be overridden by subclasses for login
    public boolean login(String input1, String input2) {
        return false;   // Base class returns false, subclasses will override
    }

    // Method to display user info
    public void displayInfo() {
        System.out.println("User Info: " + name + " | " + studentID);
    }
}

// Subclass Admin inherits from User
class Admin extends User {
    // Additional attributes specific to Admin
    private String username;
    private String password;

    // Constructor uses super() to call User's constructor and initialize extra attributes
    public Admin(String name, String studentID, String username, String password) {
        super(name, studentID);  // Call User constructor
        this.username = username;
        this.password = password;
    }

    // Override login method for Admin authentication
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        // Return true only if both username and password match
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    // Override displayInfo method to show admin-specific login message
    @Override
    public void displayInfo() {
        System.out.println("Admin Login Successful!");
        System.out.println("Welcome Admin: " + getName() + " | ID: " + getStudentID());
    }
}

// Subclass Student inherits from User
class Student extends User {
    // Constructor uses super() to call User's constructor
    public Student(String name, String studentID) {
        super(name, studentID);  // Call User constructor
    }

    // Override login method for Student authentication
    @Override
    public boolean login(String inputName, String inputID) {
        // Return true only if both name and studentID match
        return inputName.equals(getName()) && inputID.equals(getStudentID());
    }

    // Override displayInfo method to show student-specific login message
    @Override
    public void displayInfo() {
        System.out.println("Student Login Successful!");
        System.out.println("Welcome Student: " + getName() + " | ID: " + getStudentID());
    }
}

// Main program class containing main() method
public class LoginSystem {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Create an Admin object with sample/fixed credentials
        Admin admin = new Admin("Admin Name", "A001", "admin", "1234");

        // Create a Student object with sample/fixed credentials
        Student student = new Student("John Doe", "S123");

        // Display login menu
        System.out.println("=== LOGIN SYSTEM ===");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.print("Choose option (1/2): ");

        // Read user's menu selection
        int option = input.nextInt();
        input.nextLine();  // Consume newline character after int input

        // Check selected option
        if (option == 1) {
            // Admin login process
            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            // Check if login is successful
            if (admin.login(username, password)) {
                admin.displayInfo();   // Show admin info if successful
            } else {
                System.out.println("Login Failed: Incorrect Admin credentials.");
            }

        } else if (option == 2) {
            // Student login process
            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Student ID: ");
            String id = input.nextLine();

            // Check if login is successful
            if (student.login(name, id)) {
                student.displayInfo();  // Show student info if successful
            } else {
                System.out.println("Login Failed: Incorrect Student credentials.");
            }

        } else {
            // If option is not 1 or 2
            System.out.println("Invalid option!");
        }

        // Close Scanner to free resources
        input.close();
    }
}
