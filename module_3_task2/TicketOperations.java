/**
 * The TicketOperations class provides utility methods
 * for calculating and displaying ticket-related information.
 */
public class TicketOperations {

    /**
     * Calculates the total cost of multiple movie tickets.
     *
     * @param tickets an array of MovieTicket objects
     * @return the total cost of all tickets
     */
    public double calculateTotal(MovieTicket[] tickets) {
        double total = 0;
        for (MovieTicket ticket : tickets) {
            total += ticket.getPrice();
        }
        return total;
    }

    /**
     * Calculates the total cost after applying a discount.
     *
     * @param tickets  an array of MovieTicket objects
     * @param discount the discount percentage (e.g., 0.1 for 10%)
     * @return the total cost after discount
     */
    public double calculateTotalWithDiscount(MovieTicket[] tickets, double discount) {
        double total = calculateTotal(tickets);
        return total - (total * discount);
    }

    /**
     * Prints the details of all tickets and the total cost.
     *
     * @param tickets an array of MovieTicket objects
     */
    public void printReceipt(MovieTicket[] tickets) {
        System.out.println("===== MOVIE TICKET RECEIPT =====");
        for (MovieTicket ticket : tickets) {
            ticket.displayTicket();
            System.out.println("---------------------------");
        }
        System.out.printf("Total: $%.2f%n", calculateTotal(tickets));
    }
}
