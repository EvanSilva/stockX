/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.badpals.stockx.item;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SneakerTest {
    @Test
    void Sneaker() {
        Sneaker zapa = new Sneaker("Adidas", "ElEbano");
        assertEquals("Adidas", zapa.getStyle());
        assertEquals("ElEbano", zapa.getName());
    }
}
