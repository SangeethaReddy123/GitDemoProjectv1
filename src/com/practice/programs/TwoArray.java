package com.practice.programs;

import java.util.Scanner;

public class TwoArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value::");
		int[] a = new int[10];
		int[] b = new int[10];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = b.length - 1; i >= 0; i--) 
		{
			b[i] = a[j];
			j++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(b[i]);
		}

	}

}
