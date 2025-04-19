/**
 * Main class containing the battle simulation program with GameCharacter hierarchy.
 * This program demonstrates inheritance and polymorphism in a simple battle scenario.
 */
public class Main {
    /**
     * The main method serves as the entry point of the program.
     * It creates Hero and Enemy objects, displays their initial health,
     * and simulates a battle between them.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Hero object named "Brimstone" with 150 health points
        Hero brimstone = new Hero("Brimstone", 150);

        // Create an Enemy object named "Viper" with 200 health points
        Enemy viper = new Enemy("Viper", 200);

        // Display the initial health status of both characters
        System.out.println("Initial Health:");
        System.out.println(brimstone.getName() + "'s health: " + brimstone.getHealth());
        System.out.println(viper.getName() + "'s health: " + viper.getHealth());
        System.out.println();

        // Simulate the battle: Brimstone attacks Viper, then Viper retaliates
        brimstone.attack(viper);
        System.out.println();
        viper.attack(brimstone);
    }
}

/**
 * Abstract superclass representing a generic game character.
 * Contains common attributes (name and health) and methods that will be overridden.
 */
class GameCharacter {
    private String name;    // The character's name
    private int health;     // The character's health points

    /**
     * Constructor to initialize a GameCharacter with a name and health.
     *
     * @param name   The name of the character
     * @param health The initial health points of the character
     */
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * Getter for the character's name.
     *
     * @return The character's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the character's name (included per requirements, though unused here).
     *
     * @param name The new name to set
     */
    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the character's health.
     *
     * @return The character's current health points
     */
    public int getHealth() {
        return health;
    }

    /**
     * Setter for the character's health, used to update health after attacks.
     *
     * @param health The new health value to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Abstract method to perform an attack on a target character.
     * Intended to be overridden by subclasses (Hero and Enemy).
     *
     * @param target The character to attack
     */
    @SuppressWarnings("unused")
    public void attack(GameCharacter target) {
        // This method will be overridden by subclasses
    }
}

/**
 * Subclass of GameCharacter representing a Hero with a sword attack.
 * Inherits name and health attributes and overrides the attack method.
 */
class Hero extends GameCharacter {
    /**
     * Constructor to initialize a Hero with a name and health.
     *
     * @param name   The name of the hero
     * @param health The initial health points of the hero
     */
    public Hero(String name, int health) {
        super(name, health); // Call the superclass constructor
    }

    /**
     * Overrides the attack method to simulate a sword attack.
     * Reduces the target's health by 20 and displays the result.
     *
     * @param target The character being attacked
     */
    @Override
    public void attack(GameCharacter target) {
        // Display the attack message with hero's and target's names
        System.out.println(getName() + " attacks " + target.getName() + " using a sword!");
        // Reduce target's health by 20
        target.setHealth(target.getHealth() - 20);
        // Display the target's updated health
        System.out.println(target.getName() + "'s health: " + target.getHealth());
    }
}

/**
 * Subclass of GameCharacter representing an Enemy with a magic attack.
 * Inherits name and health attributes and overrides the attack method.
 */
class Enemy extends GameCharacter {
    /**
     * Constructor to initialize an Enemy with a name and health.
     *
     * @param name   The name of the enemy
     * @param health The initial health points of the enemy
     */
    public Enemy(String name, int health) {
        super(name, health); // Call the superclass constructor
    }

    /**
     * Overrides the attack method to simulate a magic attack.
     * Reduces the target's health by 15 and displays the result.
     *
     * @param target The character being attacked
     */
    @Override
    public void attack(GameCharacter target) {
        // Display the attack message with enemy's and target's names
        System.out.println(getName() + " attacked " + target.getName() + " using magic!");
        // Reduce target's health by 15
        target.setHealth(target.getHealth() - 15);
        // Display the target's updated health
        System.out.println(target.getName() + "'s health: " + target.getHealth());
    }
}