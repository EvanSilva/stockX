package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Max implements Criteria{

    Criteria criteria;
    Criteria otherCriteria;

    public Max(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        List<Offer> offers = andCriteria.checkCriteria(item);
        return offers.
    }
}
