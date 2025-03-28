package com.github.nicolasholanda.behavioral.strategy;

/**
 * Context class that uses a payment strategy to process payments.
 */
public class PaymentProcessor {
    
    private PaymentStrategy strategy;

    /**
     * Sets the payment strategy dynamically at runtime.
     *
     * @param strategy the payment strategy to use
     */
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Processes a payment using the current payment strategy.
     *
     * @param amount the amount to be paid
     */
    public void processPayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy is not set.");
        }
        strategy.pay(amount);
    }
}
