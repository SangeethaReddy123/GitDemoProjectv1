package com.practice.programs;

import java.util.Scanner;

public class Largest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers::");
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		int largest = a[0];
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > largest)
			{
				largest = a[i];

			}
			if (a[i] < smallest)
			{
				smallest = a[i];
			}
		}
		System.out.println("smallnumber is ::" + smallest + "largestNumber is :: " + largest);

	}

}
