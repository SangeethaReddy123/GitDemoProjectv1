package com.file.programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Createfile {

	public static void main(String[] args) throws IOException {
		// File f=new File("C:\\SangeethaReddy\\Output.txt");
//			f.createNewFile();
//			System.out.println("Successfull");

		try 
		{
			File f = new File("C:\\SangeethaReddy\\Output.txt");
			String data = "Hi Sangeetha ....How are you ?..What are you doing....";
			FileWriter fr = new FileWriter("C:\\SangeethaReddy\\Output.txt");

			fr.write(data);
			fr.close();
			System.out.println("file writing successfull...........");

		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
