package com.github.nicolasholanda.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of a Stock that tracks its price and notifies investors.
 */
public class ConcreteStock implements Stock {
    private double price;
    private List<Investor> investors = new ArrayList<>();

    /**
     * Adds an investor to the stock's subscriber list.
     *
     * @param investor the investor to add
     */
    @Override
    public void attach(Investor investor) {
        investors.add(investor);
    }

    /**
     * Removes an investor from the stock's subscriber list.
     *
     * @param investor the investor to remove
     */
    @Override
    public void detach(Investor investor) {
        investors.remove(investor);
    }

    /**
     * Notifies all investors of a stock price change.
     */
    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(price);
        }
    }

    /**
     * Updates the stock price and notifies investors.
     *
     * @param price the new stock price
     */
    @Override
    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    /**
     * Retrieves the current stock price.
     *
     * @return the stock price
     */
    public double getPrice() {
        return price;
    }
}