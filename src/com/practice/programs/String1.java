package com.practice.programs;

public class String1 
{

	public static void main(java.lang.String[] args)
	{
		try {

			String a = "This is Sangeetha";
			char c = a.charAt(22);
			System.out.println(c);

		} catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		System.out.println("Sangeetha");
		System.out.println(4);

	}
}
