package com.java.basics;

public class ConstructorExample {
	public ConstructorExample() {
		System.out.println("It is constructor method");
	}
	
	public static void main(String[] args) {
		ConstructorExample ce= new ConstructorExample();
		System.out.println("It is main Method");
	}
}
