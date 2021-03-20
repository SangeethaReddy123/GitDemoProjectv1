package com.practice.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee2 
{
	private int eno;
	private String name;
	private float salary;
	private int age;

	public void readvalue() throws InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phoneNumber::");
		this.eno = sc.nextInt();
		System.out.println("Enter Employee Name::");
		this.name = sc.next();
		System.out.println("Enter Employee salary::");
		this.salary = sc.nextFloat();
		System.out.println("Enter Employee age::");
		this.age = sc.nextInt();
	}

	@Override
	public String toString() 
	
	{
		return "eno::" + this.eno + "Employee Number::" + this.eno + "Employee salary::" + this.salary + "Eage::"
				+ this.age;

	}
}
