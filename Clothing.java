package org.maktab.HW4.T2;

public abstract class Clothing {
    String name;
    Season season;
    long basePrice;
    private DiscountStrategy discountStrategy;

    public Clothing(String name, Season season, long basePrice){
        this.name = name;
        this.season = season;
        this.basePrice = basePrice;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;

    }

    public abstract long getPrice();
}
