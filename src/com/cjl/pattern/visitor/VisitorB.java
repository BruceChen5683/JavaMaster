package com.cjl.pattern.visitor;

public class VisitorB implements Visitor{
    @Override
    public void visit(NodeA nodeA) {
        System.out.println("VisitorB.visit"+nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println("VisitorB.visit"+nodeB.operationB());
    }
}
