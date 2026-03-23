package ee.ut.math.tvt.salessystem.logic;

import static org.junit.Assert.*;
import org.junit.Test;

import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;

public class ShoppingCartGT {

    @Test
    public void test0() {
        ShoppingCart shoppingCart0 = new ShoppingCart(new InMemorySalesSystemDAO());
        shoppingCart0.submitCurrentPurchase();
    }

    @Test
    public void test1() {
        ShoppingCart shoppingCart0 = new ShoppingCart(new InMemorySalesSystemDAO());
        assertEquals(0, shoppingCart0.getAll().size());
    }

    @Test
    public void test2() {
        ShoppingCart shoppingCart0 = new ShoppingCart(new InMemorySalesSystemDAO());
        shoppingCart0.cancelCurrentPurchase();
    }

    @Test
    public void test3() {
        ShoppingCart shoppingCart0 = new ShoppingCart(new InMemorySalesSystemDAO());
        shoppingCart0.addItem(null);
        shoppingCart0.submitCurrentPurchase();
    }
}
