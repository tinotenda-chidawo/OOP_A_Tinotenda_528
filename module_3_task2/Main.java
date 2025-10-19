/**
 * The Main class demonstrates the Movie Ticket System with discount feature.
 */
public class Main {
    public static void main(String[] args) {
        MovieTicket[] tickets = {
            new MovieTicket("Avengers: Endgame", "A1", 10.5),
            new MovieTicket("Inception", "B3", 9.0)
        };

        TicketOperations operations = new TicketOperations();
        operations.printReceipt(tickets);

        System.out.println("\nApplying 10% discount...");
        System.out.printf("Total after discount: $%.2f%n", operations.calculateTotalWithDiscount(tickets, 0.10));
    }
}
