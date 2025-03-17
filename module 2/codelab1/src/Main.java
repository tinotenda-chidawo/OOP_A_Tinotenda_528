// Animal class to represent an animal with basic attributes and behavior
class Animal {
    // Attributes (fields) of the Animal class with String data type
    String name;    // Stores the name of the animal
    String type;    // Stores the type of the animal (e.g., Mammal, Reptile)
    String sound;   // Stores the sound the animal makes

    // Constructor to initialize the Animal object with name, type, and sound
    // This runs when a new Animal object is created
    public Animal(String name, String type, String sound) {
        this.name = name;   // 'this' refers to the current object's name attribute
        this.type = type;   // Assigns the type parameter to the object's type
        this.sound = sound; // Assigns the sound parameter to the object's sound
    }

    // Method to display the animal's information
    // No return value (void), just prints details to the console
    public void displayInfo() {
        System.out.println("Animal Information:");
        System.out.println("Name: " + name);     // Prints the animal's name
        System.out.println("Type: " + type);     // Prints the animal's type
        System.out.println("Sound: " + sound);   // Prints the animal's sound
        System.out.println("----------------"); // Separator for readability
    }
}

// Main class where the program starts execution
public class Main {
    // The main method - entry point of the program
    public static void main(String[] args) {
        // Creating the first Animal object (animal1) with specific values
        Animal animal1 = new Animal("Cat", "Mammal", "Nyann~~");
        // 'new Animal()' calls the constructor to create the object

        // Creating the second Animal object (animal2) with specific values
        Animal animal2 = new Animal("Dog", "Mammal", "Woof-Woof!!");

        // Calling the displayInfo() method for animal1 to show its details
        animal1.displayInfo();

        // Calling the displayInfo() method for animal2 to show its details
        animal2.displayInfo();
    }
}