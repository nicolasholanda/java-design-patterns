package com.github.nicolasholanda.behavioral.strategy;

/**
 * Concrete strategy for processing payments via credit card.
 */
public class CreditCardPayment implements PaymentStrategy {
    
    private String cardNumber;

    /**
     * Constructs a CreditCardPayment strategy with the given card number.
     *
     * @param cardNumber the credit card number
     */
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

