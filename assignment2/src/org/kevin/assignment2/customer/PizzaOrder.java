package org.kevin.assignment2.customer;

import org.kevin.assignment2.pizza.Pizza;

public class PizzaOrder {

    private Pizza pizza;
    private int quantity;

    public PizzaOrder(Pizza pizza, int quantity) {
        this.pizza = pizza;
        this.quantity = quantity;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pizza.getUnitPrice() * quantity;
    }
}
