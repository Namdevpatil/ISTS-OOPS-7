package com.javaFinalKeyword;

//The type Example2 cannot subclass the final class Example1
public class Example2 extends Example1
{	
	
	//Cannot override the final method from Example1
	public String getEmployeeName()
	{
		return "Jayesh Kumar";
	}
	

}
