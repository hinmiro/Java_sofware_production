package module02;
import java.util.HashMap;
import java.util.Map;


public class GroceryListManager2 {
    private final Map<String, Double> groceryList = new HashMap<>();

    public GroceryListManager2(){
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
            System.out.printf("%s. %s %s\n", increment++, item ,groceryList.get(item));
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

    public static void main(String[] args) {
        GroceryListManager2 grocery = new GroceryListManager2();
        grocery.addItem("Apple", 2.15);
        grocery.addItem("Milk", 1.15);
        grocery.addItem("Bread", 4.23);
        grocery.displayList();
        grocery.checkItem("Milk");
        grocery.removeItem("Milk");
        System.out.printf("\nTotal cost of groceries is %.2f", grocery.calculateTotalCost());
    }
}

