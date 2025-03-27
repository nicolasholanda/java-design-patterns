package com.github.nicolasholanda.behavioral.observer;

/**
 * Subject interface representing a stock that investors can subscribe to.
 */
public interface Stock {
    /**
     * Adds an investor to the list of subscribers.
     *
     * @param investor the investor to add
     */
    void attach(Investor investor);

    /**
     * Removes an investor from the list of subscribers.
     *
     * @param investor the investor to remove
     */
    void detach(Investor investor);

    /**
     * Notifies all subscribed investors of a stock price change.
     */
    void notifyInvestors();

    /**
     * Sets the stock price and triggers investor notifications.
     *
     * @param price the new stock price
     */
    void setPrice(double price);
}

