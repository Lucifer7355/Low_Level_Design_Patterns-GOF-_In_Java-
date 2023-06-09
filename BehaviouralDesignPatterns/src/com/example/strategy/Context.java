package com.example.strategy;

public class Context {
    private Strategy strategy;
public Context() {}

public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2) {
        int result = strategy.doOperation(num1, num2);
        System.out.println("Result: " + result);
    }
}

