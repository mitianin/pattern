package com.company.chain.util;

public enum PizzaType {
    HAWAIIAN(20),
    PEPPERONI(22),
    CHEESE(15),
    MEAT(25),
    FRENCH(18);

    private int price;

    PizzaType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
