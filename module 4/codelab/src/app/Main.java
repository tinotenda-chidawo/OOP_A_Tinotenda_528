package app;

import Library.*;

public class Main {
    public static void main(String[] args) {
        Book nonFiction = new NonFiction("Madilog", "Tan Malaka", "History & Knowledge");
        Book fiction = new Fiction("Hainuwele: The Coconut Princess", "Lilis Hu", "Folklore");

        Member member1 = new Member("Tino Chidawo", "528");
        Member member2 = new Member("Shafi Ehza", "484");

        nonFiction.displayInfo();
        fiction.displayInfo();
        System.out.println();

        member1.displayInfo();
        member2.displayInfo();
        System.out.println();

        member1.borrowBook("Madilog");
        member2.borrowBook("Hainuwele: The Coconut Princess", 7);
        System.out.println();

        member1.returnBook("Madilog");
        member2.returnBook("Hainuwele: The Coconut Princess");
    }
}
