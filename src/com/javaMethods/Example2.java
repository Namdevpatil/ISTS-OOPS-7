package com.javaMethods;

//program entry/starting point
public class Example2 
{
	//custom method: sum of two numbers
	public static int getSum(int value1, int value2)
	{
		int sum = value1+value2;
		return sum;//return statement
	}

	//custom method: sub of two numbers
	public static int getSub(int value1, int value2)
	{
		int sub = value1-value2;
		return sub;//return statement
	}

	//custom method: sum of two numbers
	public static void getDiv()
	{
		int value1 = 1000, value2 = 200;
		int div = value1/value2;
		System.out.println(div);
	}

	//main(): main method is entry point of java program execution.
	public static void main(String[] args) 
	{
		System.out.println(Example2.getSub(100, 200));//100 and 200 are arguments/values to value1 and value2 parameters
		System.out.println(Example2.getSub(700, 200));//100 and 200 are arguments/values to value1 and value2 parameters
	
		System.out.println("======================================================");
		
		Example2.getDiv();
		
		System.out.println("======================================================");
		
		int sum = Example2.getSum(100, 590);
		System.out.println(sum);//
		
	}

}
