package org.solver.expression;

public class AddExp extends Expression {

    private final Expression lVal;

    private final Expression rVal;

    public AddExp(Expression lExp, Expression rExp) {
        this.lVal = lExp;
        this.rVal = rExp;
    }

    @Override
    public int len() {
        return lVal.len() + rVal.len() + 1;
    }

    @Override
    public int getVal() {
        return lVal.getVal() + rVal.getVal();
    }

    @Override
    public String toString() {
        return lVal.toString() + "+" + rVal.toString();
    }
}
