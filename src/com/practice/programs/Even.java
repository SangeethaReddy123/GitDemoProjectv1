package com.practice.programs;

import java.util.Scanner;

public class Even 
{

	public static void main(String[] args) 
	{
		int pos = 0;
		int neg = 0;
		int zero = 0;
		int odd = 0;
		int even = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eliments::");
		int[] a = new int[20];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();

			if (a[i] > 0) 
			{
				pos++;
			} else if (a[i] < 0) 
			{
				neg++;
			} else 
			{
				zero++;
			}
			if (a[i] % 2 == 0) 
			{
				even++;

			} else 
			{
				odd++;
				
			}
			System.out.println("positive::"+pos+"negative::"+neg+"Zero::"+zero+"odd"+odd+"Even"+even);
			}

	}    
}
