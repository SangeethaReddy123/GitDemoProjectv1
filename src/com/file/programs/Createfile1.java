package com.file.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Createfile1 
{

	public static void main(String[] args) 
	{
		try 
		{
//		File f=new File("C:\\SangeethaReddy\\roopa.txt");
//		f.createNewFile();
//		System.out.println("Sucusses");
			File f = new File("C:\\SangeethaReddy\\roopa.txt");
			FileReader fr = new FileReader("C:\\SangeethaReddy\\roopa.txt");

			Scanner sc = new Scanner(fr);
			while (sc.hasNextLine()) 
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();

		}

		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}

	}
}
