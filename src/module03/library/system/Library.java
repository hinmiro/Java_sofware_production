package module03.library.system;

import java.util.Scanner;

import module03.library.model.Book;
import module03.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryMember> members = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void addMember(String name) {
        members.add(new LibraryMember(name));
    }

    public void borrowBooks(String borrower, String book) {
        for (Book b : books) {
            if (b.getTitle().equals(book)) {
                books.remove(b);
                for (LibraryMember m : members) {
                    if (m.getName().equals(borrower)) {
                        m.addBook(b);
                    }
                }
            }
        }
    }

    public void returnBooks(String title) {
        for (LibraryMember m : members) {
            ArrayList<Book> borrowed = m.getBooks();
            for (Book b : borrowed) {
                if (b.getTitle().equals(title)) {
                    books.add(b);
                    m.removeBook(b);
                }
            }
        }
    }
}
