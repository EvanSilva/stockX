package edu.badpals.stockx.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTest {

    @Test
    void sale(){
        Sale venta = new Sale("30",400);
        assertEquals("30", venta.size);
        assertEquals(400, venta.price);
    }

}
