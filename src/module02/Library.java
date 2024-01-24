package module02;

import java.util.ArrayList;

public class Library {
    private static final ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void displayBooks() {
        int increment = 1;
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.printf("%s: Title: %s, Author: %s, Year: %s\n", increment++, book.getTitle(), book.getAuthor(), book.getYear());
        }
    }

    public static void findBooksByAuthor(String name) {
        System.out.printf("\nBooks by Author \"%s\":\n", name);
        for (Book book : books) {
            if (book.getAuthor().equals(name)) {
                System.out.printf("Title: %s, Year: %s\n", book.getTitle(), book.getYear());
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The fellowship of the ring", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Two towers", "J.R.R. Tolkien", 1954);
        Book book3 = new Book("The return of the king", "J.R.R. Tolkien", 1955);
        addBook(book1);
        addBook(book2);
        addBook(book3);
        displayBooks();
        findBooksByAuthor("J.R.R. Tolkien");

    }
}
