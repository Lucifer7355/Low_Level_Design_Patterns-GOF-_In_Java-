package com.example.proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Internet internet = new ProxyInternet();
	        try {
	            internet.connectTo("google.com");
	            internet.connectTo("abc.com");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}

}
