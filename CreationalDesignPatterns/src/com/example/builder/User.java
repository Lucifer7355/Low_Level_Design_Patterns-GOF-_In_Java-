package com.example.builder;

public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String email; // optional
    private final String phone; // optional
 
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }
 
   
 
    public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public int getAge() {
		return age;
	}



	public String getEmail() {
		return email;
	}



	public String getPhone() {
		return phone;
	}



	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phone;
 
        public UserBuilder() {
        }
        
        public UserBuilder lastName(String lastname) {
        	this.lastName = lastname;
        	return this;
        }
        
        public UserBuilder firstName(String firstname) {
        	this.firstName = firstname;
        	return this;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
 
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
 
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
 
        public User build() {
            return new User(this);
        }
    }
}