package edu.badpals.stockx.item;

public class Bid implements Offer {

    String size = "";
    Integer bid = 0;
    public Bid (String size, Integer Bid) {
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
        return this.bid.compareTo(value());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
