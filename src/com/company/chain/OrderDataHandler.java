package com.company.chain;

public class OrderDataHandler extends Handler{

    @Override
    void handle(PizzaOrder order) {
        if (order.getOrderId() == 0 || order.getPizzaType() == null) {
            System.out.println("Invalid order data");
        } else {
            next(order);
        }
    }


}
