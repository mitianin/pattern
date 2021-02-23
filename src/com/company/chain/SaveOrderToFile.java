package com.company.chain;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrderToFile extends Handler {

    @Override
    void handle(PizzaOrder order) {
        try(FileWriter fw = new FileWriter("orders.txt", true)){
            fw.write("#" + order.getOrderId() +
                    " order:" + order.getPizzaType().name() + "_PIZZA" +
                    " price:" + order.getPizzaType().getPrice() + "\n");
            next(order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
