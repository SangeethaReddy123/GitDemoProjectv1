package com.file.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Createemployee 
{
	public static void main(String[] args) throws IOException 
	{

		File f = new File("C:\\SangeethaReddy\\kavya.txt");

		FileInputStream is = new FileInputStream(f);

		Scanner sc = new Scanner(is);

		StringBuffer bf = new StringBuffer();

		while (sc.hasNext()) {
			bf.append(sc.nextLine());
			bf.append("\n");
		}
		System.out.println("Contents of the file: " + bf);

		File f1= new File("C:\\SangeethaReddy\\roopa.txt");

		FileWriter wr = new FileWriter(f1);
		wr.write(bf.toString());
		wr.flush();
		wr.close();
		System.out.println("File copied successfully.......");
	}

}