package com.example.strategy;

public class AddOperation implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
