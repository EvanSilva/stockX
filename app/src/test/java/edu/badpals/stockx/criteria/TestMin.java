package edu.pingpong.stockx.criteria;

import edu.badpals.stockx.criteria.Asks;
import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.criteria.Min;
import edu.badpals.stockx.criteria.Size;
import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMin {

    @Test
    public void testMin() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria size = new Size("13");
        Criteria bids = new Asks();
        Criteria max = new Min(size, bids);

        List<Offer> filteredSize = max.checkCriteria(sneaker);
        assertTrue(filteredSize.stream().allMatch(o -> o.size().equals("13")));
        assertTrue(filteredSize.stream().allMatch(o -> o instanceof Ask));
        assertEquals(333, filteredSize.get(0).value());
    }
}