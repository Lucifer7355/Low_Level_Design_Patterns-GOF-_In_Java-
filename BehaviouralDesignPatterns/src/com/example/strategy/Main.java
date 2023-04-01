package com.example.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new AddOperation());
        context.executeStrategy(10, 5);

        context.setStrategy(new SubtractOperation());
        context.executeStrategy(10, 5);

        context.setStrategy(new MultiplyOperation());
        context.executeStrategy(10, 5);
    }
}
