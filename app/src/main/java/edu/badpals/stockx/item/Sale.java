package edu.badpals.stockx.item;

public class Sale implements Offer {

    public String size = "";
    public Integer price = 0;

    public Sale (String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.price.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
