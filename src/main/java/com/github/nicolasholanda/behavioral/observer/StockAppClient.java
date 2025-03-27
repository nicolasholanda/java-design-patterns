package com.github.nicolasholanda.behavioral.observer;

public class StockAppClient {

    public static void main(String[] args) {
        ConcreteStock stock = new ConcreteStock();

        Investor investor1 = new ConcreteInvestor("Alice");
        Investor investor2 = new ConcreteInvestor("Bob");

        stock.attach(investor1);
        stock.attach(investor2);

        System.out.println("Setting stock price to $100.0");
        stock.setPrice(100.0);

        System.out.println("Setting stock price to $105.5");
        stock.setPrice(105.5);

        stock.detach(investor1);

        System.out.println("Setting stock price to $110.0");
        stock.setPrice(110.0);
    }
}
