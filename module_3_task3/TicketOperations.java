public class TicketOperations {
    public double calculateTotal(MovieTicket[] tickets) {
        double total = 0;
        for (MovieTicket ticket : tickets) {
            total += ticket.getPrice();
        }
        return total;
    }

    public double calculateTotalWithDiscount(MovieTicket[] tickets, double discount) {
        double total = calculateTotal(tickets);
        return total - (total * discount);
    }

    public void printReceipt(MovieTicket[] tickets) {
        System.out.println("===== MOVIE TICKET RECEIPT =====");
        for (MovieTicket ticket : tickets) {
            ticket.displayTicket();
            System.out.println("---------------------------");
        }
        System.out.printf("Total: $%.2f%n", calculateTotal(tickets));
    }
}