package com.file.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee2 {
	public static void main(String[] args) throws IOException {
		int id;
		String name;
		int salary;
		int salaryArray[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employes....");
		int n = sc.nextInt();
		File f = new File("C:\\SangeethaReddy\\kavya.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("id      ::");
		fw.write("name    ::");
		fw.write("salary  ::");
		fw.write("\n");
		for (int i = 0; i < n; i++) {
			Scanner scn1 = new Scanner(System.in);
			System.out.println("Enter employee id::");
			id = scn1.nextInt();
			System.out.println("Enter employee name::");
			name = scn1.next();
			System.out.println("Enetr Employee salary::");
			salary = scn1.nextInt();
			for (int j = 0; j < salaryArray.length; j++) {
				salaryArray[i] = salary;
			}

			fw.write(id + "              ");
			fw.write(name + "              ");
			fw.write(salary + "          ");
			fw.append("\n");

			fw.flush();

			System.out.println("Sucess");
			FileReader r = new FileReader("C:\\SangeethaReddy\\kavya.txt");
			BufferedReader re = new BufferedReader(r);
			Scanner sc1 = new Scanner(re);
			while (sc1.hasNext()) {
				String data = sc1.nextLine();
				System.out.println(data);
			}
			int Max = 0;
			if (Max < salaryArray[i]) {
				Max = salaryArray[i];
			}
			System.out.println("Max sary is::" + Max);

		}

	}
}
