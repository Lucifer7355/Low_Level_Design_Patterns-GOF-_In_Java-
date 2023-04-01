package com.example.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User.UserBuilder()
                .age(30)
                .email("john.doe@example.com")
                .phone("1234567890").firstName("John").lastName("Doe")
                .build();
		System.out.println(user);

	}

}
