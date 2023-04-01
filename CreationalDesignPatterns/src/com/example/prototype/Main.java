package com.example.prototype;

public class Main {
	public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype(1);
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();

        System.out.println("Prototype 1: " + prototype1.getX());
        System.out.println("Prototype 2: " + prototype2.getX());
    }
}
