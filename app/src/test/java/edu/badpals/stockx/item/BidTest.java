package edu.badpals.stockx.item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BidTest {

    class bidTest {

        @Test
        void Bid() {
            Bid apuesta = new Bid("10", 200);
            assertEquals("10", apuesta.size);
            assertEquals(200, apuesta.value());
        }
    }

}
