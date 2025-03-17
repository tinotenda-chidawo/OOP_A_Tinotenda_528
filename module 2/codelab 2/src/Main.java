// BankAccount class to represent a bank account with attributes and methods
class BankAccount {
    // Attributes of the BankAccount class
    String accountNumber;  // Stores the account number (e.g., NIM)
    String ownerName;      // Stores the name of the account owner
    double balance;        // Stores the account balance (using double for decimal values)

    // Constructor to initialize a BankAccount object
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber; // Assigns account number to the object
        this.ownerName = ownerName;         // Assigns owner name to the object
        this.balance = balance;             // Assigns initial balance to the object
    }

    // Method to display account information
    public void displayInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber); // Prints account number
        System.out.println("Owner Name: " + ownerName);         // Prints owner name
        System.out.println("Balance: $" + balance);             // Prints balance with $ symbol
        System.out.println("-----------------------------");     // Separator for readability
    }

    // Method to deposit money into the account
    public void depositMoney(double amount) {
        // Check if the deposit amount is positive
        if (amount > 0) {
            balance += amount;  // Add the amount to the balance
            System.out.println("Deposit Transaction:");
            System.out.println("Amount Deposited: $" + amount); // Show deposited amount
            System.out.println("New Balance: $" + balance);     // Show updated balance
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
        System.out.println("-----------------------------");     // Separator
    }

    // Method to withdraw money from the account
    public void withdrawMoney(double amount) {
        // Check if the withdrawal amount is positive and if balance is sufficient
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Subtract the amount from the balance
            System.out.println("Withdrawal Transaction:");
            System.out.println("Amount Withdrawn: $" + amount); // Show withdrawn amount
            System.out.println("New Balance: $" + balance);     // Show updated balance
        } else if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
        } else {
            System.out.println("Error: Insufficient balance for withdrawal!");
        }
        System.out.println("-----------------------------");     // Separator
    }
}

// Main class where the program starts execution
public class Main {
    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Creating the first BankAccount object (account1) with my details
        BankAccount account1 = new BankAccount("123456789", "John Doe", 500.75);
        // Replace "123456789" with your NIM, "John Doe" with your name, and 500.75 with your balance

        // Creating the second BankAccount object (account2) with friend's details
        BankAccount account2 = new BankAccount("987654321", "Jane Smith", 250.50);
        // Replace "987654321" with friend's NIM, "Jane Smith" with friend's name, and 250.50 with a balance

        // Displaying initial information for account1
        account1.displayInfo();

        // Performing transactions on account1
        account1.depositMoney(100.25);   // Depositing $100.25
        account1.withdrawMoney(50.00);   // Withdrawing $50.00

        // Displaying initial information for account2
        account2.displayInfo();

        // Performing transactions on account2
        account2.depositMoney(75.00);    // Depositing $75.00
        account2.withdrawMoney(300.00);  // Attempting to withdraw $300 (insufficient balance)
    }
}