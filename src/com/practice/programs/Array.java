package com.practice.programs;

public class Array 
{

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[5];
			a[9] = 8;
		} catch (ArrayIndexOutOfBoundsException e)
		{
        System.out.println(e);
		}

	}
}
