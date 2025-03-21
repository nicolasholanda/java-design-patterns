package com.github.nicolasholanda.behavioral.interpreter;

/**
 * Expression interface that defines an interpret method.
 */
public interface Expression {
    /**
     * Evaluates the expression and returns an integer result.
     *
     * @return evaluated result of the expression
     */
    int interpret();
}