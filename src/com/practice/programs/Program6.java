package com.practice.programs;

import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int randomNumber=(int)(Math.random()*100);
		System.out.println(randomNumber);
		int gucess=10;
		int []a=new int[gucess];
		while(gucess>0)
		{
			int gucess1=sc.nextInt();
			for(int i=0;i<a.length;i++)
			{

				if (gucess== a[i])
				{
					System.out.println("you already gucess that number");
					break;
				} 
				else if (gucess == randomNumber) 
				{
					System.out.println("You Win");
					return;
				}
				else
				{
					a[i] = gucess;
				}
			}
			System.out.println("Hard Luck");
		}
	}
}


