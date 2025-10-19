/**
 * The MovieTicket class represents a ticket purchased for a specific movie.
 * It includes movie details, seat number, and price.
 */
public class MovieTicket {
    private String movieTitle;
    private String seatNumber;
    private double price;

    // Default constructor
    public MovieTicket() {}

    // Parameterized constructor
    public MovieTicket(String movieTitle, String seatNumber, double price) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Getters
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display method
    public void displayTicket() {
        System.out.println("Movie: " + movieTitle);
        System.out.println("Seat: " + seatNumber);
        System.out.printf("Price: $%.2f%n", price);
    }
}
