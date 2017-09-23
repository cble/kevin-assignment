package org.kevin.assignment2.customer;

public class Customer {

    private String name;
    private PizzaOrder[] pizzaOrders;

    public Customer(String name, PizzaOrder[] pizzaOrders) {
        this.name = name;
        this.pizzaOrders = pizzaOrders;
    }

    public String getName() {
        return name;
    }

    public PizzaOrder[] getPizzaOrders() {
        return pizzaOrders;
    }

    public double getTotalPrice() {
        double result = 0;
        if (pizzaOrders != null) {
            for (PizzaOrder pizzaOrder : pizzaOrders) {
                result += pizzaOrder.getTotalPrice();
            }
        }
        return result;
    }
}
