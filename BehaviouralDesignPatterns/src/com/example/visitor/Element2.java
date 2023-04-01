package com.example.visitor;

class Element2 implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
