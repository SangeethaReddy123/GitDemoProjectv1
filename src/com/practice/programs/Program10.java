package com.practice.programs;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program10 
{

	public static void main(String[] args) throws IOException
	{
		double test1, test2, test3;
		double average;
		String name;
		FileReader fr = new FileReader("test.txt");
		Scanner sc = new Scanner(fr);

		PrintWriter outFile = new PrintWriter("testavg.txt");

		while (sc.hasNext()) {
			name =sc.next();
			outFile.println("Student Name: " + name);

			test1 = sc.nextDouble();
			test2 = sc.nextDouble();
			test3 = sc.nextDouble();

			outFile.printf("Test scores: %5.2f %5.2f %5.2f %n", test1, test2, test3);
			average = (test1 + test2 + test3) / 3;
			outFile.printf("Average test score: %5.2f %n", average);
			outFile.println();
		}

		sc.close();
		outFile.close();

	}

}
