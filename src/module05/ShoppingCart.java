package module05;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> list = new HashMap<>();

    public ShoppingCart(CartUser user) {
    }

    public void removeItem(String s) {
        if (list.containsKey(s))
            list.remove(s);
        else
            System.out.println("No such item");
    }

    public void addItem(String s, double d) {
        list.put(s, d);
    }

    public double calculateCost() {
        double cost = 0;
        for (Map.Entry<String, Double> item : list.entrySet()) {
            cost += item.getValue();
        }
        return cost;
    }


    public int getListLength() {
        return list.size();
    }

    public static void main(String[] args) {
        ShoppingCart one = new ShoppingCart(new CartUser("joe"));
    }
}

class CartUser {
    private String name;

    public CartUser(String name) {
        this.name = name;
    }
}