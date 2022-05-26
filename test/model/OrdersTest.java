/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Eechang
 */
public class OrdersTest {

    public OrdersTest() {
    }

    @BeforeAll
    public void setUpClass() {
        Orders orders = new Orders();
        orders.setPhone("91234567");
        orders.setQuantity(1);
        orders.setAllergy("");
        orders.setTableNumber("1");
        orders.setDate("2022-05-26");
        orders.setTotal(Float.parseFloat("13.00"));
        orders.setCreatedBy("91234567");
        orders.setDiscount(Float.parseFloat("0.00"));
        orders.setGrandTotal(Float.parseFloat("13.00"));
        Orders.save(orders);
    }

    @Test
    public void setStatusFulfill() {
        Orders order = new Orders();
        order.setId(16);
        order.fulfillOrder(order);
    }

    @Test
    public void setStatusUnfulfill() {
        Orders order = new Orders();
        order.setId(16);
        order.unfulfillOrder(order);
    }

    @Test
    public void setStatusCancel() {
        Orders order = new Orders();
        order.setId(16);
        order.cancelOrder(order);
    }

    @Test
    public void getTestFulfilledStatus() {
        setStatusFulfill();
        Orders order = new Orders();
        order.getOrdStatus(16);
        assertEquals("Fulfilled", order.getStatus());
    }
    
    @Test
    public void getTestUnfulfilledStatus() {
        setStatusUnfulfill();
        Orders order = new Orders();
        order.getOrdStatus(16);
        assertEquals("Unfulfilled", order.getStatus());
    }
    
    @Test
    public void getTestCancelStatus() {
        setStatusCancel();
        Orders order = new Orders();
        order.getOrdStatus(16);
        assertEquals("Cancelled", order.getStatus());
    }
}