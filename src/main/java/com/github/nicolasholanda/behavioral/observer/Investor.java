package com.github.nicolasholanda.behavioral.observer;

/**
 * Observer interface representing an investor who gets notified of stock price changes.
 */
public interface Investor {
    /**
     * Updates the investor with the new stock price.
     *
     * @param price the updated stock price
     */
    void update(double price);
}
