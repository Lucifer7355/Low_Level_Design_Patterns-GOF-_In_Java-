package com.example.factory;

public class Main {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
    }
}