package edu.badpals.stockx.item;

public class Ask implements Offer {

    String size = "";
    Integer ask = 0;

    public Ask (String size,Integer ask) {
    }
    @Override
    public String size() {
        return null;
    }
    @Override
    public int value() {
        return 0;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.ask.compareTo(value());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
