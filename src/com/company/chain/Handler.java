package com.company.chain;

public abstract class Handler {
    private Handler next;

    abstract void handle(PizzaOrder order);

    protected void next(PizzaOrder order){
        if (next != null) next.handle(order);
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return this;
    }
}
