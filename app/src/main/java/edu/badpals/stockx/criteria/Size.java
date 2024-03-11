package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class Size implements Criteria {

    private String size = "";

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> rightSizes = new ArrayList<Offer>();
        for (Offer offer: item.offers())
            if (offer.size() == this.size) {
                rightSizes.add(offer);
            } else{
                continue;
            }
        return rightSizes;

    }
}
