package com.javaSuperKeyword;

public class Example1 
{
	
	//fields
	int id = 890;	
	String name;
	
	public Example1() {
		id = 889;
		name = "Example1";
	}
	
	
	
	public Example1(int id, String name) {
		this.id = id;
		this.name = name;
	}



	//method
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	

}
