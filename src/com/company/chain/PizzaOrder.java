package com.company.chain;

import com.company.chain.util.PizzaType;


public class PizzaOrder {
    private int orderId;
    private PizzaType pizzaType;

    public PizzaOrder() {
    }

    public PizzaOrder(int orderId, PizzaType pizzaType) {
        this.orderId = orderId;
        this.pizzaType = pizzaType;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getOrderId() {
        return orderId;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "orderId=" + orderId +
                ", pizzaType=" + pizzaType +
                '}';
    }
}
