package com.cjl.pattern.interpreter.actualcombat;

public interface BooleanExp {
    boolean Evaluate(Context context);
    BooleanExp Replace(String var, BooleanExp exp);
    BooleanExp Copy();
}
