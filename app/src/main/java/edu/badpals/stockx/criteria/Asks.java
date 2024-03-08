package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asks implements Criteria{

    public  Asks() { }

    public List<Offer> checkCriteria(Item item) {
        List<Offer> asks = new ArrayList<Offer>();
        for (Offer offer : item.offers())
            if(offer instanceof Ask) {
                asks.add(offer);
            } else {
                continue;
            }
        Collections.sort(asks);
        return asks;
    }
}