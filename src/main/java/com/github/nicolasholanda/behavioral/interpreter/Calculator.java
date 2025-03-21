package com.github.nicolasholanda.behavioral.interpreter;

public class Calculator {
    public static void main(String[] args) {
        // Constructing the expression: (5 + 3) - 2
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression addition = new AddExpression(five, three); // (5 + 3)
        Expression subtraction = new SubtractExpression(addition, two); // (5 + 3) - 2

        System.out.println("Result: " + subtraction.interpret()); // Output: 6
    }
}
