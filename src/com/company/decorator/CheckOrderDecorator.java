package com.company.decorator;

import com.company.chain.PizzaOrder;

public class CheckOrderDecorator implements OrderFunction {
    private GetOrderInfo getOrderInfo;

    public CheckOrderDecorator(GetOrderInfo getOrderInfo) {
        this.getOrderInfo = getOrderInfo;
    }

    @Override
    public void doSmth(PizzaOrder order) {
        if (order.getOrderId() != 0 && order.getPizzaType() != null)
            System.out.println("Order data is correct");
        else System.out.println("Invalid order data");
    }
}
