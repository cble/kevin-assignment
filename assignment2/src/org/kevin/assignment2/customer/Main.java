package org.kevin.assignment2.customer;

import org.kevin.assignment2.pizza.Pizza;

public class Main {

    public static void main(String[] args) {
        // initialize pizza entities
        Pizza chickenPizza = new Pizza("chicken", 5);
        Pizza beefPizza = new Pizza("beef", 8);
        Pizza seafoodPizza = new Pizza("seafood", 10);

        /** Test Case 1 */
        // initialize pizzaOrder entities
        PizzaOrder[] pizzaOrders1 = new PizzaOrder[3];
        pizzaOrders1[0] = new PizzaOrder(chickenPizza, 2);
        pizzaOrders1[1] = new PizzaOrder(beefPizza, 1);
        pizzaOrders1[2] = new PizzaOrder(seafoodPizza, 1);
        // initialize customer entity
        Customer kevin = new Customer("kevin", pizzaOrders1);
        System.out.println(kevin.getTotalPrice());


        /** Test Case 2 */
        // another way to initialize an array
        PizzaOrder[] pizzaOrders2 = new PizzaOrder[] {
                new PizzaOrder(chickenPizza, 1),
                new PizzaOrder(seafoodPizza, 1)
        };
        // initialize customer entity
        Customer jj = new Customer("JJ", pizzaOrders2);
        System.out.println(jj.getTotalPrice());
    }
}
