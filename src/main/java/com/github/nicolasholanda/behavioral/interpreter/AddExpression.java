package com.github.nicolasholanda.behavioral.interpreter;

/**
 * Non-terminal expression for addition.
 */
class AddExpression implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Constructs an AddExpression with two subexpressions.
     *
     * @param left  the left-hand side expression
     * @param right the right-hand side expression
     */
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}