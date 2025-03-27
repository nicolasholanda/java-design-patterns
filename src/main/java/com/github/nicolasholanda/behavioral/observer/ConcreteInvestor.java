package com.github.nicolasholanda.behavioral.observer;

/**
 * Concrete implementation of an Investor that receives stock price updates.
 */
public class ConcreteInvestor implements Investor {
    private String name;

    /**
     * Constructs a ConcreteInvestor with a name.
     *
     * @param name the name of the investor
     */
    public ConcreteInvestor(String name) {
        this.name = name;
    }

    /**
     * Receives a stock price update and prints the notification.
     *
     * @param price the updated stock price
     */
    @Override
    public void update(double price) {
        System.out.println(name + " received stock price update: $" + price);
    }
}

