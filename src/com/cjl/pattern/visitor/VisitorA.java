package com.cjl.pattern.visitor;

public class VisitorA implements Visitor{
    @Override
    public void visit(NodeA nodeA) {
        System.out.println("VisitorA.visit"+nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println("VisitorA.visit"+nodeB.operationB());
    }
}
