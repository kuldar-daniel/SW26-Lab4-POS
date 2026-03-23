package ee.ut.math.tvt.salessystem.dataobjects;

import static org.junit.Assert.*;
import org.junit.Test;

public class StockItemGT {

    @Test
    public void test00() {
        StockItem stockItem0 = new StockItem(Long.valueOf(-1L), "name", "desc", -969.36, 1);
        assertEquals("name", stockItem0.getName());
        assertEquals((-969.36), stockItem0.getPrice(), 0.01);
        assertEquals(1, stockItem0.getQuantity());
    }

    @Test
    public void test01() {
        StockItem stockItem0 = new StockItem();
        assertEquals(0, stockItem0.getQuantity());
    }

    @Test
    public void test02() {
        StockItem stockItem0 = new StockItem(899L, "", "}", 899L, 204);
        stockItem0.setId(899L);
        assertEquals("}", stockItem0.getDescription());
        assertEquals(204, stockItem0.getQuantity());
        assertEquals((double) 899L, stockItem0.getPrice(), 0.01);
    }

    @Test
    public void test03() {
        StockItem stockItem0 = new StockItem(899L, "", "}", 899L, 204);
        assertEquals(Long.valueOf(899L), stockItem0.getId());
    }

    @Test
    public void test04() {
        StockItem stockItem0 = new StockItem(899L, "", "}", 899L, 204);
        stockItem0.setQuantity(0);
        assertEquals(0, stockItem0.getQuantity());
    }

    @Test
    public void test05() {
        StockItem stockItem0 = new StockItem(899L, "", "}", 899L, 204);
        stockItem0.setName("}");
        assertEquals("}", stockItem0.getName());
    }

    @Test
    public void test06() {
        StockItem stockItem0 = new StockItem();
        assertEquals(0.0, stockItem0.getPrice(), 0.01);
    }

    @Test
    public void test07() {
        StockItem stockItem0 = new StockItem(899L, "", "}", 899L, 204);
        assertEquals("}", stockItem0.getDescription());
    }

    @Test
    public void test08() {
        StockItem stockItem0 = new StockItem(899L, "", "}", 899L, 204);
        stockItem0.setPrice(899L);
        assertEquals((double) 899L, stockItem0.getPrice(), 0.01);
    }

    @Test
    public void test09() {
        StockItem stockItem0 = new StockItem();
        assertEquals("StockItem{id=null, name='null'}", stockItem0.toString());
    }

    @Test
    public void test10() {
        StockItem stockItem0 = new StockItem();
        stockItem0.setDescription("");
        assertEquals("", stockItem0.getDescription());
    }
}
