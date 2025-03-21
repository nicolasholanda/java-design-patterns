package com.github.nicolasholanda.behavioral.interpreter;

/**
 * Non-terminal expression for subtraction.
 */
class SubtractExpression implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Constructs a SubtractExpression with two subexpressions.
     *
     * @param left  the left-hand side expression
     * @param right the right-hand side expression
     */
    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}