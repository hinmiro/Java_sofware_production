package module02;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        int increment = 1;
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.printf("%s: Title: %s, Author: %s, Year: %s\n", increment++, book.getTitle(), book.getAuthor(), book.getYear());
        }
    }

    public void findBooksByAuthor(String name) {
        System.out.printf("\nBooks by Author \"%s\":\n", name);
        for (Book book : books) {
            if (book.getAuthor().equals(name)) {
                System.out.printf("Title: %s, Year: %s\n", book.getTitle(), book.getYear());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                borrowedBooks.add(book);
            }
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        boolean available = false;
        for (Book book : books) {
            available = book.getTitle().equals(title);
        }
        return available;
    }

    public static void main(String[] args) {
        Library oodi = new Library();
        Book book1 = new Book("The fellowship of the ring", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Two towers", "J.R.R. Tolkien", 1954);
        Book book3 = new Book("The return of the king", "J.R.R. Tolkien", 1955);
        oodi.addBook(book1);
        oodi.addBook(book2);
        oodi.addBook(book3);
        oodi.displayBooks();
        oodi.findBooksByAuthor("J.R.R. Tolkien");
        oodi.borrowBook("Two towers");
        System.out.println("\n\n");
        oodi.displayBooks();
        oodi.returnBook(oodi.borrowedBooks.get(0));
        System.out.println("\n\n");
        oodi.displayBooks();
        System.out.println("\n");
        System.out.printf("Is book available, %s", oodi.isBookAvailable("Two towers"));


    }
}
