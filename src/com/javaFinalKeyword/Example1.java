package com.javaFinalKeyword;

//3. final keyword with class: cannot do inheritance
//public final class Example1 
public class Example1 
{
	
	//1. final keyword with fields: the value of the fields are not modifiable
	public final int employeeId = 890;
	//private String employeeName;
	String employeeName;
	
	public Example1() {
		//employeeId = 889;//The final field Example1.employeeId cannot be assigned
	}
	
	//method
	int getEmployeeId()
	{
		return employeeId;
	}
	
	//2. final keyword with methods: Cannot override
	//public final String getEmployeeName()
	public String getEmployeeName()
	{
		return employeeName;
	}
	

}
