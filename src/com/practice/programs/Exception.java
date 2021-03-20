package com.practice.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception 
{
	public static void main(String[] args)
	{

		int a = 0, b = 0;
		int result = 0;
		// Scanner sc=null;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a  ::");
			a = sc.nextInt();
			System.out.println("Enter b   ::");
			b = sc.nextInt();
			result = a / b;

		} catch (ArithmeticException ex) 
		{

			System.out.println(ex);
			sc.close();

		} catch (InputMismatchException ex) 
		{
			System.out.println(ex);
			sc.close();
		} finally 
		{

			System.out.println("Finally");
			System.gc();
			sc.close();
		}

		System.out.println(result);
		System.out.println("Sangeetha");
		System.out.println("Roopa");
		System.out.println(1);
		System.out.println(2);

	}
}