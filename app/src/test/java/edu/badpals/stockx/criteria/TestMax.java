import edu.badpals.stockx.criteria.Bids;
import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.criteria.Max;
import edu.badpals.stockx.criteria.Size;
import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMax {

    @Test
    public void checkCriteria_max_size_bid_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria size = new Size("13");
        Criteria bids = new Bids();
        Criteria max = new Max(size, bids);

        List<Offer> filteredSize = max.checkCriteria(sneaker);
        assertTrue(filteredSize.stream().allMatch(o -> o.size().equals("13")));
        assertTrue(filteredSize.stream().allMatch(o -> o instanceof Bid));
        assertEquals(900, filteredSize.get(0).value());
    }
}