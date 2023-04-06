package com.ob.springques5;

public class Cat implements Pet {

	@Override
	public String petType() {
		// TODO Auto-generated method stub
		System.out.println("type-cat");
		return null;
	}

	@Override
	public String petName() {
		// TODO Auto-generated method stub
		System.out.println("name - meow");
		return null;
	}

}
