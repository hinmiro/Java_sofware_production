package module03.library.system;

import module03.library.model.Book;
import module03.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryMember> members = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void addMember(String name) {
        members.add(new LibraryMember(name));
    }

    public void borrowBooks(String borrower, String book) {
        System.out.printf("\n%s borrowed %s", borrower, book);
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
            ArrayList<Book> toBeReturned = new ArrayList<>();
            for (Book b : borrowed) {
                if (b.getTitle().equals(title)) {
                    System.out.printf("\n%s returned %s", m.getName(), b.getTitle());
                    books.add(b);
                    toBeReturned.add(b);
                }
            }
            toBeReturned.clear();
        }
    }

    public void reserveBook(String title, String member) {
        for (LibraryMember m : members) {
            if (m.getName().equals(member)) {
                for (Book b : books) {
                    if (b.getTitle().equals(title)) {
                        b.reserve(member);
                        m.reserveBook(b);
                    }
                }
            }
        }

    }

    public void cancelReservation(String title, String member) {
        for (LibraryMember m : members) {
            if (m.getName().equals(member)) {
                for (Book b : books) {
                    if (b.getTitle().equals(title)) {
                        b.cancelReserve(member);
                        m.cancelReservation(b);
                    }
                }
            }
        }
    }

    public void displayReservedBooks() {
        for (LibraryMember m : members) {
            ArrayList<Book> resb = m.getReservedBooks();
            System.out.printf("\n%s reserved books:\n", m.getName());
            for (Book b : resb) {
                System.out.printf("%s\n", b.getTitle());
            }
        }
    }
}
