package com.practice.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {


		public static void main(String[] args) 
		{
			int a =0,b=0;
			//Scanner sc = new Scanner(System.in);
			Scanner sc = null;
			//Scanner sc =new Scanner(System.in);
			System.out.println("Enter a, b");
			int result = 0; 
			try
			{
				a = sc.nextInt();
				b = sc.nextInt();
				sc.close();
				result = a/b;
			}
			catch(InputMismatchException ex)
			{
				System.exit(0);
				System.out.println(ex);
				sc.close();
			}
			catch(ArithmeticException ex)
			{
				System.out.println(ex);
				sc.close();
			}
			finally
			{
				System.out.println("Finally");
				System.gc();
				sc.close();
			}
			System.out.println(result);
		}
	}


