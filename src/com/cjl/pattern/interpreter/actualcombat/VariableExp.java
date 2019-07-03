package com.cjl.pattern.interpreter.actualcombat;

public class VariableExp implements BooleanExp{
    private String booleanExp1;

    public VariableExp(String booleanExp1) {
        this.booleanExp1 = booleanExp1;
    }

    @Override
    public boolean Evaluate(Context context) {
        return context.LookUp(booleanExp1);
    }

    @Override
    public BooleanExp Replace(String var, BooleanExp exp) {
       if(var.equals(booleanExp1)){
           return exp.Copy();
       }else {
           return new VariableExp(booleanExp1);
       }
    }

    @Override
    public BooleanExp Copy() {
        return new VariableExp(booleanExp1);
    }
}
