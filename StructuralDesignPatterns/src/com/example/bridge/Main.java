package com.example.bridge;

public class Main {
	public static void main(String[] args) {
        ShapeCreate redCircle = new Circle(100,100, 10, new DrawCircleRed());
        ShapeCreate greenCircle = new Circle(100,100, 10, new DrawCircleGreen());

        System.out.println(redCircle.draw());
        System.out.println(greenCircle.draw());
    }
}
