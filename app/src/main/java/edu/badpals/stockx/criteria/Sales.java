package edu.badpals.stockx.criteria;
import edu.badpals.stockx.item.Sale;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sales implements Criteria{

    public  Sales() { }

    public List<Offer> checkCriteria(Item item) {
        List<Offer> sales = new ArrayList<Offer>();
        for (Offer offer : item.offers())
            if(offer instanceof Sale) {
                sales.add(offer);
            } else {
                continue;
            }
        return sales;
    }
}