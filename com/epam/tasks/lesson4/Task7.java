package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task7
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
			arr[i] = rand.nextInt(1000) * 0.1 - 5;
		}
		
		System.out.println("Sourse array: ");
		for (double el : arr)
		{
			System.out.printf("%.3f ", el);
		}
		
		System.out.print("\nz = ");
		double z = Double.parseDouble(scan.nextLine());
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > z)
			{
				arr[i] = z;
			}
		}
		
		System.out.println("Result: ");
		for (double el : arr)
		{
			System.out.printf("%.3f ", el);
		}
	}
}
