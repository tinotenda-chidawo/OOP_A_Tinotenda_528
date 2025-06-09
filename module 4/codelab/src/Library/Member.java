package Library;

public class Member implements BookLoan {
    private final String name;
    private final String memberID;

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    @Override
    public void borrowBook(String title) {
        System.out.println(name + " borrowed the book titled: " + title);
    }

    // Overloading
    public void borrowBook(String title, int loanDuration) {
        System.out.println(name + " borrowed the book \"" + title + "\" for " + loanDuration + " days.");
    }

    @Override
    public void returnBook(String title) {
        System.out.println(name + " returned the book titled: " + title);
    }

    public void displayInfo() {
        System.out.println("Member: " + name + " (ID: " + memberID + ")");
    }
}
