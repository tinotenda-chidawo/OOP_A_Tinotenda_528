package Library;

public class Fiction extends Book {
    private final String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: " + title + " by " + author + " (Genre: " + genre + ")");
    }
}
