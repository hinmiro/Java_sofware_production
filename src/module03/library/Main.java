package module03.library;
import module03.library.system.Library;

public class Main {

    public static void main(String[] args) {
        Library oodi = new Library();
        oodi.addBook("The Golden Fool", "Robin Hobb");
        oodi.addBook("The Hobbit", "J.R.R. Tolkien");
        oodi.addBook("Royal Assassin", "Robin Hobb");
        oodi.addMember("Luke");
        oodi.addMember("Bender");
        oodi.borrowBooks("Luke", "The Hobbit");
        oodi.returnBooks("The Hobbit");
        oodi.reserveBook("The Hobbit", "Bender");
        oodi.cancelReservation("The Hobbit", "Bender");
        oodi.reserveBook("The Golden Fool", "Luke");
        oodi.reserveBook("Royal Assassin", "Luke");
        oodi.displayReservedBooks();
    }
}