package com.javaSuperKeyword;

public class Example2 extends Example1
{	
	int id;
	String name;

	public Example2() {
		id = 300;
		name = "Example2";
	}
	
	public void getEmployeeDetails()
	{
		System.out.println(super.id);
		System.out.println(super.name);
	}
	

}
