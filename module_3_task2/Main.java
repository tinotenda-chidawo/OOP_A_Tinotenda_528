public class Main {
    public static void main(String[] args) {
        MovieTicket[] tickets = {
            new MovieTicket("Avengers: Endgame", "A1", 10.5),
            new MovieTicket("Inception", "B3", 9.0)
        };

        TicketOperations operations = new TicketOperations();
        operations.printReceipt(tickets);
    }
}
