package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task15
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter the length of array: ");
		int n = Integer.parseInt(scan.nextLine());
		
		double[] arr = new double[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(200) * 0.1 - 10;
		}
		
		for (double el : arr)
		{
			System.out.printf("%.3f ", el);
		}
		
		System.out.print("\nc = ");
		double c = Double.parseDouble(scan.nextLine());
		System.out.print("d = ");
		double d = Double.parseDouble(scan.nextLine());
		
		System.out.println("Result:");
		for(double el : arr)
		{
			if(el >= c && el <= d)
			{
				System.out.printf("%.3f ", el);
			}
		}
	}
}
