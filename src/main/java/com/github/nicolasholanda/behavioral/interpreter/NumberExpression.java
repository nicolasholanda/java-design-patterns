package com.github.nicolasholanda.behavioral.interpreter;

/**
 * Terminal expression representing a number.
 */
public class NumberExpression implements Expression {
    private final int number;

    /**
     * Constructs a NumberExpression with a given integer value.
     *
     * @param number the value of the number
     */
    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}