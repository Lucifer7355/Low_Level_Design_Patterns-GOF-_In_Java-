package com.example.visitor;

class Element1 implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
