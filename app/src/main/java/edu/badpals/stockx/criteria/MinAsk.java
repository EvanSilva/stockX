package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria {

    public MinAsk() {
    }


    public List<Offer> checkCriteria(Item item) {

        Asks asks = new Asks();
        List<Offer> asksList = asks.checkCriteria(item);
        List<Offer> minAsk = new ArrayList<Offer>();
        minAsk.add(asksList.get(0));
        return minAsk;

    }
}
