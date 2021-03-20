package com.practice.programs;

import java.util.Scanner;

public class Program5
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 100);

		System.out.println(randomNumber);
		int guesses = 10;
		int[] a = new int[guesses];

		while (guesses > 0) 
		{
			guesses--;
			int guess = sc.nextInt();
			for (int i = 0; i < a.length; i++)
			{
				if (guess == a[i])
				{
					System.out.println("you already guessed that number");
					break;
				} 
				else if (guess == randomNumber) 
				{
					System.out.println("You Win");
					return;
				} 
				else 
				{
					a[i] = guess;
				}
			}
			System.out.println("Hard Luck");
		}
	}
}
