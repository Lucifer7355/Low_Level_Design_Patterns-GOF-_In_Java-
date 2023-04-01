package com.example.visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Element1());
        objectStructure.attach(new Element2());

        ConcreteVisitor visitor = new ConcreteVisitor();
        objectStructure.accept(visitor);
    }
}