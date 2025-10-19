/**
 * The MovieTicket class represents a ticket purchased for a specific movie.
 * It contains details such as movie title, seat number, and ticket price.
 */
public class MovieTicket {
    private String movieTitle;
    private String seatNumber;
    private double price;

    /**
     * Constructs a MovieTicket object with specified details.
     *
     * @param movieTitle  the title of the movie
     * @param seatNumber  the seat number for the ticket
     * @param price       the price of the ticket
     */
    public MovieTicket(String movieTitle, String seatNumber, double price) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    /** @return the movie title */
    public String getMovieTitle() {
        return movieTitle;
    }

    /** @return the seat number */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** @return the ticket price */
    public double getPrice() {
        return price;
    }

    /**
     * Displays the ticket details in a readable format.
     */
    public void displayTicket() {
        System.out.println("Movie: " + movieTitle);
        System.out.println("Seat: " + seatNumber);
        System.out.printf("Price: $%.2f%n", price);
    }
}
