package com.company.chain;

public class SuccessOrderInfo extends Handler {
    @Override
    void handle(PizzaOrder order) {
        System.out.println("Order is confirmed");
        System.out.println("Order info is - " + order.toString() + "\n");
        next(order);
    }
}
