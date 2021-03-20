package com.practice.programs;

public class Number
{

	public static void main(String[] args)
	{
		try
		{
			int num = Integer.parseInt("eenhjefg");
			System.out.println(num);
		} catch (NumberFormatException e) 
		{
           System.out.println(e);
		}

	}

}
