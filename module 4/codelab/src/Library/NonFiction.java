package Library;

public class NonFiction extends Book {
    private final String field;

    public NonFiction(String title, String author, String field) {
        super(title, author);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book: " + title + " by " + author + " (Field: " + field + ")");
    }
}
