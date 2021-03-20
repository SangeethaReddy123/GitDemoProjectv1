package com.practice.programs;

import java.util.Scanner;

public class Program 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one by one eliments  of an array::");
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) 
		{
		
			a[i] = sc.nextInt();
		}
        System.out.println("Print one by one::");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println( a[i]);
		}
	}
}
