package com.company.chain;

import com.company.chain.util.OrderId;
import com.company.chain.util.PizzaType;

public class Main {
    public static void main(String[] args) {
        OrderId orderId = new OrderId();

        Handler chain = new OrderDataHandler()
                .setNext(new SaveOrderToFile()
                        .setNext(new SuccessOrderInfo()));

        for (int i = 0; i < 10; i++) {
            for (PizzaType value : PizzaType.values()) {
                chain.handle(new PizzaOrder(orderId.getId(), value));
            }
        }
    }
}
