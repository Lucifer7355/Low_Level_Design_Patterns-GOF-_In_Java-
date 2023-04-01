package com.example.adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Adaptee adaptee = new Adaptee();
	        Target target = new Adapter(adaptee);
	        target.request();
	}

}
