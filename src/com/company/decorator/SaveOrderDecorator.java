package com.company.decorator;

import com.company.chain.PizzaOrder;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrderDecorator implements OrderFunction {
    private GetOrderInfo getOrderInfo;

    public SaveOrderDecorator(GetOrderInfo getOrderInfo) {
        this.getOrderInfo = getOrderInfo;
    }

    @Override
    public void doSmth(PizzaOrder order) {
        try(FileWriter fw = new FileWriter("decorator.txt")){
            fw.write("#" + order.getOrderId() +
                    " order:" + order.getPizzaType().name() + "_PIZZA" +
                    " price:" + order.getPizzaType().getPrice() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
