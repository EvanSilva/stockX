package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestMaxBid {

    @Test
    void testMaxBid(){

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));

        sneaker.add(new Sale("5.5", 500));
        sneaker.add(new Sale("4.5", 430));
        sneaker.add(new Sale("5.5", 700));
        sneaker.add(new Sale("6", 672));

        sneaker.add(new Ask("5.5", 500));
        sneaker.add(new Ask("4.5", 430));
        sneaker.add(new Ask("5.5", 700));
        sneaker.add(new Ask("6", 672));

        Criteria maximunBid = new MaxBid();

        List<Offer> filteredBids = maximunBid.checkCriteria(sneaker);
        assertEquals(900, filteredBids.get(0).value());


    }


}