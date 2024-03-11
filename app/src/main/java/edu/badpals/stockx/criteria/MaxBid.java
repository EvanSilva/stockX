package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class MaxBid implements Criteria {

    public MaxBid() {
    }

    public List<Offer> checkCriteria(Item item) {
        Bids bids = new Bids();
        List<Offer> bidsList = bids.checkCriteria(item);
        List<Offer> maxBid = new ArrayList<Offer>();
        maxBid.add(bidsList.get(0));
        return maxBid;
    }
}
