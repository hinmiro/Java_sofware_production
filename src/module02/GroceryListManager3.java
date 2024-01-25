package module02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GroceryListManager3 {
    private final Map<String, Double> groceryList = new HashMap<>();
    private final Map<String, ArrayList<String>> categories = new HashMap<>();
    private final ArrayList<String> fruits = new ArrayList<>();
    private final ArrayList<String> dairy = new ArrayList<>();
    private final ArrayList<String> bakery = new ArrayList<>();

    public GroceryListManager3() {
    }

    public void addItem(String item, Double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        System.out.printf("\nRemoving \"%s\" from the list...\n", item);
        groceryList.remove(item);
        displayList();
    }

    public void displayList() {
        int increment = 1;
        System.out.println("\nGrocery List:\n");
        for (String item : groceryList.keySet()) {
            System.out.printf("%s. %s %s\n", increment++, item, groceryList.get(item));
        }
    }

    public void checkItem(String item) {
        if (groceryList.containsKey(item)) {
            System.out.printf("\n\"%s\" in the grocery list? %s\n", item, true);
        } else {
            System.out.printf("\n\"%s\" in the grocery list? %s\n", item, false);
        }
    }

    public double calculateTotalCost() {
        double cost = 0;
        for (String item : groceryList.keySet()) {
            cost += groceryList.get(item);
        }
        return cost;
    }

    public void addItemWithCategory(String item, String category) {
        switch (category) {
            case "fruits" -> {
                fruits.add(item);
                categories.put(category, fruits);
            }
            case "dairy" -> {
                dairy.add(item);
                categories.put(category, dairy);
            }
            case "bakery" -> {
                bakery.add(item);
                categories.put(category, bakery);
            }
        }
    }

    public void displayByCategory(String category) {
        if (categories.containsKey(category)) {
            ArrayList<String> retrieved = categories.get(category);
            System.out.println(category+": "+ String.join(", ", retrieved));
        }
    }

    public static void main(String[] args) {
        GroceryListManager3 grocery = new GroceryListManager3();
        grocery.addItem("Apple", 2.15);
        grocery.addItem("Milk", 1.15);
        grocery.addItem("Bread", 4.23);
        grocery.displayList();
        grocery.checkItem("Milk");
        grocery.removeItem("Milk");
        System.out.printf("\nTotal cost of groceries is %.2f", grocery.calculateTotalCost());

        grocery.addItemWithCategory("Apple", "fruits");
        grocery.addItemWithCategory("Bread", "bakery");
        grocery.addItemWithCategory("Butter", "dairy");
        System.out.println(" ");
        grocery.displayByCategory("fruits");
        grocery.displayByCategory("bakery");
        grocery.displayByCategory("dairy");
    }
}

