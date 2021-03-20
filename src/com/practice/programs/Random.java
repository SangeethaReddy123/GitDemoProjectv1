package com.practice.programs;

import java.util.Scanner;

public class Random {
	
public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int randomNumber = 88;
			
			int a[] = new int[10];
		
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Enter Number :: ");
			    int	number = sc.nextInt();
				
				if(number == randomNumber)
				{
					System.out.println("You win!!!!!!");
					break;
				}
				for(int j=0;j<i;j++)
				{
					if(a[j] == number)
					{
						System.out.println("Already tried this number , please try another number");
						break;
					}
				}
				a[i] = number;
			}
			System.out.println("Done with the attempts, Better luck next time!!!");
		}
	}


