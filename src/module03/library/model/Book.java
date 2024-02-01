package module03.library.model;

public class Book {
    private String title, author;
    private static int isbnIncrement;
    private int isbn;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isbn = isbnIncrement++;
    }

    public String getTitle() {
        return this.title;
    }
}
