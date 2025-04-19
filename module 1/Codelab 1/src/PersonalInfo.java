// Import necessary classes
import java.time.Year;     // For getting the current year
import java.util.Scanner;  // For taking user input

public class PersonalInfo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name and read it
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their gender (M/F) and read the first character
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        // Prompt the user to enter their year of birth and read it as an integer
        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Close the Scanner object to free system resources
        scanner.close();

        // Calculate age by subtracting year of birth from the current year
        int age = Year.now().getValue() - yearOfBirth;

        // Convert gender input to a full text description using a ternary operator
        String genderText = (gender == 'M' || gender == 'm') ? "Male" : "Female";

        // Display the collected and calculated personal information
        System.out.println("\nPersonal Data:");
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + genderText);
        System.out.println("Age     : " + age + " years");
    }
}
