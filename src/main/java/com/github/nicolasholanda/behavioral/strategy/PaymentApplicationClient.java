package com.github.nicolasholanda.behavioral.strategy;

public class PaymentApplicationClient {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Use credit card payment
        processor.setStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        processor.processPayment(100.00);

        // Switch to PayPal payment
        processor.setStrategy(new PayPalPayment("user@example.com"));
        processor.processPayment(50.00);

        // Switch to cryptocurrency payment
        processor.setStrategy(new CryptoPayment("1A2B3C4D5E6F"));
        processor.processPayment(200.00);
    }
}
