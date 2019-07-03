package com.cjl.pattern.interpreter.actualcombat;

public class AndExp implements BooleanExp{
    private BooleanExp booleanExp1;
    private BooleanExp booleanExp2;

    public AndExp(BooleanExp booleanExp1, BooleanExp booleanExp2) {
        this.booleanExp1 = booleanExp1;
        this.booleanExp2 = booleanExp2;
    }

    @Override
    public boolean Evaluate(Context context) {
        return booleanExp1.Evaluate(context) && booleanExp2.Evaluate(context);
    }

    @Override
    public BooleanExp Replace(String var, BooleanExp exp) {
        return new AndExp(booleanExp1.Replace(var,exp),booleanExp2.Replace(var, exp));
    }

    @Override
    public BooleanExp Copy() {
        return new AndExp(booleanExp1.Copy(),booleanExp2.Copy());
    }
}
