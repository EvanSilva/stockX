package edu.badpals.stockx.item;


public class Sneaker implements Item{

    private String style = " ";
    private String name = " ";
    private int ask = 0;
    private int bid = 0;
    private int sale = 0;

    public Sneaker (String style, String name) {
        this.style = style;
        this.name = name;
    }
    public String getStyle() {
        return this.style;
     }

    public String getName() {
        return this.name;
    }

/**
    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void add(Offer offer) {
    }

    @Override
    public void setBid(int bid) {
    }

    @Override
    public List<Offer> offers() {
        return null;
    }

    @Override
    public void setAsk(int ask) {

    }
    @Override
    public void setSale(int sale) {

    }

*/
}
