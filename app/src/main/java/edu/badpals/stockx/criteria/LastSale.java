package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastSale implements Criteria{

    public LastSale () {

    }

    public List<Offer> checkCriteria(Item item) {
        Sales sales = new Sales();
        List<Offer> allSales = sales.checkCriteria(item);
        int sizeSales = allSales.size();
        List<Offer> lastOnSale = Arrays.asList(allSales.get(sizeSales -1));
        return lastOnSale;
    }



}
