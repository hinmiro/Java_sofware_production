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

    public double getAverageBookRating() {
        double averageRating = 0;
        for (Book book : books) {
            averageRating += book.getRating();
        }
        return averageRating/books.size();
    }

    public Book getMostReviewedBook() {
        Book mostRevieved = null;
        int increment = 1;
        for (Book book : books) {
            ArrayList<String> revs = book.getReview();
            if (increment < books.size()) {
                ArrayList<String> revs2 = books.get(increment).getReview();
                if (revs.size() > revs2.size()) {
                    mostRevieved = book;
                }
                else {
                    mostRevieved = books.get(increment);
                }
            }
            increment++;
        }
        return mostRevieved;
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
        System.out.printf("Is book available, %s", oodi.isBookAvailable("Two towers"));
        System.out.println("\n\n");
        double increment = 3;
        for (Book book : oodi.books) {
            book.addReview("Very nice book!");
            book.setRating(increment++);
        }
        Book book = oodi.books.get(0);
        book.addReview("Not so nice book");
        System.out.println("\n");
        System.out.printf("\nAverage book rating is %.2f", oodi.getAverageBookRating());
        System.out.println("\n");
        System.out.printf("Most reviewed book is %s", oodi.getMostReviewedBook().getTitle());



    }
}
