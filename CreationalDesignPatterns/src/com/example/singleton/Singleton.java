package com.example.singleton;

public class Singleton {
	
	private static Singleton obj=null;
	
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		synchronized (obj) {
			if(obj==null) {
				return new Singleton();
			}	
		}
		return obj;
	}
	 public void showMessage() {
	      System.out.println("Hello World!");
	   }
}
