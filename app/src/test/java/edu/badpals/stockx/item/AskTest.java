package edu.badpals.stockx.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AskTest {

    class askTest {

        @Test
        void Ask() {
            Ask peticion = new Ask("20", 2000);
            assertEquals("20", peticion.size);
            assertEquals(2000, peticion.value());
        }
    }

}
