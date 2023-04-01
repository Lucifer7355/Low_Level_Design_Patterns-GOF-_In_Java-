package com.example.composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape circle1 = new Circle();
	        Shape circle2 = new Circle();
	        Shape circle3 = new Circle();
	        Shape triangle = new Triangle();

	        Drawing drawing = new Drawing();
	        drawing.addShape(circle1);
	        drawing.addShape(circle2);
	        drawing.addShape(circle3);
	        drawing.addShape(triangle);

	        drawing.draw();
	}

}
