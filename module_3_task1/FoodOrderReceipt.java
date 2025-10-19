import java.util.Scanner;

public class FoodOrderReceipt {
    // Attributes
    private String customerName;
    private String foodItem;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public FoodOrderReceipt(String customerName, String foodItem, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate total cost
    public double calculateTotal() {
        double subtotal = quantity * pricePerItem;
        double tax = subtotal * 0.10; // 10% tax
        return subtotal + tax;
    }

    // Method to display the receipt
    public void printReceipt() {
        System.out.println("\n===== FOOD ORDER RECEIPT =====");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per Item: $%.2f\n", pricePerItem);
        System.out.printf("Total (with 10%% tax): $%.2f\n", calculateTotal());
        System.out.println("Thank you for your order!");
        System.out.println("===============================");
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter food item: ");
        String food = input.nextLine();

        System.out.print("Enter quantity: ");
        int qty = input.nextInt();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        FoodOrderReceipt order = new FoodOrderReceipt(name, food, qty, price);
        order.printReceipt();

        input.close();
    }
}
