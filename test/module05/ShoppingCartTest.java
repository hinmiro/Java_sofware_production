package module05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private static ShoppingCart cart;
    private int old;

    @BeforeAll
    static void setup() {
        cart = new ShoppingCart(new CartUser("joe"));
    }


    @Test
    void testRemoveItem() {
        old = cart.getListLength();
        cart.removeItem("milk");
        assertEquals(old - 1, cart.getListLength());
    }

    @Test
    void testAddItem() {
        int oldLen = cart.getListLength();
        cart.addItem("milk", 1.20);
        assertEquals(oldLen + 1, cart.getListLength());
    }

    @Test
    void testCalculateCost() {
        cart.addItem("apple", 3.1);
        cart.addItem("bread", 0.9);
        cart.addItem("cheese", 4.2);
        assertEquals(8.2, cart.calculateCost(), 0.001);
    }


}