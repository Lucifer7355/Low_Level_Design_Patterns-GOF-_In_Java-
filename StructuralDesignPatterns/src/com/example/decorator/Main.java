package com.example.decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
