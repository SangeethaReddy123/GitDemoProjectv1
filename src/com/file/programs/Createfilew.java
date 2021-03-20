package com.file.programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Createfilew 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\SangeethaReddy\\kavya.txt");
		// f.createNewFile();
		// System.out.println("suceess");
		FileWriter fr = new FileWriter("C:\\SangeethaReddy\\kavya.txt");
		String data = "Hi kavaya how are you ..how is going is every thing ..how is your family";
		fr.write(data);
		fr.close();
		System.out.println("sucess");

	}

}
