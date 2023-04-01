package com.example.abstractfactory;

public class Main {

	public static void main(String[] args) {
		 FurnitureFactory factory = new VictorianFurnitureFactory();

	        Chair chair = factory.createChair();
	        Sofa sofa = factory.createSofa();

	        chair.sitOn();
	        sofa.sitOn();
	}

}
