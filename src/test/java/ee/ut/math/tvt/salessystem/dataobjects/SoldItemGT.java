package ee.ut.math.tvt.salessystem.dataobjects;

import static org.junit.Assert.*;
import org.junit.Test;

public class SoldItemGT {

    @Test
    public void test00() {
        SoldItem soldItem0 = new SoldItem();
        soldItem0.setPrice(0.0);
        assertEquals(0.0, soldItem0.getPrice(), 0.01);
    }

    @Test(expected = NullPointerException.class)
    public void test01() {
        SoldItem soldItem0 = new SoldItem();
        soldItem0.getSum();
    }

    @Test
    public void test02() {
        SoldItem soldItem0 = new SoldItem();
        soldItem0.setQuantity(Integer.valueOf(-3567));
        assertEquals(Integer.valueOf(-3567), soldItem0.getQuantity());
    }

    @Test
    public void test03() {
        SoldItem soldItem0 = new SoldItem();
        assertEquals("SoldItem{id=null, name='null'}", soldItem0.toString());
    }

    @Test
    public void test04() {
        SoldItem soldItem0 = new SoldItem();
        soldItem0.setStockItem(new StockItem());
        assertNotNull(soldItem0.getStockItem());
    }

    @Test
    public void test05() {
        SoldItem soldItem0 = new SoldItem();
        assertNull(soldItem0.getStockItem());
    }

    @Test
    public void test06() {
        SoldItem soldItem0 = new SoldItem(new StockItem(), 1362);
        assertEquals(Integer.valueOf(1362), soldItem0.getQuantity());
    }

    @Test
    public void test07() {
        SoldItem soldItem0 = new SoldItem(new StockItem(), 389);
        assertNull(soldItem0.getId());
    }

    @Test
    public void test08() {
        SoldItem soldItem0 = new SoldItem();
        assertNull(soldItem0.getName());
    }

    @Test
    public void test09() {
        SoldItem soldItem0 = new SoldItem();
        soldItem0.setName(null);
        assertNull(soldItem0.getName());
    }

    @Test
    public void test10() {
        SoldItem soldItem0 = new SoldItem();
        soldItem0.setId(Long.valueOf(0L));
        assertEquals(Long.valueOf(0L), soldItem0.getId());
    }

    @Test
    public void test11() {
        SoldItem soldItem0 = new SoldItem();
        assertEquals(0.0, soldItem0.getPrice(), 0.01);
    }
}
