package com.file.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Createfile7 {

	public static void main(String[] args) throws IOException 
    {
		BufferedReader br = new BufferedReader(new FileReader("C:\\SangeethaReddy\\kavya.txt")); 
		String line = null;
		int i=0;
		int sum =0;
		int n =0;
		line = br.readLine();
		String[] values = line.split(",");
		for (String str : values)   
		{
			if(str.equals("salary"))
			break;
			i++;
		}
		while ((line = br.readLine()) != null)
		{
			String[] value = line.split(",");    
			sum+=Integer.parseInt(value[i]);
			n++;			 
		}
		System.out.println(sum);
		System.out.println(sum/n);
		}
		
	
}

