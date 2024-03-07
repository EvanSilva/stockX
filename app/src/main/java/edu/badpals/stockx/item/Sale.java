package edu.badpals.stockx.item;

public class Sale extends Offer {

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
    public int compareTo(Offer oferta) {
        return 0;
    }
// ¿?
    @Override
    public String toString() {
        return super.toString();
    }
}
