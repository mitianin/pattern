package com.company.decorator;

import com.company.chain.PizzaOrder;

public class GetOrderInfo implements OrderFunction {
    @Override
    public void doSmth(PizzaOrder order) {
        System.out.println(order);
    }
}
