package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class MaxBid implements Criteria {

    public MaxBid() {
    }

    public List<Offer> checkCriteria(Item item) {
        Bids bidCriteria = new Bids();
        List<Offer> bids = bidCriteria.checkCriteria(item);
        List<Offer> maxBid = new ArrayList<Offer>();
        if (!bids.isEmpty()) {
            maxBid.add(bids.get(0));
        } else {
            System.out.println("\n \t      Aun no hay Bids");
        }
        return maxBid;
    }
}
