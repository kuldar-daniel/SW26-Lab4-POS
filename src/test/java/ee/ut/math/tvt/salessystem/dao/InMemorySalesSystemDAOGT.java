package ee.ut.math.tvt.salessystem.dao;

import static org.junit.Assert.*;
import org.junit.Test;

import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

public class InMemorySalesSystemDAOGT {

    @Test
    public void test0() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        dao.saveStockItem(new StockItem(0L, "", "", 0L, -1));
        StockItem found = dao.findStockItem(0L);
        assertNotNull(found);
        assertEquals(-1, found.getQuantity());
    }

    @Test
    public void test1() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        assertNull(dao.findStockItem(0L));
    }

    @Test
    public void test2() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        assertEquals(4, dao.findStockItems().size());
    }

    @Test
    public void test3() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        dao.commitTransaction();
    }

    @Test
    public void test4() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        dao.saveSoldItem(new SoldItem());
    }

    @Test
    public void test5() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        dao.rollbackTransaction();
    }

    @Test
    public void test6() {
        InMemorySalesSystemDAO dao = new InMemorySalesSystemDAO();
        dao.beginTransaction();
    }
}
