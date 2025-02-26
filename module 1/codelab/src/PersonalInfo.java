import java.time.Year;
import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        scanner.close();

        int age = Year.now().getValue() - yearOfBirth;
        String genderText = (gender == 'M' || gender == 'm') ? "Male" : "Female";

        System.out.println("\nPersonal Data:");
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + genderText);
        System.out.println("Age     : " + age + " years");
    }
}

