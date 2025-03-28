package com.github.nicolasholanda.behavioral.strategy;

/**
 * Strategy interface for different payment methods.
 */
public interface PaymentStrategy {
    /**
     * Processes the payment with a given amount.
     *
     * @param amount the amount to be paid
     */
    void pay(double amount);
}

