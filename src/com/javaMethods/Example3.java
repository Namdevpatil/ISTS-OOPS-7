package com.javaMethods;

//program entry/starting point
public class Example3 
{
	
	//custom method: sum of two numbers
	public static int getSum(int value1, int value2)
	{
		int sum = value1+value2;
		return sum;//return statement
	}

	//custom method: sub of two numbers
	public static String getSub(int value1, int value2)
	{
		int sub = value1-value2;
		int sum = Example3.getSum(200, 250);//calling getSum();
		return "Sub: "+sub+", "+"Sum: "+sum;
	}

	
	//main(): main method is entry point of java program execution.
	public static void main(String[] args) 
	{
		System.out.println(Example3.getSub(220, 190));
		
	}

}
