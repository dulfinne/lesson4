package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task9
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
		
		double min = arr[0];
		double max = arr[0];
		int imin = 0;
		int imax = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
				imin = i;
			}
			
			if (arr[i] > max)
			{
				max = arr[i];
				imax = i;
			}
		}
		
		double temp = arr[imin];
		arr[imin] = arr[imax];
		arr[imax] = temp;
		System.out.println("\nResult: ");
		for (double el : arr)
		{
			System.out.printf("%.3f ", el);
		}
	}
}
