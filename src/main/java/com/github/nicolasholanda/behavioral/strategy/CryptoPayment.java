package com.github.nicolasholanda.behavioral.strategy;

/**
 * Concrete strategy for processing payments via cryptocurrency.
 */
public class CryptoPayment implements PaymentStrategy {
    
    private String walletAddress;

    /**
     * Constructs a CryptoPayment strategy with the given wallet address.
     *
     * @param walletAddress the cryptocurrency wallet address
     */
    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Crypto Wallet: " + walletAddress);
    }
}