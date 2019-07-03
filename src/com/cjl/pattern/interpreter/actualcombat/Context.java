package com.cjl.pattern.interpreter.actualcombat;

import java.util.Hashtable;

public class Context {
    private Hashtable<String, Boolean> context = new Hashtable<String, Boolean>();

    public void Assign(String name, boolean val) {
        context.put(name, new Boolean(val));
    }

    public boolean LookUp(String name) {
        return ((Boolean)context.get(name)).booleanValue();
    }

    public Context() {
    }
}
