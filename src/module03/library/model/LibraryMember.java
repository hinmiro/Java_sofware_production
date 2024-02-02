package module03.library.model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private static int idIncrement;
    private int id;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        id = idIncrement++;
    }

    public String getName() {
        return this.name;
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    public ArrayList<Book> getBooks() {
        return borrowedBooks;
    }

    public void removeBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void reserveBook(Book book) {
        reservedBooks.add(book);
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }

    public void cancelReservation(Book book) {
        reservedBooks.remove(book);
    }
}
