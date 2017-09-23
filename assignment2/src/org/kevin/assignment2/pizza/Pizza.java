package org.kevin.assignment2.pizza;

/**
 * 4. Write a java class called pizza with (Add detail as needed) :
 * i. Create at least 3 attributes :pizza type , unit price and loyalty points. More attributes are welcome to have.
 * ii. Create constructors . Extra-credit of 0.5 point if you write more than 1 right constructor to this class
 */
public class Pizza {

    private String type;
    private double unitPrice;
    private int loyaltyPoints;

    public Pizza(String type, double unitPrice, int loyaltyPoints) {
        this.type = type;
        this.unitPrice = unitPrice;
        this.loyaltyPoints = loyaltyPoints;
    }

    public Pizza(String type, double unitPrice) {
        this(type, unitPrice, 0);
    }

    public String getType() {
        return type;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
