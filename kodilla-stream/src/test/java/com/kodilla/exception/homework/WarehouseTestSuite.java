package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test (expected = OrderDoesntExistException.class)
    public void testGetOrder() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order getOrder = warehouse.getOrder("A20");
        //then
        assertEquals(getOrder,warehouse);
    }

}