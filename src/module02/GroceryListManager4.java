package module02;

import java.util.HashMap;
import java.util.Map;


public class GroceryListManager4 {
    private Map<String, GroceryItem4> groceries = new HashMap<>();

    public GroceryListManager4() {
    }

    void addItem(String item, double cost) {
        groceries.put(item, new GroceryItem4(item, cost));
    }

    void removeItem(GroceryItem4 i) {
        groceries.remove(i.getName());
    }

    void checkItem(GroceryItem4 i) {
        if (groceries.containsKey(i.getName())) {
            System.out.printf("\nIs %s in the grocerylist? %s\n", i.getName(), true);
        } else {
            System.out.printf("\nIs %s in the grocerylist? %s\n", i.getName(), false);

        }
    }

    void displayList() {
        int increment = 1;
        System.out.println("\nGrocery List:");
        for (String item : groceries.keySet()) {
            System.out.printf("%s %s\n", increment++, (groceries.get(item)).getName());
        }
    }

    double calculateTotalCost() {
        double totalCost = 0;
        for (String item : groceries.keySet()) {
            totalCost += (groceries.get(item).getCost());
        }
        return totalCost;
    }

    void displayByCategory(String category) {
        System.out.printf("\nDisplaying %s:\n", category);
        for (String item : groceries.keySet()) {
            GroceryItem4 obj = groceries.get(item);
            if (obj.getCategory().equals(category)) {
                System.out.println(obj.getName());
            }
        }
    }

    void updateQuantity(String item, int newQuantity) {
        for (String key : groceries.keySet()) {
            if (groceries.get(item).getName().equals(item)) {
                groceries.get(item).addQuantity(newQuantity);
            }
        }
    }


    void addItemWithCategory(String item, String category) {
        groceries.put(item, new GroceryItem4(item, category));
    }

    void addItemWithQuantity(String item, int quantity) {
        groceries.put(item, new GroceryItem4(item, quantity));
    }

    void displayAvailableItems() {
        int increment = 1;
        for (String item : groceries.keySet()) {
            GroceryItem4 obj = groceries.get(item);
            System.out.printf("%s %s quantity: %s\n", increment++, obj.getName(), obj.getQuantity());
        }
    }

    public static void main(String[] args) {
        GroceryListManager4 manager = new GroceryListManager4();
        manager.addItemWithCategory("Milk", "Dairy");
        manager.displayByCategory("Dairy");
        manager.addItemWithQuantity("Apple", 4);
        manager.addItemWithQuantity("bread", 4);
        manager.displayAvailableItems();






    }
}

