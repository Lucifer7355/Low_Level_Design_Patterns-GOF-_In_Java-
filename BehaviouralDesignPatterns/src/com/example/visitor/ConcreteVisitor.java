package com.example.visitor;

class ConcreteVisitor implements Visitor {
    public void visit(Element1 element1) {
        System.out.println("Visited Element1");
    }

    public void visit(Element2 element2) {
        System.out.println("Visited Element2");
    }
}
