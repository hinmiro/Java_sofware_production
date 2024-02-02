package module03.library.model;

public class Book {
    private String title, author;
    private static int isbnIncrement;
    private int isbn;
    private boolean reserved = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isbn = isbnIncrement++;
    }

    public String getTitle() {
        return this.title;
    }

    public void reserve(String name) {
        if (reserved) {
            System.out.printf("\nBook %s is already reserved", this.title);
        }else {
            System.out.printf("\nBook %s is now reserved to you.", this.title);
            reserved = true;
        }
    }

    public void cancelReserve(String name) {
        System.out.printf("\n%s reservation is cancelled from %s", this.title, name);
        reserved = false;
    }
}
