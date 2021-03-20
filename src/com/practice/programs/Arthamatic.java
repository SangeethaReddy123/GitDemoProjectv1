package com.practice.programs;

public class Arthamatic
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 5, b = 0;
			int c = a / b;
			System.out.println("Result is" + c);
			
		} catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		
	}

}
