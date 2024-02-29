package com.javaPrivateAccessModifier;

class Example2 extends Example1
{
	
	
	public String getEmployeeName()
	{
		return employeeName;//The field Example1.employeeName is not visible
	}
	

}
