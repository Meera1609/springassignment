package com.ob.springques5;

public class Dog implements Pet{

	@Override
	public String petType() {
		// TODO Auto-generated method stub
		System.out.println("type- dog");
		return null;
	}

	@Override
	public String petName() {
		// TODO Auto-generated method stub
		System.out.println("name-tommy");
		return null;
	}

}
