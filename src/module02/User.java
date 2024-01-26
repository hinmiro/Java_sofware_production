package module02;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    public ArrayList<Book> borrowed = new ArrayList<>();

    public User(String name, int age) {
        this.name = name; this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Book returnBook() {
        Book book = borrowed.remove(0);
        return book;

    }

    public ArrayList<Book> getBorrowed() {
        return borrowed;
    }

    public void displayBorrowedBooks() {

        for (Book book : borrowed) {
            System.out.println(book.getTitle());
        }
    }
}
