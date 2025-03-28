package com.github.nicolasholanda.behavioral.strategy;

/**
 * Concrete strategy for processing payments via PayPal.
 */
public class PayPalPayment implements PaymentStrategy {
    
    private String email;

    /**
     * Constructs a PayPalPayment strategy with the given email.
     *
     * @param email the PayPal account email
     */
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}

