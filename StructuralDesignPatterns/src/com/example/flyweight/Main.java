package com.example.flyweight;

public class Main {
	public static void main(String[] args) {
	      Flyweight flyweight = FlyweightFactory.getFlyweight("key");
	      flyweight.operation();
	   }
}
