package module02;

public class Book {
    private final String title, author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title; this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }
}
