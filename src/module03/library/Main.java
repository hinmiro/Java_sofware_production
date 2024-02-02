package module03.library;
import module03.library.system.Library;

public class Main {

    public static void main(String[] args) {
        Library oodi = new Library();
        oodi.addBook("The Golden fool", "Robin Hobb");
        oodi.addBook("The Hobbit", "J.R.R. Tolkien");
        oodi.addBook("Royal Assassin", "Robin Hobb");
        oodi.addMember("Luke");
        oodi.addMember("Bender");
        oodi.borrowBooks("Luke", "The Hobbit");
        oodi.returnBooks("The Hobbit");
    }
}