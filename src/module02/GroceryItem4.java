package module02;

public class GroceryItem4 {
    private String name, category;
    private double cost;
    private int quantity;

    public GroceryItem4(String name) {
        this.name = name;
    }

    public GroceryItem4(String name, String category) {
        this.name = name; this.category = category;
    }
    public GroceryItem4(String name, double cost) {
        this.name = name; this.cost = cost;
    }
    public GroceryItem4(String name, int quantity) {
        this.name = name; this.quantity = quantity;
    }
    public String getCategory(){return this.category;}

    public String getName() {return name;}

    public double getCost() {
        return cost;
    }

    public void addQuantity(int q) {
        quantity += q;
    }

    public int getQuantity() {
        return quantity;
    }
}
