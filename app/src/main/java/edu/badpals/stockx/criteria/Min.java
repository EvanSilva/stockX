package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;
import java.util.Optional;

public class Min implements Criteria{

    Criteria criteria;
    Criteria otherCriteria;

    public Min(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item sneaker) {

        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(sneaker)
                .stream()
                .min(Offer::compareTo);
        // Effective java, Item 54: Return empty collections or arrays, not nulls
        return offer.isPresent()? List.of(offer.get()) : List.of();
    }
}