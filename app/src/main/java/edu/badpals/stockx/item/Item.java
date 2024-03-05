package edu.badpals.stockx.item;

public interface Item {

    public int getBid();

    public int getAsk();

    public int getSale();

//    public void add(Offer offer);
    public void setBid(int bid);

//    public List<Offer> offers();

    public void setAsk(int ask);

    public void setSale(int sale);

    public String toString();

}
