package module02;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<String> shoppingList = new ArrayList<>();

    public ShoppingList(){}

    public void addItem(String item) {
        shoppingList.add(item);
    }

    public void removeItem(String item) {
        shoppingList.remove(item);
    }
    public void displayList() {
        int increment = 1;
        System.out.println("Shopping List:\n");
        for (String item : shoppingList) {
            System.out.printf("%s. %s\n", increment++, item);
        }
    }
}
