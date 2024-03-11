package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

    Criteria criteria;
    Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstFilter = criteria.checkCriteria(item);
        List<Offer> secondFilter = otherCriteria.checkCriteria(item);
        List<Offer> finalCriteria = new ArrayList<>();
        finalCriteria.addAll(firstFilter);
        finalCriteria.retainAll(secondFilter);
        return finalCriteria;

    }
}
