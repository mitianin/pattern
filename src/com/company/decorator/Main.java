package com.company.decorator;

import com.company.chain.PizzaOrder;
import com.company.chain.util.PizzaType;

public class Main {
    public static void main(String[] args) {

        OrderFunction o = new GetOrderInfo();
        o.doSmth(new PizzaOrder(32,PizzaType.MEAT));
        OrderFunction orderFunction = new SaveOrderDecorator(new GetOrderInfo());
        orderFunction.doSmth(new PizzaOrder(21, PizzaType.HAWAIIAN));

        orderFunction = new CheckOrderDecorator(new GetOrderInfo());
        orderFunction.doSmth(new PizzaOrder(32, PizzaType.CHEESE));
    }

}
