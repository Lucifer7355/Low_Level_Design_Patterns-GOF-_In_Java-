package com.example.bridge;

public class DrawCircleRed implements DrawAPI {

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]";
    }
}