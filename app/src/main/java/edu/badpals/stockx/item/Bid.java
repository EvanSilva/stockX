package edu.badpals.stockx.item;

public class Bid implements Offer {

    String size = "";
    Integer bid = 0;
    public Bid (String size, Integer bid) {
        this.bid = bid;
        this.size = size;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.bid.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n";
    }
}
