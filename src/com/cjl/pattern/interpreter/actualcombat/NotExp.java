package com.cjl.pattern.interpreter.actualcombat;

public class NotExp implements BooleanExp{
    private BooleanExp booleanExp1;

    public NotExp(BooleanExp booleanExp1) {
        this.booleanExp1 = booleanExp1;
    }

    @Override
    public boolean Evaluate(Context context) {
        return !booleanExp1.Evaluate(context);
    }

    @Override
    public BooleanExp Replace(String var, BooleanExp exp) {
        return new NotExp(booleanExp1.Replace(var,exp));
    }

    @Override
    public BooleanExp Copy() {
        return new NotExp(booleanExp1.Copy());
    }
}
