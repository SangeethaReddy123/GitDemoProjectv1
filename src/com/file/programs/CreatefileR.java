package com.file.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CreatefileR 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
    File  f=new File("C:\\SangeethaReddy\\kavya.txt");
    FileReader fr=new FileReader("C:\\SangeethaReddy\\kavya.txt");
    Scanner sc=new Scanner(fr);
    while(sc.hasNextLine()) 
    {
    	String data=sc.nextLine();
    	System.out.println(data);
    }
    sc.close();
    
    
	}

}
