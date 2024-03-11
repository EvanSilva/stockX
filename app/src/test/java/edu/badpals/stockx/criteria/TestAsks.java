package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Sneaker;
import org.junit.jupiter.api.Test;
import edu.badpals.stockx.item.Offer;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestAsks {

    @Test
    void testAsks(){

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Ask("5.5", 550));
        sneaker.add(new Ask("4.5", 480));
        sneaker.add(new Ask("5.5", 900));
        sneaker.add(new Ask("6", 472));

        Criteria bids = new Asks();

        List<Offer> filteredBids = bids.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(b -> b instanceof Ask));

        assertEquals(472, filteredBids.get(0).value());


    }


}