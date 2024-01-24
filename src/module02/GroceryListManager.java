package module02;

import java.util.ArrayList;

public class GroceryListManager {
    private final ArrayList<String> groceryList = new ArrayList<>();

    public GroceryListManager(){
    }
    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        System.out.printf("\nRemoving \"%s\" from the list...\n", item);
        groceryList.remove(item);
        displayList();
    }

    public void displayList() {
        int increment = 1;
        System.out.println("\nGrocery List:\n");
        for (String item : groceryList) {
            System.out.printf("%s. %s\n", increment++, item);
        }
    }

    public void checkItem(String item) {
        if (groceryList.contains(item)) {
            System.out.printf("\n\"%s\" in the grocery list? %s\n", item, true);
        } else {
            System.out.printf("\n\"%s\" in the grocery list? %s\n", item, false);
        }
    }

    public static void main(String[] args) {
        GroceryListManager grocery = new GroceryListManager();
        grocery.addItem("Apple");
        grocery.addItem("Milk");
        grocery.addItem("Bread");
        grocery.displayList();
        grocery.checkItem("Milk");
        grocery.removeItem("Milk");
    }
}
